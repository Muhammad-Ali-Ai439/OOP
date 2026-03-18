/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe; // Muhammad Ali 73051
import java.util.Scanner;
public class Class1 {
    int factorial(int n){
        int fact=1;  // Muhammad Ali 73051
        for(int i=1; i<=n; i++)
            fact=fact*i;
        return fact;
    }                 // Muhammad Ali 73051
    void pattern(){
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=i; j++){ // Muhammad Ali 73051
              System.out.print("*");
            }
         System.out.println();
        }
    }
    int length(){
    int[] arr1 = {10, 20, 30, 40, 50}; // Muhammad Ali 73051
    return arr1.length;
    }
    void palindrome(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int original = n; // Muhammad Ali 73051
        int reverse = 0;
        while(n > 0) {
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n / 10;   // Muhammad Ali 73051
        } 
        if(original == reverse) {
            System.out.println("Palindrome Number");
        } 
        else {
            System.out.println("Not a Palindrome"); // Muhammad Ali 73051
        }
    }
    void Primenum(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();  // Muhammad Ali 73051
        int count = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                count++;    // Muhammad Ali 73051
            }
        }
        if(count == 2) {
            System.out.println("Prime Number");
        } 
        else {
            System.out.println("Not a Prime Number"); // Muhammad Ali 73051
        } 
    }
    void swap1(){
        int a = 10, b = 20;
        System.out.println("Before Swapping, a is "+a+" and b is "+b);
        a = a + b;
        b = a - b;  /// Muhammad Ali 73051
        a = a - b;
       System.out.println("After Swapping, a is "+a+" and b is "+b);
    }
    void swap2(){       // Muhammad Ali 73051
        int a = 30, b = 20, temp;
        System.out.println("Before Swapping, a is "+a+" and b is "+b);
        temp = a;
        a = b;        // Muhammad Ali 73051
        b = temp;

         System.out.println("After Swapping, a is "+a+" and b is "+b);
    }   // Muhammad Ali 73051
}
