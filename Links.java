package w2.hw;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.navigate().back();
		String attribute = driver.findElement(By.xpath("//a[contains(text(),'without clicking me')]")).getAttribute("href");
		System.out.println("destination url without clicking : "+ attribute);
		driver.findElement(By.linkText("Verify am I broken?")).click();
		String borkenLink = driver.findElement(By.xpath("//h1[text()='404 Not Found']")).getText();
		System.out.println("yes it is broken link : " +borkenLink);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@link='blue'])[3]")).click();		
		List<WebElement> findElements = driver.findElements(By.xpath("//a"));
		System.out.println(findElements.size());
	}

}
