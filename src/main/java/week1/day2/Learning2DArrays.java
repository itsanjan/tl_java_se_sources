package week1.day2;
import java.util.Scanner;

import org.apache.poi.util.SystemOutLogger;

public class Learning2DArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] studentList= {"Raja1","Raja2","Raja3","Raja4","Raja5"};
		int[] ageList = {20,21,22,23,24,25};
		char[][] grades= {
				{'A','A','A','A','A'},
				{'B','B','B','B','B'},
				{'C','C','C','C','C'},
				{'D','D','D','D','D'},
				{'E','E','E','E','E'},
		};

		//Logic
		System.out.println("Enter the index of student");
		Scanner scr=new Scanner(System.in);
		int studentIndex = scr.nextInt();
		studentIndex=studentIndex-1;
		if(studentIndex<5) {	
			String outputText= studentList[studentIndex] + " who is "+ ageList[studentIndex]+" years of age has scorred "+grades[studentIndex][0]+" "+grades[studentIndex][1]+" "+grades[studentIndex][2]+" "+grades[studentIndex][3]+" "+grades[studentIndex][4]+" as per records ";
			System.out.println(outputText);
		}
		else
		{
			System.out.println("Index out of DB");
		}

		//Print all data
		System.out.println("See all data : yes/no");
		if(true)
		{
			int lIndex=0;
			for (int i=0;i<=4;i++) {
				lIndex=i;
				String outputText=grades[lIndex][0] +" "+grades[lIndex][1] +" "+grades[lIndex][2] +" "+grades[lIndex][3] +" "+grades[lIndex][4] +" ";
				System.out.print(outputText);
			}
			System.out.println("For-each execution");
			for (String var: studentList)
			{
				System.out.println(var);
			}
			System.out.println("For-each 2D execution");
			for (char var: grades[1])
			{
				System.out.print(var);
			}
		}
	}

}
