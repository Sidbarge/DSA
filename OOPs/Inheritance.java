public class Inheritance {
    public static void main(String[] args)
    {
        Fish Shark=new Fish();
        Shark.eat();
        Dog d1=new Dog();
        d1.leg=4;
        d1.eat();
        System.out.println(d1.leg);
    }
}
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breates");
    }
}

class Fish extends Animal{   //Single Inheritance
    int fins;

    void swim(){
        System.out.println("Swims");
    }
}

class Mammals extends Animal{
    String breed;

    void walk(){
        System.out.println("Swims");
    }
}

class Dog extends Mammals{    //Multilevel Inheritance
    int leg;
}