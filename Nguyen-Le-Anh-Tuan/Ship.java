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
public class Ship {
    private ArrayList<String> locationCells;
    private String name;

   public void setName(String string){
       name = string;
   }
   public void setlocationCells(ArrayList<String> loc){
       locationCells = loc;
   }
   public String check(String userInput){
       String result = "miss";
       int index = locationCells.indexOf(userInput);
       if(index >= 0){
           locationCells.remove(index);
           if(locationCells.isEmpty())
               result = "kill";
           else result = "hit";
       }
       return result;
   } 
}
