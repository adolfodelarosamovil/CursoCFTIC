# CursoCFTIC
Temas vistos en el curso DESARROLLO PARA DISPOSITIVOS MÓVILES CON SISTEMA OPERATIVO DE CODIGO ABIERTO

## Jueves 19/09/2019

Inicio del curso 
Duración:150Hrs.

Coordinadora general: Leticia
CAS: Mari Jose

Profesor: Valeriano
github personal https://github.com/Valexx55
stackoverflow https://stackoverflow.com/users/4067559/val-martinez

Herramientas Necesarias:
* Android Studio
* JDK 8

Extensiones de las aplicaciones:
* Google `.apk`
* iOS `.ipa`

Recabar información importante:
* StackOverflow
* Git
* GitHub

Ajustes en el dispositivo para poder ejecutar aplicaciones:
* Depuración USB activada
* Usar como desarrollador
* Número de compilación pulsar 7 veces

[Test de Evaluación](https://github.com/adolfodelarosamovil/CursoCFTIC/blob/master/Documentacion/TEST_TICAPP.doc)

## Viernes 20/09/2019

**Android Device Brige** permite conectar el dispositivo a Android Studio

**Terminal** en el IDE de Android Studio podemos abrir un Terminal.
Algunos comandos usados son los siguientes:

`pwd` Directorio actual
`ls`  Directorios y archivos
`ls -las` Directorios y archivos en lista incluyendo ocultos

### Git
Git se almacena en tres espacios diferentes:

* Workspace
* Local
* Remote

### Atajos de Teclado

**Preference**

   **Key Map** Para personalizar teclado, puedo poner los comandos de otros editores como *Visual Studio* o *Eclipse*.
   
   <img src="/imgDocumentacion/create_newproject.png">
   
### Documetación Oficial

[Documentación oficial](https://developer.android.com/)

### APP MiPrimerApp

Aplicación creada para ver la estructura general de cualquier aplicación Android.

En Android Studio creamos un nuevo proyecto.

<img src="/imgDocumentacion/create_newproject.png">

Al ingresar todos los datos solicitados vemos la estructura de un proyecto en Android Studio.

<img src="/imgDocumentacion/structure_project.png">

Al ejecutar el proyecto en el simulador tenemos lo siguiente:

<img src="/imgDocumentacion/myapplication1_ejecucion.png">

### Gradle

**Gradle** es el Gestor de Dependencias usado por Android Studio.

El archivo **build.gradle** contiene información importante de la construcción de nuestro proyecto como `compileSdkVersion` y todas las dependencias necesarias.

<img src="/imgDocumentacion/build_gradle.png">

### Extensiones de Archivos

* `.java` Clase java
* `.class` Clase compilada
* `.jar` Librería de clases
* `.apk` Ejecutable de Android

### Arquitectura de una aplicación Android

<img src="/imgDocumentacion/pila-software-android.png">

### Componentes de una aplicación Android

Existen 4 componentes en Android

<img src="/imgDocumentacion/componentes.png">

* **Activity**: Representan las pantallas d enuestra aplicación
* **Servicios**: Hacen taresas no visuales
* **Receiver**: Gestionan los eventos
* **Provider**:

#### Activity

Cuando creemos una acividad conviene crearla por medio del asistente ya que se realizan tres tareas:

* Se registra en el **AndroidManifest.xml**
* Se crea un archivo **activity.java**
* Se crea un archivo **activity.xml** dentro de la carpeta **/res/layout** que va a representar la parte visual dentro de nuestra aplicación, es decir la pantalla. Esto se conoce como dibujar la **Activity** de forma *"estática"*, también existe una forma *"dinámica"* que se hace mediante sentencias dentro del archivo **.java**

### Clase Log

La clase Log nos permite mandar mensajes a la consola que nos ayudarán a debugear nuestra APP. Algunos son los siguientes:

```
 Log.println(Log.ERROR,"Mensaje","Contenido del mensaje");
 Log.v("MIAPP", "Contenido del mensaje VERBOSE " + Log.VERBOSE);
 Log.d("MIAPP", "Contenido del mensaje DEBUG " + Log.DEBUG);
 Log.i("MIAPP", "Contenido del mensaje INFO " + Log.INFO);
 Log.w("MIAPP", "Contenido del mensaje WARN " + Log.WARN);
 Log.e("MIAPP", "Contenido del mensaje de ERROR " + Log.ERROR);
 Log.wtf("MIAPP", "Contenido del mensaje de ASSERT " + Log.ASSERT);
```

Los cuales podremos ver en **Logcat** de nuestro Android Studio

<img src="/imgDocumentacion/log.png">

Podemos filtrar los mensajes usando el **Tag** que colocamos en la instrucción `Log`, en este caso `"MIAPP"`.

### Clase R

La **clase R** da acceso a todo lo que se encuentra en la carpeta **res**. Por ejemplo

## Lunes 23/09/2019

### APP VERSIONES

### Eventos

* **Listener**: Objeto pendiente del evento
* **CallBack**: Función que se ejecuta cuando se produce un evento. La manera de llamar a un CallBack puede ser *Declaarativa* dentro de un XML o *Programatica* dentro del archivo .java

## Martes 24/09/2019

### Icono de la App

[Icono de la App](https://developer.android.com/studio/write/image-asset-studio?hl=es-419)

Para crear el icono de la aplicación seleccionamos **File / New / Image Asset** como en la siguiente imagen

<img src="/imgDocumentacion/image_asset.png">

Podemos seleccionar el que nos sale por defecto o podemos seleccionar alguna imagen almacenada en nuestro ordenador.

<img src="/imgDocumentacion/image_asset_configure.png">	

O podríamos pulsar en **Clip Art** para seleccionar alguno de los iconos que nos vienen cargados.

<img src="/imgDocumentacion/image_asset_configure_2.png">

Podemos pulsar en la imagen de icono para que nos salgan todos los demas.

<img src="/imgDocumentacion/select_icon.png">

También podemos cambiar el color del icono

<img src="/imgDocumentacion/image_asset_configure_3.png">

Al aceptar la configuración en nuestro proyecto se almacenarán los diferentes tamaños de nuestro icono dentro de la carpeta **res/mipmap**

<img src="/imgDocumentacion/mipmap.png">

Finalmente en nuestro movil ya tendremos nuestra aplicación representada con el icono que configuramos.

<img src="/imgDocumentacion/app_icon.png"> 


