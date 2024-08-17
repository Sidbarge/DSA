import java.util.*;
public class Operations
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int marks[]=new int[5];//Creating Array
        //Inputting value in the array
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        //Print the array
        System.out.println("Phy:"+marks[0]);
        System.out.println("Chem:"+marks[1]);
        System.out.println("Maths:"+marks[2]);
    }
}
