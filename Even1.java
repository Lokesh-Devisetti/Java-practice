//Write a JAVAprogram to check whether a number is even or odd.
import java.util.Scanner;
public class Even1{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int number=sc.nextInt();
        if(number%2==0)
        {
            System.out.println(number+" is even");
        }
        else{
        System.out.println(number+" is odd");
        }
    }
}