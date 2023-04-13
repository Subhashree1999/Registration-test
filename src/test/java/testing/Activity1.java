package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\seleniumjarandwebdriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://nextv3.elemetrik.net/elemetrik-registration/signup/registration");
			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Subhashree");
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Behera");
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Subhashreebehera@gmail.com");
			driver.findElement(By.xpath("//label[text()='Account Title*']//following-sibling::input"))
					.sendKeys("Project.co.in");
			driver.findElement(By.xpath("//input[@name='siteDomain']")).sendKeys("Project");
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//div[contains(@class,'next_select__indicator')])[1]"))))
			.click();
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[text()='Learning Journeys']"))))
			.click();
			driver.findElement(By.xpath("(//div[contains(@class,'next_select__indicator')])[1]")).click();

			driver.findElement(By.xpath("//span[text()='Next']")).click();
			driver.findElement(By.xpath("//h3[text()='Verify your Email to Complete Setup']")).click();

			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
