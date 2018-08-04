package week1.day2;

//enum Result{
//	pass, fail, block, invalid;
//}

public class TestCase {
	//	Result result;

	//	public TestCase(Result result) {
	//		this.result=result;
	//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in)
		String TCResult = "pass";

		switch (TCResult)
		{
		case "pass" :
			System.out.println("PASS");
			break;
		case "fail" : 
			System.out.println("fail");
			break;
		case "blocked" : 
			System.out.println("blocked");
			break;
		case "invalid" : 
			System.out.println("invalid");	
			break;


		}

	}
}

/*
 *TestResult : pass, fail, block, invalid
 *
 */