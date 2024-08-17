public class Update_ith_Bit {
    public static int Clear_ith_Bit(int n,int i)
    {
        int BitMask=~(1<<i);
        return n&BitMask;
    }
    public static int update_ith_Bit(int n,int i,int newBit)
    {
        n=Clear_ith_Bit(n,i);
        int BitMask=newBit<<i;
        return n|BitMask;
    }
    public static void main(String[] args)
    {
         System.out.println(update_ith_Bit(10, 1, 0));
    }
}
