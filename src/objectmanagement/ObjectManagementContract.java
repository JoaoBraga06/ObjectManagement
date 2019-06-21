/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectmanagement;

/**
 *
 * @author joaop
 */
public interface ObjectManagementContract {
    /**
     * Adds an object to the array
     * 
     * @param obj Object to be added
     * @return Success
     */
    public boolean addObject(Object obj);
    
    /**
     * Removes an object given by the user
     * 
     * @param obj Object to remove
     * @return Success
     */
    public boolean removeObject(Object obj);
    
    /**
     * Lists all the objects in the array
     */
    public void listObjects();
}
