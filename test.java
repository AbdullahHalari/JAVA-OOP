// import java.util.Scanner;
// import java.util.concurrent.CountDownLatch;

// import jdk.nashorn.internal.codegen.CompileUnit;

// public class lab2task {
    
//     Scanner sc = new Scanner(System.in);
//     public static void main(String[] args){

        
//         lab2task obj = new lab2task();

        // obj.datatypes();
        // obj.rectangle();
        // obj.product();
        // obj.ascii();
        // obj.Double();;
        // obj.ascii_add();
        // obj.addition();
        // obj.square();
        // obj.sum_product();
        // obj.add_product();
        // obj.area();
        // obj.introduction();
        // obj.area_perimeter();
        // obj.string_input();
        // obj.equal();
        // obj.grading();
        // obj.absolute();
        // obj.attendence();
        // obj.medical_cause();
        // obj.switchCase();
        // obj.uppercase();
    //     obj.average();
    // }

    // public void datatypes(){
    //     int a = 4;
    //     float b = 5.5f;
    //     double c = 2.34;
    
    //     System.out.println(a + " " + " " + b + " " +c);
    // }
    
    // public void rectangle(){
    //     int length = 2;
    //     int width = 3;

    //     System.out.println("The area of a rectangle is: " + length*width);
    // }

    // public void product(){
    //     float num1 = (float) 7.2;
    //     int num2 = 6;

    //     System.out.println("The product is: " + num1*num2);

    // }

    // public void ascii(){
    //     char c = 'b';
    //     int d = (int)c;

    //     System.out.println(d);
    // }

    // public void Double(){
    //     double  x = 100.235;
    //     int y = (int)x; 
    //     System.out.println(y);
    // }

    // public void ascii_add(){
    //     char c = 'a';
    //     int d = (int)c + 2;
    //     char x = (char)d;

    //     System.out.println(x);
    // }
    // public void addition(){
    //     double num1 = (double) 6.5;
    //     int num2 = 5;
    //     double num3 = (double) (num1 + num2);

    //     System.out.println("The addition is: " + num3);

    // }

    // public void square(){
    //     float x = 2.9f;

    //     System.out.println(x*x);

    // }

    // public void sum_product(){
    //     System.out.println("Enter First Number: ");
    //     int x = sc.nextInt();

    //     System.out.println("Enter Second Number: ");
    //     int y = sc.nextInt();
    //     System.out.println(x+y);
    //     System.out.println(x*y);

    // }

    // public void add_product(){
    //     System.out.println("Enter First Number: ");
    //     int x = sc.nextInt();

    //     System.out.println("Enter Second Number: ");
    //     int y = sc.nextInt();

    //         int a = x+y;
    //         int b = x*y;
    //     System.out.println("the sum of two is "+ a + " and product of two is " + b);

    // }

    // public void area(){
    //     System.out.println("Enter length: ");
    //     double x = sc.nextDouble();

    //     System.out.println("Enter breadth: ");
    //     double y = sc.nextDouble();

    //        int area = (int) (x*y); 
    //     System.out.println("the area rectangle is: " + area);
    // }

    // public void introduction(){

    //     System.out.println("Enter your name: ");;
    //     String name = sc.nextLine();

    //     System.out.println("Enter your roll_no: ");;
    //     String roll_no = sc.nextLine();

    //     System.out.println("Enter your interest: ");;
    //     String interest = sc.nextLine();

    //     System.out.println("Hey, my name is " + name + ". and my roll number is " + roll_no + ". My field of interest are " + interest);
    // }

    // public void area_perimeter(){

    //     int length;
    //     int breadth;
    //     int Perimeter;
    //     int area;
        
    //     System.out.print("Enter Length: ");
    //     length = sc.nextInt();

    //     System.out.print("Enter Breadth: ");
    //     breadth = sc.nextInt();
		
    //     area = length * breadth;
    //     Perimeter = (length*2) + (breadth*2);
		
    //     System.out.println("Area = " + area);
		
    //     System.out.println("Perimeter = " + Perimeter);
    //     }

    // public void string_input(){

    //     System.out.println("Enter first string: ");;
    //     String first = sc.nextLine();

    //     System.out.println("Enter second string: ");;
    //     String second = sc.nextLine();

        

    //     System.out.println(first + second);
    // }

        // public void equal(){

        //     System.out.print("Enter first number: ");
        //     int x = sc.nextInt();

        //     System.out.print("Enter second number: ");
        //     int y = sc.nextInt();

        //     System.out.print("Enter third number: ");
        //     int z = sc.nextInt();
    
        //     if (x == y && x == z)
        //     {
        //         System.out.println("All numbers are equal");
        //     }
        //     else if ((x == y) || (x == z) || (z == y))
        //     {
        //         System.out.println("Any of two are equal");
        //     }
        //     else
        //     {
        //         System.out.println("All numbers are different");
        //     } 
        // }



    // public void grading(){
        // System.out.println("Enter Marks: ");;
        // int marks = sc.nextInt();

        // if(marks>=90)
        // {
        //     System.out.print("A");
        // }
    //     else if(marks>=86 && marks<89)
    //     {
    //        System.out.print("A-");
    //     } 
    //     else if(marks>=81 && marks<85)
    //     {
    //         System.out.print("B+");
    //     }
    //     else
    //     {
    //         System.out.print("F");
    //     }
    // }

        // public void absolute(){
            // System.out.println("Enter Number: ");;
            // int value = sc.nextInt();

        //     if(value<0)
        //     {
        //         value = (-1) * value; 
        //         System.out.print(value);
        //     }
        //     else {
        //         System.out.println(value);
        //     }
        // }

        // public void attendence(){
        //     System.out.println("Enter Number of classes held: ");;
        //     int held = sc.nextInt();

        //     System.out.println("Enter Number of classes attended: ");;
        //     int attended = sc.nextInt();


        //     int percent =  attended * 100 / held;

        //     System.out.println("Percentage of class attended : "+ percent +"%" );

        //     if(percent>=75){
        //         System.out.println("student is allowed to sit in exam");
        //     }
        //     else{
        //         System.out.println("student is not allowed to sit in exam ");
        //     }
        // }

        // public void medical_cause(){
        //     System.out.println("Enter Number of classes held: ");;
        //     int held = sc.nextInt();

        //     System.out.println("Enter Number of classes attended: ");;
        //     int attended = sc.nextInt();


        //     int percent =  attended * 100 / held;

            // System.out.println("did student has medical cause or not (Y or N): ");;
            // char medical = sc.next().charAt(0);

        //     System.out.println("Percentage of class attended : "+ percent +"%" );

            

        //     if(percent>=75){
        //         System.out.println("student is allowed to sit in exam");
        //     }
        //     else if(medical=='Y' || medical=='y'){
        //         System.out.println("student is allowed to sit in exam");
        //     }
        //     else{
        //         System.out.println("student is not allowed to sit in exam ");
        //     }
        // }

            // public void switchCase()
            //     {
            // System.out.println("Enter Day: ");;
            // String day = sc.next();
                    
            //         switch(day)
            //         {
            //             case "MON":
            //             case "TUE":
            //             case "WED":
            //             case "THU":
            //             case "FRI":
            //             case "SAT":
            //             System.out.println("Working Day");
            //             break;
                                        
                        
            //             case "SUN":
            //             System.out.println("Holiday Day");
            //             break;
                                
            //             default:
            //             System.out.println("Invalid option!");
            //             break;
            //         }
            //     }

            // public void uppercase(){

            //     int character; 
        
            //     for (int i = 65; i <= 90; ++i){ 
            //         System.out.print(" " + i); 
            //     }

            //     for (int j = 65; j <= 90; ++j){ 
            //         System.out.print(" " + (char)j); 
            //     }
                                
            //     }

            // public void average(){
                // int sum = 0;
                // int average ;
                // int product = 1;

                // for(int i=1; i<=100; i++){
                //     System.out.println("Enter integer: ");
                //     int x = sc.nextInt();

                //     sum = sum + x;
                //     average = sum/i;

                //     product = product * i;

                //     System.out.println("Press q to quit: ");
                //     char quit = sc.next().charAt(0);
                //     if(quit == 'q' || quit == 'Q'){
                       
                //         System.out.println("The Average of the Numbers is " + average);
                //         System.out.println("The product of the numbers is " + product);
                //         break;
                //     }
                // }



