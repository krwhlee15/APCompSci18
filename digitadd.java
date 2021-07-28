import java.util.Scanner;
public class digitadd
{
    public static void main (String[]args)
    {
        Scanner keybd = new Scanner (System.in);
         System.out.println ("Enter an integer");

         int n = keybd.nextInt ();
         int sum = 0;

         while (n > 0)
         {
             sum += (n % 10);
             n /= 10;
         }
         System.out.println ("Sum of all the digits : " + sum );
         return;
    }}
