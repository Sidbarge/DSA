public class FastExponentiation {
    public static int fast_exponentiation(int a,int n)
    {
        int ans=1;
        while(n>0){
            if((n&1)!=0)
            {
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] main)
    {
        System.out.println(fast_exponentiation(3, 4));
    }
}
