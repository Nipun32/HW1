package HW7;
import java.util.*;
public class Lottery {
	int[] Random_Numbers;
	public Lottery()
	{
		Random_Numbers = new int[5];
		Random rand = new Random();	
		for(int i=0;i<5;i++)
			Random_Numbers[i]=rand.nextInt(10);
	}
	int[] getLotteryArray()
	{
		return Random_Numbers;
	}
int checkResult(int userArray[])
	{
	/*
	 * here the
	 *  marker wants from programmer to match the each position of corresponding array 
	 * of user with random numbers in the
	 *  lottery list and sends the result of matching list.
	 *  thus we use  Table_match table to build the logic.*/
		int count=0,i=0,j=0;
		Boolean Table_match[] = new Boolean[10];
		for(i=0; i<10;i++)  Table_match[i]=true;
		i=0;
		for(; i<5; i++)
		{
			for(; j<5; j++)
			{
				if(userArray[i]==Random_Numbers[j] &&  Table_match[userArray[i]])
				{
					count++;
					 Table_match[userArray[i]]=false;
				}}}
		return count;
	}}