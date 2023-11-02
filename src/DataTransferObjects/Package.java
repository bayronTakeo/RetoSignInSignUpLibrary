/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataTransferObjects;

import java.io.Serializable;

/**
 *
 * @author bayro
 */
public class Package implements Serializable {
    
    private User user;
    private MessageEnum message;

    public Package() {
    }

    public Package(User user, MessageEnum message) {
        this.user = user;
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public MessageEnum getMessage() {
        return message;
    }

    public void setMessage(MessageEnum message) {
        this.message = message;
    }
    
    public void getDatos(User user, MessageEnum message) {
        this.user = user;
        this.message = message;
    }
    
    
}
