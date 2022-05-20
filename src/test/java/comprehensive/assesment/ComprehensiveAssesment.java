package comprehensive.assesment;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComprehensiveAssesment {
	
	

	public static void main(String args[]) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver", "C:\\Logs\\chromedriver.exe");  
      WebDriver driver=new ChromeDriver();  
       driver.get("https://www.urbanladder.com/"); 
       Thread.sleep(2000);
       driver.findElement(By.id("search")).sendKeys("sofa set");
       driver.findElement(By.cssSelector("span.search-icon.icofont-search")).click();
       driver.findElement(By.className("lazy")).click();
       WebElement a= driver.findElement(By.xpath("//div[contains(@class,'price final')]"));
       System.out.println(a.getText());
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.findElement(By.id("add-to-cart-button")).click();
       driver.findElement(By.className("continueshop")).click();
	}

}
