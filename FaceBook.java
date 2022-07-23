package w2.hw;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.findElement(By.id("u_0_0_cJ")).click();
		driver.findElement(By.xpath("//div[@class='_6ltg'][2]")).click();
		driver.findElement(By.name("lastname")).sendKeys("Moha");
		driver.findElement(By.name("firstname")).sendKeys("Moha1");
		driver.findElement(By.id("password_step_input")).sendKeys("Java1947$$");
		driver.findElement(By.name("reg_email__")).sendKeys("1001001001");
		WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
		Select myday = new Select(day);
		myday.selectByValue("21");
		WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
		Select mymonth = new Select(month);
		mymonth.selectByIndex(2);
		WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
		Select myyear = new Select(year);
		myyear.selectByVisibleText("2000");
		//driver.findElement(By.xpath("//div[@class='5k_2 _5dba'][1]")).click();
		driver.findElement(By.xpath("//input[@name='sex'][1]")).click();
		
		
		
	}

}
