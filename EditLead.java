package week2.assignment;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		driver.findElementByLinkText("Leads").click();Thread.sleep(2000);
		driver.findElementByLinkText("Find Leads").click();Thread.sleep(2000);
		driver.findElementByXPath("/html/body/div[6]/div/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[1]/form/div/div[2]/div/div/div/div/div[2]/div[1]/input").sendKeys("Pluto");Thread.sleep(2000);
		driver.findElementByXPath("/html/body/div[6]/div/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div/div/div[2]/div/div/table/tbody/tr/td/table/tbody/tr/td[2]/em/button").click();Thread.sleep(2000);		
		driver.findElementByXPath("(//a[@class='linktext'])[6]").click();Thread.sleep(2000);	
		driver.findElementByLinkText("Edit").click();Thread.sleep(2000);
		driver.findElementByXPath("(//input[@name='companyName'])[2]").clear();Thread.sleep(2000);
		driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("Delta");Thread.sleep(2000);
		driver.findElementByXPath("(//input[@value='Update'])").click();
		System.out.println(driver.findElementById("viewLead_companyName_sp").getText());
		System.out.println("All steps are completed successfully!!!!");
		driver.close();

	}

}
