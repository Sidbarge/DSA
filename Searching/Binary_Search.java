public class Binary_Search 
{
    public static int BinarySearch(int array[],int key)
    {
        int start=0;
        int end=array.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(array[mid]==key)
            {
                return mid;
            }
            if(array[mid]<key)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        int array[]={1,4,5,7,8,9,12};
        int key=4;
        System.out.println("The index at which key is "+BinarySearch(array,key));
    }
}
