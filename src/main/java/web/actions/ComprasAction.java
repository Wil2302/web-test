package web.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComprasAction extends BaseActions {

	public ComprasAction(WebDriver driver) {
		super(driver);
	}

	public void pesquisarIten(String item) {
		WebElement campoPesquisa = driver.findElement(By.id("twotabsearchtextbox"));
			campoPesquisa.click();
			campoPesquisa.sendKeys(item);
			campoPesquisa.submit();
	}

	public void validarPesquisa(String iten) throws Exception {
		String pesquisa = driver.findElement(By.xpath(
				"//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]/span[@class=\"a-color-state a-text-bold\"]"))
				.getText();
		boolean compara = pesquisa.contains(iten);
		if(compara == false) {
			throw new Exception("Retorno de Pesquisa incorreto");
		}
	}
}
