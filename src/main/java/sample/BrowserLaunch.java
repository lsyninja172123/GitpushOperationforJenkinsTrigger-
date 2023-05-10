package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {
	public static void main(String[] args) {
     WebDriverManager.chromedriver().setup();
     ChromeOptions options = new ChromeOptions();
     options.addArguments("--remote-allow-origins=*");
     options.addArguments("--no-sandbox");
     options.addArguments("--disable-dev-shm-usage");
     WebDriver driver=new ChromeDriver(options);
     driver.get("https://www.google.com");
     System.out.println("done");
     System.out.println("Newly added syout");
		System.out.println("Newly added syout");
     driver.findElement(By.name("q")).sendKeys("jenkins"+Keys.ENTER);
     
     
	}
}
