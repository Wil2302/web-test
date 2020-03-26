package web.core;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser implements IBrowser {

	private static WebDriver driver;
	private static String URL_BASE = "http://www.buscacep.correios.com.br/sistemas/buscacep/buscaCepEndereco.cfm";
    public WebDriverWait wait;

	public void setupBrowser() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Desenvolvimento\\git-web\\web-test\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get(URL_BASE);

		ThreadDriver.setTDriver(driver);
		wait = new WebDriverWait(ThreadDriver.getTDriver(), 10);
	}

	public static void close() {
		driver.close();
	}

}
