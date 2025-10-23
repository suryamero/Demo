package org.example;
abstract class Animal{
    abstract void sound();
     void sleep(){
         System.out.println("Animals sleep");
     }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dogs bark");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cats says meaw");
    }
}
public class AbstractExample {
    public static void main(String[] args) {
        Animal a1=new Dog();
        a1.sound();
        a1.sleep();
        Animal a2=new Cat();
        a2.sleep();
        a2.sound();
    }
}
