public class Diagonal_Sum 
{
    public static void diagonal(int matrix[][])
    {
        int sum=0;
        /*for(int i=0;i<=matrix.length-1;i++)//But here time complexity is O(n^2) which is not optimised solution
        {
            for(int j=0;j<=matrix[0].length;j++)
            {
                if(i==j)//primary diagonal
                {
                    sum+=matrix[i][j];
                }
                else if(i+j==matrix.length-1)//Secocndary diagonal
                {
                    sum+=matrix[i][j];
                }
            }
        }*/
        for(int i=0;i<=matrix.length-1;i++)
        {
            sum+=matrix[i][i];
            if(i!=matrix.length-1-i)// Here to check weather i==j to not repeat the middle element in odd matrix
            {
                sum+=matrix[i][matrix.length-i-1];//j=matrix.length-1-i as i+j=matrix.length-1
            }
        }
        System.out.println(sum);
    }    
    public static void main(String[] args) 
    {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        diagonal(matrix);

    }
}
