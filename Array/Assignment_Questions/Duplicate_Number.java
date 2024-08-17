//Method 1
//This is solved by brute force
public class Duplicate_Number 
{
    public static boolean duplicate(int number[])
    {
        
        for(int i=0;i<(number.length-1);i++)
        {
            for(int j=i+1;j<number.length;j++)
            {
                if(number[i]==number[j])
                {
                    return true;
                }
                
            }
        }
        return false;
    }
    public static void main(String[] args) 
    {
        int number[]={1,2,3,1};
        System.out.println(duplicate(number));
    }
}
