package week2.assignment;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElementByXPath("//section[@class='innerblock']/div/div/input").click();Thread.sleep(3000);
	    System.out.println(driver.findElementByXPath("//*[@id='contentblock']/section/div[2]/div/input").isSelected());Thread.sleep(3000);
	    driver.findElementByXPath("//*[@id='contentblock']/section/div[3]/div[2]/input").click();Thread.sleep(3000);
	    driver.findElementByXPath("//*[@id='contentblock']/section/div[4]/div[1]/input").click();Thread.sleep(1000);
	    driver.findElementByXPath("//*[@id='contentblock']/section/div[4]/div[2]/input").click();Thread.sleep(1000);
	    driver.findElementByXPath("//*[@id='contentblock']/section/div[4]/div[3]/input").click();Thread.sleep(1000);
	    driver.findElementByXPath("//*[@id='contentblock']/section/div[4]/div[4]/input").click();Thread.sleep(1000);
	    driver.findElementByXPath("//*[@id='contentblock']/section/div[4]/div[5]/input").click();Thread.sleep(1000);
	    System.out.println("All steps are completed successfully!!!!");
	    driver.close();
	}

}

/*1) Complete all the 5 activities in Edit Page: http://leafground.com/pages/Edit.html
2) Complete all the 4 activities in Button Page: http://leafground.com/pages/Button.html
3) Complete all the 5 activities in HyperLink Page: http://leafground.com/pages/Link.html
4) Complete all the 3 activities in Image Page: http://leafground.com/pages/Image.html
5) Complete all the 6 activities in DropDown Page: http://leafground.com/pages/Dropdown.html
6) Complete all 3 activities in Radio button Page: http://leafground.com/pages/radio.html
7) Complete all 4 activities in CheckBox Page: http://leafground.com/pages/checkbox.html
*/