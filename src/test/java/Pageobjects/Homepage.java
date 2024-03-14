package Pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage extends Basepage {
	
	WebDriver driver;
	public Homepage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	// Webelements  for list of menu toggles
	List<WebElement> menutoggles =driver.findElements(By.xpath("//a[@class='nav-link dropdown-toggle']"));
	//Action methods
	public void printmenutoggles() {		
	for(WebElement toggle: menutoggles)
	{
		String toggletext=toggle.getText();
		System.out.println(toggletext);
	}
	}
}
