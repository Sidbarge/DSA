public class Linear_Search 
{
    public static void LinearSearch(int numbers[],int key)
    {
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]==key)
            {
                System.out.println("Key is at index "+i);
            }
            else
            {
                System.out.println("Not Found");
            }
        }
    }
    public static void main(String[] args) 
    {
        int numbers[]={4,5,1,7,9,8,10,6,2,3};
        int key=10;
        LinearSearch(numbers,key);
    }
}
