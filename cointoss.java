import java.util.Scanner;
public class cointoss
{ 
    public static void main (String[]args)
    {
        Scanner keybd = new Scanner (System.in);
         System.out.println ("Enter an integer");

         double n = keybd.nextInt ();
         double k = 1;
         double sum = 0;

         while (k <= n)
          {
              double coin = Math.random();
                 if (coin > 0.5)
                 {
                      coin = 1;
                 }
                 else
                 {
                      coin = 0;
                 }
              sum = sum + coin;
              k = k+1;
          }    
         System.out.println("probability of tail : " + sum/n);
         return;
    }}
