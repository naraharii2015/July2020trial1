package july2020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browsertest {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://redbus.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("src")).sendKeys("Hyderabad");
		driver.findElement(By.id("dest")).sendKeys("Shirdi");
		driver.findElement(By.xpath("//*[@id='onward_cal']")).click();
		driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[6]/td[2]")).click();
		
		Thread.sleep(20000);
		driver.findElement(By.id("search_btn")).click();
	}

}
