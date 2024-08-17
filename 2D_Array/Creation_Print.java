import java.util.*;
public class Creation_Print 
{
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
    }
}
