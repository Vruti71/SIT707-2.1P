package sit707_week2;
import org.openqa.selenium.By;
import org.openqa.selenium. WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demmu {

public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\asus\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	
try {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	WebElement fName = driver.findElement(By.id("firstName"));
	WebElement lName = driver.findElement(By.id("lastName"));
	WebElement userEmail = driver.findElement(By.id("userEmail"));
	WebElement gender= driver.findElement(By.name("gender"));
	WebElement phone= driver.findElement(By.id("userPhone"));
	WebElement DOB = driver.findElement(By.id("userEmail"));
	WebElement submit = driver.findElement(By.id("submit"));
	
	
	fName.sendKeys("Kheni");
	lName.sendKeys("Vruti");
	userEmail.sendKeys("vruti@gmail.com");
	gender.sendKeys("Female");
	phone.sendKeys("9090909090");
	fName.sendKeys("Female");
	
	submit.click();
	
	Thread.sleep(2000);
	driver.quit();
}
catch(InterruptedException err) {
	
}

	
	}
}
