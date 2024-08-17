public class Prime_NUmber 
{
    public static boolean isprime(int n)
    {
        boolean isprime=true;
        if(n==2)
        {
            isprime=true;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                isprime=false;
            }
        }
        return isprime;
    }
    public static void main(String[] args) 
    {
        System.out.println(isprime(6));
    }
}
