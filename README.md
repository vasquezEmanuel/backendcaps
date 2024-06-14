# Manual de Instalación y Ejecución del Backend

Este manual proporciona una guía paso a paso para configurar y ejecutar el backend de tu proyecto. Incluirá la instalación del IDE, la configuración del proyecto en Spring Boot, y la importación de la base de datos en MySQL.

## 1. Instalación del IDE

Puedes usar cualquier IDE, pero aquí se explicará el proceso con IntelliJ IDEA.

### IntelliJ IDEA
1. Descarga IntelliJ IDEA desde [aquí](https://www.jetbrains.com/idea/download/).
2. Instala IntelliJ IDEA siguiendo las instrucciones del instalador.
3. Abre IntelliJ IDEA y selecciona "Open" para abrir el proyecto desde tu directorio local.

## 2. Clonar el Proyecto desde GitHub

1. Abre tu terminal o línea de comandos.
2. Clona el repositorio usando el siguiente comando:
   ```bash
   git clone https://github.com/vasquezEmanuel/backendcaps.git
3. Abre el proyecto clonado en tu IDE.

## 3. Configuración de la Base de Datos MySQL

### Instalación de MySQL
1. Descarga MySQL desde [aquí](https://dev.mysql.com/downloads/installer/).
2. Instala MySQL siguiendo las instrucciones del instalador y configura un usuario root con su contraseña.

### Crear la Base de Datos

1. Descarga la base de datos desde este [aquí](https://drive.google.com/file/d/1iWOTKqBylnXpWC2k8ihHMpSyXAhsT7Yu/view?usp=sharing).

### Importar las Tablas y Datos 

1. Abre MySQL Workbench.
2. Selecciona "Server" > "Data Import".
3. Selecciona "Import from Self-Contained File" y busca el archivo anteriormete descargado .sql que contiene la estructura y datos de la base de datos.
4. En "Default Target Schema", selecciona databasecaps.
5. Haz clic en "Start Import".

## 4. Configuración y Ejecución del Proyecto en Spring Boot

1. Abre el proyecto en IntelliJ IDEA.
2. Configura el archivo application.properties o application.yml con la información de tu base de datos MySQL:
   ```bash
   spring.datasource.url=jdbc:mysql://localhost:3306/databasecaps
   spring.datasource.username=root
   spring.datasource.password=tu-contraseña
   spring.jpa.hibernate.ddl-auto=update
3. Ejecuta la aplicación haciendo clic en el botón "Run" de IntelliJ IDEA
