public class Primes_in_range
{
    public static boolean prime(int n)
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
    public static void range_prime(int n)
    {
        for(int i=2;i<=n;i++){
        if(prime(i))
        {
            System.out.print(i+" ");
        }

        }
    }
    public static void main(String[] args) 
    {
        range_prime(100);
    }
}
