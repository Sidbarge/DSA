import java.util.*;

public class Leap_year 
{
    public static void main(String args[])
    {
        int y;
        System.out.println("Enter the year:");
        Scanner sc=new Scanner(System.in);
        y=sc.nextInt();
        if(((y%4==0) && (y%100!=0)) || (y%400==0))
        {
            System.out.println("The year is leap Year");
        }
        else
        {
            System.out.println("The year is not leap year");
        }
    }
    
}