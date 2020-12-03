package Controller;

//import Controller.ReadClient;
import Controller.WriteClient;
import DTO.Request;
import DTO.Response;
import Entity.Account;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client {

    private InetAddress host;
    private int port;
    Socket client;
    Request request;
    public Response response;
    public Socket returnsocket() {
        return client;
    }

    public void setResponse(Response response) {
        this.response = response;
    }
    
    public Client(InetAddress host, int port) {
        this.host = host;
        this.port = port;
    }

    public void setRequestClient(Request request) {
        this.request = request;
    }

    public void openSocketClient() {
        try {
            client = new Socket(host, port);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

//    public void ReadClienttoServer() {
//        ReadClient readClient = new ReadClient(client);
//        readClient.start();
//    }

    public void WriteClienttoServer() {
        WriteClient write = new WriteClient(client, request);
        write.start();
      
    }
 
}

class WriteClient extends Thread { // hàm nhập của client gửi cho server 

    private Socket clientsocket;
    private Request request;

    public WriteClient() {
    }

    public WriteClient(Socket clientsocket, Request request) {
        this.clientsocket = clientsocket;
        this.request = request;

    }

    @Override
    public void run() {
//        ObjectOutputStream objectOutputStream = null;
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(clientsocket.getOutputStream());
            objectOutputStream.writeObject(request);
        } catch (Exception e) {
        }
        

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
// */
//class ReadClient extends Thread { // hàm đọc của client từ server
//
//    private Socket client;
//
//    public ReadClient() {
//    }
//
//    public ReadClient(Socket client) {
//        this.client = client;
////        this.response = response;
//    }
//
//    @Override
//    public void run() {
//        ObjectInputStream dis = null;
//        try {
//            dis = new ObjectInputStream(client.getInputStream());
//
//            Response response = (Response) dis.readObject();
////                System.out.println(response);
//        } catch (Exception e) {
//          
//            
//        }
//        super.run();
//    }
//}
