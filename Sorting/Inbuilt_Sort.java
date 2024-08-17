import java.util.*;
public class Inbuilt_Sort 
{
    public static void printarr(Integer[] array)
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args) 
    {
        Integer arr[]={3,1,2,5,4};
        //Arrays.sort(arr);//This is an inbuilt function to sort array
        //Arrays.sort(arr,0,3);  //It is used for partial sorting.Here if we want to sort elements from 0 to 2 
                                //then we should write (0,3) it is non inclusive
        Arrays.sort(arr,Collections.reverseOrder());
        printarr(arr);
    }
}
