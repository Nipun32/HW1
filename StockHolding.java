package HW6;
//import java.io.*;	
class StockHolding{
	public static void main(String args[]) {
      Stockclass[] arrayofStock= new Stockclass[3];
      arrayofStock[0]=new Stockclass();
      arrayofStock[1]=new Stockclass();
      arrayofStock[2]=new Stockclass();
      arrayofStock[0].SetStockHoldingValues(2.30,4.50,40,"Nike");
      arrayofStock[1].SetStockHoldingValues(12.19,10.56,90,"Adidas");
      arrayofStock[2].SetStockHoldingValues(45.10,49.51,210,"Vardhman");
      SortCompanyName(arrayofStock);
      arrayofStock[0].displayData(arrayofStock);
	}
	public static void SortCompanyName(Stockclass arrayofStock[]) {
    	for(int i=0;i<arrayofStock.length;i++) {
    		for(int j=i+1;j<arrayofStock.length;j++) {
    			if(arrayofStock[i].companyName.compareTo(arrayofStock[j].companyName)>0 ) {
			Stockclass temp=arrayofStock[i];
					arrayofStock[i]=arrayofStock[j];
					arrayofStock[j]=temp;
    		}}}}
}
