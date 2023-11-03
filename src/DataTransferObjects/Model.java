/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataTransferObjects;

import exceptions.ConnectionErrorException;
import exceptions.InvalidUserException;
import exceptions.MaxConnectionException;
import exceptions.TimeOutException;
import exceptions.UserExistException;

/**
 *
 * @author Bayron
 */
public interface Model {

    public User doSignIn(User user) throws InvalidUserException, ConnectionErrorException, TimeOutException, MaxConnectionException;

    public void doSignUp(User user) throws UserExistException, ConnectionErrorException, TimeOutException, MaxConnectionException;
}
