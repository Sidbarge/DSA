public class Counting_Sort 
{
    public static void sort(int arr[])
    {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            largest=Math.max(largest, arr[i]);//TO find the largest number to set length of count array
        }
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++)//Iterating over arr array to set frequency of nunber in count array
        {
            count[arr[i]]++;  
        }
        int j=0;
        for(int i=0;i<count.length;i++)
        {
            while(count[i]>0)
            {
                arr[j]=i;
                j++;
                count[i]--;
            }
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
        int arr[]={5,4,1,3,2,1};
        sort(arr);
        printarr(arr);
    }
}
