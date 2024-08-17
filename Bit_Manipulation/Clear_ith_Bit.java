public class Clear_ith_Bit {
    public static int clear_ith_Bit(int n,int i)
    {
        int BitMask=~(1<<i);
        return n&BitMask;
    }
    public static void main(String[] args)
    {
         System.out.println(clear_ith_Bit(10, 1));
    }
}
