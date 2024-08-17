public class SubArray_Sum_KADANEs 
{
    public static void kadanes(int array[])
    {
        int CurrSum=0;
        int MaxSum=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++)
        {
            CurrSum+=array[i];
            if(CurrSum<0)
            {
                CurrSum=0;
            }
            MaxSum=Math.max(MaxSum, CurrSum);
        }
        System.out.println(MaxSum);
    }
    public static void main(String[] args) 
    {
        int array[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(array);
    }
}
