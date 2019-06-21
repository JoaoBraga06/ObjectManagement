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
public class SizeFull extends Exception {

    /**
     * Creates a new instance of <code>SizeFull</code> with default message.
     */
    public SizeFull() {
        System.out.println("The array is full. Relocating memory."+'\n');
    }

}
