package HW6;
import java.io.*;

///import com.sun.javaws.exceptions.ExitException;

//import com.sun.java.util.jar.pack.Instruction.Switch;
public class UserStockClass {
	public static void main(String[] args, Stockclass[] ArrayofStock) throws NumberFormatException, IOException {
		    BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
		    System.out.println("Press 1 go for stock class,else Press 0 for foreign stock class.");
		    int M= Integer.parseInt(inp.readLine());//if m=1 go for stock class ,else use foreign stock class.
		    System.out.println("Enter the number of records want to enter and type of stock to use by user:");
		    int T= Integer.parseInt(inp.readLine());
		    Stockclass[] ArrayofStock1;
       if(M==1) {
    	   ArrayofStock1=new Stockclass[T];
    	   for(int i=0;i<T;i++){
    	 ArrayofStock1[i]=new Stockclass();
    	 double a,b;
    	 int c;String d;
    	 a=Double.parseDouble(inp.readLine());
    	 b=Double.parseDouble(inp.readLine());
    	 c=Integer.parseInt(inp.readLine());
	   	 d=inp.readLine();
	   	  ArrayofStock1[i].SetStockHoldingValues(a,b,c,d);
    	   }
       }
       else {
    	ArrayofStock1=new ForeignStockHolding[T];
    	   for(int i=0;i<T;i++){
    	 ArrayofStock1[i]=new ForeignStockHolding();
    	 double a,b;
    	 int c;String d;
    	 a=Double.parseDouble(inp.readLine());
    	 b=Double.parseDouble(inp.readLine());
    	 c=Integer.parseInt(inp.readLine());
	   	 d=inp.readLine();
	   	ArrayofStock1[i].SetStockHoldingValues(a,b,c,d);
    	   }
    	   
       }
       System.out.println(" 1)Display stock information with the lowest value\r\n" + 
       		"    2)Display stock with the highest value\r\n" + 
       		"    3)Display the most profitable stock\r\n" + 
       		"    4)Display the least profitable stock\r\n" + 
       		"    5)List all stocks sorted by company name (A-Z)\r\n" + 
       		"    6)List all stocks sorted from the lowest value to the highest value\r\n" + 
       		"    7)Exit ");
  	   int Val= Integer.parseInt(inp.readLine());
	switch(Val) {
  	   case 1:
  	    getMaxvalue_stock(ArrayofStock1);
  		break;
  	   case 2:
        getMinvalue_stock(ArrayofStock1);
   		break;
  	   case 3:
  		 getMost_Profitvalue_stock(ArrayofStock1);
  		 break;
  	   case 4:
  		 getLeast_Profitvalue_stock(ArrayofStock1);
  		 break;
  	   case 7:
  		   System.exit(0);
  		   default:
  			   System.out.println("Invalid Value.");
  	   }
       }
	 public static void getMaxvalue_stock(Stockclass Array[]) {
		 double Max=-1.00;
		 for(int i=0;i<Array.length;i++) {
			 if(Array[i].currentSharePrice>Max)Max=Array[i].currentSharePrice;
		 }
		 System.out.println("The maximum value of the stock market is:"+ Max); 
	 }
	 public static void getMinvalue_stock(Stockclass Array[]) {
		 double Min=999.00;
		 for(int i=0;i<Array.length;i++) {
			 if(Array[i].currentSharePrice<Min)Min=Array[i].currentSharePrice;
		 }
		 System.out.println("The maximum value of the stock market is:"+ Min);
	 }
	 public static void getMost_Profitvalue_stock(Stockclass Array[]) {
		 double Max=-1.00;
		 //int Max_index=0;
		 for(int i=0;i<Array.length;i++) {
			 if((Array[i].currentSharePrice-Array[i].purchaseSharePrice)>Max) {Max=Array[i].currentSharePrice-Array[i].purchaseSharePrice; } }
		 System.out.println("The maximum value profit  of the stock market is:"+ Max); 
	 }
	 public static void getLeast_Profitvalue_stock(Stockclass Array[]) {
		 double Min=999.00;
		// int Min_index = 0;
		 for(int i=0;i<Array.length;i++) {
			 if((Array[i].currentSharePrice-Array[i].purchaseSharePrice)<Min) {Min=Array[i].currentSharePrice-Array[i].purchaseSharePrice;}
		 }
		 System.out.println("The minimum value profit  of the stock market is:"+ Min); 
	 }
	 public static void SortCompanyName(Stockclass arrayofStock[]) {
	    	for(int i=0;i<arrayofStock.length;i++) {
	    		for(int j=i+1;j<arrayofStock.length;j++) {
	    			if(arrayofStock[i].companyName.compareTo(arrayofStock[j].companyName)>0 ) {
				Stockclass temp=arrayofStock[i];
						arrayofStock[i]=arrayofStock[j];
						arrayofStock[j]=temp;}}}}
	 
	 }
	
   /*Modify the application so the user can choose how many stocks they want to enter as well as the type of the stock (maximum 8 stocks). 
    * The application should accept user data for every stock and after the data has been entered it should display the following menu:
    1)Display stock information with the lowest value
    2)Display stock with the highest value
    3)Display the most profitable stock
    4)Display the least profitable stock
    5)List all stocks sorted by company name (A-Z)
    6)List all stocks sorted from the lowest value to the highest value
    7)Exit  */