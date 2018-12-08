package HW6;
//import java.io.*;	
class ForeignStock{
	public static void main(String args[]) {
      ForeignStockHolding[] arrayofStock= new  ForeignStockHolding[5];
      arrayofStock[0]=new  ForeignStockHolding();
      arrayofStock[1]=new  ForeignStockHolding();
      arrayofStock[2]=new  ForeignStockHolding();
      arrayofStock[3]=new  ForeignStockHolding();
      arrayofStock[4]=new  ForeignStockHolding();
      arrayofStock[0].SetForeignHoldingValues(2.30,4.50,40,"Nike",71.21);
      arrayofStock[1].SetForeignHoldingValues(12.19,10.56,90,"Adidas",7.09);
      arrayofStock[2].SetForeignHoldingValues(45.10,49.51,210,"Vardhman",8.9);
      arrayofStock[3].SetForeignHoldingValues(67.19,30.56,790,"Paroo",7.09);
      arrayofStock[4].SetForeignHoldingValues(32.1,60.56,190,"Malika",17.09);
      SortCompanyName(arrayofStock);
      arrayofStock[0].displayData(arrayofStock);
	}
	public static void SortCompanyName( ForeignStockHolding arrayofStock[]) {
    	for(int i=0;i<arrayofStock.length;i++) {
    		for(int j=i+1;j<arrayofStock.length;j++) {
    			if(arrayofStock[j].companyName.compareTo(arrayofStock[i].companyName)>0 ) {
			ForeignStockHolding temp=arrayofStock[i];
					arrayofStock[i]=arrayofStock[j];
					arrayofStock[j]=temp;
    		}
    	}
    }
	}
}
