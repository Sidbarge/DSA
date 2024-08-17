public class UpperCaseToLowerCase {
    public static void main(String[] args)
    {
        char a='B';
        int BitMask=1<<5;
        a=(char)(a|BitMask);
        System.out.println("The LowerCase value is "+a);
    }
}
