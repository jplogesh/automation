package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Amazonhomepage 
{
	WebDriver driver;
	public Amazonhomepage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	By search = By.id("twotabsearchtextbox");
	By Submit = By.cssSelector("input[type='submit']");
	By select = By.cssSelector("span.a-size-medium a-color-base a-text-normal");
	By addtocart =By.xpath("//input[@value='add to cart']");
	
	public WebElement search()
	{
		return driver.findElement(search);
	} 
	
	public WebElement Submit()
	{
		return driver.findElement(Submit);
	}
	public WebElement select()
	{
		return driver.findElement(select);
	}
	public WebElement addtocart()
	{
		return driver.findElement(addtocart);
	}
}