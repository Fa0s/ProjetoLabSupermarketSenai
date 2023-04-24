<h1 align="center"> 🚀 Projeto Lab Supermarket </h1>

<div align='center'>

<a href='https://www.java.com/pt-BR/'>![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)</a>
<a href='https://spring.io'>![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)</a>   <a href='https://maven.apache.org'>![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)</a>   <a href='https://www.postgresql.org'>![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)</a>

</div>
<br></br>

# 📰 Índice
- 📃 [Sobre](#📃-sobre)
- ⛔ [Pré-Requisitos](#⛔-pré-requisitos)
- 💻 [Tecnoligias Utilizadas](#💻-tecnologias-utilizadas)
- ✅ [Requisitos da Aplicação](#✅-requisitos-da-aplicação)
- 📋 [Roteiro da Aplicação](#📋-roteiro-da-aplicação)
- 📊 [Modelo Relacional](#📊-modelo-relacional-uml)
- 📄 [Documentação do Projeto](#📄-documentação-do-projeto)
- 💭 [Plano do Projeto](#💭-plano-do-projeto)
- 💬 [Observações](#💬-observações)
<br></br>

# 📃 Sobre

" *A LAB Supermarket está contratando novos desenvolvedores para o seu quadro de colaboradores, com o intuito de expandir os negócios. Os gestores entendem que antes de finalizar as contratações, é necessário executar um desafio prático onde o futuro colaborador deverá criar o back-end de um sistema de lista de compras. É hora de ficar feliz, pois você foi escolhido para criar a API Rest do LabShoppingList.* "

Este é um projeto avaliativo do modulo 3 do curso **Analista de Desenvolvimento Web** da instituição Senai.
<br></br>

# ⛔ Pré-Requisitos:
Pré-Requisitos para execução do projeto:

- Java 17
- PostgreSQL
- IDE 
- Configurar bando de dados
 
## Configurando banco de dados:
- Criar um banco de dados com o nome: **LabSupermarket**
<br></br>

# 💻 Tecnologias utilizadas
- [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [SpringBoot 2.7.6](https://docs.spring.io/spring-boot/docs/2.7.6/)
- [Maven 4.0.0](https://maven.apache.org/ref/4.0.0-alpha-5/)
- [VSCode](https://code.visualstudio.com)
- [Postman](https://www.postman.com)
- [PgAdmin](https://www.pgadmin.org)
- [Diagrams.net](https://www.diagrams.net)
<br></br>

# ✅ Requisitos da Aplicação

A aplicação que deverá ser realizada individualmente, deve contemplar os seguintes requisitos:
- Criação de modelo relacional
- Utilização correta do GitHub e escrita do Readme.md
- Cadastro de categoria
- Listagem de categorias
- Deleção de categoria
- Cadastro de produto
- Listagem de produtos
- Edição de produto por identificador
- Deleção de um produto por identificador
- Listagem de valor total comprado
- Documentação de código
<br></br>


# 📋 Roteiro da aplicação

- Requisito geral da aplicação:
    - Utilização de Spring: Boot, MVC, Data
    - Criação de API Rest
    - Utilização de Git com GitHub
    - Uso do banco de dados PostgreSQL
    - Criação de modelagem do banco de dados com Draw.io, DBDesigner ou ERD Tool do pgAdmin
    - Criação de documentação com Swagger
- Cadastro de categoria:
    - Não permitir cadastro duplicado
    - Não permitir cadastro com campos inválidos
    - Campos necessários:
        - Identificador da categoria: Único, autogerado
        - Nome da categoria: Única, tipo texto, preenchimento obrigatório
        - Descrição da categoria: Tipo texto, preenchimento não obrigatório
- Listagem de categorias:
    - Listar todas as categorias cadastradas com seus respectivos campos
- Deleção de categoria:
    - Deletar uma categoria por identificador
    - Não permitir deleção caso a categoria esteja em uso
- Cadastro de produto:
    - Não permitir cadastro duplicado
    - Não permitir cadastro com campos inválidos
    - Campos necessários:
        - Identificador do produto: Único, autogerado
        - Identificador da categoria: Utilizar categoria válida e já criada
        - Nome do produto: Tipo texto, preenchimento obrigatório
        - Valor do produto: Tipo numérico, preenchimento obrigatório
        - Status do produto: Comprado ou não comprado
- Listagem de produtos:
    - Listar todos os produtos cadastrados com seus respectivos campos
- Edição de produto:
    - Editar as informações do produto por identificador
- Deleção de produto:
    - Deletar um produto por identificador
- Listagem de valor total:
    - Listar o valor total comprado
    - Utilizar o status para calcular
- Documentação de código:
    - Documentar todos os endpoints criados utilizando Swagger 

<br></br>
 
# 📊 Modelo relacional UML
![modelo relacional uml](diagrama/diagramaProjeto.png)
<br></br>


<br></br>
# 📄 Documentação do Projeto

- https://documenter.getpostman.com/view/23798743/2s8YzMYQux
<br></br>
 
# 💭 Plano do Projeto

Ao construir a aplicação proposta, o aluno estará colocando em prática os aprendizados em:
- Spring:
    - Spring Boot: O que é Servlet, Fundamentos do Spring, O que é MVC, DTO, Autenticação/Segurança/JWT
    - Spring Data: Fundamentos, JPA/Hibernate, Model e Repository
    -   Explorando API Rest: CRUD (GET, POST, PUT, DELETE), Controller, Service e Repository
- SQL e Banco de Dados
    - Modelo relacional, Overview do PostgreSQL, Instalação e configuração do ambiente, Comandos DDL (CREATE, ALTER, DROP) e Comandos DML (INSERT, UPDATE, DELETE, SELECT)
-   Documentação de Back-End:
    -   Introdução, Boas práticas e Swagger

    <br></br>

# 💬 Observações

A documentação do projeto não foi feita com Swagger devido a uma incompatibilidade entre o **Spring 2.7.6** e o **Swagger**. Foi acordado com o professor que a documentação poderia ser feita utilizando outros métodos.
<br></br>

#     
### Desenvolvido por **Filipe Oliveira** 
<div align="center">
<a href='https://www.linkedin.com/in/faosoliveira/'>
    <img src='https://img.shields.io/badge/linkedin-%230077B5.svg?style=for-the-badge&logo=linkedin&logoColor=white'></img></a></div>
