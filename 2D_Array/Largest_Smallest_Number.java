
import java.util.*;
public class Largest_Smallest_Number 
{
    public static void largest_smallest(int matrix[][])
    {
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
         for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                largest=Math.max(largest,matrix[i][j]);
                smallest=Math.min(smallest, matrix[i][j]);
            }
        }
        System.out.println("The largest number is "+largest);
        System.out.println("The smallest number is "+smallest);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[3][3];
        int n=matrix.length, m=matrix[0].length;//or we can write 3 for number of number of row and columns
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        largest_smallest(matrix);
    }
}
