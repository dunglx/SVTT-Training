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
public class DoWhile {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int count, number;
      System.out.print("Enter a number: ");
      number = input.nextInt();
      
      count = 1;
      do {
          System.out.print(count + " & ");
          count++;
      }
      while (count <= number);
      System.out.println("Ailanguoithuongem");
  }  
}
