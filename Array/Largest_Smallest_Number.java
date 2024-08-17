public class Largest_Smallest_Number 
{
    public static void largest_smallest(int numbers[])
    {
        int largest=Integer.MIN_VALUE;//-infinity
        int smallest=Integer.MAX_VALUE;//+infinity
        for(int i=0;i<numbers.length;i++)
        {
            if(largest<numbers[i])
            {
                largest=numbers[i];
            }
        }
        for(int i=0;i<numbers.length;i++)
        {
            if(smallest>numbers[i])
            {
                smallest=numbers[i];
            }
        }
        System.out.println("The largest number is "+largest);
        System.out.println("The smallest number is "+smallest);
    }
    public static void main(String[] args) 
    {
        int number[]={4,5,1,7,8,9,6};
        largest_smallest(number);
    }
}
