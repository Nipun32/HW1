package Hw2;
import java.io.*;
import java.util.*;
public class SearchingKeyword {

	public static void main(String[] args)  throws IOException {
		// TODO Auto-generated method stub
		int i=0;
		//creating file objects for respective given files by the user.
        File f_dictionary=new File("E:\\java_data\\hw2\\HW2-dictionary.txt");
        File f_keyword=new File("E:\\java_data\\hw2\\HW2-keywords.txt");
        String[] arrDictionary=new String[16000];
        String[] arrKeyword=new String[84];
        Scanner scan=new Scanner(f_dictionary);
        while(scan.hasNextLine()) {
        	arrDictionary[i]=scan.nextLine();
        	i++;
        }
        scan.close();
        scan=new Scanner(f_keyword);
        i=0;
        while(scan.hasNextLine()) {
        	arrKeyword[i]=scan.nextLine();
        	i++;
        }
        scan.close();int cnt=0;
        Selection_sort(arrDictionary);
        /*for(String a: arrDictionary)
        System.out.println(a);*/
    	Selection_sort(arrKeyword);
    	/*for(String a: arrKeyword)
    		System.out.println(a);*/
    	PrintWriter fout=new PrintWriter("HW2OUTCOME.txt");//to write the output in a file named assignement_output.
    	for(String a: arrKeyword) {
    		boolean flag=Search_dic(a,arrDictionary);
    		if(!flag) {fout.println("keyword not found : "+a);cnt++;//bool fuction to chack wheter keyword present in dictionary or not.
    			}
    	}
    	fout.println("Number of keywords not found = "+cnt);
    	fout.close();
	}
//function for sorting the input array to the argument section of function.
	public static void Selection_sort(String[] arr) {
		int i,j,n;
		n=arr.length;
		for(i=0;i<n;i++) {
			for(j=i+1;j<n;j++) {
				if(arr[i].compareTo(arr[j])>0 ) {
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	//for given keyword ,binary search in the dictionary made by the respective function.
public static boolean Search_dic(String a,String[] arr) {
	int left,right;
	left=0;right=arr.length-1;
	while(left<=right) {
		int mid =(left+right)/2;
		if(arr[mid].compareTo(a)==0)return true;
		else if(arr[mid].compareTo(a)<0) {
			left=mid+1;}
		else right=mid-1;
		}
			return false;
	}
}
