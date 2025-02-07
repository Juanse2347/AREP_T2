# Microframework Web para Servicios REST y Gestión de Archivos Estáticos

En este tallertiene como objetivo mejorar un servidor web existente que actualmente admite archivos estáticos como HTML, JavaScript, CSS e imágenes. La mejora transformará el servidor en un microframework web completamente funcional, permitiendo el desarrollo de aplicaciones web con servicios REST de backend.


## 📌 Características
- Implementación del método get() que permite definir servicios REST utilizando funciones lambda.

```bash
get("/hello", (req, res) -> "hello world!");
```

- Desarrollo de un mecanismo para extraer valores de consulta de las solicitudes entrantes.
  
```bash
get("/hello", (req, res) -> "hello " + req.getValues("name"));
```
 
- Implementación del método staticfiles() para definir la carpeta donde se encuentran los archivos estáticos.
  
```bash
staticfiles("webroot/public");
```

## 🛠️ Requisitos
- Java 11 o superior
- Git
- Maven

## 🚀 Instalación y Ejecución
### 1️⃣ Clonar el repositorio
```bash
git clone https://github.com/Juanse2347/AREP_T2
cd AREP_T2
```

### 2️⃣ Compilar el proyecto con Maven
```bash
mvn clean install
```

![Image](https://github.com/user-attachments/assets/8889b4a2-c7a5-41ee-822c-e244bc836c8c)


### 3️⃣ Ejecutar el servidor

```bash
mvn exec:java -Dexec.mainClass="co.edu.eci.arep.RunApp"
```

![Image](https://github.com/user-attachments/assets/69edaaf2-b097-46dc-af5d-a1c79357ea26)


### 4️⃣ Probar con un navegador o `curl`
```bash
curl http://localhost:30000/
```



## 🔍 Pruebas

Puedes ejecutar pruebas con JUnit:
```bash
mvn test
```

![Image](https://github.com/user-attachments/assets/49fe2d36-13c1-43f9-926b-5ec8b60bfeed)


## 🔍 Pruebas de extremo a extremo ##

Pruebas del navegador 

Probamos que nuestro servicio este funcionando correctamente

```bash
http://localhost:30000/
```

## 🔍 Pruebas de Estilo de Codificacion ##

Con el siguiente comando realizamos las pruebas de estilo de codificación son aquellas que verifican que el código sigue las convenciones y buenas prácticas del equipo o la comunidad

```bash
mvn checkstyle:check
```

![Image](https://github.com/user-attachments/assets/6c5a4c16-9c71-463d-9629-59f5c976213a)

## 🔍 Probando el REST ##

Vamos a comprobar los endpoints de nuestra API

```bash
curl -X GET "http://localhost:30000/app/hello?name=Pedro"
```

Esperamos lo siguiente:

![Image](https://github.com/user-attachments/assets/96425314-2516-4504-990e-2b6f79aaee43)


Prueba el endpoint que devuelve PI

```bash
curl -X GET "http://localhost:30000/App/pi"
```

Esperamos lo siguiente:

![Image](https://github.com/user-attachments/assets/8ab36e03-77ca-4ce0-8ca5-f239d78d37fb)


## 🔍 Pruebas automatizadas ##

Este proyecto incluye pruebas automatizadas para garantizar su correcto funcionamiento. Ejecuta los tests con:

```bash
cd src
javac -cp .:/path/to/junit-4.12.jar co/edu/eci/arep/HttpServerTest.java
```

## :office: Desplieqgue ##

Vamos a ejecutar el servidor como un proceso en segundo plano o configurar un servicio systemd, de la siguiente manera:

```bash
mvn exec:java -Dexec.mainClass="co.edu.eci.arep.HttpServer"
```

## :cd: Construido con ## 

 - Java - Lenguaje principal utilizado
 - Maven - Para la gestión de dependencias y automatización
 - JUnit - Para pruebas automatizadas

## :busts_in_silhouette: Contribuciones ##

Lea [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) para obtener detalles sobre nuestro código de conducta y el proceso para enviarnos solicitudes de extracción.

## :school_satchel: Control de Versiones ##

Usamos [SemVer](http://semver.org/) para controlar las versiones.

## :bust_in_silhouette: Autor ##

* **Juan Sebastian Sanchez** - *Trabajo Inicial* - [Juanse2347](https://github.com/Juanse2347)


## 📄 Licencia
Este proyecto está bajo la licencia [LICENSE](LICENSE). ¡Siéntete libre de contribuir! 😊


## :wave: Expresiones de Gratitud ##

- Inspiracion
- Compromiso

