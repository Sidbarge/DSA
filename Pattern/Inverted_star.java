public class Inverted_star 
{
    public static void main(String[] args) 
    {
        int n=4;
        /*for(int line=n;line>=1;line--)
        {
            for(int star=line;star>=1;star--)
            {
                System.out.print("*");
            }
        System.out.println();
        }*/

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print("*");
            }
        System.out.println();    
        }
    }
}
