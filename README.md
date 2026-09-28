#  DigitalBank - API REST

Uma API REST profissional desenvolvida em **Java** com o framework **Spring Boot**, integrada ao banco de dados relacional **MySQL**. O projeto nasceu da evolução de um sistema de banco digital via console (terminal) para um servidor web moderno, robusto e escalável de mercado.

##  Tecnologias e Conceitos Dominados

Durante o desenvolvimento e a migração da arquitetura, foram aplicados conceitos fundamentais exigidos pelo mercado de desenvolvimento backend:

* **Spring Boot 3 & Maven:** Gerenciamento de dependências, automação de build e inicialização do servidor embutido Apache Tomcat na porta 8080.
* **Injeção de Dependências (`@Autowired`):** Delegação do ciclo de vida dos objetos e gerenciamento de componentes pelo ecossistema do Spring.
* **Camada de Controle (`@RestController` & `@RequestMapping`):** Criação de rotas HTTP mapeadas para escutar requisições web através do protocolo HTTP.
* **Persistência de Dados Moderna (`@Repository` & `JdbcTemplate`):** Integração com banco de dados MySQL, substituindo o JDBC tradicional por abstrações que gerenciam conexões e executam queries de forma limpa.
* **Encapsulamento e POO:** Criação de entidades de dados estruturadas com mapeamento de tipos modernos do Java, como `LocalDate`.

##  Rotas da API Disponíveis

### Clientes
* **`GET /ola`** ➔ Rota de teste para verificação da saúde do servidor web.
* **`GET /ola/cadastrar`** ➔ Endpoint que instancia uma entidade, valida os dados de restrição física do banco e executa o `INSERT` no MySQL local.

##  Estrutura do Banco de Dados (MySQL)

A persistência está estruturada na tabela `clientes` mapeando as seguintes colunas e constraints obrigatórias:
* `id_cliente` (INT AUTO_INCREMENT PRIMARY KEY)
* `nome` (VARCHAR)
* `cpf` (VARCHAR)
* `email` (VARCHAR)
* `data_nascimento` (DATE)
* `celular` (VARCHAR)

##  Como Executar o Projeto Localmente

1. Clone o repositório em sua máquina.
2. Certifique-se de ter o **MySQL** instalado e crie um schema chamado `digital_bank`.
3. Abra o arquivo `src/main/resources/application.properties` e atualize as propriedades `spring.datasource.username` e `spring.datasource.password` com as credenciais do seu banco local.
4. Execute a classe principal `DigitalbankApplication.java` utilizando a sua IDE (VS Code/IntelliJ) ou via terminal com o comando `mvn spring-boot:run`.
5. Acesse `http://localhost:8080/ola/cadastrar` no seu navegador para testar a inserção automática!
