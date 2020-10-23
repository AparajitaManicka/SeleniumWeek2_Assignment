package week2.assignment;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttonpage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElementById("home").click();Thread.sleep(3000);System.out.println("Welcome to Home Page");
		//driver.findElementByLinkText.click();Thread.sleep(1000);System.out.println("Welcome to button page");
		driver.get("http://leafground.com/pages/Button.html");Thread.sleep(3000);
		System.out.println("The position of the button is "+driver.findElementById("position").getLocation());Thread.sleep(1000);
		System.out.println("The position of the button is "+driver.findElementById("position").getLocation().getX());Thread.sleep(1000);
		System.out.println("The size of the button is "+driver.findElementById("size").getSize());Thread.sleep(1000);
		System.out.println("The color of the button is "+driver.findElementById("color").getCssValue("background-color"));
		System.out.println("All steps have been completed successfully");	
		driver.close();
	}

}
