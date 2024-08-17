public class Print_SubArray
{
    public static void SubArray(int array[])
    {
        int ts=0;
        for(int i=0;i<array.length;i++)//for Start
        {
            int start=i;
            for(int j=i;j<array.length;j++)//For End
            {
                int end=j;
                for(int k=start;k<=end;k++)//Prints Array
                {
                    System.out.print(array[k]+" ");//Sub Array
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The total subarray is "+ts);
    }
    public static void main(String[] args) 
    {
        int array[]={2,4,6,8,10};
        SubArray(array);
    }
}
