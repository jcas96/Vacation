import java.util.Scanner;

public class VacationTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//uses the scanner class to scan in user input for vacation information
		System.out.println("Please Enter the Vacation Destination: ");
		String dest = input.next();
		System.out.println("Please enter the Budget");
		double budg = input.nextDouble();
		System.out.println("Please enter the Brand: ");
		String br = input.next();
		System.out.println("Please enter the Rating: ");
		int rate = input.nextInt();
		System.out.println("Please enter the Price: ");
		double pri = input.nextDouble();

		//creates a allInclusiveVacation using the user inputs
		
		AllInclusiveVacation vacay1 = new AllInclusiveVacation(dest, budg , br, rate, pri);
		System.out.printf("The First all-Inclusive vacation is:\n%S\n",vacay1.toString());

		//checks if said vacation is over or underbudget and then prints it out
		if(vacay1.overBudget()<0.0001&&vacay1.overBudget()>-0.0001) {
			System.out.printf("It is on budget");
		}else if(vacay1.overBudget()>0) {
			System.out.printf("It is under budget by $%.2f", vacay1.overBudget());
		}else {
			System.out.printf("It is over budget by $%.2f", -vacay1.overBudget());
		}
		
		
		System.out.println("\nPlease Enter the Vacation Destination: ");
		dest = input.next();
		System.out.println("Please enter the Budget");
		budg = input.nextDouble();
		System.out.println("Please enter the Brand: ");
		br = input.next();
		System.out.println("Please enter the Rating: ");
		rate = input.nextInt();
		System.out.println("Please enter the Price: ");
		pri = input.nextDouble();

		//creates a allInclusiveVacation using the user inputs
		
		AllInclusiveVacation vacay2 = new AllInclusiveVacation(dest, budg , br, rate, pri);
		System.out.printf("\n\nThe Second all-inclusive vacation is: \n%S\n", vacay2.toString());

		//checks if said vacation is over or underbudget and then prints it out
		
		if(vacay2.overBudget()<0.0001&&vacay2.overBudget()>-0.0001) {
			System.out.printf("It is on budget");
		}else if(vacay2.overBudget()>0) {
			System.out.printf("It is under budget by $%.2f", vacay2.overBudget());
		}else {
			System.out.printf("It is over budget by $%.2f", -vacay2.overBudget());
		}

		//CHecks if the vacations are equal to each other using the created equals method
		vacay2.setBrand(vacay1.getBrand());
		vacay2.setPrice(vacay1.getPrice());
		if(vacay1.equals(vacay2)) {
			System.out.printf("\n\nvacay1 and vacay2 are equal");
		}else {
			System.out.printf("\n\nVacay1 and vacay2 are not equal");
		}
		
		vacay2.setDestination(vacay1.getDestination());
		vacay2.setBudget(vacay1.getBudget());
		if(vacay1.equals(vacay2)) {
			System.out.printf("\n\nvacay1 and vacay2 are now equal");
		}else {
			System.out.printf("\n\nVacay1 and vacay2 are not equal");
		}
		
		//uses hardcoded lists as input for the PieceMealVacation
		String[] itemsList1 = {"hotel", "meals", "airfare", "windsurfing" };
		double[] costsList1 = {750.00, 250.00, 400.00 };
		PieceMealVacation pmv1 = new PieceMealVacation("Miami", 1500.00,itemsList1,costsList1);
		System.out.printf("\n\nThe first piecemeal vacation is:\n%S",pmv1.toString());

		//checks if said vacation is over or underbudget and then prints it out
		
		if(pmv1.overBudget()<0.0001&&pmv1.overBudget()>-0.0001) {
			System.out.printf("It is on budget");
		}else if(pmv1.overBudget()>0) {
			System.out.printf("It is under budget by $%.2f", pmv1.overBudget());
		}else {
			System.out.printf("It is over budget by $%.2f", -pmv1.overBudget());
		}

		//uses hardcoded lists as input for the PieceMealVacation
		
		String[] itemsList2 = {"hotel", "meals", "airfare", "windsurfing" };
		double [] costsList2 = {750.00, 250.00, 400.00, 120.00, 200.00 };
		PieceMealVacation pmv2 = new PieceMealVacation("Miami", 1500.00,itemsList2,costsList2);
		System.out.printf("\n\nThe second piecemeal vacation is:\n%S", pmv2.toString());
		
		//checks if said vacation is over or underbudget and then prints it out
		
		if(pmv2.overBudget()<0.0001&&pmv2.overBudget()>-0.0001) {
			System.out.printf("It is on budget");
		}else if(pmv2.overBudget()>0) {
			System.out.printf("It is under budget by $%.2f", pmv2.overBudget());
		}else {
			System.out.printf("It is over budget by $%.2f", -pmv2.overBudget());
		}
		
		if(pmv1.equals(pmv2)) {
			System.out.printf("\n\npmv1 and pmv2 are equal");
		}else {
			System.out.printf("\n\npmv1 and pmv2 are not equal");
		}
		
		pmv2.setItems(itemsList1); 
		pmv2.setCosts(costsList1);
		if(pmv1.equals(pmv2)) {
			System.out.printf("\npmv1 and pmv2 are now equal");
		}else {
			System.out.printf("\npmv1 and pmv2 are not equal");
		}

		input.close();
		
	}
}
