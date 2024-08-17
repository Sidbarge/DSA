public class operator
{
    public static void main(String args[])
    {
        //Binary Operator---->
        //+,-,*,/,%

        //Unary Operator
        int a=10;
        int b=++a;
        System.out.println(a);
        System.out.println(b);

        int c=10;
        int d=c++;
        System.out.println(c);
        System.out.println(d);

        //Relational Operator---->==,!=,>,<,<=,>=

        //Logical operator---->&&,||,!
        System.out.println( (5>4) && (6<8));

        //Assignment Operator----->=,+=,-=,*=,/=
        int A=10;
        //A=A+5;
        A+=5;
        System.out.println(A);
        int B=10;
        //B=B-5;
        B-=5;
        System.out.println(B);

    }
}
