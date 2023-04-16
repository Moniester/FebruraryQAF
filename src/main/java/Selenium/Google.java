package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {

	public static void main(String[] args) {
		
	WebDriver driver;
	
	WebDriverManager.edgedriver().setup();
	
	driver = new EdgeDriver();
	driver.get("https://www.adidas.com/us");
	driver.findElement(By.name("")).sendKeys("Quality Insurence");
	driver.findElement(By.name("bank")).click();

	
	
	

    
	


	
	
	
	}

}
