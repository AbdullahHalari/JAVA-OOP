// // package examples;

// import java.util.Scanner; //library for input

// /**
//  *
//  * @author rida.ayesha
//  */
// public class classandexamplecode 
// {

//     //object of Scanner class for input
//    Scanner sc = new Scanner(System.in);

//    //instance variables
//     String fname , lname, fullName;
//     int age;
//     float height;
//     char gender;
//     boolean isPakistani;
//     double salary;
        
    // public static void main(String[] args) 
    // {
//         classandexamplecode obj = new classandexamplecode();
        
//  //       obj.dataTypes();
//  //       obj.input();
//  //       obj.output();
//       //  obj.typeCasting();
//      //   obj.typeCasting2();       
//      //   obj.ifElse();
//     //    obj.nested_if_Else();
//         obj.if_Else_If();
// //        obj.switchCase();
// //        obj.nested_Switch_Case();      
// //        obj.forLoop();
// //        obj.doLoop();
//       //  obj.breakStatement();
//       //  obj.continueStatement();
// //        obj.whileLoop();
// //        obj.arrayInitialization();
// //        obj.forEachLoop();
        
//     }
    
    
//     public void dataTypes()
//     {
//         //local variables of each data type
//         String fname ="Ahmed", lname = "Khan", fullName = "Ahmed Khan";
//         int age=50;
//         float height=6.2f;
//         char gender = 'M';
//         boolean isPakistani = true;
//         double salary = 98750.76;
        
//         //printing in one statement
        
//         System.out.println("Age = "+age +"\nFirst Name = "+fname+ "\nLast Name = "+lname +"\nFull Name = " +fullName+ "\nHeight = "+height+"\nGender = "+gender+"\nIs Pakistani? "+isPakistani);
        

//     }
    
//     public void input()
//     {
        
//         System.out.println("Enter First Name: ");
//         fname = sc.next();
        
//         System.out.println("\nEnter Last Name: ");
//         lname = sc.next();
        
//         sc.nextLine(); //onsume the leftover new line by using the nextLine() method.
        
//         System.out.println("\nEnter Full Name:\n");
//         fullName = sc.nextLine(); //method to read a string after whitespace
        
//         System.out.println("Enter Age: ");
//         age = sc.nextInt();
        
//         System.out.println("Enter Height: ");
//         height = sc.nextFloat();
        
//         System.out.println("Enter Gender: (M/F) ");
//         gender = sc.next().charAt(0);
        
//         System.out.println("Enter Salary: ");
//         salary = sc.nextDouble();
       
//         System.out.println("Enter Status as TRUE/FALSE: (Is Pakistani National?)");
//         isPakistani = sc.nextBoolean();
//     }
    
//     public void output()
//     {
//         System.out.println("First Name = " +fname);
//         System.out.println("Last Name = " +lname);
//         System.out.println("Full Name = " +fullName);
//         System.out.println("Age = " +age);
//         System.out.println("Height = " +height);
//         System.out.println("Gender = " +gender);
//         System.out.println("Salary = " +salary);
//         System.out.println("Is Pakistani Status = " +isPakistani);
        
//         //printing by one statement      
        
//         System.out.println("Age = "+age +"\nFirst Name = "+fname+ "\nLast Name = "+lname +"\nFull Name = " +fullName+ "\nHeight = "+height+"\nGender = "+gender+"\nIs Pakistani? "+isPakistani);
        
//     }
 
    
//     public void typeCasting()
//     {
//         //implicit type casting
//         int y =5;
//         float f =y;
//         System.out.println("Converted value in float from int = "+f);
        
//         //explicit type casting
//         float f2 =6.5f;
//         int z = (int)f2;
//         System.out.println("Converted value in int from float = "+z);
        
//         //implicit type casting
//         char c = 'A';
//         int n = c;
//         System.out.println("Integer representation of A = "+n);
        
//         //explicit type casting
//         int d = 65;
//         char ch = (char)d;
//         System.out.println("Character representation of 65 = "+ch);
        
//         int a = 3;
//         Integer in = 5;    
//         in++;
//         System.out.println("Integer value = "+in);
//         //int converted in string
//         String str = in.toString();    
//         //str++; //this will give error now
//         System.out.println("Converted string from integer: " +str);
        
//         String num = "10";
//         //num++; will give error
//         //converting string to int
//         int con = Integer.parseInt(num);
//         con++;
//         System.out.println("Converted integer from string: "+con);
        
