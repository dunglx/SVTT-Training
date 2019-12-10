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
public class Break {
    public static void main(String[] args){
        float sum = 0;
        int count, subjects = 10;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the marks for " + subjects +" subjects: ");
        for(count =0; count < subjects; count++){
            float mark;
            mark = input.nextFloat();
            if(mark < 0) break;
            sum += mark;
        }
        if (count >= subjects)
            System.out.print("Average mark = "+ sum/subjects);
        else
            System.out.print("Eror: Invalid mark!");
    }
}
