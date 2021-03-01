import java.util.*;

public class lab5tasks
{

    public static void main(String[] args)
    {
        test obj  = new test();
        // System.out.println(obj.even());
        obj.even();

        // Courses s = new Courses();
        // Courses c = new Courses("physics");

        // System.out.println(s.message);
        // System.out.println(c.message);



        // Scanner sc = new Scanner(System.in);
     
        // Rectangle []r = new Rectangle[3];
        
        // for(int i = 0; i<3; i++)
        // {
        //  r[i] = new Rectangle();  
        // }
        // // r[0] = new Rectangle();
        // // r[1] = new Rectangle(4);
        // // r[2] = new Rectangle(7,8);
        
        // for(int i = 0; i<3; i++)
        // {

        //     System.out.println("Area is: " + r[i].area());

        // }
        
        // Scanner sc = new Scanner(System.in);
     
        // Student []r = new Student[3];
        
        // for(int i = 0; i<3; i++)
        // {
        //    String name = sc.nextLine();
        //   String  roll_no = sc.nextLine();

        //  r[i] = new Student(name, roll_no);  
        // }
        
        // for(int i = 0; i<3; i++)
        // {

        //     r[i].display();
        //     // System.out.println(r[i].display());

        // }
        // r[0].display();

    }
}
// class Courses
// {
//     String message;
//     String course;
 
//     public  Courses(){
//          message = "I am not enrolled in any course yet";
//      }
//     public Courses(String name)
//     {
//         course = name;
//          message = "I am not enrolled in any course yet " + name;
//      }
// }

// class Rectangle{

//    float length;
//    float breadth;

//     public Rectangle(){

//        float length = 0;
//        float breadth = 0;
        
//     }

//     public Rectangle(float r){

//         length=breadth=r;

//     }
//     public Rectangle(float length,float breadth){
//         this.length = length;
//         this.breadth = breadth;

//     }
//     public float area(){

//         return length*breadth;
//     }

// }
// class Student{
//     Scanner sc = new Scanner(System.in);

//     String name;
//     String roll_no; 

//     Student(String name, String roll_no){

//         this.name = name;
//         this.roll_no = roll_no;
//         // name = sc.nextLine();
//         // roll_no = sc.nextLine();
    
//     }
//      public void display()
//     {

//         System.out.println(name+roll_no);
//     }

    
// }

class test{
    // int x = 8;
public void even(){


    // for(int i =1; i<=8; i++){
    //     if(i%2==0){
    //         System.out.println(i);

    //     }
    //     // else{

    //     // }
    //     // System.out.println("even are: \n" + (i%2==1) );
    // }
    // for(int i = 10; i>=1; --i)
    // {
    //     System.out.println(i);
    // }
    Scanner in = new Scanner(System.in);

    System.out.print("Input floating-point number: ");
    double x = in.nextDouble();
    System.out.print("Input floating-point another number: ");
    double y = in.nextDouble();

     if(x==y){
         System.out.println("error");

     }
     else{
         System.out.println("diff");
     }

    }
}