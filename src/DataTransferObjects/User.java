/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataTransferObjects;

import java.io.Serializable;

/**
 *
 * @author Bayron
 */
public class User implements Serializable {

    private String email;
    private String name;
    private String direction;
    private int codePostal;
    private int phoneNumber;
    private String password;

    public User() {
    }

    public User(String email, String name, String direction, int codePostal, int phoneNumber, String password) {
        this.email = email;
        this.name = name;
        this.direction = direction;
        this.codePostal = codePostal;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDirection() {
        return direction;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }
}
