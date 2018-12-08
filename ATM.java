package HW7;
import java.util.*;
@SuppressWarnings("serial")
//User defined Exception 
class InvalidPinException extends Exception{}
@SuppressWarnings("serial")
class InsufficientBalanceExcpetion extends Exception{} 
@SuppressWarnings("serial")
class CashShortageException extends Exception{}
@SuppressWarnings("serial")
class NotMultipleException extends Exception{}
public class ATM {
	@SuppressWarnings("resource")
	public static void main(String []args)
	{
		/*
		 * defining attributes required for specifying account of a 
		 * user details password and amount 
		 * in the balance of the respective customer.
		 * 1.user account Name_cust.
		 * 2.user initial account balance.
		 * 3.amount in ATM.
		 * 4. choice to be enter by the user for the action to be performed by the user.
		 * 5. amount of balance to deposit in the account.
		 * 6.amount user want to withdraw by specifying unique password if match with user password.
		 * */
		@SuppressWarnings("unused")
		String Name_cust ;
		double Account_bal ;
		int password, user_password; 
		double Machine_bal=100000; 
		int choice = 0;
		double depositAmt,withdrawAmt = 0;
		Scanner scan = new Scanner(System.in);//Taking User Input
		System.out.println("  Enter the account details to create an account: ");
		System.out.println("  Enter mane of user: ");
		Name_cust=scan.nextLine();
		System.out.println("  Enter account balance:");
		Account_bal=scan.nextDouble();
		System.out.println("  Enter your 4 digit password: ");
		password=scan.nextInt();
		/*On display 
		 * of screen. */
		while(true)
		{
		 System.out.println("Please choose the desired option\n");
		 System.out.print("Please Choose From the Following Options:"
                 + "  1.Display Balance"+ "  2. Deposit" +"  3. Withdraw."+ "   4.Log Out.");
		choice=scan.nextInt();
		switch(choice)
		 {
		 case 1:
              //Case for Displaying the balance
             try {
             System.out.println("Enter your password:");
             user_password = scan.nextInt();
             if (user_password!=password) /*
              entered password not matched with Original
               password and hence throw exception.*/
            throw new InvalidPinException();
             }
             catch(InvalidPinException ipe)
             {
            	 System.out.println("Invalid Pin!Please reenter your passwordword");
            	 user_password = scan.nextInt();
             }
			 displayBalance(Account_bal); //Displaying account balance
             break;
         case 2:
        	 /* Depositing money in the bank account*/
             System.out.println("Enter Amount to Deposit: ");
             depositAmt = scan.nextDouble();
             Account_bal=deposit(depositAmt, Account_bal);
             /*function invoked to add 
             the deposited amount to balance*/
             break;
         case 3: 
        	 // Withdrwal of money
             try {
            	 System.out.print("\nEnter Amount You Wish to Withdrawl: $ ");
             withdrawAmt = scan.nextDouble();
             if(withdrawAmt>Account_bal)
            	 /*checking  of Withdrawl amount with 
             Current Balance in Account*/
            	 throw new InsufficientBalanceExcpetion();
             if(withdrawAmt>Machine_bal) 
            	 /*Checking of withdrawl amount with
            	 Cash present in the machine*/
            	 throw new CashShortageException();
             if(withdrawAmt%200!=0||withdrawAmt%2000!=0||withdrawAmt%500!=0)
            	 throw new NotMultipleException();
             }
             catch(InsufficientBalanceExcpetion ise)
             {
            	System.out.println("Insufficient Balance!/n Enter the amout to be withdrawn:");
            	withdrawAmt = scan.nextDouble();
             }
             catch(CashShortageException cse)
             {
            	 System.out.println("Cash Shortage!/n Enter amout to be withdrawn:");
             	withdrawAmt = scan.nextDouble();
             }
             catch(NotMultipleException nme)
             {
            	 System.out.println("Error! Enter the amount multiple of 200,500 or 2000:");
             	withdrawAmt = scan.nextDouble();
             }
            Account_bal = withdraw(Account_bal, withdrawAmt);
            /*Function invoked to deduct the withdrawl 
            amount and display new balance*/
             break;
         case 4:
             System.out.print("Exit of process.");
             System.exit(0);
             break;
		 }}}
	public static void displayBalance(double Account_bal) {
		System.out.printf("\nYour Current Balance is $%.2f\n", Account_bal);	
	}
	public static double deposit(double x, double y) {
        double depositAmt = y, Account_bal = x;
        double newBalance = depositAmt + Account_bal; 
        System.out.printf("Your New Balance is $%.2f\n",  newBalance);
        return newBalance;
    }
	public static double withdraw(double x, double y) {
        double withdrawAmt = y, Account_bal = x, newBalance;
        newBalance = Account_bal - withdrawAmt; //Updating the current balance
        System.out.printf("Your New Balance is %.2f\n",newBalance);
        return newBalance;  
    }}