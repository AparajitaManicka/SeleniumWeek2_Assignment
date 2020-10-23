package week2.assignment;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hyperlink {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
 
        driver.findElementByXPath("//*[@id='contentblock']/section/div[1]/div/div/a").click();Thread.sleep(2000); 
        driver.findElementByXPath("//*[@id='post-153']/div[2]/div/ul/li[3]/a/img").click();Thread.sleep(3000);
        System.out.println(driver.findElementByLinkText("Find where am supposed to go without clicking me?").getAttribute("href"));Thread.sleep(2000);
        driver.findElementByLinkText("Verify am I broken?").click();
        String title = driver.getTitle();
        
        System.out.println("Title:"+title);
        
        if(title.contains("Not Found")) {
        	System.out.println("The link is broken");
        }
        
        driver.get("http://leafground.com/pages/Link.html");Thread.sleep(2000);
        
        List<WebElement> links = driver.findElementsByTagName("a");
        System.out.println("Number of links on the page is "+links.size());
        for(int i=0;i<links.size();i++) {
        	
        	System.out.println(i+"."+links.get(i).getText());
        }
        System.out.println("All steps are completed successfully!!!!");
        driver.close();
	}

}
