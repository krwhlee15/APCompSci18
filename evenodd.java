import java.util.Scanner;

public class evenodd{
    public static void main(String[] args){
        Scanner keybd = new Scanner(System.in);
        System.out.println("Enter an integer.");
       
        int n = keybd.nextInt();
        if(n%2 == 0){
            System.out.println("even");}
        else{
            System.out.println("odd");}
        return;
    }}
