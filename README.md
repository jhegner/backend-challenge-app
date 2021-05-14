# Solucao Desafio - Jidlafe Hegner

## Introdução

O projeto de solução do desafio foi desenvolvido com Java 11 e Spring Boot 2.4.5.

IDE: Idea 2021.1

Para teste: JUnit(Jupiter) 5.7.1

Apache Maven 3.8.1

## Descrição da solução

Dado os requisitos do problema (caso de uso) decidi separar as responsabilidades de cada validação
em uma classe especializada.

As validações são feitas iterando uma lista de validações. Se necessário a remoção ou inclusão de uma validação
entendo que isso permita pouca alteração no código.

Onde possível adicionei a capacidade de parametrizar a quantidade de caracteres a serem validados

A API Web é simples (POST) exigindo um campo no HEADER da requisição com a senha a ser validada.

/api/v1/valida-senha

Em caso de senha valida a API retorna HTTP_STATUS_CODE - 200

Em caso de senha invalida a API retorna HTTP_STATUS_CODE - 400

Para os testes mantive em poucos arquivos para realizar a entrega num prazo menor, podendo granular se necessário.

Para build do projeto utilizei o Maven.

## Instruções para execução

Necessário instalação do Java 11 ou superior.

Maven instalado para build do projeto e execucao.

Podera utilizar o Idea para melhor navegacao do projeto.

Build:

mvn clean install

Setup:

mvn spring-boot:run

API Para Teste:

curl -v --location --request POST 'http://localhost:8080/api/v1/valida-senha' --header 'senha: 1234545'

curl -v --location --request POST 'http://localhost:8080/api/v1/valida-senha' --header 'senha: AbTp9!fok'

Verifique o status code