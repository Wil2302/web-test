$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("correios.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 3,
  "name": "Pesquisa de CEP",
  "description": "\r\nComo um usuário \r\nGostaria de pesquisar um CEP\r\nPara que eu possa obter as informações de endereço",
  "id": "pesquisa-de-cep",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@funcionais"
    }
  ]
});
formatter.before({
  "duration": 33957187405,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Pesquisar um cep e guardar as informações da pesquisa",
  "description": "",
  "id": "pesquisa-de-cep;pesquisar-um-cep-e-guardar-as-informações-da-pesquisa",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 10,
      "name": "@COREIOTESTE"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "que pesquiso um CEP",
  "keyword": "Dado "
});
formatter.step({
  "line": 13,
  "name": "gravo a resposta",
  "keyword": "Quando "
});
formatter.step({
  "line": 14,
  "name": "valido a resposta gravada",
  "keyword": "Então "
});
formatter.match({
  "location": "BuscarCEPSteps.que_pesquiso_um_CEP()"
});
formatter.result({
  "duration": 1181065605,
  "status": "passed"
});
formatter.match({
  "location": "BuscarCEPSteps.gravo_a_resposta()"
});
formatter.result({
  "duration": 88808676044,
  "status": "passed"
});
formatter.match({
  "location": "BuscarCEPSteps.valido_a_resposta_gravada()"
});
formatter.result({
  "duration": 47539607195,
  "status": "passed"
});
formatter.after({
  "duration": 1635943230,
  "status": "passed"
});
});