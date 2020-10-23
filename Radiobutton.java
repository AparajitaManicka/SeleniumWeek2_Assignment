package week2.assignment;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElementById("yes").click();Thread.sleep(2000);
		
		//driver.findElementById("yes").click();Thread.sleep(2000);
		boolean Unchecked = driver.findElementByXPath("//*[@id='contentblock']/section/div[2]/div/div/label[2]/input").isSelected();
		System.out.println(Unchecked);
		
		//driver.findElementById("yes").click();Thread.sleep(2000);
		boolean checked = driver.findElementByXPath("//*[@id='contentblock']/section/div[2]/div/div/label[3]/input").isSelected();
		System.out.println(checked);
		
		System.out.println("All steps are completed successfully!!!!");
		driver.close();
	}

}
