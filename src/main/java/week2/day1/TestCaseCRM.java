package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class TestCaseCRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Environment
		//System.setProperty("webdriver.chrome.driver", "C:\\drivers");

		//Chrome Configurations
		ChromeOptions myChrome=new ChromeOptions();
		//myChrome.setHeadless(true);
		ChromeDriver driver = new ChromeDriver(myChrome);

		//Login
		System.out.println("Login");
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();

		//Navigate
		System.out.println("Navigate");
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		
		// Dropdown count
		List<WebElement> allDdList = driver.findElementsByTagName("select");
		System.out.println("Count of Dropdowns in on page is :"+" "+allDdList.size());

		//Fill data 
		System.out.println("Fill data");
		driver.findElementById("createLeadForm_companyName").sendKeys("Amazon");
		driver.findElementById("createLeadForm_firstName").sendKeys("Anjan");
		driver.findElementById("createLeadForm_lastName").sendKeys("kumar");

		//DD
		System.out.println("DD");
		WebElement dropdown = driver.findElementById("createLeadForm_industryEnumId");
		Select dd=new Select(dropdown);
		List<WebElement> ddList = dd.getOptions();
		for (WebElement thisDdList : ddList)
		{
			System.out.println(thisDdList.getText());
		}

		dd.selectByVisibleText("Insurance");

		driver.findElementByClassName("smallSubmit").click();

		//Teardown
		driver.close();


	}

}
