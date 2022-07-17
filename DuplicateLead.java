package w2.d1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ram");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Karthik");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Gullu");
		driver.findElement(By.name("departmentName")).sendKeys("CS");
		driver.findElement(By.name("description")).sendKeys("LEARNIG IS FUN");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("dhinamanikarthik.svce@gmail.com");
		WebElement dd1 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state = new Select(dd1);
		state.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		String title=driver.getTitle();
		if(title.equals("View Lead | opentaps CRM"))
		{
			System.out.println("sucessully added lead");
		}
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon1");
		driver.findElement(By.id("createLeadForm_lastName")).clear();
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ram1");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Karthik1");
		driver.findElement(By.className("smallSubmit")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
	}

}
