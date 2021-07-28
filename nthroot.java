import java.util.Scanner;
public class nthroot 
{
    public static void main (String[]args)
    {
     Scanner keybd = new Scanner (System.in);
        System.out.println("Enter the number.");
       System.out.print("n for nth root : ");
        double n = keybd.nextDouble();
        System.out.print("Value to take sqrt : ");
        double k = keybd.nextDouble();
       System.out.print("approximation : ");
        double xI = keybd.nextDouble();
       System.out.print("errorbound : ");
        double errorbound = keybd.nextDouble();

        double xII = 0;
        double error = 1;

        while (error > errorbound)
        {
            xII = xI - ((Math.pow(xI,n) - k)/(n*Math.pow(xI,(n-1))));
            error = Math.abs((xII-xI) / xII);
            xI = xII;
        }

        if (n == 2)
        {
            System.out.println("Sqrt = " + xII);
        }
        else if (n == 3)
        {
            System.out.println("Cbrt = " + xII);
        }
        else
        {
            System.out.println(k +"th root = " + xII);
        }
       return;
    }
}
