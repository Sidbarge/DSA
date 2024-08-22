public class Abstraction {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.walk();
        System.out.println(h.color);  //Brown is printed as when object is created of a subclass then constructor of super class is called before its own constructor so h.changecolor(); need to be called before printing to change color
        Chicken c=new Chicken();
        c.walk();
    }
}

abstract class Animal{  //Cannot create the object
    String color;
    Animal(){  //Can have constructor
        color="Brown";
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk(); //Abstract method doesn't have implementation 
}

class Horse extends Animal{
    void changecolor(){
        color="dark brown";
    }
    void walk(){  //It is compulsary for subclass to implement the abstact method
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}