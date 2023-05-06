package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateNewOpportunity {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qeagle-dev-ed.my.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Manage your sales process with accounts, leads, opportunities, and more']")).click();
		WebElement oppor = driver.findElement(By.xpath("//span[text()='Opportunities'][1]"));
		driver.executeScript("arguments[0].click()", oppor);
		driver.findElement(By.linkText("New")).click();
	WebElement opp =driver.findElement(By.xpath("//input[@name='Name']"));
		opp.sendKeys(" sales force automation by reyol");
	String name1 = "sales force automation by reyol";
		System.out.println(name1);
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//button[text()='Today']")).click();
	 driver.findElement(By.xpath("//button[contains(@class,'slds-combobox__input slds-input_faux ')]")).click();
	 driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
	 driver.findElement(By.xpath("//button[text()='Save']")).click();
	 String name = driver.findElement(By.xpath("(//h1)[3]//lightning-formatted-text")).getText();
	
	  if (name.equals(name1)) {
		  System.out.println("its same");
	  }  else {
		  System.out.println("not same");
	  }
	driver.close();	
	}
}