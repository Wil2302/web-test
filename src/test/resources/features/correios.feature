#language: pt
@funcionais
Funcionalidade: Pesquisa de CEP
  
  Como um usuario 
  Gostaria de pesquisar um CEP
  Para que eu possa obter as informações de endereço

  @COREIOTESTE
  Cenario: Pesquisar um cep e guardar as informacoes da pesquisa
    Dado que pesquiso um CEP
    Quando gravo a resposta
    Entao valido a resposta gravada
