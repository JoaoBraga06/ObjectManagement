/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectmanagement;
import Exceptions.*;

/**
 *
 * @author joaop
 */
public class ObjectManagement implements ObjectManagementContract{
    /**
     * Default Size
     */
    private static final int TAM=5;
    
    /**
     * Increment Size
     */
    private static final int TAM_INC=1;
    
    /**
     * Objects
     */
    private Object[] objects;

    /**
     * Constructor with size given by user
     * 
     * @param tam Initial size
     */
    public ObjectManagement(int tam) {
        this.objects= new Object[tam];
    }
 
    /**
     * Constructor with default size
     */
    public ObjectManagement() {
        this.objects= new Object[TAM];
    }    
    
    /**
     * Adds an object to the array
     * 
     * @param obj Object to be added
     * @return Success
     */
    @Override
    public boolean addObject(Object obj){
        boolean IsAdded=true;
        int i=this.searchObject(obj);
        
        try{
            if(obj==null)
                throw new ObjectNull();
            if(i!=-1)
                throw new ObjectAlreadyExists();
            if(this.Size()==this.objects.length)
                throw new SizeFull();              
        }catch(ObjectNull | ObjectAlreadyExists e){
            IsAdded=false;
        }catch(SizeFull e){
            Object[] temp=new Object[this.objects.length+TAM_INC];
            System.arraycopy(this.objects, 0, temp, 0, this.objects.length);
            this.objects=temp;
            System.out.println("Memory has been relocated."+'\n');
        }
        
        if(IsAdded){
            this.objects[this.Size()]=obj;
            System.out.println("Object added."+'\n');
        }
        return IsAdded;
    }
    
    /**
     * Removes an object given by the user
     * 
     * @param obj Object to remove
     * @return Success
     */
    @Override
    public boolean removeObject(Object obj){
        boolean IsRemoved=true;
        int i=this.searchObject(obj);
        
        try{
            if(this.Size()==0)
                throw new SizeEmpty();
            if(i==-1)
                throw new ObjectNonexistent();
        }catch(SizeEmpty | ObjectNonexistent e){
            IsRemoved=false;
        }
        
        if(IsRemoved){
            for(i=i;i<this.Size()-1;i++){
                this.objects[i]=this.objects[i+1];
            }
            this.objects[this.Size()-1]=null;
            System.out.println("Object removed."+'\n');
            
            if(this.Size()<=this.objects.length-TAM_INC){
                Object[] temp = new Object[this.objects.length-TAM_INC];
                System.arraycopy(this.objects, 0, temp, 0, this.Size());
                this.objects=temp;
                System.out.println("Memory realocated."+'\n');
            }
        }
        
        return IsRemoved;    
    }
    
    /**
     * Lists all the objects in the array
     */
    @Override
    public void listObjects(){
        for(Object object : this.objects){
            System.out.println(object);
        }
    }    
    
    /**
     * Caculates the number of occupied positions in the array of objects
     * 
     * @return Number of occupied positions
     */
    private int Size(){
        int i=0;
        while(i<this.objects.length && this.objects[i]!=null)
            i++;
        
        return i;
    }
    
    /**
     * Search an object in the array
     * 
     * @param object Object to search
     * @return Position of the object in the array. If the object doesn't exists returns -1;
     */
    @SuppressWarnings("empty-statement")
    private int searchObject(Object object){
        int i;
        
        for(i=0;i<this.Size() && !this.objects[i].equals(object);i++);
        
        if(i==this.Size())
            i=-1;
        return i;
    }
}
