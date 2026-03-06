📚 LiterAlura

Aplicação desenvolvida em Java com Spring Boot que consome dados de uma API pública de livros e armazena as informações em um banco de dados PostgreSQL. O sistema permite pesquisar livros, consultar autores e realizar análises simples sobre os dados cadastrados.

Este projeto foi desenvolvido como prática de consumo de APIs, persistência de dados e organização de aplicações backend.

🚀 Tecnologias Utilizadas

☕ Java 17

🌱 Spring Boot

🗄 Spring Data JPA

🐘 PostgreSQL

🔗 API Gutendex

📦 Maven

💻 IntelliJ IDEA

🐙 Git & GitHub

📖 Funcionalidades

O sistema funciona através de um menu interativo no terminal.

Menu principal
===== LiterAlura =====

1 - Buscar livro pelo título
2 - Listar livros
3 - Listar autores
4 - Autores vivos em determinado ano
5 - Contar livros por idioma
0 - Sair
🔎 Buscar livro pelo título

Busca livros na API Gutendex e salva os dados no banco de dados.

📚 Listar livros

Mostra todos os livros cadastrados no sistema.

✍️ Listar autores

Exibe os autores registrados no banco de dados.

📅 Autores vivos em determinado ano

Permite descobrir quais autores estavam vivos em um ano específico.

🌎 Contar livros por idioma

Mostra quantos livros estão cadastrados para cada idioma.

🔗 API Utilizada

O sistema utiliza a API Gutendex, que disponibiliza livros do Projeto Gutenberg.

Exemplo de requisição:

https://gutendex.com/books/?search=dom+casmurro

Documentação oficial:

https://gutendex.com/

🗃 Banco de Dados

O projeto utiliza PostgreSQL para persistência dos dados.

Entidade Autor
Campo	Tipo
id	Long
nome	String
birthYear	Integer
deathYear	Integer
Entidade Livro
Campo	Tipo
id	Long
titulo	String
idioma	String
autor	Autor
⚙️ Como Executar o Projeto
1️⃣ Clonar o repositório
git clone https://github.com/seu-usuario/literalura.git
2️⃣ Abrir no IntelliJ

Abra a pasta do projeto no IntelliJ IDEA.

3️⃣ Configurar o banco de dados

No arquivo:

application.properties

Adicione suas configurações do PostgreSQL:

spring.datasource.url=jdbc:postgresql://localhost:5432/literalura
spring.datasource.username=postgres
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
4️⃣ Executar o projeto

Execute a classe:

LiterAluraApplication

O menu aparecerá no terminal.

🎯 Objetivo do Projeto

Este projeto foi desenvolvido para praticar:

Consumo de APIs REST

Conversão de JSON para objetos Java

Persistência com Spring Data JPA

Integração com PostgreSQL

Estruturação de projetos Spring Boot

👩‍💻 Autora

Viviane Lisboa dos Santos

🎓 Estudante de Engenharia de Software
🏫 Católica de Brasília
