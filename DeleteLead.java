package week2.assignment;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();Thread.sleep(2000);
		driver.findElementByXPath("//span[text()='Phone']").click();Thread.sleep(2000);
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99");Thread.sleep(2000);
		driver.findElementByXPath("(//td[@class='x-btn-center'])[7]").click();Thread.sleep(2000);
		String LeadID=driver.findElementByXPath("(//a[@class='linktext'])[4]").getText();Thread.sleep(2000);
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();Thread.sleep(2000);
		driver.findElementByLinkText("Delete").click();Thread.sleep(2000);
		driver.findElementByLinkText("Find Leads").click();Thread.sleep(2000);
		driver.findElementByXPath("//input[@name='id']").sendKeys(LeadID);Thread.sleep(2000);
		driver.findElementByXPath("(//button[@type='button'])[7]").click();Thread.sleep(2000);
		System.out.println(driver.findElementByXPath("//div[@class='x-paging-info']").getText());Thread.sleep(2000);
		System.out.println("All steps are completed successfully!!!!");
		driver.close();
	}

}
