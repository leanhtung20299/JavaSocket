package DTO;

import com.mysql.cj.protocol.Message;
import Entity.Account;
import entity.AccountSocket;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class Response implements Serializable {
    private static final long serialVersionUID = 8L;
    private Task task;
    private Boolean accepted;
    private Boolean exist;
    private Account user;
//    private Vector<User> users;
//    private Vector<Conversation> conversations;
//    private Conversation conversation;
    private String name;
    private Message message;
    private Boolean success;
    private Set<AccountSocket> listAccountsocketreturn;
    public Response() {
    }

    public Set<AccountSocket> getListAccountsocketreturn() {
        return listAccountsocketreturn;
    }

    public void setListAccountsocketreturn(Set<AccountSocket> listAccountsocketreturn) {
        this.listAccountsocketreturn = listAccountsocketreturn;
    }

   

    public Response(Task task, Boolean accepted, Boolean exist, Account user, String name, Message message, Boolean success) {
        this.task = task;
        this.accepted = accepted;
        this.exist = exist;
        this.user = user;
        this.name = name;
        this.message = message;
        this.success = success;
    }

   

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public Boolean getAccepted() {
        return accepted;
    }

    public void setAccepted(Boolean accepted) {
        this.accepted = accepted;
    }

    public Boolean getExist() {
        return exist;
    }

    public void setExist(Boolean exist) {
        this.exist = exist;
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

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return user+" "+success+" "+task; //To change body of generated methods, choose Tools | Templates.
    }
    
  
}
