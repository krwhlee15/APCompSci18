import java.util.Scanner;
public class integral
{
    public static void main (String[]args)
    {
        Scanner keybd = new Scanner (System.in);

        System.out.println ("Enter two numbers");
        double a = keybd.nextDouble ();
        double b = keybd.nextDouble ();
        double sum = 0;

        System.out.println ("Enter n");
        int n = keybd.nextInt ();
        int m = 0;
        
        double area = 0;

        while (m <= n)
        {
           area = Math.pow((a+(m*((b-a)/n))),2)*((b-a)/n);
           sum += area;
           m += 1;
        }

        System.out.println ("Area = " + sum);
    }
}
