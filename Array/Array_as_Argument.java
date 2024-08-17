public class Array_as_Argument 
{
    public static void updation(int marks[],int n)
    {
        for(int i=0;i<marks.length;i++)
        {
            n=5;
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) 
    {
        int marks[]={97,98,99};
        int n=10;
        updation(marks,n);
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
        System.out.println(n);
    }
}
