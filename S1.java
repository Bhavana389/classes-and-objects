import java.util.*;
import java.lang.*;
class S1
{ 
public static void main(String[]args)
     {  
       System.out.println(Calculator.powerDouble(13,14));
         System.out.println(Calculator.powerInt(12,10));
       }
}
class Calculator
{ 
Calculator()
{ int num1 =0;
 int  num2 = 0;
}
Calculator(double n,int n1)
{ double num1 = n;
 int  num2=n1;
}
Calculator(int n,int n1)
{ int num1 = n;
 int num2=n1;
}
static double powerInt(int num1,int num2)
      {  double n = Math.pow(num1,num2);
          return n;
       }
  static  double powerDouble(double num1,int num2)
    {  double n1 = Math.pow(num1,num2);
           return n1;
     }
 }
