# Conversor de Monedas - Java API Challenge

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![GSON](https://img.shields.io/badge/Gson-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Completado-green?style=for-the-badge)

## 📋 Descripción del Proyecto
Este proyecto es un conversor de divisas interactivo desarrollado en **Java**. El programa permite realizar conversiones de moneda en tiempo real conectándose a la [ExchangeRate-API](https://www.exchangerate-api.com/).

El objetivo principal es aplicar conceptos de Programación Orientada a Objetos (POO), manejo de solicitudes HTTP y procesamiento de datos en formato JSON mediante la librería GSON.

---

## Características
- **Conexión en tiempo real:** Obtiene las tasas de cambio más actuales desde una API externa.
- **Menú Interactivo:** Interfaz de consola fácil de usar con 10 opciones de conversión predefinidas.
- **Manejo de Excepciones:** El programa está preparado para manejar errores de conexión o entradas inválidas.
- **Estructura Limpia:** Uso de `Records` en Java para un modelado de datos más eficiente.

---

## Tecnologías Utilizadas
- **Lenguaje:** Java 21+
- **Librería de JSON:** [Gson 2.10.1](https://github.com/google/gson)
- **API Externa:** ExchangeRate-API
- **Herramientas:** HttpClient, HttpRequest, HttpResponse

---

## Funcionamiento

El programa sigue el siguiente flujo de trabajo:



1. El usuario selecciona una opción de conversión desde el menú.
2. El programa solicita la cantidad de dinero a convertir.
3. Se genera una solicitud dinámica a la API con la estructura: `.../pair/{BASE}/{TARGET}/{CANTIDAD}`.
4. La API responde con un JSON que el programa parsea para mostrar el resultado final.

### Ejemplo de Ejecución:
<img width="401" height="438" alt="Shot-2026-01-02-205512" src="https://github.com/user-attachments/assets/e4473aa5-2f39-424b-b41c-f6c8b2b66b2b" />
<br>
<img width="372" height="214" alt="Shot-2026-01-02-210553" src="https://github.com/user-attachments/assets/08c6854a-d0b3-4b36-936a-7116965bc2a7" />

