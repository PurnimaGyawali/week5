import java.util.Scanner;

/**
 * Write a description of class FixedDepositNIB here.
 *
 * @author Purnima
 * @version v1
 */
public class FixedDepositNIB
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        char repeat='Y';
        while (repeat=='Y' || repeat=='y')
        {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~WELCOME TO NIB BANK~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~FIXED DEPOSIT~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\n");
            System.out.println("Enter the principal amount (minimum: Rs.1000): ");
            float P=input.nextFloat();
            if(P<1000)
            {
                System.out.println("Minimum deposit is Rs.1000. Setting the Principal to Rs.1000 by Default");
                P=1000;
                System.out.println("\n");
            }
            System.out.println("Enter the annual interest rate (8% - 12%)");
            float aR=input.nextFloat();
            if( aR<8 || aR>12)
            {
                System.out.println("Invalid interest rate. Setting the rate to 8% by Default");
                aR=8;
                System.out.println("\n");
            }
            System.out.println("Enter the duration in years (maximum: 5 years): ");
            int yrs=input.nextInt();
            if(yrs>5)
            {
                System.out.println("Maximum duration is 5 years. Setting the years to 1 year by Default");
                yrs=1;
                System.out.println("\n");
            }
            float mR= (aR/100)/12;
            int mon= yrs*12;
            double A= P* Math.pow(1+mR, mon);
            float fRate=0.005f;
            double fee= A*fRate;
            double fA= A-fee;
            System.out.println("\n");
            System.out.println("_______________________Fixed Deposit Details_____________________________");
            System.out.println("\n");
            System.out.printf("Principal Amount: Rs.%.2f",P);
            System.out.printf("\nAnnual Interest Rate: %.2f%%",aR);
            System.out.printf("\nMonthly Interest Rate: %.2f%%",(mR * 100));
            System.out.printf("\nDuration: %d years (%d months)",mon,yrs);
            System.out.printf("\nMaturity Amount: %.2f",A);
            System.out.printf("\nProcessing Fee: %.2f",fee);
            System.out.printf("\nFinal Amount: Rs.%.2f",fA);
            System.out.println("\n");
            System.out.println("_________________________________________________________________________");
            System.out.println("Do you want to calculate another Fixed Deposit? (y/n): ");
            repeat = input.next().charAt(0);
            System.out.println();
        }
        System.out.println("~~~~~~~~~~~~~Thank you for using Nepal Investment Bank FD Calculator!~~~~~~~~");
    }
}