//         //converting string to float
//         float fl = Float.parseFloat(num);
//         fl+=3;
//         System.out.println("Converted float from string: "+fl);
//     }
    
//     public void typeCasting2()
//     {
//         //ASCII VALUES AND CHARACTER FROM A-Z
//         for (int i = 65; i <=90; i++) 
//         {
//             System.out.println("ASCII  value of " +(char)i +" is = " +i);
//         }
        
     
//     }
    
//     public void breakStatement()
//     {
//          //break statement
//         for (int i = 65; i <=90; i++) 
//         {
//             if (i == 70) 
//             {
//                 System.out.println("ASCII  value of " +(char)i +" is = " +i);
//                 break;
                              
//             }
//             else
//             {
//                 System.out.println("ASCII  value of " +(char)i +" is = " +i);
//             }
            
            
//         }
        
//     }
    
// // continue statement
//     public void continueStatement()
//     {     
       
//         for (int i = 65; i <=90; i++) 
//         {
//             if (i==67) 
//             {
//                 continue;
//             }
//             else
//             {
//                 System.out.println("ascii  value of " +(char)i +" is = " +i);
//             }
            
            
               
//         }
//     }
    
//     public void ifElse()
//     {
//         System.out.println("\nEnter Age: ");
//         int age = sc.nextInt();
//         if(age == 18)
//         {
//             System.out.println("Eligible for license..!!");
            
//         }
//         else
//         {
//             System.out.println("Not eligible for license..!!");
//         }
//     }
    
//     public void nested_if_Else()
//     {
//         String country = "Pakistan";
//         String city = "Karachi";
//         if (country.equals("Pakistan"))
//         {
//             if(city.equals("Karachi"))
//             {
//                 System.out.println("Initial Dialing code for PTCL numbers is +9221");
//             }
//         }
//     }
     
//     public void if_Else_If()
//     {
//         float marks=83.5f;
	
//         if(marks>80)
//         {
//           System.out.println("A+");
// 	}
// 	else if(marks>=70 && marks <80)
//         {
// 		 System.out.println("A");
// 	}
// 	else if(marks>=60 && marks <70)
//         {
// 		 System.out.println("B");
// 	}
//         else if(marks>=50 && marks <60)
//         {
// 		 System.out.println("C");
// 	}
// 	else
//         {
// 		 System.out.println("Fail!");
// 	}
        
//     }
//     public void switchCase()
//     {
//         String day = "MON";
//         int age = 6;
//         char c = 'M';
//         float sal = 70000.45f; //not allowed in switch
//         switch(day)
//         {
//             case "MON":
//             case "TUE":
//             case "WED":
//             case "THU":
//             case "FRI":
//             case "SAT":
//             System.out.println("Shop Open!");
//             break;
                               
            
//             case "SUN":
//             System.out.println("Working day!");
//             break;
                    
//             default:
//             System.out.println("Invalid option!");
//             break;
//         }
        
        
//     }
    
//     public void nested_Switch_Case()
//     {
        
//         String day = "MON";
//         String time = "Evening";

//         switch(day)
//         {           
//             case "MON":
//             case "TUE":
//             case "WED":
//             case "THU":
//             case "FRI":
//             case "SAT":
//             switch(time)
//             {
//                 case "Morning":
//                 System.out.println("Shop Open!");
//                 break;
                    
//                 case "Evening":
//                 System.out.println("Shop Closed!");
//                 break;
                    
//                 default:
//                 System.out.println("Invalid option!");
//                 break;
                    
//             }
            
//             break;
                               
            
//             case "SUN":
//             System.out.println("Shop Closed!");
//             break;
                    
//             default:
//             System.out.println("Invalid option!");
//             break;
//         }
        
//     }
       
//     public void forLoop()
//     {
//         for (int i = 0; i < 5; i++)
//         {
//             System.out.println(i);    
//         }
//     }
    
//     public void whileLoop()
//     {
//         boolean b = true;
//         int n =1;
//         while(b!=false)
//         {
//             System.out.println(n);           
//             if (n==3)
//             {
//                 b = false;
//             }
            
//             n++;
//         }
//     }
    
//     public void doLoop()
//     {
//         int m=1;
//         do
//         {
//             System.out.println(m);
//             m++;
//         }
//         while(m<=3);
//     }
    
