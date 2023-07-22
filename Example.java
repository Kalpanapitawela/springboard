import java.util.*;
class Example{
public static void main(String args[]){
Scanner input=new Scanner(System.in);
System.out.print("Input number 1 : ");
int num1=input.nextInt();
System.out.print("Input number 2 : ");
int num2=input.nextInt();
System.out.println(num1+" "+num2);
//-----------Do not modify before this line--------
int num3=num1;
num1=num2;
num2=num3;
//-------Do not modify after this line---------------
System.out.println(num1+" "+num2);
}
}