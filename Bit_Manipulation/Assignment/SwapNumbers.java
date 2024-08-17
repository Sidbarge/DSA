public class SwapNumbers {
    public static void main(String[] args)
    {
        int a=4;
        int b=2;
        //Swap
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("The value of a is "+a);
        System.out.println("The value of b is "+b);
    }
}
