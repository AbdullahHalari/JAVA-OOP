import java.util.acanner;

public class q2{

    Scanner ac =new acanner(System.in);

    public static void main(String[] args) {
        q2 obj = new q2();
        
        obj.test();
    } 

    public void test() {
        float num[][] = new float[8][5];
        for(int i=0; i<=4; i++) { 
        System.out.println("\nenter the num of student no: " + (i+1) );
            System.out.print("\nMATHS Mark : ");
            num[0][i] = ac.nextInt();
            System.out.print("\nPHYSICS Mark : ");
            num[1][i] = ac.nextInt();
            System.out.print("\nCHEMISTRY Mark : ");
            num[2][i] = ac.nextInt();
            System.out.print("\nURDU Mark : ");
            num[3][i] = ac.nextInt();
            System.out.print("\nOOP Mark : \n");
            num[4][i] = ac.nextInt();
            num[5][i] = num[0][i] + num[1][i] + num[2][i] + num[3][i] + num[4][i];

            num[6][i] = num[5][i]/500*100;
            num[7][i] = num[6][i];
        }
         System.out.println("number\tMATHS\t\tPHYSICS\t\tCHEMISTRY\tURDU\t\tOOP\t\tTotal\t   Percentage\tGrade\n");

         for (int i = 0; i < 5; i++)
    {
        System.out.print(i+1);
        System.out.print("       \t" +  num[0][i]);
        System.out.print("\t       \t" +num[1][i]);
        System.out.print("\t       \t" +num[2][i]);
        System.out.print("\t       \t" +num[3][i]);
        System.out.print("\t       \t" + num[4][i]);
        System.out.print("           \t" + num[5][i]);
        System.out.print("      \t" +num[6][i]);
        
        if(num[7][i]>=80)
        {
            System.out.print("\tA");
        }
        else if(num[7][i]>=60 && num[7][i]<80)
        {
           System.out.print("\tB");
        } 
        else if(num[7][i]>=40 && num[7][i]<60)
        {
            System.out.print("\tC");
        }
        else
        {
            System.out.print("\tD");
        }
        System.out.println("\n\n");
    }
       
 }


}



