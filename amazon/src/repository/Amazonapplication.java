package repository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Amazonapplication {
	@Test
public void Amazon()
{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jey Prakash\\work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		Amazonhomepage ah=new Amazonhomepage(driver);
	    ah.search().sendKeys("headphones below 1000 rupees");
	    ah.Submit().click();
	    ah.select().click();
	   // Select s = new Select(driver.findElement(By.id("quantity")));
		//s.selectByValue("2");
		ah.addtocart().click();
}
}
