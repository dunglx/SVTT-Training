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
public class While {
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int count, number;
      System.out.print("Enter a number: ");
      number = input.nextInt();
      
      count = 1;
      while (count <= number){
          System.out.print(count + " & ");
          count++;
      }
      System.out.println("Ailanguoithuongem");
  }  
}
