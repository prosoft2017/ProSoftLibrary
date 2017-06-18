/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.chat;

import domain.user.AppUser;
import java.util.List;

/**
 *
 * @author Nikola
 */
public class Message implements domain.DomainObject{
    
    private AppUser appUserSender;
    private List<AppUser> appUserReciver;
    private String messageContent;
    private MessageType messageType;

    public Message() {
        messageType = MessageType.Private;
    }

    public Message(AppUser appUserSender, List<AppUser> appUserReciver, String messageContent, MessageType messageType) {
        this.appUserSender = appUserSender;
        this.appUserReciver = appUserReciver;
        this.messageContent = messageContent;
        this.messageType = messageType;
    }

    public void setAppUserSender(AppUser appUserSender) {
        this.appUserSender = appUserSender;
    }

    public void setAppUserReciver(List<AppUser> appUserReciver) {
        this.appUserReciver = appUserReciver;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public AppUser getAppUserSender() {
        return appUserSender;
    }

    public List<AppUser> getAppUserReciver() {
        return appUserReciver;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    @Override
    public String toString() {
        return "Message{" + (appUserSender == null ? "Global Message" : appUserSender.getUsername()) + ": " + messageContent + '}';
    }
}
