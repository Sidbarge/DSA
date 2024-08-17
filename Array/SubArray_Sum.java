public class SubArray_Sum 
{
    public static void Sum(int array[])
    {   
        int sum=0;
        for(int i=0;i<array.length;i++)
        {
            int start=i;
            for(int j=i;j<array.length;j++)
            {
            int end=j;
            sum=0;
            for(int k=start;k<=end;k++)
            {
                
                System.out.print(array[k]+" ");
                sum+=array[k];
            }
            System.out.println("The sum of above array is "+sum);}
            
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        int array[]={2,4,6,8,10};
        Sum(array);
    }
}
