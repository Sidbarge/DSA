public class EvenOrOdd {
    public static void EvenOrOdd(int num)
    {
        int BitMask=1;
        if((num&BitMask)==0)//The AND operation of 1 with even number is 0
        {
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
    public static void main(String[] args)
    {
         EvenOrOdd(3);
         EvenOrOdd(2);
         EvenOrOdd(7);
    }
}
