public class Largest_String_Lexicographic 
{
    public static void main(String[] args) 
    {
        String fruit[]={"apple","banana","mango"};
        String largest=fruit[0];
        for(int i=0;i<fruit.length;i++)
        {
            if(largest.compareToIgnoreCase(fruit[i])<0)//It ignore upper or lower case
            {
                largest=fruit[i];
            }
        }
        System.out.println(largest);
    }
}
