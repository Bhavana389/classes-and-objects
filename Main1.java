import java.util.*;
import java.lang.*;
class Calculator
{ 
static double powerInt(int num1,int num2)
      {  double n = Math.pow(num1,num2);
          return n;
       }
  static  double powerDouble(double num1,int num2)
    {  double n1 = Math.pow(num1,num2);
           return n1;
     }
 }
class S1
{ public static void main(String[]args)
     { 
       Calculator.powerInt(12,10);
    System.out.println(" answer is" +n);
       }
}
