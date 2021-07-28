import java.util.Scanner;

public class np
{
  public static void main (String[]args)
  {
    Scanner keybd = new Scanner (System.in);
      System.out.print ("Enter n to compute the nth prime number: ");

    int nth = keybd.nextInt ();
    int i, j, n, n_prime;
    boolean is_prime;
    int num = 1;
    int count = 0;

    n_prime = 0;
    for (i = 2, n = 0; n < nth; i++)
      {
        is_prime = true;
        for (j = 2; j <= (int) Math.sqrt (i); j++)
          {
            if (i % j == 0)
              {
                is_prime = false;
                break;
              }
          }

        if (is_prime)
        {
            n_prime = i;
            n++;
//            if(n % 10000 == 0)
//              System.out.printf("%d: %d\n", n, i);
        }
      }
    System.out.println ("Value of nth prime: " + n_prime);
  }
}
