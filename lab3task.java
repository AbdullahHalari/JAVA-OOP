import java.util.*;

public class lab3task{

    Scanner sc =new Scanner(System.in);

    public static void main(String[] args) {

        lab3task obj = new lab3task();
        
        obj.calculate_grade();
    } 

    public void calculate_grade() {
        float marks[][] = new float[8][5];
        
        for(int i=0; i<=4; i++) { 

        System.out.println("\nenter the marks of student no: " + (i+1) );
            System.out.print("\nMATHS Mark : ");
            marks[0][i] = sc.nextInt();
            System.out.print("\nPHYSICS Mark : ");
            marks[1][i] = sc.nextInt();
            System.out.print("\nCHEMISTRY Mark : ");
            marks[2][i] = sc.nextInt();
            System.out.print("\nURDU Mark : ");
            marks[3][i] = sc.nextInt();
            System.out.print("\nOOP Mark : ");
            marks[4][i] = sc.nextInt();
            marks[5][i] = marks[0][i] + marks[1][i] + marks[2][i] + marks[3][i] + marks[4][i] ;
            marks[6][i] = marks[5][i]/500*100;
            marks[7][i] = marks[6][i];
        
        }

         System.out.println("*******************************************************************************************************************");
         System.out.println("Student_No\tMATHS\t\tPHYSICS\t\tCHEMISTRY\tURDU\t\tOOP\t\tTotal\t    Percentage\t\tGrade\n");

         for (int i = 0; i < 5; i++)
    {
        System.out.print(i+1);
        System.out.print("       \t" +  marks[0][i]);
        System.out.print("\t       \t" +marks[1][i]);
        System.out.print("\t       \t" +marks[2][i]);
        System.out.print("\t       \t" +marks[3][i]);
        System.out.print("\t       \t" + marks[4][i]);
        System.out.print("           \t" + marks[5][i]);
        System.out.print("      \t" +marks[6][i]);
        
        if(marks[7][i]>=80)
        {
            System.out.print("\t\tA");
        }
        else if(marks[7][i]>=60 && marks[7][i]<80)
        {
           System.out.print("\t\tB");
        } 
        else if(marks[7][i]>=40 && marks[7][i]<60)
        {
            System.out.print("\t\tC");
        }
        else
        {
            System.out.print("\t\tD");
        }

        System.out.println("\n\n");
    }
       
 }


}



