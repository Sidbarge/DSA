import java.util.*;
public class Strings
{
    public static void main(String[] args) 
    {
        char arr[]={'a','b','c','d'};
        String str="abcd";
        String str2=new String("xyz");
        //Strings are immutable
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        String name;
        name=sc.next();//It only inputs a single word It does not consider word after space
        System.out.println(name);
        String str3;
        str3=sc1.nextLine();//It inputs the entire line
        System.out.println(str3);

        //TO FIND LENGTH OF THE STRING

        System.out.println(name.length());//Here we write () parenthesis

        //CONCATENATION

        String FirstName="Siddharth";
        String LastName="Barge";
        String FullName=FirstName+" "+LastName;
        System.out.println(FullName);

        System.out.println(FullName.charAt(5));//Used to print Character at given index
    }
}