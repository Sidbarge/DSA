public class bin_dec 
{
    public static void bintodec(int binnum)
    {
        int pow=0;
        int dec=0;
        int lastdigit;
        while(binnum>0)
        {
            lastdigit=binnum%10;
            dec=dec+(lastdigit*(int)Math.pow(2,pow));
            pow++;
            binnum=binnum/10;
        }
        System.out.println("The decimal of "+binnum+" is "+dec);
    }
    public static void main(String[] args) 
    {
        bintodec(101);
    }
}
