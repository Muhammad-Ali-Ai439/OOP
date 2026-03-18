/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exe3;
    //Muhammad Ali 73051
public class Exe3 {
    public static void main(String[] args) {
        Cat c = new Cat();//Muhammad Ali 73051
        c.name = "Kitty";
        c.id = 1;
//Muhammad Ali 73051
        Dog d = new Dog();
        d.name = "Rocky";
        d.id = 2;
        System.out.println("Cat Name: " + c.name);
        c.drink();//Muhammad Ali 73051
        c.walk();

        System.out.println();

        System.out.println("Dog Name: " + d.name);
        d.eat();//Muhammad Ali 73051
        d.bark();
    }//Muhammad Ali 73051
}

