import java.util.*;
class Patients
{ 
 public static void main(String[]args)
  {  Patient p = new Patient();
    p.name();
   p.BMI(3.24 , 4.56);
   System.out.println( p.BMI(3.24 , 4.56));
}
}
class Patient
{ String name ;
  double weight ;
   double height ;
 Patient()
{ name = "  ";
  weight = 0;
  height = 0;
}
Patient(double a, double b)
{ 
 weight = a;
  height = b;
}
  void name()
 { 
Scanner sc = new Scanner(System.in);
      System.out.println("enter name");
    name=sc.nextLine();
}
  double BMI( double weight,double height)
{  
   double bmi = ((weight * 2.2)/(height *12*height*12))*703;
    return bmi;
}
}

   
     
    

