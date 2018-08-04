package daily_practice;

public class cc2_ascendDecend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Nos= {13,25,9,56,54,89,17};
		//System.out.println(Nos);
		int largestNos=0;

		for (int i=0;i<Nos.length-1;i++) {
			System.out.println(Nos[i]);
			if(Nos[i]<Nos[i+1]) {
				Nos[i]=Nos[i+1];
			}
			else
			{
				largestNos=Nos[i+1];
			}
		}

		for (int element:Nos) {
			System.out.println(element);
		}
	}
}

/* 8,1,6,2,3,10,4,5,6,7
 * 
 * 8,1; 6,1
 * 
 *  
 */
