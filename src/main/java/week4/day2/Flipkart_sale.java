package week4.day2;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import WdMethods.SeMethods;

public class Flipkart_sale extends SeMethods {

	@Test
	public void login() {
		startApp("chrome", "http://flipkart.com");
		
		click(locateElement("xpath","//button[text()=\"✕\"]"));
		moveOverToElement(locateElement("xpath","//span[text()=\"TVs & Appliances\"]"),10,locateElement("xpath","//*[@id=\"container\"]/div/header/div[3]/ul/li[2]/ul/li/ul/li[1]/ul/li[8]/a/span"));
		
		
		
		click(locateElement("linktext","//select[@class=\"fPjUPw\"]//child::option[@value=\"25000\"]"));

		//		type(locateElement("id","firstNameField"),"Anjan");
		//		type(locateElement("id","lastNameField"),"kumar");
	}
}
