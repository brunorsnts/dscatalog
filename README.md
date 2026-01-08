DS Catalog

DSCatalog é uma aplicação de catálogo de produtos desenvolvida como projeto backend em Java usando Spring Boot. Este projeto segue boas práticas de arquitetura em camadas, possui autenticação e autorização com OAuth2 + JWT, além de fornecer uma API REST para gerenciar produtos, categorias e usuários.

⚙️ Estrutura do repositório: monorepo contendo o backend do projeto (sem frontend por enquanto).

- Funcionalidades
- Funcionalidades principais

📌 CRUD completo de Produtos, Categorias e Usuários

🔐 Autenticação via OAuth2 + JWT

👤 Controle de acesso por perfil (ex.: ROLE_ADMIN, ROLE_OPERATOR)

🧪 Testes automatizados com JUnit e Mockito

📊 Paginação de resultados nas listagens

📍 Estrutura de projeto em camadas (Controller → Service → Repository)

📦 Utiliza Bean Validation para garantir integridade dos dados

🛠 Tecnologias usadas
Categoria	Ferramenta / Framework
Linguagem	Java
Framework Backend	Spring Boot
Segurança	Spring Security, OAuth2, JWT
Persistência	JPA / Hibernate
Banco de Dados	H2 (em memória) / Possível substituição
Testes	JUnit, Mockito
Build	Maven
📋 Pré-requisitos

Antes de rodar o projeto localmente, você precisa ter:

- Java 17+

- Maven

- IDE (opcional): IntelliJ, VS Code, Eclipse etc.

** Como executar o projeto
1. Clone este repositório
git clone https://github.com/brunorsnts/dscatalog.git

2. Vá para a pasta do backend
cd dscatalog/backend

3. Compile e execute
./mvnw spring-boot:run


ou, se preferir rodar dentro da sua IDE, carregue o projeto e execute a classe principal com o Spring Boot.

** Testando a API

Se quiser testar as requisições, use uma ferramenta como Postman ou Insomnia.

Endpoints de exemplo:

GET /products → Listar produtos paginados

POST /categories → Criar uma nova categoria


Para testar com credenciais diferentes e ver permissões diferentes, crie contas com papéis distintos ou configure seed de banco de dados.

** Ideias para próximas melhorias **

Você pode expandir o projeto com:

- Integração com banco de dados real (PostgreSQL ou MySQL)

- Documentação interativa com Swagger/OpenAPI

- Frontend separado em React ou Angular

- Deploy usando Docker + CI/CD

🤝 Contribuindo

Contribuições são bem-vindas! Para contribuir com melhorias:

1. Faça um fork deste repositório

2. Crie uma branch com sua feature: git checkout -b feature/nova-funcionalidade

3. Faça commits claros e descritivos

4. Envie um Pull Request
