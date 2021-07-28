import java.util.Scanner;

public class f2c{
    public static void main(String[] args){
        Scanner keybd = new Scanner(System.in);
        System.out.println("Enter temp. in Fahrenheit.");
        
        double fahr;
    	fahr = keybd.nextDouble();
        double cent;
        cent = (fahr-32)*(5.0/9.0);
        System.out.println("Temperature in Celsius = " + cent);
        return;
    }}
