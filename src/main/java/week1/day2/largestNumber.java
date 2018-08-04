package week1.day2;

public class largestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers= {1,6,4,8,9,5};
		int largest = 0;
		
		for (int i=0; i<numbers.length-1;i++) {
			if(numbers[i]>numbers[i+1]) {
				largest=numbers[i];
			}
			else {
				largest=numbers[i+1];
			}
		//System.out.println(largest);
		}
		System.out.println(largest);
	}

}

/*
* largest, a, b
* 
* index -> length
* 
* if a > b, largest = a else largest = b
*
*/