package DTO;

import com.mysql.cj.protocol.Message;
import Entity.Account;
import entity.AccountSocket;
import java.io.Serializable;
import java.util.Set;

public class Request implements Serializable {
    private static final long serialVersionUID = 7L;
    private Task task;
    private String username;
    private String password;
    private Account user;
    private String name;
    private Set<AccountSocket> listAccountsocket;
    private Message message;

    public Request() {
    }

    public Request(Task task, String username, String password, Account user, String name, Message message) {
        this.task = task;
        this.username = username;
        this.password = password;
        this.user = user;
        this.name = name;
        this.message = message;
    }

    public Task getTask() {
        return task;
    }

    public Set<AccountSocket> getListAccountsocket() {
        return listAccountsocket;
    }

    public void setListAccountsocket(Set<AccountSocket> listAccountsocket) {
        this.listAccountsocket = listAccountsocket;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Account getUser() {
        return user;
    }

    public void setUser(Account user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return username + " " +password +" "+task; //To change body of generated methods, choose Tools | Templates.
    }
    
}
