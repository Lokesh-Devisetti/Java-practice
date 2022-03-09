//Write a JAVAprogram to print all odd number between 1 to 100.
import java.util.Scanner;
public class Odd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value");
        int n=sc.nextInt();
         int i=1;
        while(i<=n)
        {
                System.out.println(i+" is odd number ");
                  i=i+2;
            
        }
    }
}
