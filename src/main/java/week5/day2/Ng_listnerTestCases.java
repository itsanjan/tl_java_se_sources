package week5.day2;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import WdMethods.Annotations;


@Listeners(TestNGListners.class)
public class Ng_listnerTestCases  extends Annotations{


	@Test(groups= {"smoke"})
	public void createContact() {
		//click(locateElement("linktext","My Contacts"));
		System.out.println("create contact");
	}
	@Test(groups= {"regression"})
	public void createLead() {
		//click(locateElement("linktext","Create Lead"));
		System.out.println("create contact");
	}


}