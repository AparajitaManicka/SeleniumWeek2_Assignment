package week2.assignment;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement index = driver.findElementById("dropdown1");
		Select dropdown1 = new Select(index);
		dropdown1.selectByIndex(1);Thread.sleep(3000);
		
		WebElement text = driver.findElementByName("dropdown2");
		Select dropdown2 = new Select(text);
		dropdown2.selectByVisibleText("Selenium");Thread.sleep(3000);
		
		WebElement value = driver.findElementById("dropdown3");
     	Select dropdown3 = new Select(value);
		dropdown3.selectByValue("1");Thread.sleep(3000);
		
		WebElement number = driver.findElementByClassName("dropdown");
		Select dropdown4 = new Select(number);
		List<WebElement> number1 = dropdown4.getOptions(); 
		System.out.println(number1.size());Thread.sleep(3000);
		
		WebElement send = driver.findElementByXPath("//*[@id='contentblock']/section/div[5]/select");
		Select dropdown5 = new Select(send);
		send.sendKeys("Selenium");Thread.sleep(3000);
		
		WebElement sel = driver.findElementByXPath("//*[@id='contentblock']/section/div[6]/select");
		Select dropdown6 = new Select(sel);
		dropdown6.selectByValue("1");Thread.sleep(3000);
	
		System.out.println("All steps are completed successfully!!!!");
		driver.close();
		
		
	}

}
