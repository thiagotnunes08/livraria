# 🚀 Integração de IA Generativa com Java e Spring Boot  

Este projeto demonstra como integrar a API da OpenAI GPT-4 em uma aplicação Java utilizando Spring Boot. Você aprenderá a configurar a chave da OpenAI, rodar o projeto e explorar abstrações avançadas para consumir IA generativa de forma eficiente.  

Certifique-se de atender aos seguintes requisitos antes de iniciar: **Java 23 ou superior**, **Spring Boot 3 ou superior** e **API Key da OpenAI** (obtenha em [OpenAI API](https://platform.openai.com/signup)).  

Para começar, siga os passos abaixo:  

1. **Clone o Repositório**  
   Comece clonando o projeto para sua máquina local:  
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   cd seu-repositorio
   
2. **Configure a API KEY**
   Você precisará informar sua chave da OpenAI para consumir os modelos de IA. Abra o arquivo src/main/resources/application.properties e adicione:
   ```bash
   spring.ai.openai.api-key=OPENAI-API-KEY
   Alternativamente, configure a chave de API como uma variável de ambiente:
    ```bash
   export OPENAI_API_KEY=YOUR_API_KEY



