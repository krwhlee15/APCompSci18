import java.util.Scanner;
public class montecarlo
{
    public static void main (String[]args)
    {
        Scanner keybd = new Scanner (System.in);

        System.out.println("input n");
        int n = keybd.nextInt ();
        
        System.out.println("input boundary(2 numbers);");
        double a = keybd.nextDouble ();
        double b = keybd.nextDouble ();
        int m = n;
        double x = 0;
        double y = 0;
        double p = 0;

        while (n >= 0)
        {
        x = (Math.random()*(b-a))+a;
        y = (Math.random())*(b*b);
        if ((x*x) > y)
        {
        p += 1;
        }
        n -= 1;
        }
        
        System.out.println((p/m)*(b*b)*(b-a));
        return;
    }
}
