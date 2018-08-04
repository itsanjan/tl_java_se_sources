package WdMethods;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;;

public class Annotations extends SeMethods {

	@BeforeMethod(groups= {"smoke","regression"})
	public void login2() {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
	}

	@AfterMethod(groups= {"smoke","regression"})
	public void closeBrowser2() {
		driver.quit();
	}

	@DataProvider(name="fetchData")
	public String[][] getData(){
		String[][] data=new String[2][5];
		data[0][0]="TestLeaf";
		data[0][1]="Babu";
		data[0][2]="M";
		data[0][3]="babu@testleaf.com";
		data[0][4]="12345678";
		
		data[1][0]="Anjan";
		data[1][1]="Anjan";
		data[1][2]="K";
		data[1][3]="anjan@testleaf.com";
		data[1][4]="12345678";
		return data;
// This will cause multiple (2) runs of the same test case is row no. is 2
	}

}
