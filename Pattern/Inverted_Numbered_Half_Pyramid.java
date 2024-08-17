import java.util.Scanner;

public class Inverted_Numbered_Half_Pyramid 
{
    public static void pyramid(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pyramid(n);
    }
}
