package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteOpportunity {
	public static void main(String[] args) throws InterruptedException {	
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://login.salesforce.com");
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@1234");
	    driver.findElement(By.xpath("//input[@id='Login']")).click();
	    driver.findElement(By.xpath("(//button[contains(@class,'slds-button')])[7]")).click();
	    driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//p[contains(text(),'Manage your sales ')]")).click();
	    Thread.sleep(5000);
	    WebElement text1 = driver.findElement(By.xpath("(//a[contains(@class,'slds-context-bar')])[2]"));
		driver.executeScript("arguments[0].click()", text1);
	    driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("sales force automation by reyol", Keys.ENTER);
	    WebElement text2 = driver.findElement(By.xpath("//a[contains(@class,'keyboardMode--trigger')]"));
	    driver.executeScript("arguments[0].click()", text2);
	    driver.findElement(By.xpath("//a[@title='Delete']")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//button[@title='Delete']")).click();
	    Thread.sleep(3000);
	    WebElement text = driver.findElement(By.xpath("//span[text()='No items to display.']"));
	    System.out.println(text.getText());
        driver.close();	    
}
}