//                 int count = 0;
//                 int a = 100;
//                 int product = 0; 
//                 while (count<=a) {
//                      System.out.println("Enter Integers");
//                      String x = sc.next();

//                      if (x != "q"){
//                         //  int y = Character.getNumericValue(x);
//                         int y = Integer.parseInt(x);
//                          product = product + y;
//                          System.out.println("Press q when you are done inputting the numbers or enter to continue");
//                          count = count + 1 ;

//                      }
//                      else{
//                          System.out.println("Press q to quit");
//                          break;
//                      }
                   
                

//             }
//             int average = product/count;
                
//                 System.out.println("You Inputed " + count + " Numbers");
//                 System.out.println("The Average of the Numbers is " + average);
//                 System.out.println("The product of the numbers is " + product);
//         }
// }

// #include<stdio.h>

// int main(){
// 	int NUMSTUDENTS ;
// 	printf("Enter Number Of Student: ");
// 	scanf("%d",&NUMSTUDENTS);
	
//     float marks[5][NUMSTUDENTS];
  
	
//     printf("\nEnter the marks of the %d students :\n",NUMSTUDENTS);
    
//     for (int i = 0; i < NUMSTUDENTS; i++)
//     {
//         printf("\nEnter the marks of student :%d\n", i+1);
//         printf("\nMATHS Mark :");
//         scanf("%f", &marks[0][i]);
//         printf("PHYSICS Mark : ");
//         scanf("%f", &marks[1][i]);
//         printf("CHEMISTRY Mark : ");
//         scanf("%f", &marks[2][i]);
//         printf("URDU Mark : ");
//         scanf("%f", &marks[3][i]);
//         printf("\n\n");
//         marks[4][i] = marks[0][i] + marks[1][i] + marks[2][i] + marks[3][i];
//         marks[5][i] = marks[4][i]/400*100;

