package HW6;
public class ForeignStockHolding extends Stockclass {
       /*Give ForeignStockHolding an additional instance variable: conversionRate, which will be a float.
        *  (The conversion rate is what you need to multiply the local price by to get a price in Canadian dollars. 
        *  Assume the purchasePrice and currentPrice are in the local currency.) 
        *  Override costInDollars and valueInDollars to do the right thing.
          Add at least two instances of ForeignStockHolding to the existing array from part one.*/
          double conversionRate;
		public void setConversionRate(double conversionRate) {
			this.conversionRate = conversionRate;
		}
		public double getConversionRate() {
			return conversionRate;
		}
		public double costinDollars() {
	    	double costinDollar=purchaseSharePrice * (double)numberofShares*conversionRate;
	    	return costinDollar;
	    }
	    
	    public double valueinDollars() {
	    	double valueIndollar=currentSharePrice * (double)numberofShares*conversionRate;
	    	return valueIndollar;
	    }
	    /*Display all the stocks sorted by 
	     * company name in reverse alphabetical order.*/
	    public void SetForeignHoldingValues(double purchaseshareprice,double currentshareprice,int numberofshares, String companyname,double conversionrate) {
	    	purchaseSharePrice=purchaseshareprice;
	    	currentSharePrice=currentshareprice;
	    	numberofShares=numberofshares;
	    	companyName=companyname;
	    	conversionRate=conversionrate;
	    }
	    public void displayForeignData(ForeignStockHolding arrfordisplay[]) {
	    	for(int i=0;i<arrfordisplay.length;i++) {
	    	System.out.println(" purchaseSharePrice = "+ arrfordisplay[i].purchaseSharePrice +"currentSharePrice="+arrfordisplay[i].currentSharePrice +" numberofShares="+ arrfordisplay[i].numberofShares+"companyName="+arrfordisplay[i].companyName+arrfordisplay[i].conversionRate);
	    	System.out.println("");}
	    }
	}
