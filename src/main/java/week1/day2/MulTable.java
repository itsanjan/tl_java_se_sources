package week1.day2;

import java.util.Scanner;

public class MulTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Give inout nos");
		Scanner scr=new Scanner(System.in);
		int mulIndex=scr.nextInt();
		
		for (int i=0;i<=10;i++) {
			String outputTxt= i + " * "+mulIndex + " = " + mulIndex*i;
			System.out.println(outputTxt);
		}
	}

}


/*
*Multiplication table
*
* tableNumber
* 
* for loop to 10
* 
* out index , out mulNumber, out index*mulNumber
*
*/