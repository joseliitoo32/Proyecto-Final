# 🏋️ Proyecto: Gestión de Gimnasio

## 👥 Cómo nos organizamos (equipo de 3)

Para hacer el proyecto bien y no liarnos, hemos dividido el trabajo en 3 partes. Cada uno se encarga de una cosa, pero todos ayudamos un poco en todo.

---

## 🔵 Persona 1: Backend (clases y lógica)

Se encarga de crear las clases del programa y que todo funcione por dentro.

### Cosas que hace:

* Crear clases como:

  * Cliente
  * Rutina
  * Clase
  * Pago
  * Asistencia
* Hacer que funcionen las cosas:

  * Asignar rutinas
  * Controlar asistencia
* Programar métodos (toString, equals, etc.)
* Controlar errores (para que no se rompa el programa)

---

## 🟢 Persona 2: Base de datos (BBDD)

Se encarga de guardar los datos y conectarlos con el programa.

### Cosas que hace:

* Crear la base de datos (MySQL)
* Crear tablas:

  * clientes
  * pagos
  * clases
* Hacer el CRUD:

  * Crear
  * Leer
  * Actualizar
  * Borrar
* Conectar Java con la base de datos (JDBC)
* Crear clases DAO (ClienteDAO, etc.)

---

## 🟣 Persona 3: Interfaz (pantallas)

Se encarga de que el programa tenga ventanas y sea fácil de usar.

### Cosas que hace:

* Crear pantallas:

  * Login
  * Menú principal
  * Clientes
  * Pagos
  * etc.
* Botones y acciones
* Validar datos (por ejemplo, que no estén vacíos)
* Hacer que se vea bonito y ordenado

---

## 🔗 Cómo funciona todo junto

Ejemplo:

1. El usuario añade un cliente en la interfaz
2. Se crea el cliente en el backend
3. Se guarda en la base de datos
4. Se muestra en pantalla

---

## 🗂️ Organización del proyecto

```bash
/src
  /model        # clases
  /dao          # base de datos
  /view         # interfaz
  /controller   # conecta todo
```

---

## 🔀 Cómo usamos GitHub

Para no tener problemas:

* Cada uno trabaja en su parte
* Hacemos commits a menudo
* Mensajes claros:

  * "Añadido Cliente"
  * "CRUD pagos hecho"
* Usamos ramas:

  * backend
  * database
  * frontend

---

## ⚠️ Cosas importantes

* No dejar todo para el final
* No hacer todo una sola persona
* Ayudarnos entre todos

---

## ✅ Cómo vamos a trabajar

* Hablar entre nosotros cada semana
* Decir qué hemos hecho
* Ayudarnos si alguien tiene problemas

---

## 🎯 Objetivo

Hacer una aplicación que funcione bien, esté ordenada y que podamos explicar en clase sin problemas.
