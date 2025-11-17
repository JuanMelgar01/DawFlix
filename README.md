#  DAWFLIX - Plataforma de Streaming en Consola

## Introducción

DAWFLIX es una aplicación de consola desarrollada en Java que simula una plataforma de contenido multimedia con una estética retro inspirada en los antiguos programas de texto. El proyecto se ejecuta en PowerShell para permitir el uso de fuentes compatibles con emoticonos y caracteres especiales, ofreciendo así una interfaz más visual gracias al uso de gráficos ASCII.

La interacción del usuario está diseñada para emular las interfaces clásicas: los menús contienen palabras clave con una letra subrayada y en color verde que actúan como "botones". Pulsando la tecla **Shift** junto con esa letra, el usuario puede activar la opción correspondiente.

## Funcionamiento

### - Menú Principal

Al iniciar el programa, se presenta un menú con las siguientes opciones:

- Iniciar sesión con un usuario ya registrado.
- Registrar un nuevo usuario.
- Salir del programa.

En caso de registro, se solicitan los datos necesarios y al iniciar sesión se verifica si el usuario ya existe.

### - Menú de Usuario

Una vez iniciado sesión, el usuario accede a un menú con las siguientes funciones:

- Acceder a diferentes tipos de contenido multimedia.
- Consultar la ficha personal del usuario.
- Ver una lista de **sugerencias personalizadas** según la puntuación de los contenidos.

### - Navegación de Contenido

Dentro de las secciones de contenido, se ofrecen varias opciones:

- Ordenar los contenidos por diferentes criterios (título, duración, puntuación, etc.).
- Buscar por título o descripción.
- Seleccionar un contenido para ver su ficha detallada.

### - Ficha de Contenido

En la ficha de cada contenido se muestra información extendida y se permite:

- Añadir a la lista de favoritos.
- Puntuar el contenido.
- Reproducirlo.

Antes de la reproducción, el sistema comprueba si el contenido está marcado como **+18** y si el usuario tiene activado el **control parental**. Si la reproducción es válida, el contenido se reproduce y se añade automáticamente a la sección "Seguir viendo".

Ambas listas, tanto **Favoritos** como **Seguir viendo**, permiten gestionar el contenido y eliminarlo cuando el usuario lo desee.

### - Menú Personal

Desde aquí el usuario puede:

- Consultar sus datos personales.
- Ver sus contenidos favoritos.
- Revisar lo que está siguiendo actualmente.
- Cerrar sesión.

Al cerrar sesión, se retorna al menú principal, desde el cual es posible salir del programa completamente.

---

## Compilación y Ejecución

Desde la consola de git de visual studio, hay que situarse en la carpeta raiz del proyecto.

- Introduce el comando javac -encoding UTF-8 -d bin $(find src -name "*.java")
Para compilar el proyecto.

Abre **Terminal** o **PowerShell** y ve al directorio raíz del proyecto, accede a la carpeta /bin.

- Introduce el comando [Console]::OutputEncoding = [System.Text.Encoding]::UTF8 (para poder ver los iconos)
- Ejecuta con la instrucción java Main.App
