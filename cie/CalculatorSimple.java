package cie;
import java.util.Scanner;

public class CalculatorSimple {
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the first number:");
int a=scan.nextInt();
System.out.println("Enter the second number:");
int b=scan.nextInt();

System.out.println("Addition :"+(a+b));
System.out.println("Subtraction :"+(a-b));
System.out.println("Multiplication :"+(a*b));
System.out.println("Division :"+(a/b));
}
}
