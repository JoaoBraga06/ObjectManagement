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
public class ObjectAlreadyExists extends Exception {

    /**
     * Creates a new instance of <code>ObjectAlreadyExists</code> without detail
     * message.
     */
    public ObjectAlreadyExists() {
        System.out.println("Object already exists in the array."+'\n');
    }
   }

