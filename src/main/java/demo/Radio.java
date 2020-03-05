package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {
	public static void main(String[] args)
	 {
		 System.setProperty("webdriver.chrome.driver","D:/SeleniumJars/ChromeDriver/chromedriver.exe");
			//System.setProperty("webdriver.driver.bin","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://demowebshop.tricentis.com/");
		//driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		//driver.findElement(By.id("pollanswers-1")).click();
		//List<WebElement> rb=driver.findElements(By.name("pollanswers-1"));
		//((WebElement) rb.get(2)).click();
			driver.findElement(By.id("small-searchterms")).sendKeys("book");
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")).click();
			driver.findElement(By.id("As")).click();

		
}
}
