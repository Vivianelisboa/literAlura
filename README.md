# literAlura
📚LiterAlura

Projeto desenvolvido em Java com Spring Boot para consumir dados de livros através de uma API e armazená-los em um banco de dados. O sistema permite buscar livros pelo título, listar livros cadastrados, listar autores e realizar consultas específicas sobre autores e idiomas.

 Tecnologias utilizadas

Java 17

Spring Boot

Spring Data JPA

PostgreSQL

API Gutendex

Maven

IntelliJ IDEA

Git e GitHub

📖 Sobre o projeto

O LiterAlura é uma aplicação de linha de comando que consome dados da API Gutendex, uma API pública que fornece informações sobre livros do Projeto Gutenberg.

A aplicação permite que o usuário busque livros pelo título. Quando um livro é encontrado, suas informações e as informações do autor são armazenadas no banco de dados.

Depois disso, o sistema permite realizar diversas consultas sobre os dados armazenados.

⚙️ Funcionalidades

O sistema possui as seguintes opções de menu:

1️⃣ Buscar livro pelo título
Busca um livro na API e salva no banco de dados.

2️⃣ Listar livros
Exibe todos os livros cadastrados no banco de dados.

3️⃣ Listar autores
Mostra todos os autores cadastrados.

4️⃣ Listar autores vivos em determinado ano
Permite consultar quais autores estavam vivos em um determinado ano.

5️⃣ Contar livros por idioma
Mostra a quantidade de livros cadastrados para cada idioma.

0️⃣ Sair
Encerra o programa.

🗄️ Estrutura do projeto

🔗 API utilizada

A aplicação consome dados da:

API Gutendex

https://gutendex.com/books/

Exemplo de busca:

https://gutendex.com/books/?search=dom+casmurro
🗃️ Banco de dados

Foi utilizado o banco:

PostgreSQL

As entidades principais são:

Autor

id

nome

birthYear

deathYear

Livro

id

titulo

idioma

autor

▶️ Como executar o projeto

1️⃣ Clonar o repositório

git clone https://github.com/seu-usuario/literalura.git

2️⃣ Abrir o projeto no IntelliJ IDEA

3️⃣ Configurar o banco PostgreSQL no arquivo:

application.properties

Exemplo:

spring.datasource.url=jdbc:postgresql://localhost:5432/literalura
spring.datasource.username=postgres
spring.datasource.password=senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

4️⃣ Executar a classe principal:

LiterAluraApplication

O menu será exibido no terminal.

🎯 Objetivo do projeto

Este projeto foi desenvolvido com o objetivo de praticar:

Consumo de API

Manipulação de dados JSON

Persistência de dados com JPA

Integração com banco de dados

Estruturação de projetos Spring Boot

👩‍💻 Autora

Viviane Lisboa dos Santos

Estudante de Engenharia de Software
Católica de Brasília
