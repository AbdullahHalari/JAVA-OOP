
// // package com.mycompany.getterandsetter;

// /**
//  *
//  */
// public class practice {
//     public String name;
//     private int age;
    
//     public practice(int age, String name)
//     {
//         this.age = age;
//         this.name = name;
//     }
    
//     public void display()
//     {
//         System.out.println(this.age + " and " + this.name);
//     }
    
//     // SETTER - MUTATOR
//     public void setAge(int age)
//     {
//         this.age = age;
//     }
    
//     // GETTER - ACCESSOR
//     public int getAge()
//     {
//         return this.age;
//     }
// }


// // ************
// //  MAIN CLASS
// // ************

// // package com.mycompany.getterandsetter;

// /**
//  *\ munim.khan
//  */
// public class MainClass {
//      public static void main(String args[])
//      {
//          /*
//         practice obj = new practice();
//         obj.name = "Abdullah";
//         obj.setAge(21); 
//          System.out.println("Name : " + obj.name + " and Age is : " + obj.getAge());
//          */
         
//          practice obj = new practice(31, "Abdullah");
//          obj.display();
//      }
// }

// public class practice
// {
// 	public static void main(String[] args) {
// 		// OuterClass ocObj = new OuterClass();
// 		// OuterClass.InnerClass inObj = ocObj.new InnerClass();
// 		// inObj.display();
		
// 		OuterClass.InnerClass innObj = new OuterClass().new InnerClass();
// 		innObj.display();
		
// 		OuterClass.InnerStaticClass iscobj = new OuterClass.InnerStaticClass();
// 		iscobj.S_display();
// 	}
// }


// class OuterClass
// {
//     static String msg = "String";
//     class InnerClass
//     {
//         void display()
//         {
//             System.out.println("Non-Static inner class method invoked with " + msg);
//         }
//     }
    
//     static class InnerStaticClass
//     {
//         void S_display()
//         {
//             System.out.println("Static inner class method invoked with " + msg);
//         }
//     }
// }

class practice{  
    static{
        int a = 5 ;
        int b = 6;
        System.out.println("static block is invoked " + (a+b));}  
    public static void main(String args[]){  
    //  System.out.println("Hello main");  
    }  
  }  