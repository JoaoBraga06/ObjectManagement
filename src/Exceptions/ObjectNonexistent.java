/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author joaop
 */
public class ObjectNonexistent extends Exception {

    /**
     * Creates a new instance of <code>ObjectNonexistent</code> without detail
     * message.
     */
    public ObjectNonexistent() {
        System.out.println("The object doesn't exist."+'\n');
    }

}
