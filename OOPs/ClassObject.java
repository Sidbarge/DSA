public class ClassObject 
{
    public static void main(String args[])
    {
        pen p1=new pen();//created a pen object called p1
        p1.setColor("Red");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.Tip);
    }
}

class pen{
    String color;
    int Tip;
    void setColor(String newColor)
    {
        color=newColor;
    }
    void setTip(int newTip)
    {
        Tip=newTip;
    }
}