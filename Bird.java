import java.util.*;
class Bird extends Animal
{ void sleep()
{ System.out.println("bird  is sleeping");
}
void eat()
{
System.out.println("bird is eating");
}
void fly()
{ System.out.println("bird is flying");
}
public static void main(String[]args)
{ Animal a = new Animal();
 Bird b= new Bird();
   a.eat();
   a.sleep();
   b.eat();
  b.sleep();
  b.fly();
}
}
class Animal
{ void sleep()
{ System.out.println("animal is sleeping");
}
void eat()
{ System.out.println("animal is eating");
}
}
