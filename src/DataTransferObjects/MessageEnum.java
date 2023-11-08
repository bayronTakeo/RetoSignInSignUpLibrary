/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataTransferObjects;

import java.io.Serializable;

/**
 * Enum que envía y recibe el tipo de respuesta del servidor y del cliente.
 *
 * @author Bayron
 */
public enum MessageEnum {
    RE_SIGNIN,
    RE_SIGNUP,
    AN_OK,
    AN_INVALIDUSER,
    AN_USEREXIST,
    AN_CONNECTIONERROR,
    AN_MAXCONNECTION
}
