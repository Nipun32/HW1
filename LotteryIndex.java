package HW7;
import java.util.*;
public class LotteryIndex {
public static void main(String[] args) {
	Lottery lotteryNumbers = new Lottery();
	Scanner input = new Scanner(System.in);
		try {
			while(true)
			{
				System.out.println("1. Check the luck");
				System.out.println("2. Get the Lottery Numbers");
				System.out.println("3. some other time");
				System.out.println("Enter any option: ");
				
				int choice = input.nextInt();
				if(choice == 1)
				{
					int userNumbers[] = new int[5];
					System.out.println("Enter 5 numbers (range 0-9)");
					for(int i=0; i<5; i++)
					{
						userNumbers[i] = input.nextInt();
					}
					int count = lotteryNumbers.checkResult(userNumbers);
					if(count == 5)
					{
						System.out.println("YOU ARE A GRAND PRIZE WINNER!!");
					}
					else
						System.out.println("you got " + count + " numbers same");
				}
				else if(choice == 2)
				{
					int lotteryArray[] = lotteryNumbers.getLotteryArray();
					
					for(int i=0; i<5; i++)
					{
						System.out.print(lotteryArray[i] + " ");
					}
				}
				else
				break;
			}
		} finally {
			input.close();
		}}}
