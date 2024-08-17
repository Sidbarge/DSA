import java.util.Scanner;

public class Calculator 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        System.out.println("Enter the operation");
        char operator=sc.next().charAt(0);
        switch(operator)
        {
            case '+': System.out.println("The Addition is "+(a+b));
                    break;
            case '-': System.out.println("The Subtraction is "+(a-b));
                    break;
            case '*': System.out.println("The Multiplication is "+(a*b));
                    break;
            case '/': System.out.println("The Division is "+(a/b));
                    break;
            default: System.out.println("Wrong Input");                
        }
    }
}
