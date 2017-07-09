package testing01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test01 {

	@Test
	public void Testjen() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
	}

}
