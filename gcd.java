import java.util.Scanner;
public class gcd
{
    public static void main (String[]args)
    {
        Scanner keybd = new Scanner (System.in);
        
        System.out.println("Enter two integer");
        int a = keybd.nextInt ();
        int b = keybd.nextInt ();
        int c = 1;

        while (c > 0)
        {
            c = (b % a);
            b = a;
            if(c != 0)
            {
                a = c;
            }
        }

        System.out.println("GCD = " + a);
        return;
    }
}
