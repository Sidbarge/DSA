public class Set_ith_Bit {
    public static int set_ith_Bit(int n,int i)
    {
        int BitMask=1<<i;
        return n|BitMask;
    }
    public static void main(String[] args)
    {
         System.out.println(set_ith_Bit(10, 2));
    }
}
