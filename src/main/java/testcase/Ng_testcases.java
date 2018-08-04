package testcase;


import org.testng.annotations.Test;

import WdMethods.Annotations;
public class Ng_testcases extends Annotations{


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
