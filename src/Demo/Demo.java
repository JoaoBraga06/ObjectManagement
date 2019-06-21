/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;
import objectmanagement.ObjectManagement;

/**
 *
 * @author joaop
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objects
        Object o = new Object();
        Object j = new Object();
        Object a=o;
        
        //Object Management
        ObjectManagement manage = new ObjectManagement(1);
        
        //Add and remove
        manage.addObject(j);
        manage.removeObject(o);
        manage.addObject(o);
        manage.addObject(a);
        manage.removeObject(j);
        manage.listObjects();
    }
    
}
