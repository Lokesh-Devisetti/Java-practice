//Write a JAVA program to input basic-salary of an employee and calculate its Gross salary according to following:
//BasiJAVASalary <= 10000 : HRA = 20%, DA = 80%
//BasiJAVASalary <= 20000 : HRA = 25%, DA = 90%
//BasiJAVASalary > 20000 : HRA = 30%, DA = 95%
import java.util.Scanner;
class Gross
{
 public static void main(String args[]) 
 {
  double Basic_salary,DA,HRA,da1,hra1,GrossPayment;
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter Basic Salary Of Employee: ");
  Basic_salary=scan.nextDouble();
  //System.out.println("Enter Basic DA Of Employee: "); 
  //da1=scan.nextDouble();
  //System.out.println("Enter Basic HRA Of Employee: ");
  //hra1=scan.nextDouble();
  if(Basic_salary<=10000)
  {
   DA=0.80*Basic_salary;
   HRA=0.20*Basic_salary;
  }
   else if(Basic_salary<=20000)
  {
   DA=0.90*Basic_salary;
   HRA=0.25*Basic_salary;
  }
   else
  {
   DA=0.95*Basic_salary;
   HRA=0.30*Basic_salary;
  }
  GrossPayment=Basic_salary+DA+HRA;
  System.out.println("Gross Salary Of Employee: "+GrossPayment);
  }
}