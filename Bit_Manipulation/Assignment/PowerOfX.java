public class PowerOfX {
    public static int Power(int x)
    {
        int ans=1;
        int n=x;
        while(n>0)
        {
            if((n&1)==1)
            {
                ans=ans*x;
            }
            x=x*x;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args)
    {
        System.out.println(Power(5));
    }
}
