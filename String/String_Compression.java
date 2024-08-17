public class String_Compression 
{
    public static String compress(String str)
    {
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++)//It has time complexity of O(n) as only i is incremented loop will only run upto length of the string
        {
            Integer count=1; //Here Integer is used because later we need to convert it into string which only takes object 
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1)
            {
                sb.append(count);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) 
    {
        String str="aaaabbbccd";
        System.out.println(compress(str));
    }
}
