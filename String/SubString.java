public class SubString 
{
    public static String Sub_String(String str,int st,int en)
    {
        String substr="";
        for(int i=st;i<en;i++)
        {
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) 
    {
        String str="HelloWorld";
        System.out.println(str.substring(0, 5));
        System.out.println(Sub_String(str, 0, 5));
    }   
}
