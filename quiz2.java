public class quiz2

{

public static void main(String[] args) {

        A pera = new A(40, 30, 80);
       System.out.println("Percentage of A = " + pera.getPercentage());
       

       B perb = new B(50, 84, 62, 79);
       System.out.println("Percentage of B = " + perb.getPercentage());

}

}

abstract class  Marks {

   public abstract float getPercentage();
}

class A extends Marks{

   float marks1, marks2, marks3;

   A(float marks1, float marks2, float marks3){

       this.marks1=marks1;
       this.marks2=marks2;
       this.marks3=marks3;

   }

   public float getPercentage(){

       float percent = (marks1 + marks2 + marks3)/300*100;
       return percent;
   }

}

class B extends Marks{

    float marks1, marks2, marks3, marks4;

   B(float marks1, float marks2, float marks3, float marks4){

    this.marks1=marks1;
    this.marks2=marks2;
    this.marks3=marks3;
    this.marks4 = marks4;

   }

   public float getPercentage(){

       float percent =(marks1+marks2+marks3+marks4)/400*100;
       return percent;

   }

}