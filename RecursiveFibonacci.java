package HW8;
public class RecursiveFibonacci
{
	//simple version to calculate fibonacci.
    public long basic(long n)
    {
        long result = 1;
        if( n <= 0)
            result = 0;
        else if (n == 1)
            result = 1;
        else
            result = basic(n-1) + basic(n-2);  //formula to calculate fibonacci.
        return result;
    }
    
    long x[]=new long[100];
    {for(int i=0;i<100;i++)
    { if(i==1)
        	 x[i]=1;
      else if(i==0)
    	  x[i]=0;
      else 
    	x[i]=-1;}
    }
    public long better(long n)
    {
        if(n<1)
          return 0;
        if(x[(int)n]!=-1)
        	 return x[(int)n];
        else {
        	x[(int)n]=better(n-1)+better(n-2);
        	return x[(int)n];
        }}}
/*
    public long tailRecursive(long n)
    {
        // IMPLEMENT THIS METHOD USING A RECURSIVE HELPER FUNCTION
        // AND RETURN AN APPROPRIATE VALUE
         return 0;
    } 
    public boolean secondMSB(long n)
    {
        // IMPLEMENT THIS METHOD AND RETURN AN APPROPRIATE VALUE
         return false;
    }
   
    public long reduceBy2ndMSB(long n)
    {
        long result = 1;
        // IMPLEMENT THIS METHOD 
        return result;
    } */
