//Raul E Gonzalez (rgonzalez365@toromail.csudh.edu)

package CSC_Assignments;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TipCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double happyLvl;
		double happyTip;
		final double TAX = .0713;
		DecimalFormat f = new DecimalFormat("#.##");
		
		Scanner firstIn = new Scanner(System.in);
		System.out.print("Enter bill amount: ");
		double billAmt = firstIn.nextDouble();
		
		if (billAmt < 0) {
			System.out.println("Bill amount can not be less than 0.");
			System.exit(0);
		}
		
		Scanner secondIn = new Scanner(System.in);
		System.out.print("How happy are you with the service [1-5]: ");
		int happyInput = firstIn.nextInt();
		
		if (happyInput < 1 || happyInput > 5 ) {
			System.out.println("Happiness amount must be in the range of [1-5].");
			System.exit(0);
		}
		
		double taxAmt = billAmt * TAX;
		
		System.out.println("\nYour bill total\t\t\t\t: " + billAmt);
		System.out.println("Tax(@7.13%)\t\t\t\t: " + f.format(taxAmt));
		
		switch (happyInput) {
		case 1:
			happyLvl = .05;
			happyTip = billAmt * happyLvl;
			System.out.println("Tip(@5%) based on happiness value\t: " +  f.format(happyTip));
			System.out.println("Total Payable\t\t\t\t: " + f.format((billAmt + taxAmt + happyTip)));

			break;
		case 2:
			happyLvl = .075;
			happyTip = billAmt * happyLvl;
			System.out.println("Tip(@7.5%) based on happiness value\t: " + f.format(happyTip));
			System.out.println("Total Payable\t\t\t\t: " + (billAmt + taxAmt + happyTip));

			break;
		case 3:
			happyLvl = .10;
			happyTip = billAmt * happyLvl;
			System.out.println("Tip(@10%) based on happiness value\t: " + f.format(happyTip));
			System.out.println("Total Payable\t\t\t\t: " + f.format((billAmt + taxAmt + happyTip)));

			break;
		case 4:
			happyLvl = .15;
			happyTip = billAmt * happyLvl;
			System.out.println("Tip(@15%) based on happiness value\t: " + f.format(happyTip));
			System.out.println("Total Payable\t\t\t\t: " + f.format((billAmt + taxAmt + happyTip)));

			break;
		case 5:
			happyLvl = .20;
			happyTip = billAmt * happyLvl;
			System.out.println("Tip(@20%) based on happiness value\t: " + f.format(happyTip));
			System.out.println("Total Payable\t\t\t\t: " + f.format((billAmt + taxAmt + happyTip)));

			break;
		default:
			// No need for a default. 
		}
	}
}
