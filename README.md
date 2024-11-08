
# DummyJSON Client - Java 17 e Spring Boot 3.2.5 ( DESAFIO )

## Descrição do Projeto

Este projeto é um microsserviço Java que interage com a API pública [DummyJSON](https://dummyjson.com/docs/products) para realizar operações de busca de produtos. O projeto foi desenvolvido usando Java 8 e Spring Boot 2.6.x.

## Objetivo do Desafio

O desafio consiste em migrar este projeto para Java 17 e Spring Boot 3.2.5. Durante a migração, você enfrentará várias dificuldades, incluindo a adaptação ao novo namespace, substituição de métodos depreciados e ajustes em testes unitários.

## Tecnologias Utilizadas

- Java 17 (JDK 17)
- Spring Boot 3.2.5
- Spring Cloud OpenFeign
- Springdoc OpenAPI (Swagger UI)
- Jakarta Validation API (para validação de dados)

## Endpoints Disponíveis
1. GET /api/products
- Obtém todos os produtos.
- Resposta (200): Lista de produtos.
- 
2. GET /api/products/{id}
- Obtém um produto pelo ID.
- Parâmetros: id (Long)
- Resposta (200): Produto correspondente ao ID fornecido.
- Resposta (404): Produto não encontrado.

## Acessando a Documentação Swagger-Ui

Após iniciar o servidor, você pode acessar a documentação da sua API através do Swagger UI:

1. Abra seu navegador e acesse a URL:

    ```bash
    http://localhost:8080/swagger-ui.html
    ```
No Swagger UI, você verá todos os endpoints da sua API documentados de forma interativa. Você pode testar os endpoints diretamente da interface.

## Acessar saúde do microsserviço.
- Utilizar url para Actuator.

    ```bash
    http://localhost:8080/actuator/health
    ```


### Executar a Aplicação

1. Clone o repositório:

    ```bash
    git clone Shenrique/code-challenge-migration-main.git
    cd dummyjson-client
    ```

2. Compile e execute o projeto:

    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

3. Acesse o serviço:

    O serviço estará disponível em `http://localhost:8080`.

### Executar Testes

Para executar os testes unitários:

```bash
mvn clean test
```

## Requisitos de Entrega

1. Atualizar o `pom.xml` para usar Java 17+ e Spring Boot 3.2.5.
2. Substituir `RestTemplate` por `WebClient` ou `Openfeign`.
3. Substituir os testes unitários feitos com `JUnit 4` e `Mockito` por testes de integração utilizando `@SpringBootTest`.
4. Refatorar qualquer código depreciado ou incompatível.
5. Garantir que todos os testes ainda passam após a migração.
6. Deixar a URL da API dummyjson parametrizada por ambiente no projeto.
7. Adicionar no projeto um novo path `/health` que retorna a saude do microsserviço.

## Validação Sobre o Challenge

- O projeto deve estar funcionando em Java 17 e Spring Boot 3.2.5.
- Todos os testes unitários devem ser executados e passar sem falhas.
- O código deve estar devidamente documentado e organizado.