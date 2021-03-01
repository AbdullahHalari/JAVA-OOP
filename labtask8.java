import java.util.*;

import org.graalvm.compiler.nodes.memory.address.AddressNode.Address;

public class labtask8 {
    public static void main(String[] args) {

        // PrintNumber print = new PrintNumber();
        // print.printn(5);
        // print.printn(0.5);
        // print.printn('5');

        // Print obj = new Print();
        // obj.output(6, 'c');
        // obj.output('c', 6);
        
        // Area obj = new Area();
        // obj.area(4,5);
        // obj.area(7);


  //   Scanner sc = new Scanner(System.in);
  //       int j = 5;
  //       Student []s = new Student[5];
  //       int age ;
  //       String name , address ;
  //       System.out.println("\tEnter Details of Students"); 
  //       System.out.println("\n");

  //       for (int i=0; i<j; i++)
  //       {
  //           System.out.println("Enter details of " +(i+1) + " Student"); 
  //           System.out.println("Name : ");
  //           name = sc.next();
       
  //           System.out.println("Age : ");
  //           age = sc.nextInt();

  //           System.out.println("Address : ");
  //           address = sc.next();

  //           s[i] = new Student();
  //           s[i].setinfo(name, age);
  //           s[i].setinfo(name, age, address);

          
  //       }
  //          System.out.println("\t Details of Students Entered");
  //           System.out.println("\n");

  //       for(int i=0; i<j; i++)
  //           {
       
  //           System.out.println("\nDetails of " +(i+1) + " Student is");

  //               s[i].display();
  //  }

        // Degree x = new Degree();
        // Undergraduate a = new Undergraduate();
        // Postgraduate b = new Postgraduate();
        // a.getDegree();
        // b.getDegree();
        // x.getDegree();
  
    //  BankA a = new BankA(1000);
    // BankB b = new BankB(1500);
    // BankC c = new BankC(2000);
    // System.out.println(a.getBalance());
    // System.out.println(b.getBalance());
    // System.out.println(c.getBalance());
    
                // J a = new J();
                // a.i = 5;
                // a.j = 7;
                // a.j = a.i;
                // a.printNum();
  
                // A ob = new A();
                // A obj = new B();
                // ob.parent();
                // obj.parent();
    }
}

//111111111111111
// class PrintNumber{
//     public static void printn(int num){
//       System.out.println(num);
//     }
//     public static void printn(double num){
//       System.out.println(num);
//       }
//     public static void printn(char num){
//       System.out.println(num);
//     }
//   }


// //222222222222222222
//   class Print{
//     public void output(int n, char c)
//      {
//       System.out.println("Integer is: " + n);
//       System.out.println("Character is: " + c);
//      }
//      public void output(char c, int n)
//      {
//       System.out.println("Character is: " + c);
//       System.out.println("Integer is: " + n);
//      }
//    }
   
//   //3333333333333

  // class Area{
  //   public static void area(int length,int breadth){
  //     System.out.println("area of rectangle " + length*breadth);
  //   }
  //   public static void area(int side){
  //     System.out.println("area of square " + side*side);
  //   }
  // }

// //44444444444444444

// class Student{
//  int age;
//  String name, address;
 
//   Student()
//   {
//    name="unknown";
//    age=0;
//    address="not available";  
//   }
  
//  public void setinfo(String nam, int ag)
//   {
//    name=nam;
//    age=ag;
  
//   }
  
//  public void setinfo(String nam, int ag, String addres)
//   {
//     name = nam;
//     age= ag;
//     address=addres; 
//   }
//  public void display()
//   { 
    
    
//     System.out.println("Name : " + name);
//      System.out.println("Age : " + age);
//      System.out.println("Address : "+address);
//     }
// }


  //5555555555555555

  // class Degree{
  //   public void getDegree(){
  //     System.out.println("I got a degree");
  //   }
  // }
  
  // class Undergraduate extends Degree{
  //   public void getDegree(){
  //     System.out.println("I am an Undergraduate");
  //   }
  // }
  
  // class Postgraduate extends Degree{
  //   public void getDegree(){
  //     System.out.println("I am a Postgraduate");
  //   }
  // }
  
  
// //666666666666666666666666



// class Bank
// {
// public int getBalance()
//     {
//         return 0;
//     }
// }

// class BankA extends Bank
// {
//     int amount;

//     BankA(int a)
//     {
//         amount = a;
//     }

//   public  int getBalance()
//     {
//         return amount;
//     }
// }

// class BankB extends Bank
// {
//     int amount;
//     BankB(int a)
//     {
//         amount = a;
//     }

//    public int getBalance()
//     {
//         return amount;
//     }
// };

// class BankC extends Bank
// {
//     int amount;

//     BankC(int a)
//     {
//         amount = a;
//     }

//   public  int getBalance()
//     {
//         return amount;
//     }
// }


//   //7777777777777777777777777

  // class I{
  //   int i;
  //   public void printNum(){
  //     System.out.println(i);
  //   }
  // }
  
  // class J extends I{
  //   int j;
  //   public void printNum(){
  //     System.out.println(j);
  //   }
  // }



//8888888888888888888888888888888

// class A {
//     public void parent() {
        
//         System.out.println("parent");
//     }
// }
// class B extends A{

//     public void parent() {
//         System.out.println("child");
//     }
// }