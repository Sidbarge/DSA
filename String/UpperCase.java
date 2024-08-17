public class UpperCase 
{
    public static String uppercase(String str)
    {
        StringBuilder sb=new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)==' ' && i<str.length()-1)
            {
                sb.append(str.charAt(i));//Appends the space
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));//Converts to uppercase and then appends
            }
            else
            {
                sb.append(str.charAt(i));//appends remaining letters
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) 
    {
        String str="hi i am siddharth";
        System.out.println(uppercase(str));
    }
}
