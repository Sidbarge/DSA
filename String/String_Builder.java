public class String_Builder 
{
    public static void main(String[] args) 
    {
        StringBuilder sb= new StringBuilder("");
        for(char ch='a';ch<='z';ch++)
        {
            sb.append(ch);
        }
        sb.toString();
        System.out.println(sb);
        System.out.println(sb.length());

    }
}
