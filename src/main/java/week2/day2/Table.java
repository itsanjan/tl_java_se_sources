package week2.day2;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String URL="http://leafground.com";

		ChromeDriver driver=new ChromeDriver();
		driver.get(URL);
		driver.findElementByLinkText("Table").click();
		//List<WebElement> tableElements =driver.findElementsByXPath("//div[@id='contentblock']//table//tr");
		int CSize=driver.findElementsByXPath("//div[@id='contentblock']//table//tr").size();
		System.out.println("Number of columns (tr) " +" "+CSize);
		int RSize=driver.findElementsByXPath("//div[@id='contentblock']//table//tr/th").size();
		System.out.println("Number of row (th) " +" "+RSize);

		//using Xpath
		WebElement CValue=driver.findElementByXPath("//div[@id='contentblock']//table//tr[3]/td[2]");
		System.out.println("Value " +" "+CValue.getText());

	}

}




