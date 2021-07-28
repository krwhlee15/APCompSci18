import java.util.Scanner;

public class npa
{
  public static void main (String[]args)
  {
    Scanner keybd = new Scanner (System.in);
      System.out.print ("Enter n to compute the nth prime number: ");
    int nth = keybd.nextInt ();
    int i, j, n, n_prime;
    int primes[];
    boolean is_prime;
    int num = 1;
    int count = 0;

      primes = new int[nth];
      n_prime = 0;
    for (i = 2, n = 0; n < nth; i++)
      {
        is_prime = true;
        for (j = 0; (j < n) && (primes[j] <= (int) Math.sqrt (i)); j++)
          {
            if (i % primes[j] == 0)
              {
                is_prime = false;
                break;
              }
          }

        if (is_prime)
          {
            primes[n] = i;
            n_prime = i;
            n++;
          if (n % 10000 == 0)
            System.out.printf ("%10d: %12d\r", n, i);
          }
      }
    System.out.println ("\nValue of nth prime: " + primes[nth - 1]);
  }
}
