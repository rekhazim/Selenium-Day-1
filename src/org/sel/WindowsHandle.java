package org.sel;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rekhagopinath\\eclipse-workspace\\Selenium practise\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
	 driver.findElement(By.xpath("//button[text()='click']")).click();
	 String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		Set<String> windows2 = driver.getWindowHandles();
		for(String x: windows2) {
			if(!x.equals(windowHandle)) {
				driver.switchTo().window(x);
			}
		}
		
		Thread.sleep(3000);
		  driver.findElement(By.xpath("//span[text()='Projects']")).click();
		  Set<String> windows = driver.getWindowHandles();
		  for (String y : windows) {
			if(!y.equals(windows2)) {
				driver.switchTo().window(y);
			}
		}

		
		Thread.sleep(3000);

		 driver.findElement(By.xpath("//a[text()='W3C Recommendation!']")).click();
	}

}
