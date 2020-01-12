package correios.steps;

import correios.actions.BuscaCEPEnderecoAction;
import correios.core.ThreadDriver;
import correios.core.Utils;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class BuscarCEPSteps {

	String resposta;
	BuscaCEPEnderecoAction thread;
	
	@Dado("^que pesquiso um CEP$")
	public void que_pesquiso_um_CEP() throws Throwable {
		new BuscaCEPEnderecoAction(ThreadDriver.getTDriver()).pesquisarCEP("08460210");
	}

	@Quando("^gravo a resposta$")
	public void gravo_a_resposta() throws Throwable {
		
		thread = new BuscaCEPEnderecoAction(ThreadDriver.getTDriver());
		resposta =	thread.pegarRetornoCEP();
		Utils.gravarDados(resposta);
		Utils.lerJson();
	}

	@Entao("^valido a resposta gravada$")
	public void valido_a_resposta_gravada() throws Throwable {
		thread.validarDadosGravados();
	}

}
