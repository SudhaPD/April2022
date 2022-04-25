package org.cts.test;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\GIT\\java\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement btnClose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnClose.click();
		
		WebElement tabSearch = driver.findElement(By.name("q"));
		tabSearch.sendKeys("Iphone",Keys.ENTER);
		
//		tabSearch.sendKeys("Iphones");
//		WebElement btnSearch = driver.findElement(By.xpath("//button[@type='submit']"));
//		btnSearch.click();
		
		List<WebElement> phnNames = driver.findElements(By.xpath("//div[@class='_4rR01T']"));

////		JavascriptExecutor js=(JavascriptExecutor)driver;
////		js.executeScript("arguments[0].scrollIntoView(true))",phnNames);
//
		WebElement nxtBtn = driver.findElement(By.xpath("//span[text()='Next']"));
		nxtBtn.click(); //Thread.sleep(3000);
		
		System.out.println(phnNames.size());
		for(int i=0;i<phnNames.size();i++) {
		WebElement phnName = phnNames.get(i);
//		System.out.println(phnName.getText());
		}
//		Thread.sleep(3000);
		List<WebElement> phnPrc = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		
		System.out.println(phnPrc.size());
		
		for(int i=0;i<phnPrc.size();i++) {
		WebElement phnPrice = phnPrc.get(i);
		System.out.println(phnPrice.getAttribute("innerText"));
		}
		nxtBtn.click();
	}

}
