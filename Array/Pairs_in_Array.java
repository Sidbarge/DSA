public class Pairs_in_Array 
{
    public static void Pairs(int array[])
    {
        int TotalPairs=0;
        for(int i=0;i<array.length;i++)
        {
            int curr=array[i];
            for(int j=i+1;j<array.length;j++)
            {
                System.out.print("("+curr+","+array[j]+")");
                TotalPairs++;
            }
            System.out.println();
        }
        System.out.println("The total pairs are "+TotalPairs);//Formula for Total Pairs is tp=n(n-1)/2
    }
    public static void main(String[] args) 
    {
        int array[]={2,4,6,8,10};
        Pairs(array);
    }
}
