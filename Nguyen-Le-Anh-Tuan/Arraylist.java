/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import java.util.ArrayList;
/**
 *
 * @author hantu
 */
public class Arraylist {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        String a = new String("Hello");
        list.add(a);
        
        String b = new String("Goodbye");
        list.add(0,b);
        System.out.println("List size is " + list.size());
        
        if(list.contains("Hello"))
            System.out.println("Hello is in");
        System.out.println("Index of" + a + "is "+ list.indexOf(a));
        
        System.out.println("List is empty? " + list.isEmpty());
        
        list.remove(a);
    }
   
    
}
