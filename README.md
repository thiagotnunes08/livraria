# 🚀 Integração de IA Generativa com Java e Spring Boot  

Este projeto demonstra como integrar a API da OpenAI GPT-4 em uma aplicação Java utilizando Spring Boot. Você aprenderá a configurar a chave da OpenAI, rodar o projeto e explorar abstrações avançadas para consumir IA generativa de forma eficiente.  

Para começar, siga os passos abaixo.  

## 📋 Requisitos  
Certifique-se de atender aos seguintes requisitos antes de iniciar:  
- **Java 23** ou superior.  
- **Spring Boot 3** ou superior.  
- **API Key da OpenAI** (obtenha em [OpenAI API](https://platform.openai.com/signup)).  

---

## 🛠️ Passo a Passo  

### 1. Clone o Repositório  
Comece clonando o projeto para sua máquina local:  
```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
cd seu-repositorio
---
## 2. Configure a API Key

Você precisará informar sua chave da OpenAI para consumir os modelos de IA.

Configuração no application.properties
Abra o arquivo src/main/resources/application.properties e adicione:

- ** spring.ai.openai.api-key=OPENAI-API-KEY

## 3. Instale as Dependências

- ** ./mvnw clean install

## 4. Execute o Projeto

- ** ./mvnw spring-boot:run

## 5. Acesse a Aplicação

Com o servidor em execução, você pode acessar a aplicação em:

- ** http://localhost:8080.

## Detalhes do Projeto
Este projeto aproveita as abstrações do Spring Boot para consumir a API da OpenAI de forma prática e poderosa.

Funcionalidades Principais
Envio de Strings Puras:

Envie prompts diretamente como texto simples.
Exemplo: "Explique como funciona o GPT-4."
Uso de Entidades Personalizadas:

Estruture suas respostas em formato JSON criando classes Java específicas.
Exemplo: MyResponseClass para mapear as informações retornadas pela IA.
Listas e Objetos Complexos:

Integração com coleções, listas e tipos de dados personalizados.
O Spring se encarrega de passar o tipo correto no contexto do modelo de linguagem.
🎥 Demonstração em Vídeo
Confira o tutorial completo no YouTube para ver o funcionamento na prática:
🔗 Assista Aqui






