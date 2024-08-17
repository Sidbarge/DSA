import java.util.*;
public class While_loop 
{
    public static void main(String[] args) 
    {
        int i=1;
        int sum=0;
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        while(i<=n)
        {
            sum+=i;
            i++;
        }
        System.out.println("The sum is "+sum);
    }
}
