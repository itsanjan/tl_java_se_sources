package daily_practice;

import java.util.ArrayList;
import java.util.Collection;

public class Wk3_cc7_repeatedNumbers {

	public static void main(String[] args) {

		int[] inputArr	= {13,65,15,67,88,65,13,99,67,13,65,87,13};
		int n=1;
		ArrayList<Integer> outputArr = new ArrayList<Integer>(n);
		for (int i=0;i<=inputArr.length-1;i++)
		{
			int indexNumber=inputArr[i];
			for (int y=i+1;y<=inputArr.length-1;y++)
			{
				if(indexNumber==inputArr[y])
				{
					if(!(outputArr.contains(indexNumber)))
						outputArr.add(indexNumber);
					break;
				}
			}
		}

		System.out.println(outputArr);
	}
}

/*
 * Pseudo code
 * 
 * Declare array, assign values
 * Declare output array
 * 
 * for loop i=0 to array length-1
 * 
 * index number = array[i]
 * 
 * 	for (y=i;y<array length -1, y++)
 * 		if ( cond : index number == array[y])
 * 			{ 	Output array[z] = array[y]
 * 				z++
 * 			}
 * 
 * print output array
 * 
 * 
 */
