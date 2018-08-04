package daily_practice;

import java.util.Scanner;

public class cc1 {

	public static void main(String[] args) {
		//Initializations
		Scanner scr=new Scanner(System.in);
		int mulNum = 0;
		int nthNum = 0;
		String outTxt=null;
		
		//User inputs
		System.out.println("Enter table number");
		mulNum=scr.nextInt();
		System.out.println("Enter Nth number");
		nthNum=scr.nextInt();

		//Calculation & output
		for (int i=1;i<=nthNum;i++) {
			outTxt=i +" * "+ mulNum +" = "+i*mulNum;
			System.out.println(outTxt);
		}
		
	}

}
