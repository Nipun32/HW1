package HW8;
//import java.io.*;
import java.util.*;
/**
 * A simple recursion for counting up and down. 
 * @author Charles Hoot 
 * @version 4.0
 */    
public class Count
{
    public static void main(String args[])
    {
        int n = getInt("Please enter an integer value greater than or equal to 0");
        
        System.out.println("Should count down to 1");
        countDown(n);
        System.out.println();
        System.out.println("Should count up from 1");
        countUp(n);
    }  
    private static void countUp(int n)
    {
        // IMPLEMENT THIS RECURSIVE METHOD
    	if(n<=0)return;
    	countUp(n-1);
        System.out.println(n);
    }
    private static void countDown(int n)
    {
        // IMPLEMENT THIS RECURSIVE METHOD
    if(n==0) return;
    System.out.println(n);
    if(n==1) return;
    countDown(n-1);
    }
    private static int getInt(String rangePrompt)
    {
        Scanner input;
        int result = 10;        //default value is 10
        try
        {
            input = new Scanner(System.in);
            System.out.println(rangePrompt);
            result = input.nextInt();
            
        }
        catch(NumberFormatException e)
        {
            System.out.println("Could not convert input to an integer");
            System.out.println(e.getMessage());
            System.out.println("Will use 10 as the default value");
        }        
        catch(Exception e)
        {
            System.out.println("There was an error with System.in");
            System.out.println(e.getMessage());
            System.out.println("Will use 10 as the default value");
        }
        return result;
                                    
    }
}
