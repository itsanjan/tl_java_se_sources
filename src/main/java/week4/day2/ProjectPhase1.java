package week4.day2;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import WdMethods.SeMethods;

public class ProjectPhase1 extends SeMethods {

	@Test
	public void login() {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		
		click(locateElement("linktext","CRM/SFA"));
		click(locateElement("linktext","Create Contact"));
		
		type(locateElement("id","firstNameField"),"Anjan");
		type(locateElement("id","lastNameField"),"kumar");
		type(locateElement("id","createContactForm_firstNameLocal"),"LAnjan");
		type(locateElement("id","createContactForm_lastNameLocal"),"Lkumar");
		type(locateElement("id","createContactForm_personalTitle"),"SomeSalutation");
		type(locateElement("id","createContactForm_generalProfTitle"),"Mr");
		type(locateElement("id","createContactForm_departmentName"),"Luna");
		selectDropDownUsingText(locateElement("id","createContactForm_preferredCurrencyUomId"),"AMD - Armenian Dram");
		type(locateElement("id","createContactForm_description"),"Example description");
		type(locateElement("id","createContactForm_importantNote"),"Note");
		//type(locateElement("id",""),"");
		type(locateElement("id","createContactForm_primaryPhoneAreaCode"),"600125");
		verifyPartialAttribute(locateElement("id","generalToNameField"),"value","Anjan kumar");
		//button
		click(locateElement("xpath","//input[@class=\"smallSubmit\"]"));
		

		
		
		
	}
	
}