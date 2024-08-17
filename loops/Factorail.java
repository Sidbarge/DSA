import java.util.Scanner;

public class Factorail 
{
    public static void main(String args[])
    {
        int i;
        int fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        for(i=n;i>1;i--)
        {
            fact=fact*i;
        }
        System.out.println("The factorial of the number is "+fact);
    }
}
