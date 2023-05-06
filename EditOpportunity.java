package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EditOpportunity {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://login.salesforce.com");
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@1234");
	    driver.findElement(By.xpath("//input[@id='Login']")).click();
	    driver.findElement(By.xpath("(//button[contains(@class,'slds-button')])[7]")).click();
	    driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
	    driver.findElement(By.xpath("//p[contains(text(),'Manage your sales ')]")).click();
	    Thread.sleep(10000);
	    WebElement np = driver.findElement(By.xpath("(//a[contains(@class,'slds-context-bar')])[2]"));
		driver.executeScript("arguments[0].click()", np);
	    driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Salesforce Automation by Yaswanth", Keys.ENTER);
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//a[contains(@class,'slds-button--icon-border-filled')]")).click();
        driver.findElement(By.xpath("//a[@title='Edit']")).click();
	    driver.findElement(By.xpath("(//input[@class='slds-input'])[4]")).clear();
	    driver.findElement(By.xpath("(//input[@class='slds-input'])[4]")).sendKeys("5/6/2023");
	    driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox')])[2]")).click();
	    driver.findElement(By.xpath("(//lightning-base-combobox-item[@class='slds-media slds-listbox__option slds-media_center slds-media_small slds-listbox__option_plain'])[6]")).click();
	    WebElement pr = driver.findElement(By.xpath("(//button[contains(@class,' slds-input_faux slds-combobox__input-value')])[4]"));
	    driver.executeScript("arguments[0].click()", pr);
	    driver.findElement(By.xpath("//lightning-base-combobox-item[contains(@class, 'slds-media_small slds-listbox__option_plain slds-has-focus')]")).click();
	    driver.findElement(By.xpath("//textarea[@class='slds-textarea']")).sendKeys("SalesForce");
	    driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
	    WebElement tt = driver.findElement(By.xpath("//span[text()='Perception Analysis']"));
	    System.out.println(tt.getText());
	    
	}}
}
