/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Bayron
 */
public class InvalidDirectionException extends Exception {
    public InvalidDirectionException() { 
        super();
    }
    public InvalidDirectionException(String msg) { 
        super(msg);
    }
}
