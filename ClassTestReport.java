package HW7;
import java.util.*;
public class ClassTestReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student[] StudentList=new Student[5]; 
        System.out.println("Enter data for students  row wise:");
       String name;
       double[] marks=new double[4];
        for(int i=0;i<2;i++) {
        	 StudentList[i]=new Student();
        	 @SuppressWarnings("resource")
			Scanner inp=new Scanner(System.in);
        	 name=inp.nextLine();
        	 StudentList[i].setStudentName(name);
         for(int j=0;j<4;j++) {
        	 marks[i]= inp.nextDouble();
         }
        // inp.close();
         StudentList[i].setMarks_obtained(marks);
        }
        for(int i=0;i<2;i++) {
       	 StudentList[i]=new Student();
       StudentList[i].getinformation();
       }
       
	}

}
