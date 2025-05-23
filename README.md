# 📝 Gestor de Tareas

Aplicación web desarrollada con Java y Spring Boot que permite gestionar tareas personales. Esta app es un ejemplo de CRUD básico, usando Thymeleaf para el frontend y una base de datos MySQL.

---

## 🚀 Funcionalidades

- Ver lista de tareas
- Crear nuevas tareas
- Marcar tareas como completadas
- Eliminar tareas
- Interfaz sencilla y responsive con Bootstrap 5

---

## ⚙️ Tecnologías utilizadas

- **Java 17**
- **Spring Boot 3**
- **Spring Data JPA**
- **Thymeleaf**
- **MySQL** 
- **Bootstrap 5**
- **Maven**

---

## 🧑‍💻 Cómo ejecutar el proyecto

### 1. Clona el repositorio

```bash
git clone https://github.com/tuusuario/gestor-tareas-spring.git
cd gestor-tareas-spring
```
### 2. Configura la base de datos
- Crea una base de datos en MySQL:
CREATE DATABASE tasksdb;

- Configura tus credenciales en src/main/resources/application.properties:
  spring.datasource.url=jdbc:mysql://localhost:3306/tasksdb?useSSL=false&serverTimezone=UTC
  spring.datasource.username=TU_USUARIO
  spring.datasource.password=TU_CONTRASEÑA

### 3. Ejecuta la aplicación
mvn spring-boot:run
Accede a la app en:
📍 http://localhost:8080/tasks


## 🖼️ Capturas de pantalla
![image](https://github.com/user-attachments/assets/8c3f8f4e-461f-479d-b484-e77ae6a76164)

## 📁 Estructura básica del proyecto
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example.taskmanager
│   │   │       ├── controller
│   │   │       ├── entity
│   │   │       └── repository
│   │   └── resources
│   │       ├── templates
│   │       │   └── index.html
│   │       └── application.properties

## 🙋‍♂️ Autor
Jonathan Hendrix
LinkedIn
📧 jonathan.hendrix@email.com
