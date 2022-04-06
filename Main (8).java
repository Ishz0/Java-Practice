import java.util.*;
class A
{

 public int id=10;
 public String name="ishan";

 void print()
 {
     System.out.println("From A class\n"+id+name);
 }
 
 public A()
 {
     System.out.println("A Constructor\n");
 }
}
class B extends A
{
  void print()
 {
     System.out.println("From B class\n");
 }
 
 public B()
 {
     super.print();
     System.out.println("B Constructor\n");
     System.out.println("From B class\n"+super.id+super.name);
 }
}

class C extends B
{
    void print()
 {
     System.out.println("From C class\n"+id+name);
 }
 
 public C()
 {
     super();
     System.out.println("C Constructor\n");
 }
}

class Main
{
  public static void main (String[] args)
  {
  C c = new C();
  c.print();
  }
}


