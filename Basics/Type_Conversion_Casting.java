import java.util.*;
public class Type_Conversion_Casting {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //Conversion:
        //int a=sc.nextFloat();---->It is not possible as float can not be converted into int by default by java
        //Conversion---->byte-->short--->int--->float--->long---->double
        float a=sc.nextInt();
        System.out.println(a);
        
        //Casting:
        float b=5.5f;//f should be written as in java decimal number are in double datatype
        //int c=b;----->Cannot be converted by default should be type casted
        int c=(int)b;
        System.out.println(c);



    }
}
