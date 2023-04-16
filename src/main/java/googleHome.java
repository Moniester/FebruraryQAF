

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.SearchItem;

public class googleHome {
	
	WebDriver driver;
	public googleHome(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="Id")
	WebElement serchBx;
	public void enterserch(String bx) {
		Object searchBx;
		 searchBx).sendKeys(bx);
	
		 @FindBy(name="Xpath")
		 WebElement searchBox;
		 
		 //searchBox.sendKeys(string);
		 public void enterSearch(String String) {
			 
			
			SearchBox.sendKeys(String);
			
		 }
		 
	
	    //webElement searchButton=driver.findElement(By.name("Xpath"));
		 @FindBy(name="btnk")
		 WebElement SearchButton 
		 
		 //searchbutton.submit();
		 public void clickSearch() {
			     
			      SearchItem.submit();
		 }
	
	
	}	
	
	
		

	


