package week5.day2;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import WdMethods.Annotations;


@Listeners(TestNGListners.class)
public class Ng_lExtentTestCases2  extends Annotations{


	@Test(groups= {"smoke"})
	public void createContact() {
		ExtentHtmlReporter html=new ExtentHtmlReporter("./reports/result.html");
		//this line only works inside nested class
		html.setAppendExisting(true);
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(html);
		
		//click(locateElement("linktext","My Contacts"));
		System.out.println("create contact");
	}
	@Test(groups= {"regression"})
	public void createLead() {
		//click(locateElement("linktext","Create Lead"));
		System.out.println("create contact");
	}


}