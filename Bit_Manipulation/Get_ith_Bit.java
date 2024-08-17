public class Get_ith_Bit {
    public static int get_ith_Bit(int n,int i)
    {
        int BitMask=1<<i;
        if((n&BitMask)==0)
        {
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args)
    {
        System.out.println(get_ith_Bit(10,2));
    }
}
