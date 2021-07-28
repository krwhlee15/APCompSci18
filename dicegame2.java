import java.util.Scanner;
public class dicegame2
{
    public static void main(String[]args)
    {
        Scanner keybd = new Scanner (System.in);
         System.out.println ("Input Gamecount");

         int n = keybd.nextInt ();
         int k = 0;
         double win = 0;
         int fr = 0;
         int sr = 0;

         while (k < n)
         {
             fr = ((int)(Math.random() * 6 + 1) + ((int)(Math.random() * 6) + 1));
             if (fr == 7 | fr == 11)
             {
                 win += 1;
                 k += 1;
             }
                 else if (fr == 2 || fr == 3 || fr == 12)
                 {
                     k += 1;
                 }
             while (fr != 7 && fr != 11 && fr != 2 && fr != 3 && fr != 12)    
             {
                 sr = ((int)(Math.random() * 6 + 1) + ((int)(Math.random() * 6) + 1));
                 if (sr == fr)
                 {
                     win += 1;
                     k += 1;
                     break;
                 }
                    else if (sr == 7)
                          {
                               k += 1;
                               break;
                          }
                      
             }
        }    
        double P = win/n;
        System.out.println(P);
        return;
    }   
}
