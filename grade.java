import java.util.Scanner;

public class grade
{
  public static void main (String[]args)
  {
    Scanner keybd = new Scanner (System.in);
      System.out.println ("Enter your grade.");

    double A = keybd.nextDouble ();

    if (A >= 90)
     {
         System.out.println ("A");
     }
    else if (A >= 80)
     {
         System.out.println ("B");
     }
    else if (A >= 70)
     {
        System.out.println ("C");
     }
    else if (A >= 60)
     {
        System.out.println ("I");
     }
    else
     {
        System.out.println ("NC");
     }
    return;
 }
}
