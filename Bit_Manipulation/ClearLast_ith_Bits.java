public class ClearLast_ith_Bits {
    public static int ClearLast_ith_Bits(int n,int i) {
        int BitMask=((~0)<<i);
        return n&BitMask;
    }
    public static void main(String[] args)
    {
       System.out.println(ClearLast_ith_Bits(15,2));
    }
}
