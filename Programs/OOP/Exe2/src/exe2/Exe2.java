/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package exe2;

import java.util.Scanner;
public class Exe2 {
//Muhammad Ali 73051
 
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter first number");
      double a=s.nextDouble();
      System.out.println("Enter second number"); //Muhammad Ali 73051
      double b=s.nextDouble();
      AdvancedCalculator k=new AdvancedCalculator();
      k.setvalues(a,b);
      System.out.println("Addition: "+k.add()); //Muhammad Ali 73051
      System.out.println("Subtarction: "+k.subtract());
      System.out.println("Multiplication: "+k.multiply());
      System.out.println("Division: "+k.divide());//Muhammad Ali 73051
    }
}
