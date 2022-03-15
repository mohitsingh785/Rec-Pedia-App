package com.pediaapp.recpedia.ui.Models;

public class User {
    String mail,username,password;

    public User( String username,String mail, String password) {
        this.mail = mail;
        this.username = username;
        this.password = password;
    }
 public User(){};

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
