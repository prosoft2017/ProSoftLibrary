/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.chat;

import domain.user.AppUser;

/**
 *
 * @author Filip
 */
public class MessageThread implements domain.DomainObject {

    private int id;
    private Message message;
    private AppUser userSender;
    private AppUser userReciver;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public AppUser getUserSender() {
        return userSender;
    }

    public void setUserSender(AppUser userSender) {
        this.userSender = userSender;
    }

    public AppUser getUserReciver() {
        return userReciver;
    }

    public void setUserReciver(AppUser userReciver) {
        this.userReciver = userReciver;
    }

}
