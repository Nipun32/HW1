package Hw1;

import java.io.*;
import java.util.*;

public class Enteringdata 
{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		File file=new File("E:\\java_data\\hw1\\HW1-data.txt");	//Opening data file
		int tot_pts=0,tot_Tot=0,tot_perc=0,ct=0,max=0;		//variables declared to store total stats
		
		Map<Character,Integer> Grade_ct=new HashMap<Character,Integer>();	//Map to grade count
		Grade_ct.put('A',0);
		Grade_ct.put('B',0);
		Grade_ct.put('C',0);
		Grade_ct.put('D',0);
		Grade_ct.put('F',0);
		
		StudentDetails stu = new StudentDetails();		//Object declared for class StudentDetails
		
		Scanner sc=new Scanner(file);					//File scanned in sc
		
		PrintWriter fw=new PrintWriter("DATAFILE.txt"); 		//Output File opened
		
		fw.println("Stdnt Id  Ex  -------- Assignments --------  Tot  Mi  Fin  CL  Pts  Pct  Gr");
		fw.println("--------  --  -----------------------------  ---  --  ---  --  ---  ---  --");
		
		//Reading data File
		while (sc.hasNextLine()) 
		{
			String[] str=sc.nextLine().split("\\s+");	//Splitting string in str array  
			
			//storing student details in object of StudentDetails
			stu.studentId=Integer.parseInt(str[0]);
			stu.LabEx=Integer.parseInt(str[1]);
			for(int i=0;i<10;i++)
			{
				stu.Assign[i]=Integer.parseInt(str[i+2]);
			}
			stu.MidTerm=Integer.parseInt(str[12]);
			stu.Final=Integer.parseInt(str[13]);
			stu.CodeLab=Integer.parseInt(str[14]);
			
			printRecord(stu, fw);		//function called
			tot_Tot+=stu.tot;
			tot_perc+=stu.perc;
			if(max < stu.points)
				max=stu.points;
			tot_pts+=stu.points;
			Grade_ct.put(stu.Grd,Grade_ct.get(stu.Grd)+1);
			ct++;
		}
		
		fw.println();
		fw.println("Average total of all students = "+tot_Tot/ct);
		fw.println("Average points of all students = "+tot_pts/ct);
		fw.println("Average percent of all students = "+tot_perc/ct);
		fw.println();
		for(Character key:Grade_ct.keySet())
	    {
			fw.println("Number of "+key+"'s = "+Grade_ct.get(key));
	    }
		fw.println();
		fw.println("Maximum points = "+max);
		sc.close();
		fw.close();
		System.out.println("Completed Successfully");
	}
	
	//Function to print student record
	public static void printRecord(StudentDetails stu,PrintWriter fw)
	{
		try
		{
			stu.tot=total(stu.Assign,stu.Assign.length);		//Function called to calculate total
			stu.points=points(stu);								//Function called to calculate points
			stu.perc=percent(stu.points);						//Function called to calculate percent
			stu.Grd=grade(stu.perc);							//Function called to calculate grade
			String out=String.format("%08d  %d  ",stu.studentId,stu.LabEx);
			for(int i=0;i<10;i++)
			{
				out+=String.format("%2d ",stu.Assign[i]);
			}
			out+=String.format(" %d  %d  ",stu.tot,stu.MidTerm);
			out+=String.format("%3d  %2d  %d",stu.Final,stu.CodeLab,stu.points);
			out+=String.format("  %3d  %2c",stu.perc,stu.Grd);
			fw.println(out);									//Record printed in file
		}catch (Exception e){
			e.printStackTrace();
			System.out.println("Exception occured.."); 
		}
		
	}
	
	//Function to count total 
	public static int total(int a[],int n)
	{
		int points=0;
		for(int i=0;i<n;i++)
			points+=a[i];
		return points;
	}
	
	//Function to calculate points
	public static int points(StudentDetails st)
	{
		int pts=0;
		pts= st.LabEx+st.tot+st.MidTerm+st.Final+st.CodeLab;
		return pts;
	}
	
	//Function to calculate percent
	public static int percent(int p)
	{
		float per=0;
		per=((float)p*100)/420;
		per=Math.round(per);			//Roundoff
		
		return (int)per;
	}
	
	//Function to calculate grade
	public static char grade(int a)
	{
		if(a>=90)
			return 'A';
		else if(a>=78)
			return 'B';
		else if(a>=62)
			return 'C';
		else if(a>=46)
			return 'D';
		else
			return 'F';
	}
}
