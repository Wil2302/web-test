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
  "duration": 30075099948,
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
  "duration": 701600736,
  "status": "passed"
});
formatter.match({
  "location": "BuscarCEPSteps.gravo_a_resposta()"
});
formatter.result({
  "duration": 225641671,
  "status": "passed"
});
formatter.match({
  "location": "BuscarCEPSteps.valido_a_resposta_gravada()"
});
formatter.result({
  "duration": 2531118,
  "status": "passed"
});
formatter.after({
  "duration": 1673372879,
  "status": "passed"
});
});