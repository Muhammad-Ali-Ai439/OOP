/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe2;

//Muhammad Ali 73051
public class AdvancedCalculator extends Calculator {
    double multiply(){ //Muhammad Ali 73051
    return num1*num2;
    }
    double divide(){
        if(num2==0){ //Muhammad Ali 73051
            System.out.println("Cannot divide by zero");
        return 0; //Muhammad Ali 73051
        }
        return num1/num2;
    } //Muhammad Ali 73051  
}
