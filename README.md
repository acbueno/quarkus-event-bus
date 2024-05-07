# Quarkus Event Bus

Este é um projeto de exemplo para demonstrar como usar o EventBus do Quarkus para comunicação assíncrona entre partes de um aplicativo.

## Pré-requisitos

- Java 11 ou superior instalado
- Maven
- Docker e Docker Compose (opcional, apenas se você quiser usar recursos como banco de dados em contêineres)

## Como usar

1. Clone este repositório: `git clone https://github.com/acbueno/quarkus-event-bus.git`
2. Navegue até o diretório do projeto: `cd quarkus-event-bus`
3. Execute o aplicativo Quarkus: `./mvnw compile quarkus:dev`
4. Acesse `http://localhost:8080` para interagir com o aplicativo.

## Recursos incluídos

- Exemplo de uso do EventBus do Quarkus para enviar e receber eventos assíncronos
- Configuração de endpoints RESTful para enviar e receber eventos
- Uso de Quarkus Extensions (RESTEasy, EventBus, SmallRye Reactive Messaging)
- Utilização de recursos do Quarkus como Injeção de Dependência e Profiles

## Configuração

O projeto inclui uma configuração básica para usar o EventBus do Quarkus. Você pode expandir essa configuração conforme necessário para atender às necessidades do seu aplicativo.

## Contribuição

Sinta-se à vontade para contribuir com novas funcionalidades, correções de bugs ou melhorias de código. Basta enviar um pull request!

## Licença

Este projeto está licenciado sob a licença MIT. Veja o arquivo `LICENSE` para mais detalhes.
