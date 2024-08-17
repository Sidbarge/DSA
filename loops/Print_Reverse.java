import java.util.Scanner;

public class Print_Reverse 
{
    public static void main(String[] args) 
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();
        System.out.print("The Reverse of the number is ");
        for(;n>0;)
        {
            int last_digit=n%10;
            System.out.print(last_digit);
            n=n/10;
        }
    }
}
