import java.util.Scanner;

public class Conditional_Statement 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the age:");
        int age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("Adult");
        }
        else if(age>16 && age<18)
        {
            System.out.println("Teenager");
        }
        else
        {
            System.out.println("Underage");
        }
    }
}
