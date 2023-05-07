package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/login");
driver.findElement(By.id("email")).sendKeys("irfi.annu@gmail.com");
driver.findElement(By.id("pass")).sendKeys("test");
driver.findElement(By.id("login")).click();

	}

}
