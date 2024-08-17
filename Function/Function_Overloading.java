import java.util.Scanner;

public class Function_Overloading 
{
    public static int sum(int a ,int b)
    {
        return a+b;
    }
    public static int sum(int a,int b,int c)
    {
        return a+b+c;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int Sum=sum(a,b,c);
        System.out.println(Sum);
    }
}
