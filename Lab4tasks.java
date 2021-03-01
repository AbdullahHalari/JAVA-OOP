// import java.util.*;

// import sun.jvm.hotspot.tools.SysPropsDumper;


// public class Lab4tasks {

    
//     public static void main(String[] args) 
//     {
    //     Student stu = new Student();
    //     System.out.println(stu.name + "\n" + stu.roll_no);


    //     Student stu = new Student();
    //     System.out.println("NAME: "+stu.name + "\n" + "ROLL_NO: "+stu.roll_no + "\n" + "AGE: " +stu.age + "\n" + "ADDRESS: " + stu.address + "\n");

    //     Student stu1 = new Student();
    //     System.out.println("NAME: "+ stu1.name1 + "\n" + "ROLL_NO: "+ stu1.roll_no1 + "\n" + "AGE: " + stu1.age1 + "\n" + "ADDRESS: " +  stu1.address1);


    //     Area lb = new Area();

    //     System.out.println("Enter length: ");
    //    float l = in.nextFloat();

    //    System.out.println("Enter breadth: ");
    //    float b = in.nextFloat();

    //        lb.setValues(l,b);
    //        System.out.println("AREA: " + lb.getArea());


    //     Average avg_cla = new Average();
    //     avg_cla.calculateAverage();


        // Employee e = new Employee();
        // Employee e1 = new Employee();
        // Employee e2 = new Employee();


        // System.out.print("NAME \t\t");
        // System.out.print("YEAR_OF_JOINING\t\t");
        // System.out.print("SALARY\t\t");
        // System.out.print("CITY\n");

        //  e.getinfo("Ahmed", "karachi", 1989, 85000);
        //  e1.getinfo("Ali", "Islamabad", 2002, 95500);
        //  e2.getinfo("Sara", "Hyderabad", 1991, 8000);

        //  e.printinfo();
        //  e1.printinfo();
        //  e2.printinfo();
        
    


    // Employee emp = new Employee();
		
    // Scanner sc = new Scanner(System.in);
    
    
    
    // System.out.println("Enter salary");
    // float salary = sc.nextFloat();
    
    // System.out.println("Enter no. of hours of work");
    // float hours = sc.nextFloat();
    
    
    //  emp.getInfo(salary, hours);
    //  emp.AddBonus();
    //  emp.AddWork();
    //  emp.printSal();
		

    // }
//     }

// }
// //1111111
// class Student{
//     String name = "Ahmed";
//     int roll_no = 102;
    
// }
// //222222
// class Student{
//    String name = "Ahad";
// int roll_no = 101;
// int age = 23;
// String address = "karachi,Pakistan" ;

// String name1 = "Ali";
// int roll_no1 = 102;
// int age1 = 34;
// String address1 = "lahore,Pakistan" ;

// }
// //3333333
// class Area{
 

//     float length;
//     float breadth;

// public void setValues(float length, float breadth){

//     this.length = length;
//     this.breadth = breadth;
// }

// public float getArea(){

//     return length * breadth;

// }

// }

// //444444
// class Average {
//     Scanner in = new Scanner(System.in);

//     float x,y,z;

//     public void calculateAverage(){

//         System.out.print("Enter the first number: ");
//         float X = in.nextFloat();

//         System.out.print("Enter the second number: ");
//         float Y = in.nextFloat();
        
//         System.out.print("Enter the third number: ");
//         float Z = in.nextFloat();

//         System.out.print("The average of entered numbers is:" +((float)(X+Y+Z)/3) );
//     }


// }
//******5555 */
// class Employee{

//     String Employee_name;
//     String City;
//     int Year_of_joining;
//     int Salary;
    
   
//     public void getinfo(String Employee_name,String City,int Year_of_joining, int Salary){
        
//          this.Employee_name = Employee_name;
//          this.City = City;
//          this.Year_of_joining = Year_of_joining;
//          this.Salary = Salary;
         
//     }
    

//     public void printinfo(){


//         System.out.println(Employee_name + "\t\t       "+ Year_of_joining + "\t\t" + Salary + "\t\t"+ City);
       
//     }
// }

////66666
// class Employee {
	
//     float salary, hours;
   

   
//    public void getInfo( float sal, float hr) {
//        salary = sal;
//        hours = hr;
//    }
   
//    public float AddBonus() {
//        if(salary<600) {
//            salary = salary + 15;
//        }
//        return salary;
//    }
   
//    public float AddWork() {
//        if(hours > 8) {
//            salary = salary + 10;
//        }
//        return salary;
//    }
//        public void printSal() {
//        System.out.println("Salary : $" + salary);
//    }
// }