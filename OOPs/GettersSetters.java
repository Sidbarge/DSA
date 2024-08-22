public class GettersSetters {
    public static void main(String args[])
    {
        pen p1=new pen();//created a pen object called p1
        p1.setColor("Red");
        System.out.println(p1.getcolor());
        p1.setTip(5);
        System.out.println(p1.gettip());
    }
}

class pen{
    private String color;
    private int Tip;

    String getcolor(){
        return this.color;//Getters returns the value, they are used to access private field outside of the class
    }//using this keyword here is optional to often used for clarity
    int gettip(){
        return this.Tip;//Setters modifies the private field from outside the class 
    }

    void setColor(String color)
    {
        this.color=color;
    }
    void setTip(int Tip)
    {
        this.Tip=Tip;//This keyword is used to reference the current object, here this.Tip refers to Tip variable in the class rather than the parameter
    }
}
