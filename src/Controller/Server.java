package Controller;

import static Controller.Server.listAccountsocket;
import DAO.UserDAO;
import DTO.Request;
import DTO.Response;
import DTO.Task;
import Entity.Account;
import com.mysql.cj.Session;
import entity.AccountSocket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server implements Serializable{
    private int port;
    public static HashSet<AccountSocket> listAccountsocket;
    public Server(int port) {
        this.port = port;
    }

    private void settingserver() throws IOException, ClassNotFoundException {
        ServerSocket serversocket = new ServerSocket(port);
        System.out.println("Server listening");
        ObjectInputStream dis = null;
        while (true) {
            Socket clientSocket = serversocket.accept();
          
//            listAccountsocket.add(accountSocket);
//            dis = new ObjectInputStream(clientSocket.getInputStream());
//            Request request = (Request) dis.readObject();
            System.out.println("Da ket noi voi Socket : " + clientSocket);
//            System.out.println(request);
            ReadServer readServer = new ReadServer(clientSocket);
            readServer.start();

        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Server.listAccountsocket = new HashSet<AccountSocket>();
        Server serversocket = new Server(15797);
        serversocket.settingserver();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PT-LS
 */
class ReadServer extends Thread { // hàm đọc dữ liệu của server được gửi từ client

    private Socket clientSocket;

    public ReadServer(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        ObjectInputStream dis = null;
        ObjectOutputStream dos = null;
        try {
            dis = new ObjectInputStream(clientSocket.getInputStream());
            dos = new ObjectOutputStream(clientSocket.getOutputStream());

            Request request = (Request) dis.readObject();
//            System.out.println(request.getTask());
            if (request.getTask() == Task.LOGIN) {
                // tạo mới account
                Account account = new Account();
                account.setPassword(request.getPassword());
                account.setUsername(request.getUsername());
                // kiểm tra
                Account checkUser = new UserDAO().checkUser(account);
//                System.out.println(checkUser.getUsername());

             
                if (checkUser!=null) {
                    AccountSocket accountSocket = new AccountSocket(clientSocket.getInetAddress().toString(),checkUser);
                    Server.listAccountsocket.add(accountSocket);
                    System.out.println(listAccountsocket.size());
                    // khoi tao doi tuong tra ve response
                    Response response = new Response();
                    response.setAccepted(true);
                    response.setExist(true);
                    response.setTask(Task.LOGIN);
                    response.setUser(checkUser);
                    response.setSuccess(true);
//                    response.setListAccountsocketreturn(listAccountsocket);
                    response.setListAccountsocketreturn(listAccountsocket);

//                    dos = new ObjectOutputStream(clientSocket.getOutputStream());
                    dos.writeObject(response);
//                    dos.writeObject(response);
//                    dos.close();
                } else {
                    Response response = new Response();
                    response.setSuccess(false);
//                    response.setUser(checkUser);
                    response.setTask(Task.LOGIN);
//                    dos.writeObject(response);

//                    dos = new ObjectOutputStream(clientSocket.getOutputStream());
                    dos.writeObject(response);

//                    dos.writeObject(response);
//                    dos.close();
                }

//      
            }
        } catch (Exception e) {
            try {
                dis.close();
                clientSocket.close();
            } catch (IOException e1) {
                System.out.println("Ngắt kết nối tới Server");
                e1.printStackTrace();
            }

        }
        super.run();
    }
}

class WriteServer extends Thread { // hàm nhập của server gửi lại cho client

    private Socket client;
    private Response response;

    public WriteServer(Socket client, Response response) {
        this.client = client;
        this.response = response;
    }

    @Override
    public void run() {
        ObjectOutputStream dos = null;
        while (true) {

            try {
                dos = new ObjectOutputStream(client.getOutputStream());
                dos.writeObject(response);
            } catch (IOException ex) {
                Logger.getLogger(WriteServer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
