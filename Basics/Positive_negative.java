import java.util.*;

public class Positive_negative
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int a=sc.nextInt();
        if(a<0)
        {
            System.out.println("The number is Negative");
        }
        else if(a==0)
        {
            System.out.println("The number is Neutral");
        }
        else
        {
            System.out.println("The number is Positive");
        }
        
        //Using Ternary Operator
        String n=(a<0)?"Negative":"Positive";
        System.out.println("The Number is "+n);
    }
}