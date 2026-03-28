# consulta-carros-api

## Descrição
Projeto para estudos sobre Redis e Spring-Boot.

## Tecnologias
- Spring-boot 4
- Java 25
- Redis
- PostgreSql
- Docker

## Como rodar
- Baixar no projeto localmente
- Certifique-se de que o Docker esteja instalado e configurada na máquina
- Rodar o comando: docker compose up -d
- Rodar o comando: ./mvnw spring-boot:run (A varíavel JAVA_HOME deve estar devidamente configurada)

## Exemplos de testes
curl -s "http://localhost:8080/fipe/1/2023" -w "\nTempo: %{time_total}s\n"
Resposta:
{"marca":"Toyota","modelo":"Corolla","anoModelo":2023,"preco":118095.00,"mesReferencia":"2026-03"}
Tempo: 0.351231s

curl -s "http://localhost:8080/fipe/1/2023" -w "\nTempo: %{time_total}s\n"
Resposta
{"marca":"Toyota","modelo":"Corolla","anoModelo":2023,"preco":118095.00,"mesReferencia":"2026-03"}
Tempo: 0.008070s

curl -X "DELETE" -s "http://localhost:8080/fipe/1/2023/cache"

Artigo de onde peguei os exemplos para estudo: https://devsuperior.com.br/blog/use-redis-para-reduzir-a-latencia-de-apis-rest

