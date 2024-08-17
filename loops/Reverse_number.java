import java.util.Scanner;

public class Reverse_number 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n;
        int rev=0;
        System.out.println("Enter the number:");
        n=sc.nextInt();
        while(n>0)
        {
            int last_digit=n%10;
            rev=(rev*10)+last_digit;
            n=n/10;
        }
        System.out.println("The Reverse number is "+rev);
    }
}
