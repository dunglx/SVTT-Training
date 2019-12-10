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
public class IfElse {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Double GPA;
        System.out.print("Enter your score GPA: ");
        GPA = input.nextDouble();
        
        if(GPA < 4.0)
            System.out.println("Sorry You' ve failed");
        else if(GPA > 8.5)
            System.out.println("You are Excellent");
        else
            System.out.println("You are good ");
    }
}
