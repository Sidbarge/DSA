public class ClearRangeOfBits {
    public static int clearbits(int n,int i,int j)
    {
        int a=(~0)<<j;
        // int b=(1<<i)-1;
        int b=~((~0)<<i);//We can Solve by both method remaining explanation is in book
        int BitMask=a|b;
        return n&BitMask;
    }
    public static void main(String[] args)
    {
        System.out.println(clearbits(10, 2, 4));
    }
}
