import java.util.*;


public class lab7task{
    public static void main(String[] args){

    Parent p = new Parent();
    Child c = new Child();
    p.parent();
    c.child();
    p.parent();

    Employee e = new Employee();
    e.name = "Abdullah";
    e.age = 20;
    e.number = "021458793";
    e.address = "abcd road karachi";
    e.salary = 80000;
    e.specialization = "CS";
    e.printSalary();
    System.out.println(e.name+ "\n" + e.age +"\n" + e.number+"\n" +e.address+"\n" + e.specialization + "\n");


    Manager m = new Manager();
    m.name = "Ahmed";
    m.age = 21;
    m.number = "01258793";
    m.address = "qwe road lahore";
    m.salary = 70000;
    m.department = "Computer Science";
    m.printSalary();
    System.out.println(m.name+ "\n" + m.age +"\n" + m.number+"\n" +m.address+"\n" +m.department);

    

    Rectangle r = new Rectangle(2, 2);
    Square s = new Square(2);
    r.area();
    r.perimeter();
    s.area();
    s.perimeter();

    Square sq = new Square();  
    sq.shape();    
    sq.rectangle();  
  }
}

 //1111111111111111111111111111111111
class Parent{
    public void parent(){

      System.out.println("This is parent class");
    }
  }
  
  class Child extends Parent{
    public void child(){
      System.out.println("This is child class");
    }
  }


   //222222222222222222222222222222222222222
class Member{
    String name;
    int age;
    String number;
    String address;
    int salary;
  
    public void printSalary(){

      System.out.println(salary);
   
    }
  
  }
  
  class Employee extends Member{
 
    String specialization;

  }
  
  class Manager extends Member{
    String department;
  }


// //3333333333333333333333

class Rectangle
{
    int length,breadth;

    Rectangle(int len, int brea)
    {
        length = len;
        breadth = brea;
    }

    void area()
    {
        
        System.out.println("Area = "+ length*breadth);
    }

    void perimeter()
    {
        System.out.println("Perimeter = " + (2*(length+breadth)));
        
    }
};

class Square extends Rectangle
{
    Square(int s){
        super(s,s);
    }
     
}


// //444444444444444444444444444

class Shape{
  public void shape(){
    System.out.println("This is shape");
  }
}

class Rectangle extends Shape{
  public void rectangle(){
    System.out.println("This is rectangular shape");
  }
}

class Circle extends Shape{
  public void circle(){
    System.out.println("This is circular shape");
  }
}

class Square extends Rectangle{
  public void square(){
    System.out.println("Square is a rectangle");
  }
}
