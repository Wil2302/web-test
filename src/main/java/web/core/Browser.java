package web.core;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser implements IBrowser {

	private static WebDriver driver;
	private static String URL_BASE = "https://www.amazon.com.br/";
    public WebDriverWait wait;

	public void setupBrowser() throws IOException {
		System.setProperty("webdriver.chrome.driver", "./chromedriver");
		driver.manage().window();
		driver.get(URL_BASE);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");
		driver = new ChromeDriver(options);
		ThreadDriver.setTDriver(driver);
		wait = new WebDriverWait(ThreadDriver.getTDriver(), 10);
	}

	public static void close() {
		driver.close();
	}

}
