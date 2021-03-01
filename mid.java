import java.util.*;
;public class mid {
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
     
        // Shipping obj = new Shipping();
		// obj.storeinfo();
		// Account ob = new Account();
		// ob.calculateSaving();

		Person per[] = new Person[5];
		for (int i = 0; i<=4; i++){
			String name = sc.nextLine();
			String city = sc.nextLine();
			per[i] = new Person(name,city);

		}

		Person p = new Person();
		int count = p.totalPersonLivingInLondon();

		System.out.println("mid.main()");
		// for(int i = 0; i<=4; i++){
		// 	per[i].london();
		// }

    }
}
// class Shipping {

//     Scanner input = new Scanner(System.in);
//     public void storeinfo(){
        

// 		// Prompt the user to enter the weight of the package
// 		System.out.print("Enter the weight of the package: ");
// 		double weight = input.nextDouble();

// 		// Calculate cost of shipping
		// if (weight > 50)
		// 	System.out.println("The package cannot be shipped.");
		// else
		// {
// 			double costPerPound; 
// 			if (weight > 0 && weight <= 1)
// 				costPerPound = 3.5;
// 			else if (weight <= 3)
// 				costPerPound = 5.5;
// 			else if (weight <= 10)
// 				costPerPound = 8.5;
// 			else //if (weight <= 20)
// 				costPerPound = 10.5;
// 			System.out.println("Shipping cost of package is $" +
// 				costPerPound * weight);
// 		}
//     }

// }
// class Account{

//     public void calculateSaving(){
//         Scanner input = new Scanner(System.in);	// Create a new Scanner object.
// 		 double MONTHLY_INTEREST_RATE = 0.00417;	// Initialize constant value

// 		// Prompt the user to enter a montly saving amount
// 		System.out.print("Enter the monthly saving amount: ");
// 		double savingAmount = input.nextDouble();

// 		// Compute first month account value
// 		double total = savingAmount * (1 + MONTHLY_INTEREST_RATE);
// 		// Compute second month account value
// 		total = (savingAmount + total) * (1 + MONTHLY_INTEREST_RATE);
// 		// Compute third month account value
// 		total = (savingAmount + total) * (1 + MONTHLY_INTEREST_RATE);
// 		// Compute forth month account value
// 		total = (savingAmount + total) * (1 + MONTHLY_INTEREST_RATE);
// 		// Compute fifth month account value
// 		total = (savingAmount + total) * (1 + MONTHLY_INTEREST_RATE);
// 		// Compute sixth month account value
// 		total = (savingAmount + total) * (1 + MONTHLY_INTEREST_RATE);

// 		// Display result
// 		System.out.println("After the sixth month, the account value is " + total);
//     }
// }
class Person {

	String name, city;

	Person(String name ,String city){
		this.name = name;
		this.city = city;

	}
	Person(){

	}

	
	// String [] red_marbles;
	// red_marbles = new String[city];
	// int [] red_marbles = new int[city];

	int totalPersonLivingInLondon(){
		int count = 0;
	
	for (int i = 0; i < 5; i++)
	{
		if(per.city=="london"){
			count = count + 1;
		}
	}

	return count;

	}
}