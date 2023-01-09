package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rekhagopinath\\eclipse-workspace\\Selenium practise\\driver\\chromedriver.exe");
	
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Static.html");
	Actions ac = new Actions(driver);
	WebElement drag = driver.findElement(By.id("dragarea"));
	WebElement drop = driver.findElement(By.id("droparea"));
 ac.dragAndDrop(drag, drop).perform();

}
}