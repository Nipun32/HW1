package ProducerLast;
import java.util.*;
class Producer_consumer
{
	//Buffer List to store data produced
	List<Integer> q_ueue=new ArrayList<Integer>();
	//Buffer List to store data produced
	int size=5;
	//Producer Function
	void produce() throws InterruptedException
	{
		// Intially the buffer is empty
		int filled=0;
		while(true)
		{
			synchronized(this)
			{
				//If buffer is filled,wait to get it free
				while( q_ueue.size()==size)
					wait();
				System.out.println("Producer produced : "+(filled%size));
				//add item to buffer list
				 q_ueue.add(filled++);
				//notify the consumer to remove it from wait state
				notify();
				//force producer thread to sleep for 1second
				Thread.sleep(1000);
				if(filled==size)
					break;
			}}}
	void consume( ) throws InterruptedException//Consumer function
	{
		int item;
		while(true)
		{
			synchronized(this)
			{
				//isEmpty()return true if   
                while( q_ueue.isEmpty()==true)
					wait();		  
                //buffer.size()==0
				item= q_ueue.remove(0);//remove first element to consume
				System.out.println("Consumer consumed : "+item);
				notify();
				//Notify producer that buffer is freed
				Thread.sleep(1000);
				//Force consumer thread to sleep for 1second
			}}}}
