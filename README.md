**Conversor de Monedas para Consola 🪙**

![Java](https://img.shields.io/badge/Java-17-blue?style=for-the-badge&logo=java) ![Maven](https://img.shields.io/badge/Maven-4.0.0-red?style=for-the-badge&logo=apache-maven) ![Licencia](https://img.shields.io/badge/Licencia-MIT-green?style=for-the-badge)

Aplicación de consola desarrollada en Java que permite convertir valores entre diferentes divisas en tiempo real, utilizando la API de **ExchangeRate-API** para obtener las tasas de cambio más recientes.

---

## 🖥️ Demostración

Así es como se ve la aplicación en funcionamiento:

```bash
*****************************************************
Sea bienvenido/a al Conversor de Moneda =]
1) Dólar =>> Peso argentino
2) Peso argentino =>> Dólar
3) Dólar =>> Real brasileño
4) Real brasileño =>> Dólar
5) Dólar =>> Peso colombiano
6) Peso colombiano =>> Dólar
7) Salir
Elija una opción válida:

*****************************************************
1
Ingrese el valor que deseas convertir: 100
El valor de 100.00 Dólar corresponde al valor final de 88210.00 Peso argentino
```

---

## ✨ Características Principales

*   **Conversión en Tiempo Real:** Se conecta a la API de `ExchangeRate-API` para obtener tasas de cambio actualizadas al momento de la consulta.
*   **Menú Interactivo:** Ofrece un menú de opciones claro y fácil de usar para que el usuario elija la conversión deseada.
*   **Soporte para Múltiples Divisas:** Incluye conversiones predefinidas entre:
    *   Dólar Estadounidense (USD)
    *   Peso Argentino (ARS)
    *   Real Brasileño (BRL)
    *   Peso Colombiano (COP)
*   **Diseño Orientado a Objetos:** El código está estructurado siguiendo los principios de la POO, separando las responsabilidades en distintas clases.
*   **Manejo de Errores:** Incluye gestión de excepciones para manejar fallos en la conexión o entradas de usuario no válidas.

---

## 🛠️ Tecnologías Utilizadas

*   **Lenguaje:** `Java 17+`
*   **Gestor de Dependencias:** `Apache Maven`
*   **Librerías:**
    *   **Gson (2.10.1):** Para el parsing eficiente de las respuestas JSON de la API.
    *   **Java HTTP Client:** Para realizar las peticiones HTTP a la API de forma nativa.
*   **API Externa:** `ExchangeRate-API (v6)`

---

## 🚀 Instalación y Ejecución

Sigue estos pasos para ejecutar el proyecto en tu entorno local.

### **Prerrequisitos**

*   Tener instalado el **JDK de Java** (versión 17 o superior).
*   Tener instalado **Apache Maven**.
*   Un IDE que soporte proyectos Maven (como IntelliJ IDEA, Eclipse o VS Code).

### **Pasos**

1.  **Clonar el repositorio:**
    ```bash
    git clone https://github.com/RQL-TEC/challenge-convertidor-de-monedas.git
    cd challenge-convertidor-de-monedas
    ```

2.  **Obtener una API Key:**
    *   Ve al sitio de [ExchangeRate-API](https://www.exchangerate-api.com/).
    *   Regístrate para obtener una clave de API **gratuita**.

3.  **Configurar la API Key:**
    *   Abre el proyecto en tu IDE y navega al archivo `src/main/java/ConsultaApi.java`.
    *   Reemplaza la clave de API existente con la tuya.
        ```java
        // Dentro de la clase ConsultaApi.java
        String apiKey = "TU_NUEVA_API_KEY"; // <-- ¡Pega tu clave aquí!
        ```

4.  **Ejecutar la aplicación:**
    *   **Desde un IDE:** Busca el archivo `Principal.java`, haz clic derecho y selecciona "Run".
    *   **Desde la terminal:** Navega a la raíz del proyecto y ejecuta:
        ```bash
        mvn compile exec:java -Dexec.mainClass="Principal"
        ```

---

## 👨‍💻 Autor

**Luis Enrique Ramos Quispe**

*   [![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/RQL-TEC)

---

## 📄 Licencia

Este proyecto está distribuido bajo la Licencia MIT.
