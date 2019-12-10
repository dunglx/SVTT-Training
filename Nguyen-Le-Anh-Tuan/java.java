/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import java.util.Scanner;
/**
 *
 * @author hantu
 */

public class java {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.print("Enter your grade: ");
      String userInput = input.next();
       char grade = userInput.charAt(0);
        
        switch (grade){
            case 'A':
                System.out.println("Excellent!");break;
            case 'B':
                System.out.println("Great!");break;
            case 'C':
                System.out.println("Normal!");break;
            case 'D':
                System.out.println("Well!");break;
            case 'F':
                System.out.println("Sorr You failed");break;
            default:
                System.out.println("Error! Invalid grade");break;
        }
    }
    
}
