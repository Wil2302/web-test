#language: pt
@funcionais
Funcionalidade: Pesquisa de CEP

	Como um usuário 
	Gostaria de pesquisar um CEP
	Para que eu possa obter as informações de endereço
	
	
	@COREIOTESTE
 Cenário: Pesquisar um cep e guardar as informações da pesquisa
	Dado que pesquiso um CEP
	Quando gravo a resposta
	Então valido a resposta gravada
	