//     public void arrayInitialization()
//     {       
//         int [] nums = {1,2,3,4,5};
//         String [] names = {"Ali ", "Ahmed", "Bilal"};
//         char cl []= {'#','%'};
//         float fl [] ={4.5f, 7.5f, 8f};
//         double dl [] = {3.5555,6,7.87767,9.99999999};
        
//         //declaration
        
//         int [] arr1 = new int[3];
//         String [] arr2 = new String[4];
//         float [] arr3 = new float [5];
//         char [] arr4 = new char [6];
//         double [] arr5 = new double [5];
        
//         //initialization - hard code
//         arr1[0] = 40;
//         arr1[1] = 30;
//         System.out.println(arr1[0] + arr1[1]);
        
//         //user input for integer array
        
//         for (int i = 0; i < arr1.length; i++)
//         {
//           System.out.println("Enter numbers: ");
//           arr1[i] = sc.nextInt();
                  
//         }
        
//         //output integer array
//         for (int i = 0; i < arr1.length; i++)
//         {
//             System.out.println(arr1[i]);    
//         }
           
       
//     }
//     //enhanced-for loop 
//     // for-each loop
//     public void forEachLoop()
//     {
//         int [] id = {1,2,3,4,5};
//         for(int i:id)
//         {
//             System.out.println(i);
//         }
//     }
    
    
// }


////////////////////////////////////////////////////////////////// Class Work Code - Lab 02 & 03/////////////////////////

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package javaapplication2;

// import java.util.Scanner;

// /**
//  *
//  * @author rida.ayesha
//  */
// public class JavaApplication2 
// {
//         Scanner sc = new Scanner(System.in);

//     int age=3;
//     char gender ='f';
//     float height = 5.2f;
//     String uni = "MAJU";
//     boolean isPresent = true;
    
//     public static void main(String[] args)
//     {
//        // System.out.println("hi");
//         //System.out.println("Hi");
//         //System.out.println("hello");
        
//         JavaApplication2 j = new JavaApplication2();
//         //j.typeCast();
        
//         j.myMethod4();
// //        System.out.println(j.myMethod());
// //        
// //        int r = j.myMethod();
// //        if (j.myMethod() ==2)
// //        {
// //            
// //        }
// //        if (r ==5) {
// //            System.out.println("5 retunred");
// //        }
// //        
// //        else
// //                {
// //                    System.out.println("5 not returned");
// //                }
// //            
        
        
//         //method invocation
//         //method calling
//       // j.input();
//         //j.output();
//     }
    
//     public void input()
//     {
//        // Scanner sc = new Scanner(System.in);
//         System.out.println("\nEnter uni name:");
//         uni = sc.nextLine();
//         System.out.println("\nEnter age: ");
//         age = sc.nextInt();
        
//         System.out.println("\nEnter height: ");
//         height = sc.nextFloat();
//         System.out.println("\nIs the student present? ");
//         isPresent = sc.nextBoolean();
//         System.out.println("\nEnter gender: ");
//         gender = sc.next().charAt(0);
        
//     }
    
//     public void output()
//   {
// //        int id=3;
// //        System.out.println("id = " +id);
//           System.out.println("Age = "+age);  
//           System.out.println("Gender "+gender);
          
//           System.out.println("\nAge = "+age+"\nGender = "+gender+"\nHeight = "+height + "\nUni name = "+uni +"\nIs the studetn present? "+isPresent);
//     }
    
    
//     public void typeCast()
//     {
//         int i =6;
//         float f = i;
//         System.out.println(f);
        
//         float fl = 5.5f;
//         int y = (int)fl;
//         System.out.println(y);
        
//         int in = 'A';
//         System.out.println(in);
        
//        // char c = 'A';
//         //int z = c;
        
//         int w = 65;
//         char x = (char)w;
//         System.out.println(x);
        
//         //wrapper classes
//         Integer in1 = 4;
//         in1++;
//        String s = in1.toString();
//         //s++;
        
//         String st = "30";
//         //st++;
//       int it =  Integer.parseInt(st);
//       it++;
//       int num1 =  Integer.parseInt("5");
//     float ff =   Float.parseFloat(st);
      
//         for (int j = 65; j <=90; j++) 
//         {
//             System.out.println("ASCII value of " +(char)j +" is = " +j );
//         }
    
