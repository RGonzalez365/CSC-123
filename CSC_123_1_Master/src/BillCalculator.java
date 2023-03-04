// Title: Assignment 02  THIS IS THE UPDATED ONE WITHOUT A PACKAGE!!!
// Author: Raul E Gonzalez
// E-mail: Rgonzalez365@toromail.csudh.edu
// Date: 03/03/2023

import java.text.DecimalFormat;
import java.util.Scanner;

public class BillCalculator {

	public static void main(String[] args) {
		DecimalFormat f = new DecimalFormat("#.##");
		String format = "%-55s%s%n";
		double monthlyCharge;
		double feeMin;
		double feeMsg;
		double feeData;
		double totalMin, totalMsg, totalData;
		final double tax = .065;
		
		Scanner firstIn = new Scanner(System.in);
		System.out.print("Voice call minutes: ");
		double vCallMin = firstIn.nextDouble();
		if(vCallMin < 0) {
			System.out.println("\nMinutes must be equal or greater than 0.");
			System.exit(0);
		}
		
		Scanner secondIn = new Scanner(System.in);
		System.out.print("Text messages sent: ");
		double tMsg = firstIn.nextDouble();
		if(tMsg < 0) {
			System.out.println("\nSMS messages must be equal or greater than 0.");
			System.exit(0);
		}
		
		Scanner thirdIn = new Scanner(System.in);
		System.out.print("MBs of data used: ");
		double megaBytes = firstIn.nextDouble();
		if(megaBytes < 0) {
			System.out.println("\nMB of data must be equal or greater than 0.");
			System.exit(0);
		}
		
		Scanner fourthIn = new Scanner(System.in);
		System.out.print("Package code [1-3]: ");
		int packCode = firstIn.nextInt();
		
		if (packCode < 1 || packCode > 3 ) {
			System.out.println("\nYou must enter a Pack Code in range of [1-3].");
			System.exit(0);
		}
		
		System.out.println("\nSummary of Usage:");
		double addVoice = 0, addText = 0, addMB = 0, totalAmt = 0, stateTaxTotal = 0;
		switch (packCode) {
		case 1:
			monthlyCharge = 20;
            //-----------------------------------------------------------------------------------------------------------
            if (vCallMin <= 100 && vCallMin >= 0) {
                System.out.println("\nYou used " + vCallMin + "/100 minutes, you are within your monthly limit.");
            }
            else if (vCallMin > 100) {
                System.out.println("\nYou used " + vCallMin + "/100 minutes, you exceeded yout monthly limit.");
				addVoice = (vCallMin - 100) * .2;
            }

            //------------------------------------------------------------------------------------------------------------
            if (tMsg <= 150 && tMsg >= 0) {
                System.out.println("You used " + tMsg + "/150 SMS messages, you are within your monthly limit.");
            }
            else if (tMsg > 150) {
                System.out.println("You used " + tMsg + "/150 SMS messages, you exceeded yout monthly limit.");
				addText = (tMsg - 150) * .2;
            }
            //----------------------------------------------------------------------------------------------------------
            if (megaBytes <= 1024 && megaBytes >= 0) {
                System.out.println("You used " + megaBytes + "/1024 MB of data, you are within your monthly limit.");
            }
            else if (megaBytes > 1024) {
                System.out.println("You used " + megaBytes + "/1024 MB of data, you exceeded yout monthly limit.");
				addMB = (megaBytes - 1024) * .25;
            }
			
			//System.out.println("\nCharges:" + addVoice);
			System.out.println("\nCharges:");
			
			System.out.println("\nPack code" + "\t\t\t\t\t\t\t\t:" + packCode);
			System.out.println("Monthly charges" + "\t\t\t\t\t\t\t\t:" + monthlyCharge);
			if (vCallMin > 100) {
				
				System.out.println(("Additional voice charges (" + (vCallMin - 100) + " minute @ 0.20 per minute)" + "\t\t\t:" + addVoice));
			}			
			else {
				System.out.println("Additional voice charges (0 minute @ 0.20 per minute)" + "\t\t\t:0.00");
			}
			if (tMsg > 150) {
				
				System.out.println(("Additional SMS charges (" + (tMsg - 150) + " SMS messages @ 0.20 per SMS)"+ "\t\t:" + addText));
			}			
			else {
				System.out.println("Additional SMS charges (0 SMS messages @ 0.20 per SMS)" + "\t\t\t:0.00");
			}
			if (megaBytes > 1024) {
				
				System.out.println(("Additional data charges (" + (megaBytes - 1024) + " MB of data @ 0.25 per MB of data)" + "\t:" + addMB));
			}			
			else {
				System.out.println("Additional data charges (0 MB of data @ 0.25 MB of data)" + "\t\t:0.00");
			}
			totalAmt = monthlyCharge + addVoice + addText + addMB;
			stateTaxTotal = (totalAmt * tax);
			System.out.println("Sub Total" + "\t\t\t\t\t\t\t\t:" + totalAmt);
			System.out.println("State Tax(6.5%)" + "\t\t\t\t\t\t\t\t:" + f.format(stateTaxTotal));
			System.out.println("Total due" + "\t\t\t\t\t\t\t\t:" + f.format(totalAmt + stateTaxTotal));
			break;
		case 2:
			monthlyCharge = 30;
			
            //-----------------------------------------------------------------------------------------------------------
            if (vCallMin <= 200 && vCallMin >= 0) {
                System.out.println("\nYou used " + vCallMin + "/200 minutes, you are within your monthly limit.");
            }
            else if (vCallMin > 100) {
                System.out.println("\nYou used " + vCallMin + "/200 minutes, you exceeded yout monthly limit.");
				addVoice = (vCallMin - 200) * .13;
            }

            //------------------------------------------------------------------------------------------------------------
            if (tMsg <= 300 && tMsg >= 0) {
                System.out.println("You used " + tMsg + "/300 SMS messages, you are within your monthly limit.");
            }
            else if (tMsg > 300) {
                System.out.println("You used " + tMsg + "/300 SMS messages, you exceeded yout monthly limit.");
				addText = (tMsg - 300) * .1;
            }
            //----------------------------------------------------------------------------------------------------------
            if (megaBytes <= 2048 && megaBytes >= 0) {
                System.out.println("You used " + megaBytes + "/2048 MB of data, you are within your monthly limit.");
            }
            else if (megaBytes > 2048) {
                System.out.println("You used " + megaBytes + "/2048 MB of data, you exceeded yout monthly limit.");
				addMB = (megaBytes - 2048) * .2;
            }
			
			System.out.println("\nCharges:");
			
			System.out.println("\nPack code: " + packCode);
			System.out.println("Monthly charges: " + monthlyCharge);
			if (vCallMin > 200) {
				
				System.out.println(("Additional voice charges (" + (vCallMin - 200) + " minute @ 0.13 per minute)" + "\t\t\t:" + addVoice));
			}			
			else {
				System.out.println("Additional voice charges (0 minute @ 0.13 per minute)" + "\t\t\t:0.00");
			}
			if (tMsg > 300) {
				
				System.out.println(("Additional SMS charges (" + (tMsg - 300) + " SMS messages @ 0.10 per SMS)" + "\t\t:" + addText));
			}			
			else {
				System.out.println("Additional SMS charges (0 SMS messages @ 0.10 per SMS)" + "\t\t\t:0.00");
			}
			if (megaBytes > 2048) {
				
				System.out.println(("Additional data charges (" + (megaBytes - 2048) + " MB of data @ 0.20 per MB of data)" + "\t:" + addMB));
			}			
			else {
				System.out.println("Additional data charges (0 MB of data @ 0.20 MB of data)" + "\t\t:0.00");
			}
			totalAmt = monthlyCharge + addVoice + addText + addMB;
			stateTaxTotal = (totalAmt * tax);
			System.out.println("Sub Total" + "\t\t\t\t\t\t\t\t:" + totalAmt);
			System.out.println("State Tax(6.5%)" + "\t\t\t\t\t\t\t\t:" + f.format(stateTaxTotal));
			System.out.println("Total due" + "\t\t\t\t\t\t\t\t:" + f.format(totalAmt + stateTaxTotal));
			break;
		case 3:
			monthlyCharge = 40;
			
            //-----------------------------------------------------------------------------------------------------------
            if (vCallMin <= 400 && vCallMin >= 0) {
                System.out.println("\nYou used " + vCallMin + "/400 minutes, you are within your monthly limit.");
            }
            else if (vCallMin > 400) {
                System.out.println("\nYou used " + vCallMin + "/400 minutes, you exceeded yout monthly limit.");
				addVoice = (vCallMin - 400) * .8;
            }

            //------------------------------------------------------------------------------------------------------------
            if (tMsg <= 600 && tMsg >= 0) {
                System.out.println("You used " + tMsg + "/600 SMS messages, you are within your monthly limit.");
            }
            else if (tMsg > 600) {
                System.out.println("You used " + tMsg + "/600 SMS messages, you exceeded yout monthly limit.");
				addText = (tMsg - 600) * .8;
            }
            //----------------------------------------------------------------------------------------------------------
            if (megaBytes <= 4096 && megaBytes >= 0) {
                System.out.println("You used " + megaBytes + "/4096 MB of data, you are within your monthly limit.");
            }
            else if (megaBytes > 4096) {
                System.out.println("You used " + megaBytes + "/4096 MB of data, you exceeded yout monthly limit.");
				addMB = (megaBytes - 4096) * .13;
            }
			
            System.out.println("\nCharges:");
			
			System.out.println("\nPack code: " + packCode);
			System.out.println("Monthly charges: " + monthlyCharge);
			if (vCallMin > 400) {
				
				System.out.println(("Additional voice charges (" + (vCallMin - 400) + " minute @ 0.80 per minute)" + "\t\t\t:" + addVoice));
			}			
			else {
				System.out.println("Additional voice charges (0 minute @ 0.80 per minute)" + "\t\t\t:0.00");
			}
			if (tMsg > 600) {
				
				System.out.println(("Additional SMS charges (" + (tMsg - 600) + " SMS messages @ 0.80 per SMS)" + "\t\t:" + addText));
			}			
			else {
				System.out.println("Additional SMS charges (0 SMS messages @ 0.80 per SMS)" + "\t\t\t:0.00");
			}
			if (megaBytes > 4096) {
				
				System.out.println(("Additional data charges (" + (megaBytes - 4096) + " MB of data @ 0.13 per MB of data)" + "\t:" + addMB));
			}			
			else {
				System.out.println("Additional data charges (0 MB of data @ 0.13 MB of data)" + "\t\t:0.00");
			}
			totalAmt = monthlyCharge + addVoice + addText + addMB;
			stateTaxTotal = (totalAmt * tax);
			System.out.println("Sub Total" + "\t\t\t\t\t\t\t\t:" + totalAmt);
			System.out.println("State Tax(6.5%)" + "\t\t\t\t\t\t\t\t:" + f.format(stateTaxTotal));
			System.out.println("Total due" + "\t\t\t\t\t\t\t\t:" + f.format(totalAmt + stateTaxTotal));
			break;
			default:
				System.exit(0);
		}
	}
}