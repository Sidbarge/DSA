public class charAt_Method 
{
    public static void PrintLetters(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) 
    {
        String FullName="Siddharth Barge";
        PrintLetters(FullName);
    }
}
