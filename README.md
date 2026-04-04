#  Proyecto DevOps - Ticketing API

##  Descripción

API REST desarrollada con Spring Boot para la gestión de tickets.
El proyecto implementa buenas prácticas de desarrollo backend y un flujo DevOps completo utilizando Docker y CI/CD.

---

##  Tecnologías

* Java 21
* Spring Boot
* Spring Data JPA
* MySQL
* Docker & Docker Compose
* GitHub Actions (CI)

---

##  Arquitectura

* Backend desacoplado en contenedores
* Base de datos independiente (MySQL)
* Comunicación interna mediante red Docker

---

##  Ejecución local

```bash
docker compose up --build
```

La API estará disponible en:

http://localhost:8080/tickets

---

##  CI/CD

El proyecto incluye un pipeline de integración continua que:

* Compila el proyecto con Maven
* Genera el artefacto (.jar)
* Construye la imagen Docker

El despliegue automático (CD) se encuentra simulado.
En un entorno productivo, se integraría con un servidor accesible por SSH o servicios cloud.

---

##  Endpoints

* GET /tickets → listar tickets
* POST /tickets → crear ticket

---

##  Mejoras futuras

* Implementación de autenticación con Spring Security
* Integración con Kafka para eventos
* Deploy en entorno cloud (AWS / Azure)
* Monitoreo con Prometheus y Grafana

---

## Autor

Proyecto desarrollado como práctica profesional orientada a DevOps y Backend.
