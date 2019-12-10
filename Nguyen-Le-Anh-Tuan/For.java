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
public class For {
    public static void main(String[] args){
        float sum = 0;
     
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the marks for " + 3 + "subject: ");
        for(int count = 0; count < 3; count++){
            float mark;
            mark = input.nextFloat();
            sum += mark;
        }
        System.out.println("Average mark = " + sum/3);
    }
    
}
