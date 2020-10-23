package week2.assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElementByXPath("//*[@id='contentblock']/section/div[1]/div/div/img").click();Thread.sleep(2000);
		driver.get("http://leafground.com/pages/Image.html");
		
		Actions action = new Actions(driver);
		WebElement link =driver.findElementByXPath("//*[@id='contentblock']/section/div[3]/div/div/img");
		action.doubleClick(link).perform();System.out.println("Clicked");Thread.sleep(2000);
		System.out.println("All steps are completed successfully!!!!");
		driver.close();
}
}