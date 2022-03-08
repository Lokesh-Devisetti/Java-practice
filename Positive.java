//Write a JAVAprogram to check whether a number is negative, positive or zero.
import java.util.Scanner;
public class Positive
{
    public static void main(String args[])
    {
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number you want to check:");
        number=sc.nextInt();
        if(number>0)
            System.out.println(number+" is positive number");
        else if(number<0)
            System.out.println(number+" is negative number");
        else
            System.out.println(" it's a zero");        
    }
}