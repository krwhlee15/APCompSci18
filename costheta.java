import java.util.Scanner;
public class costheta
{
  public static void main (String[]args)
  {
    Scanner keybd = new Scanner (System.in);
      System.out.println ("input theta");
    double theta = keybd.nextDouble ();
      System.out.println ("input errorbound");
    double errorinput = keybd.nextDouble ();
    int n;
    int m = 1;
    double error;
    int factorial;
    double result = 1;
    double E;
    double S1;
    double S2 = 0;

    do
      {
      n = 2*m;
      factorial = 1;
	while (n >= 1)
	  {
	    factorial *= n;
	    n--;
	  }
	E = Math.pow ((-1), m) * Math.pow (theta, 2*m) / factorial;
        S1 = S2;

	S2 += E;
	m++;
	error = Math.abs ((S2 - S1) / S2);
      }
    while (error > errorinput);

    result += S2;
    System.out.println ("The answer is " + result);
    return;
  }
}
