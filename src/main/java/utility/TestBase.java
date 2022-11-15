package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static Properties prop;
	public static WebDriver Driver;

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					".\\src\\test\\resources\\configuration\\text.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {
		String BrowserName = prop.getProperty("browser");

		if (BrowserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			Driver = new ChromeDriver();
	
		}

		Driver.manage().deleteAllCookies();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Driver.get(prop.getProperty("Url"));

	}
}
