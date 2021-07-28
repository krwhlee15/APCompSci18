import java.util.Scanner;
public class dicegame
{
    public static void main (String[]args)
    {
        Scanner keybd = new Scanner (System.in);
         System.out.println ("Input Gamecount");

         int n = keybd.nextInt ();
         int k = 0;
         double win = 0;
         int result = 0;

         while (k < n)
         {
            result = ((int)(Math.random() * 6) + 1) +((int)(Math.random() * 6) + 1);
            if (result == 5)
            {
            win += 1;
            k += 1;
            }
            else if (result == 7)
            {
            k += 1;
            }
         }
         double P = win/n; 
         System.out.println(P);
         return;
    }}
