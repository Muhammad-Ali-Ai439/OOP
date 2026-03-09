/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exe;
import java.util.Scanner; // Muhammad Ali 73051
public class Exe { 
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in); // Muhammad Ali 73051
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        Class1 a= new Class1();
        int result=a.factorial(n);
        System.out.println("Factorial is: "+result); // Muhammad Ali 73051
        a.pattern();
        int result2=a.length();
        System.out.println("Length of array is: "+result2);
        a.palindrome();
        a.Primenum();// Muhammad Ali 73051
        a.swap1();
        a.swap2();
    }// Muhammad Ali 73051
}
