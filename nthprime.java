import java.util.Scanner;
 
public class nthprime
{
    public static void main(String[] args)
    {
       Scanner keybd = new Scanner (System.in);
       System.out.print("Enter n to compute the nth prime number: ");
         
           int nth = keybd.nextInt();
           int i;
           int num=1;
           int count=0;
             
           while (count < nth)
           {
           num=num+1;
           for (i = 2; i <= num; i++)
           {
           if (num % i == 0)
           {
           break;
           }
           }
           if ( i == num)
           {
           count = count+1;
           }
           }
           System.out.println("Value of nth prime: " + num);
    }
}
