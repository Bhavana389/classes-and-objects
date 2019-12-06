import java.util.*;
class Box
{  
double width,depth,breadth;
static double volume;
Box()
{ 
width=0;
 breadth=0;
 depth=0;
}
Box(double a , double b, double c)
      {  width = a;
           breadth = b;
          depth = c;
       }
  double vol(double width, double breadth , double depth)
    { double volume = width *breadth*depth;
        return volume;
    }
public static void main(String[]args)
{
Box b = new Box();

System.out.println( b.vol(2.33,3.44,5.66));
}
}
   
   
           