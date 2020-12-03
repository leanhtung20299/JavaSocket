/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import Entity.Account;
import java.io.Serializable;
import java.net.Socket;

/**
 *
 * @author PT-LS
 */
public class AccountSocket implements Serializable{
    
    private String socketclient;
    private Account account ;
    
    public AccountSocket() {
    }

    public AccountSocket(String socketclient, Account account) {
        this.socketclient = socketclient;
        this.account = account;
    }

    
    
    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getSocketclient() {
        return socketclient;
    }

    public void setSocketclient(String socketclient) {
        this.socketclient = socketclient;
    }

    

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
