import java.util.Scanner;
public class birthday
{
    public static void main (String[]args)
    {
        Scanner keybd = new Scanner (System.in);
         System.out.println("Enter n, n>1, n<366 ");

        int n = keybd.nextInt ();
        double product = 1;
        double P = 1;
        double whole = Math.pow (365,n);    
        double result;
        for(int i = 0; i < n; i++)
        {
         product *= (365-i);
        }
        result = P - (product/whole);
    System.out.println(result);

        return;
    }
}
