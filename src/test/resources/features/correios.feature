#language: pt
@funcionais
Funcionalidade: Pesquisa de CEP
  
  Como um usuario 
  Gostaria de pesquisar um CEP
  Para que eu possa obter as informacoes de endereco

  @COREIOTESTE
  Cenario: Pesquisar um cep e guardar as informacoes da pesquisa
    Dado que pesquiso um CEP
    Quando gravo a resposta
    Entao valido a resposta gravada
