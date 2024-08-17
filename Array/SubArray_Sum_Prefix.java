import java.util.*;
public class SubArray_Sum_Prefix 
{
    public static void SubArray(int array[])
    {
        int MaxSum=Integer.MIN_VALUE;
        int CurrSum=0;
        int prefix[]=new int[array.length];
        prefix[0]=array[0];
        for(int i=1;i<array.length;i++)//for calculating prefix array
        {
            prefix[i]=prefix[i-1]+array[i];
        }
        for(int i=0;i<array.length;i++)//for Start
        {
            int start=i;
            for(int j=i;j<array.length;j++)//For End
            {
                int end=j;
                CurrSum=start==0?prefix[end]:prefix[end]-prefix[start-1];
                if(MaxSum<CurrSum)
                {
                    MaxSum=CurrSum;
                }    
            }
        }
        System.out.println("The Maximum sum is "+MaxSum);
    }
    public static void main(String[] args) 
    {
        int array[]={2,4,6,8,10};
        SubArray(array);
    }
}
