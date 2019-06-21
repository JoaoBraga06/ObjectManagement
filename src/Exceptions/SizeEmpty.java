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
public class SizeEmpty extends Exception {

    /**
     * Creates a new instance of <code>SizeEmpty</code> without detail message.
     */
    public SizeEmpty() {
        System.out.println("The array is empty."+'\n');
    }

}
