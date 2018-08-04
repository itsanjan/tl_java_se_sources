package WdMethods;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class LearnMouseOver {

	@Test
	public void query_sortable() {
		//1. instanciate ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		//2. Set manageble variables for Chrome
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//3. Navigate
		driver.get("https://jqueryui.com/sortable/");

		WebElement frameElement = driver.findElementByClassName("demo-frame");
		driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(frameElement);
		WebElement item1=driver.findElementByXPath("//ul[@id=\"sortable\"]/li[1]");
		//		int item1X=driver.findElementByXPath("//ul[@id=\"sortable\"]/li[1]").getLocation().getX();
		//		int item1X=driver.findElementByXPath("//ul[@id=\"sortable\"]/li[1]").getLocation().getY();
		int item4X=driver.findElementByXPath("//ul[@id=\"sortable\"]/li[4]").getLocation().getX();
		int item4Y=driver.findElementByXPath("//ul[@id=\"sortable\"]/li[5]").getLocation().getY();

		Actions builder = new Actions(driver);
		builder.dragAndDropBy(item1, item4X, item4Y);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//builder.moveToElement(target)

	}

	@Test
	public void flipkart_apple() {
		//1. instanciate ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		//2. Set manageble variables for Chrome
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//3. Navigate
		driver.get("http://www.flipkart.com/");

		driver.findElementByXPath("//button[text()='✕']").click();
		WebElement  eleElectronics = driver.findElementByXPath("//span[text()=\"Electronics\"]");
		WebElement  eleApple = driver.findElementByXPath("//span[text()=\"Apple\"]");

		Actions builder=new Actions(driver);
		builder.moveToElement(eleElectronics).pause(3000).click(eleApple).perform();
	}

}
