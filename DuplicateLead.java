package week2.assignment;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

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
		driver.findElementByXPath("//span[text()='Email']").click();Thread.sleep(2000);
		driver.findElementByName("emailAddress").sendKeys("abc@gmail.com");Thread.sleep(2000);
		driver.findElementByXPath("//button[text()='Find Leads']").click();Thread.sleep(2000);
		String firstname=driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']").getText();
		System.out.println(firstname);
		Thread.sleep(2000);
		driver.findElementByXPath("(//a[@href='/crmsfa/control/viewLead?partyId=10407'])[2]").click();Thread.sleep(2000);
		driver.findElementByLinkText("Duplicate Lead").click();Thread.sleep(2000);
		System.out.println(driver.getTitle());
		String title = driver.findElementById("sectionHeaderTitle_leads").getText();
		System.out.println(title);
		if(title.contains("Duplicate Lead")) {
			System.out.println("Title verified");
			}
		else {
			System.out.println("Check title");
		}
		driver.findElementByClassName("smallSubmit").click();Thread.sleep(2000);
		String newfirstname=driver.findElementById("viewLead_firstName_sp").getText();Thread.sleep(2000);
		System.out.println(newfirstname);
		if(firstname.equals(newfirstname)) {
			System.out.println("Firstname=Newfirstname");
		}
		else {
			System.out.println("Firstname!=Newfirstname");
		}
		System.out.println("All steps are completed successfully!!!!");
		driver.close();

	}

}