//     }
//     printf("****************************************\n");
//  	printf("\nStudent_Id\tMATHS\t\tPHYSICS\t\tCHEMISTRY\tURDU\t\t   Total\t  Percentage\n\n");

//     for (int i = 0; i < NUMSTUDENTS; i++)
//     {
//         printf("  00%d\t", i+1);
//         printf("\t  %.0f\t", marks[0][i]);
//         printf("\t  %.0f\t", marks[1][i]);
//         printf("\t  %.0f\t", marks[2][i]);
//         printf("\t %.0f\t", marks[3][i]);
//         printf("      \t %.0f/400*100",marks[4][i]);
//         printf("\t  %.2f percent",marks[5][i]);

//         printf("\n\n");
//     }
//     return 0;
// }





















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

        //  e.getinfo("Ahmed", "karachi", 1989, 95000);
        //  e1.getinfo("Ali", "Islamabad", 2002, 95500);
        //  e2.getinfo("Sara", "Hyderabad", 1991, 8000);

        //  e.printinfo();
        //  e1.printinfo();
        //  e2.printinfo();
        
    //     for(int i=0; i<3; i++)
    //     {
    //         e[i] = new Employee();
    //         e[i].getinfo(Employee_name,City,Year_of_joining,Salary);
    //     }
    //         System.out.print("NAME \t\t");
    //         System.out.print("YEAR_OF_JOINING\t\t");
    //         System.out.print("SALARY\t\t");
    //         System.out.print("CITY\n");
    //     for(int i = 0; i < 3; i++)
    //         {
    //             e[i].printinfo();
    //         }  
    //  }


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
//     // public Employee()
//     //     {

//     //     }
   
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


class Test {
    void my(){
        System.out.println("test");
    }
}
public class  drive() extends Test {
    void my(){
        System.out.println("drive");
    }


public static void main(String[] args) {
    drive obj = new test();
    obj.my();
}
}




