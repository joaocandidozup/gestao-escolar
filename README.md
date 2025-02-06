# gestao-escolar
Esta API permite até o momento um metodo GET para buscar todos os alunos do sistema.

---

## **1. Executando o Sistema**

### **Pré-requisitos**
Certifique-se de que você possui as seguintes ferramentas instaladas:
- **Java JDK 17+**
- **Banco de Dados** Postgres

### **Passos para Executar**

1. **Clone o Repositório**:
   ```bash
   git clone git@github.com:joaocandidozup/gestao-escolar.git

2. **Configure o Banco de Dados**:
    - Verifique o arquivo `application.properties` ou `application.yml` para configurar as variáveis de ambiente POSTGRES_USER e POSTGRES_PASSWORD

3. **Compile e Execute o Projeto**:
    - Compile o projeto:
      ```bash
      mvn clean install
      ```
    - Execute o projeto:
      ```bash
      mvn spring-boot:run
      ```
    - O sistema estará disponível em: `http://localhost:8080`.



## **2. Testando os Endpoints**

Certifique-se de que a aplicação está rodando. Abra o navegador e acesse: http://localhost:8080/swagger-ui.html.
Na interface do Swagger, você pode:

- Visualizar todas as rotas disponíveis.
- Testar as APIs diretamente na interface.

---