//     }
    
    
//     public int myMethod()
//     {
//         int [] num1 = {1,2,3,5,6,7,33,4,5};
//         String [] cities = {"karachi", "london", "isl"};
//         float [] f = {1.5f,30f, 8.f};
//         char [] c = {'#', 'a'};
//         double [] d = {3.444, 5.5};
        
//         System.out.println(num1[0]);
//         System.out.println(num1[1]);
//         //for- each
//         //enhanced for
//         System.out.println("by enhanceed for");
//         for(int z:num1)
//         {
//             System.out.println(z);
            
//         }
        
//         System.out.println("by for loop");
//         for (int i = 0; i < num1.length; i++) 
//         {
//             System.out.println(num1[i]);
//         }
        
//         return 0;
//     }
    
    
//     public void myMethod2()
//     {
//         String days = "mon";
//         char opr = '+';
//         int n = 6;
//         switch(days)
//         {
//             case "mon":
//             case "tue":
//             case "wed":             
//             case "thurs":         
//             case "fri":
//             System.out.println("Working day");
//             break;
                
              
//             case "sat":
//             case "sun":
//             System.out.println("Holiday!!");       
//                 break;
                
//             default:
//             System.out.println("invalid option");
//             break;
            
//         }
        
//     }
    
    
//     public void myMethod3()
//     {
//         for (int i = 0; i < 5; i++) {
//             if (i==3) 
//             {
//               System.out.println(i);
//               continue;
                
//             }
//             else
//             {
//                 System.out.println(i);
//             }
//         }
        
        
//     }
    
//     public void myMethod4()
//     {
//        String name = "ahmed";
//        boolean b =  name.equals("Ali");
//         if (b == true) 
//         {
//             System.out.println("name is Ali ");
            
//         }
//         else
//         {
//             System.out.println("Name is not ali");
            
//         }
//         if (name.equals("Ali"))
//         {
//             System.out.println("name is ali");
//         }
        
//         else
//         {
//             System.out.println("name is not ali");
            
//         }
        
        
//     }
// }

// package assign;

// /**
//  *
//  * @author rida.ayesha
//  */
// public class Assign 
// {

//     /**
//      * @param args the command line arguments
//      */
//     public static void main(String[] args) 
//     {
   
//      //MAKE METHODS FOR EACH TASK AND CALL THEM IN MAIN()
//       Assign obj = new Assign();
//       obj.q1();
//       obj.q2();
//     }
    
//     //for task 1
//       public void q1()
//         {
//             double d =55.6;
//             char c ='@';
//             int i =7;
            
//             System.out.println(d +"\n" +c + "\n"+ i);
            
//         }
    
//       //for task 2
//       public void q2()
//       {
          
          
//       }
// }
// package inputinjava;
// import java.util.Scanner;

// public class InputInJava 
// {

//     public static void main(String[] args) 
//     {      
//        Data obj = new Data();
//        obj.input();
//        obj.output();
                
//     }
    
// }

// class Data
// {   
//     Scanner sc = new Scanner(System.in);

//     String fname , lname, fullName;
//     int age;
//     float height;
//     char gender;
//     boolean isPakistani;
//     double salary;
        
//     public void input()
//     {
        
//         System.out.println("Enter First Name: ");
//         fname = sc.next();
        
//         System.out.println("\nEnter Last Name: ");
//         lname = sc.next();
        
//         sc.nextLine(); //onsume the leftover new line by using the nextLine() method.
        
//         System.out.println("\nEnter Full Name:\n");
//         fullName = sc.nextLine(); //method to read a string after whitespace
        
//         System.out.println("Enter Age: ");
//         age = sc.nextInt();
        
//         System.out.println("Enter Height: ");
//         height = sc.nextFloat();
        
//         System.out.println("Enter Gender: (M/F) ");
//         gender = sc.next().charAt(0);
        
//         System.out.println("Enter Salary: ");
//         salary = sc.nextDouble();
       
//         System.out.println("Enter Status as TRUE/FALSE: (Is Pakistani National?)");
//         isPakistani = sc.nextBoolean();
//     }
    
//     public void output()
//     {
//         System.out.println("First Name = " +fname);
//         System.out.println("\nLast Name = " +lname);
//         System.out.println("\nFull Name = " +fullName);
//         System.out.println("\nAge = " +age);
//         System.out.println("\nHeight = " +height);
//         System.out.println("\nGender = " +gender);
//         System.out.println("\nSalary = " +salary);
//         System.out.println("\nIs Pakistani Status = " +isPakistani);
        
//     }
    
// }

