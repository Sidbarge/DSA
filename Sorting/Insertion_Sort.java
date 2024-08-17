public class Insertion_Sort 
{
    public static void sort(int array[])
    {
        for(int i=1;i<array.length;i++)
        {
            int curr=array[i];
            int prev=i-1;//Here this is the first element 
            while(prev>=0 && array[prev]>curr)//Finding the correct position to insert the element
            {
                array[prev+1]=array[prev];
                prev--;
            }
            array[prev+1]=curr;//Used to insert element at correct position
        }
    }
    public static void printarr(int[] array)
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args) 
    {
        int array[]={5,4,1,3,2,6};
        sort(array);
        printarr(array);
    }    
}
