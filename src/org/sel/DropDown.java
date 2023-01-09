package org.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rekhagopinath\\eclipse-workspace\\Selenium practise\\driver\\chromedriver.exe");
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		/* WebElement year = driver.findElement(By.id("yearbox"));	

		Select s = new Select(year);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement x = options.get(i);
			String text = x.getText();
			System.out.println(text);
		}*/
		
		
		WebElement Country = driver.findElement(By.id("select2-country-container"));
		Select s = new Select(Country);
		s.selectByVisibleText("India");
		
		}
	
}
