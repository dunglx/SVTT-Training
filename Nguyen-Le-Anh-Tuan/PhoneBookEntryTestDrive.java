/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import java.util.Scanner;
class PhoneBookEntry{
    String name;
    String phone;
    
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
    }
}
/**
 *
 * @author hantu
 */
public class PhoneBookEntryTestDrive{
    public static void main(String[] args)
    {
        PhoneBookEntry tom = new PhoneBookEntry();
        tom.name = "Tom the Cat";
        tom.phone = "989238401";
        PhoneBookEntry jerry = new PhoneBookEntry();
        jerry.name = "Jerry the Mouse";
        jerry.phone = "989239999";
        
        tom.display();
        jerry.display();
    }
}
