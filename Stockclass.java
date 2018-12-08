package HW6;

public class Stockclass {
     double purchaseSharePrice,currentSharePrice;
     int numberofShares;
     String companyName;
    //defining accessor methods to get value from user
    public void SetStockHoldingValues(double purchaseshareprice,double currentshareprice,int numberofshares, String companyname) {
    	purchaseSharePrice=purchaseshareprice;
    	currentSharePrice=currentshareprice;
    	numberofShares=numberofshares;
    	companyName=companyname;
    }
    public void displayData(Stockclass arrfordisplay[]) {
    	for(int i=0; i<arrfordisplay.length;i++) {
    	System.out.println(" purchaseSharePrice = "+ arrfordisplay[i].purchaseSharePrice +"currentSharePrice="+arrfordisplay[i].currentSharePrice +" numberofShares="+ arrfordisplay[i].numberofShares+"companyName="+arrfordisplay[i].companyName);
    	System.out.println("");}
    	
    }
    public double costinDollars() {
    	double costinDollar=purchaseSharePrice * (double)numberofShares;
    	return costinDollar;
    }
    
    public double valueinDollars() {
    	double valueIndollar=currentSharePrice * (double)numberofShares;
    	return valueIndollar;
    }
    
	public double getPurchaseSharePrice() {
		return purchaseSharePrice;
	}
	public void setPurchaseSharePrice(double purchaseSharePrice) {
		this.purchaseSharePrice = purchaseSharePrice;
	}
	public double getCurrentSharePrice() {
		return currentSharePrice;
	}
	public void setCurrentSharePrice(double currentSharePrice) {
		this.currentSharePrice = currentSharePrice;
	}
	public int getNumberofShares() {
		return numberofShares;
	}
	public void setNumberofShares(int numberofShares) {
		this.numberofShares = numberofShares;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}   
}
