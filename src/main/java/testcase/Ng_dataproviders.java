package testcase;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import WdMethods.Annotations;

public class Ng_dataproviders extends Annotations {

	@Parameters({"browser"})
	@Test()
	public void createContact(String browser) {
		//click(locateElement("linktext","My Contacts"));
		System.out.println("create contact");
		System.out.println(browser);
	}
	@Test(dataProvider="fetchData", enabled=false)
	public void createLead(String CName, String FName, String LName, String Email, String PHN) 
	{
		//click(locateElement("linktext","Create Lead"));
		System.out.println("create contact");
		System.out.println(CName);
		System.out.println(FName);
		System.out.println(LName);
	}
}
