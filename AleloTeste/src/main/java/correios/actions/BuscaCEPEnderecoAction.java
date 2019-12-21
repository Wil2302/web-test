package correios.actions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.google.gson.Gson;

import correios.core.Utils;
import correios.entidades.BuscaCepDTO;

public class BuscaCEPEnderecoAction extends BaseActions{
	
	public BuscaCEPEnderecoAction(WebDriver driver) {
		super(driver);
	}
	
	private BuscaCepDTO dto;
	
	public void pesquisarCEP(String cep) {
		driver.findElement(By.name("relaxation")).sendKeys(cep);
		driver.findElement(By.xpath("//input[contains(@class,'btn2 float-right')]")).click();
	}
	
	public String pegarRetornoCEP() {
		dto = new BuscaCepDTO();
		dto.setLogradouro(driver.findElement(By.xpath("(//tr)[2]/td[1]")).getText());
		dto.setBairro(driver.findElement(By.xpath("(//tr)[2]/td[2]")).getText());
		dto.setLocalidade(driver.findElement(By.xpath("(//tr)[2]/td[3]")).getText());
		dto.setCep(driver.findElement(By.xpath("(//tr)[2]/td[4]")).getText());
		Gson gson = new Gson();
	    String json = gson.toJson(dto);
	    return json;
	}
	
	public void validarDadosGravados() {
		Assert.assertEquals(Utils.obterDadosChave("bairro"), dto.getBairro());
		Assert.assertEquals(Utils.obterDadosChave("localidade"), dto.getLocalidade());
		Assert.assertEquals(Utils.obterDadosChave("logradouro"), dto.getLogradouro());
		Assert.assertEquals(Utils.obterDadosChave("cep"), dto.getCep());
	}
	
	
}
