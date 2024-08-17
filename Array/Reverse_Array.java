public class Reverse_Array 
{
    public static void Reverse(int array[])
    {
        int start=0;
        int end=array.length-1;
        while(start<end)//Here  by using the swap function we do not need to create duplicate array which increases space complexity
        {
            int temp=array[end];
            array[end]=array[start];
            array[start]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) 
    {
        int array[]={44,55,66,77,88,99};
        System.out.print("The Reverse of the array is ");
        Reverse(array);
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
