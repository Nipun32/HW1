package HW7;
//import java.util.*;
public class Student {
   String StudentName;
   double[] Marks_obtained ;
	public double Student_average(){
    	 double sum=0;
    	 for(int i=0;i<4;i++) {
    		 sum+=this.Marks_obtained[i];
    	 }
    	 System.out.println("Average marks is:"+ sum/4);
    	 return sum/4;
     }
     public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public double[] getMarks_obtained() {
		return Marks_obtained;
	}
	public void setMarks_obtained(double[] marks_obtained) {
		Marks_obtained = marks_obtained;
	}
	public void getinformation() {
    	 System.out.println("Name of the student:"+ this.getStudentName()+""
    	 + " average marks obtained by student is:"+ Student_average()+" ");
    	 System.out.println(" grade obtained is: ");
    	 int marks=(int)Student_average();
    if (marks>=0 && marks<=59)
    			 System.out.println("F");
    else if ( marks>=60 && marks<=69)
    			 System.out.println("D");
    else if (marks>=70 && marks<=79)
    			 System.out.println("C");
    else if (marks>=80 && marks<=89)
    			 System.out.println("B");
    else if (marks>=90 && marks<=100)
    			 System.out.println("A");
    	 }
     }
