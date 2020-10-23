package week2.assignment;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Editpage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElementById("email").sendKeys("am8@gmail.com");Thread.sleep(2000);
		driver.findElementByXPath("//input[@value='Append ']").sendKeys("Hello"+Keys.HOME);Thread.sleep(2000);
		System.out.println(driver.findElementByXPath("//input[@value='TestLeaf']").getAttribute("value"));Thread.sleep(2000);
		driver.findElementByXPath("//input[@value='Clear me!!']").clear();Thread.sleep(2000);
		System.out.println(driver.findElementByXPath("//input[@disabled='true']").isEnabled());
		System.out.println("All steps are completed successfully!!!!");
		driver.close();
	}

}
