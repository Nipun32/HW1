package HW4;
import java.io.*;
import java.util.*;
// StackSort is a program that will use two stacks to sort an array of integer values.
public class StackSort {
 public static void main(String args[]) throws IOException{
        int data[] = null;
        int result[] = null;
        Scanner input = new Scanner(System.in);
        System.out.println("This program sorts an array of integer values.");
        // Create an empty array of integers
        data = createArray(0, 1, 1);
        System.out.println("Original array is: " + representationOfArray(data));
        result = doStackSort(data);
        System.out.println("Sorted array is: " + representationOfArray(result));
        System.out.println();

        // Create an array with one integer
        data = createArray(1, 0, 9);
        System.out.println("Original array is: " + representationOfArray(data));
        result = doStackSort(data);
        System.out.println("Sorted array is: " + representationOfArray(result));
        System.out.println();

        // Create an array with two integers
        data = createArray(2, 0, 9);
        System.out.println("Original array is: " + representationOfArray(data));
        result = doStackSort(data);
        System.out.println("Sorted array is: " + representationOfArray(result));
        System.out.println();

        // Create an array with 10 integers
        data = createArray(10, 0, 9999);
        System.out.println("Original array is: " + representationOfArray(data));
        result = doStackSort(data);
        System.out.println("Sorted array is: " + representationOfArray(result));
        System.out.println();

        // Create an array with 20 integers
        data = createArray(20, 0, 9);
        System.out.println("Original array is: " + representationOfArray(data));
        result = doStackSort(data);
        System.out.println("Sorted array is: " + representationOfArray(result));
        System.out.println();

        System.out.println("Please enter the number of values to sort");
        int size = getInt("   It should be an integer value greater than or equal to 1.");
        // Create an array of the given size

        data = createArray(size, 0, 99);
        System.out.println("Original array is: " + representationOfArray(data));
        result = doStackSort(data);
        System.out.println("Sorted array is: " + representationOfArray(result));
        System.out.println();
      input.close();

    }


    /**
     * Use two stacks to sort the data in an array
     * @param data An array of integer values to be sorted.
     * return     An array of sorted integers. 
     */
    private static int[] doStackSort(int data[]) {

    	 int result[] = new int[data.length];
    	    if(data.length==0)
    	    	return result;
    	    //step 2 and 3
    	    VectorStack<Integer> upperValues=new VectorStack<Integer>();
    	    VectorStack<Integer> lowerValues=new VectorStack<Integer>();
    	    // step 4 and 6
    	    int max=0,min=0;
    	    for( int i = 0; i < data.length; i++)
    	    {
    	    	if(data[i] > data[max]) 	max = i;
    	    	if(data[i] < data[min]) 	min = i;
    	    }
    	    lowerValues.push(data[min]);                        //Initially place min value in lowerValue Stack.
    	    upperValues.push(data[max]);						//Initially place max value in upperValue Stack.
    	    for( int i = 0; i < data.length; i++ )
    	    {
    	    	// as min and max elements are already included, it checks so that they are not included twice
    	    	if( i == max || i == min)
    	    		continue;
    	    	// it checks whether data element is more than top element of upperValues and less than top element of upperValues
    	    	if( lowerValues.peek()<data[i]&&!lowerValues.isEmpty()&&upperValues.peek()>data[i]&&upperValues.isEmpty() )									// condition for inserting in lowerValues Stack.
    	    	{
    	    		int j = 0;
    	    		while(lowerValues.peek() > data[i]  && !lowerValues.isEmpty())
    	    		{
    	    			upperValues.push(lowerValues.pop());
    	    			j++;
    	    		}
    	    		lowerValues.push(data[i]);					//places new value i.e data[i] in lowerValue Stack at appropriate position.
    	    		while(j != 0)
    	    		{
    	    			lowerValues.push(upperValues.pop());
    	    			j--;
    	    		}
    	    		
    	    	}
    	    	else												// condition for inserting in upperValues Stack.
    	    	{
    	    		int j = 0;
    	    		while(upperValues.peek() < data[i]  && !upperValues.isEmpty())
    	    		{
    	    			lowerValues.push(upperValues.pop());
    	    			j++;
    	    		}
    	    		upperValues.push(data[i]);				//places new value i.e data[i] in upperValue Stack at appropriate position.
    	    		while(j != 0)
    	    		{
    	    			upperValues.push(lowerValues.pop());
    	    			j--;
    	    		}
    	    	}
    	    }
    	    // Step 7
    	    while( !lowerValues.isEmpty() )					//pop all reverse sorted values from lowerStack into upperValue Stack.
    	    	upperValues.push(lowerValues.pop());
    	    // Step 5
    	    for( int i = 0; i < data.length; i++)
    	    	result[i] = upperValues.pop();			
    	        return result;


    }

    /**
     * Load an array with data values
     *
     * @param size The number of data values to generate and place in the array.
     * @param min The minimum value to generate.
     * @param max The maximum value to generate.
     * @return     An array of randomly generated integers. 
     */
    private static int[] createArray(int size, int min, int max) {

        Random generator = new Random();

        // If we get a negative size, just make the size 1
        if (size < 0) {
            size = 1;
        }
        // We need max > min for the random number generator to be happy

        if (max <= min) {
            max = min + 1;
        }

        int[] data = new int[size];

        for (int i = 0; i < size; i++) {
            data[i] = min + generator.nextInt(max - min);
        }

        return data;
    }

    /*
     * Create a string with the data values from an array
     * @param data An array of integer values.
     * return A string representation of the array.
     */
    private static String representationOfArray(int data[]) {
        String result = new String("< ");
        for (int i = 0; i < data.length; i++) {
            result += data[i] + " ";
        }
        result += ">";
        return result;
    }

    /**
     * Get an integer value
     *
     * @return     An integer. 
     */
    private static int getInt(String rangePrompt) {
        Scanner input;
        int result = 10;        //default value is 10
        try {
            input = new Scanner(System.in);
            System.out.println(rangePrompt);
            result = input.nextInt();

        } catch (NumberFormatException e) {
            System.out.println("Could not convert input to an integer");
            System.out.println(e.getMessage());
            System.out.println("Will use 10 as the default value");
        } catch (Exception e) {
            System.out.println("There was an error with System.in");
            System.out.println(e.getMessage());
            System.out.println("Will use 10 as the default value");
        }
        return result;

    }
}
