import java.util.*;
public class Search_Brute_Method
{
    public static boolean search(int matrix[][],int key)
    {
         for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==key)
                {
                    System.out.println("Found the key at "+"("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Not found element");
        return false;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[3][3];
        int n=matrix.length;//For rows
        int m=matrix[0].length;//for columns//or we can write 3 for number of number of row and columns
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
        search(matrix, 5);
    }
}

