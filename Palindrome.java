 
import java.util.Scanner;
public class Palindrome{
    public static void main(String args[])
    {
        int number,reminder,sum=0,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter any number you want to reverse:");
        number=sc.nextInt();
        temp=number;
        while(number>0){
            reminder=number%10;
            sum=(sum*10)+reminder;
            number=number/10;
        }
        if(temp==sum)
        System.out.println("palindrome");
        else
        System.out.println("not palindrome");
    }
}