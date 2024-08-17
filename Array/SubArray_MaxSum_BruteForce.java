//This is solved by burte force method 
//Here time complpexity is O(n^3) which is very bad
public class SubArray_MaxSum_BruteForce 
{
    public static void SubArray(int array[])
    {
        int CurrSum=0;
        int MaxSum=Integer.MIN_VALUE;//-infinity
        for(int i=0;i<array.length;i++)//for Start
        {
            int start=i;
            for(int j=i;j<array.length;j++)//For End
            {
                CurrSum=0;
                int end=j;
                for(int k=start;k<=end;k++)//Prints Array
                {
                    CurrSum+=array[k];
                }
                System.out.println(CurrSum);
                if(MaxSum<CurrSum)
                {
                    MaxSum=CurrSum;
                }
            }
            System.out.println();
        }
        System.out.println("The Maximum Sum is "+MaxSum);
    }
    public static void main(String[] args) 
    {
        int array[]={2,4,-6,8,10};
        SubArray(array);
    }
}
