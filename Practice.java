import java.util.*;
public class Practice
{
    public static float shortestPath(String path)
    {
        int x=0,y=0;
        for(int i=0;i<path.length();i++)
        {
            char dir=path.charAt(i);
            if(dir=='N')
            {
                y++;
            }
            else if(dir=='S')
            {
                y--;
            }
            else if(dir=='E')
            {
                x++;
            }
            else{
                x--;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args)
    {
        String fruits[]={"apple","mango","banana"};
        String largest=fruits[0];
        for(int i=0;i<fruits.length;i++)
        {
            if(largest.compareToIgnoreCase(fruits[i])<0)
            {
                largest=fruits[i];
            }
        }
        System.out.println(largest);
    }
}