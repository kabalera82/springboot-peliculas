# Spring Boot Películas

Proyecto de backend en Java con Spring Boot que expone un endpoint REST para consultar un listado de películas desde un archivo JSON.

## Características

- Backend en Spring Boot
- Endpoint `/movies` que devuelve el listado de películas en formato JSON
- Lectura de datos desde `src/main/resources/movies.json`
- Permite peticiones desde cualquier origen (CORS)
- Frontend HTML que consume el endpoint y muestra las películas con sus imágenes

## Cómo ejecutar

1. Compila el proyecto:

2. Arranca el servidor:

3. Accede al endpoint en tu navegador:

4. Abre el archivo `index.html` para ver el frontend.

## Requisitos

- Java 17+
- Maven
- Git

## Estructura

- `src/main/java/kabadev/demo/` - Código fuente Java
- `src/main/resources/movies.json` - Archivo de datos de películas
- `index.html` - Frontend básico

## Kabalera