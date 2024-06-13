Manual de Instalación y Ejecución del Backend
Este manual proporciona una guía paso a paso para configurar y ejecutar el backend de tu proyecto. Incluirá la instalación del IDE, la configuración del proyecto en Spring Boot, y la importación de la base de datos en MySQL.

1. Instalación del IDE
Puedes usar cualquier IDE, pero aquí se explicará el proceso con IntelliJ IDEA y Eclipse.

IntelliJ IDEA
Descarga IntelliJ IDEA desde aquí.
Instala IntelliJ IDEA siguiendo las instrucciones del instalador.
Abre IntelliJ IDEA y selecciona "Open" para abrir el proyecto desde tu directorio local.

2. Clonar el Proyecto desde GitHub
Abre tu terminal o línea de comandos.
Clona el repositorio usando el siguiente comando:https://github.com/tu-usuario/tu-repositorio.git

Abre el proyecto clonado en tu IDE.
3. Configuración de la Base de Datos MySQL
Instalación de MySQL
Descarga MySQL desde aquí.
Instala MySQL siguiendo las instrucciones del instalador y configura un usuario root con su contraseña.
Crear la Base de Datos
Abre MySQL Workbench y conéctate a tu servidor MySQL.
Crea una nueva base de datos ejecutando el siguiente comando: CREATE DATABASE databasecaps;

Importar las Tablas y Datos
Abre MySQL Workbench.
Selecciona "Server" > "Data Import".
Selecciona "Import from Self-Contained File" y busca el archivo .sql que contiene la estructura y datos de la base de datos.
En "Default Target Schema", selecciona databasecaps.
Haz clic en "Start Import".
