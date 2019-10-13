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

[Test de Evaluación](https://github.com/adolfodelarosamovil/CursoCFTIC/blob/master/Documentacion/TEST_TICAPP.pdf)

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

[Guía rápida completa GIT](https://github.com/adolfodelarosamovil/CursoCFTIC/blob/master/Documentacion/Guia_rapida_completa_GIT.pdf)

### Atajos de Teclado

**Preference**

   **Key Map** Para personalizar teclado, puedo poner los comandos de otros editores como *Visual Studio* o *Eclipse*.
   
   <img src="/imgDocumentacion/keymap.png">
   
### Documetación Oficial

[Documentación oficial](https://developer.android.com/)

### :iphone: APP MyApplication1 :iphone:

Clasica *App Hello World!* creada para ver la estructura general de cualquier aplicación Android.

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
* `.apk` Ejecutable de Android: Se genera usando **Build / Build Bundles(s)/APK(s) /Build APK(s)** y se genera en **app/build/outputs/apk/debug/app-debug.apk**

### Arquitectura de una aplicación Android

<img src="/imgDocumentacion/pila-software-android.png">

### Componentes de una aplicación Android

Existen 4 componentes en Android

<img src="/imgDocumentacion/componentes.png">

* **Activity**: Representan las pantallas de nuestra aplicación
* **Servicios**: Hacen tareas no visuales
* **Receiver**: Gestionan los eventos
* **Provider**: Otras Apps

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

La **clase R** da acceso a todo lo que se encuentra en la carpeta **res**:
* drawable
* layout
   * activity_main.xml
* mipmap
   * ic_launcher.png
* values
   * colors.xml
   * string.xml
   * styles.xml

## Lunes 23/09/2019

### :iphone: APP VERSIONES :iphone:

App que nos permite saber que versión se tiene en el dispositivo donde se esta ejecutando la App.

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

### :iphone: App Letras :iphone:

App que nos permitira saber si una palabra o expresión es un **palíndromo** es decir que se lee igual de izquierda a derecha que de derecha a izquierda.

### Ejercicio

Algún programador Clase C nos ha dejado en herencia una función sin documentar y programada de forma críptica. Se pide:

1) AVERIGUAR QUÉ HACE EL MÉTODO
2) DARLE UN NOMBRE APROPIADO
3) IMPLMENTAR UN MODO ALTERNATIVO DE REALIZAR LA MISMA FUNCIONALIDAD
4) HACER UNA VERSIÓN RECURSIVA QUE RESUELVA EL MISMO PROBLEMA

```
private static boolean adivinaQueHace (String cad)
	{
		boolean bd = true;
		
		int i = 0;
		int j = cad.length()-1;
		
		while ((i<=j)&&(bd))
		{
			bd = cad.charAt(i)==cad.charAt(j);
			i++;
			j--;
		}
		
		
		return bd;
	}
```

## Miercoles 25/09/2019

### Manejo de la orientación de la pantalla.

En un dispositivo movil o table tendremos dos orientaciones de la pantalla:
* Portrait (Vertical)
* Landscape (Horizontal)

Podemos seguir dos estrategias para el manejo de las pantallas:
* Insensible: es decir forzamos a que solo maneje una sola orientación de pantalla, esto se define en el *manifest*
* Sensible: Creo un layout exclusivo para la orientación Landscape.

#### Estrategia Insensible**

```xml
<activity android:name=".MainActivity"
  android:screenOrientation="landscape"
  android:configChanges="screenSize|keyboardHidden|orientation">
    <intent-filter>
      <action android:name="android.intent.action.MAIN" />
      <category android:name="android.intent.category.LAUNCHER" />
    </intent-filter>
</activity>
```

De esta manera nuestra actividad siempre se presentará en orientación Landscape no importando como coloquemos el dispositivo.

<img src="/imgDocumentacion/landscape1.png">

<img src="/imgDocumentacion/landscape2.png">

#### Estrategia Sensible

Aquí vamos a crear un layout exclusivo para la orientación Landscape como se muestra en la imagen.

<img src="/imgDocumentacion/create_landscape_variation.png">

Una vez que hemos aceptado en nuestra carpeta layout tendremos dos archivos xml con el mismo nombre, uno para la orientación Portrait y otro para Landscape, los cuales pueden ser diferentes en su diseño personalizando cada uno a nuestro gusto.

<img src="/imgDocumentacion/create_landscape_result.png">

### Ciclo de Vida de una Activity

[Ciclo de Vida de una Activity](https://developer.android.com/guide/components/activities/activity-lifecycle?hl=es)

<img src="/imgDocumentacion/activity_lifecycle.png">

Entender el ciclo de vida de una Activity es de vital importancia ya que nos ayudara a entender que pasa en cada momento con una Activity. Por ejemplo si tenemos cargada una App en una posición vertical y giramos el dispositivo a una orientación horizontal, la Activity se destruye y se vuelve a crear nuevamente. En el caso de que tengamos valores asignados estos podrán perderse ya que como se menciono anteriormente la Activity se vuelve a crear, por lo que tenemos que encontrar un mencanismo para almacenar esa información antes de que la activity se destruya para una vez que se vuelva a crear recuperar esos valores y asignarlos a sus respectivos views.


#### onSaveIntanceState

El método `onSaveInstanceState` es llamado antes de destruir una Activity por lo que es un lugar idoneo para almacenar datos.

```
@Override
public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
  super.onSaveInstanceState(outState, outPersistentState);
}
```

#### Bundle

Un *Bundle* es una especie de *Map* donde podemos almacenar datos con formato **key/value**.

<img src="/imgDocumentacion/bundle.png">

#### Ejemplo de Uso de onSaveIntanceState y Bundle

En el método `onSaveInstanceState` guardamos datos en el *Bundle* representado por `outState` usando `put` y el tipo del dato a almacenar pasando dos parámetros **key** y **value**
```
@Override
protected void onSaveInstanceState(@NonNull Bundle outState) {
  super.onSaveInstanceState(outState);

  //Almacena datos de diferentes tipos
  outState.putString("nombre", "App de prueba");
  outState.putDouble("version", 1.23);
}
```

Estos datos los podemos recuperar en el método `onCreate` ya que tiene el parámetro `savedInstanceState` de tipo *Bundle* que recibe los datos que salvamos en el método `onSaveInstanceState`, una vez recupedos los podemos asignar a donde sea necesario.

```
 @Override
 protected void onCreate(Bundle savedInstanceState) {
   super.onCreate(savedInstanceState);
   setContentView(R.layout.activity_main);

   if(savedInstanceState==null){
     Log.d("MIAPP", "No hay datos guardado");
   }else{
     Log.d("MIAPP", "Hay datos guardados");
     
     //Coger los datos guardados del Budle
     String nombre = savedInstanceState.getString("nombre");
     Double version = savedInstanceState.getDouble("version");     
    }
```

### :iphone: App IMC :iphone:

## Jueves 26/09/2019

### Archivo strings.xml

El archivo **strings.xml** que se ubica en el directorio **res/values**, es muy útil para insertar valores de textos que en lugar de ponerlos *"Harcodeados"* en los archivos `activity.xml`, podemos insertarlos en **strings.xml** y usar estos textos dentro del los archivos `activity.xml`, veamos un ejemplo la siguiente pantalla:

<img src="/imgDocumentacion/myapplication1_ejecucion.png">

se dibuja usando el siguiente `.xml`:

```
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

Podemos apreciar que dentro del `TextView` tenemos el atributo `android:text="Hello World!"` el cual hace que se despliegue ese texto en la pantalla, pero como se puede apreciar esta *"Harcodeados"*. 

Vamos a meter el texto dentro del archivo  **strings.xml** y cambiar el atributo para que siga haciendo exactamente lo mismo pero con el texto en Español, por lo que **strings.xml** quedaría así:

```
<resources>
    <string name="app_name">MyApplication1</string>
    <string name="saludo">Hola Mundo!</string>
</resources>
```

Y el atributo `text` dentro del `xml` de la actividad se debe invocar así:

`android:text="@string/saludo"`

La **@** denota que hacemos referencía a un recurso dentro de **res** en este caso dentro de **string** el cual se llama **saludo**, el resultado de la pantalla sigue siendo exactamente el mismo pero esto nos va a permitir tener todos los textos en un solo archivo.

El resultado es:

<img src="/imgDocumentacion/myapplication1_ejecucion_esp.png">

### i18n Multilenguaje


Para utilizar el multilenguaje usamos el archivo **strings.xml**, lo primero que debemos hacer es presiona en **Open editor** que se muestra en la parte superior derecha:

<img src="/imgDocumentacion/open_editor.png">

Se nos abrira un editor con la versión que tenemos actualmente (Español), para crear otra versión presionamos en el *Mundo* y seleccionamos el idioma deseado en este caso **English En**.

<img src="/imgDocumentacion/select_english.png">

Cuando seleccionamos el idioma nos creara una nueva columna en el editor para introducir el texto en el idioma seleccionado:

<img src="/imgDocumentacion/english_text.png">

Como se puede apreciar en la imagen tenemos dos **strings.xml**, uno para cada idioma, el contenido es el siguiente:

**strings.xml**
```
<resources>
    <string name="app_name">MyApplication1</string>
    <string name="saludo">Hola Mundo!</string>
</resources>
```
**strings.xml (en)**
```
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <string name="app_name">MyApplication1</string>
    <string name="saludo">Hello World!</string>
</resources>
```

Dependiendo de la configuración del dispositivo se mostrara una u otra versión.

<img src="/imgDocumentacion/myapplication1_ejecucion_esp.png" width="300"><img src="/imgDocumentacion/myapplication1_ejecucion.png" width="300">

#### Recuperar valores string de forma dinámica
También sera necesario recuperar los valores de los strings desde el código java, la forma dehacerlo es como sigue:

```
//ejemplo de obtener dinámicante un texto multilingüe
String nombre_app = getResources().getString(R.string.app_name);
Log.d("etiqueta", nombre_app);
```

### Reiniciar Servidor

Si alguna vez se nos traba la App existe la opción de resetear el servidor, la opción se hace con:

**File/ Invalidate Cache / Restart...**

### Scroll View

La vista **Scroll View** nos permite desplazarnos a lo largo de la pantalla para ver opciones que en prncipio no podemos ver, muy util para listas muy largas. Cuando se tiene una **Scroll View** solo debe contener un hijo el cual ya puede tener todo el contenido de la página. Un ejemplo lo tenemos en el siguiente código.

```
<?xml version="1.0" encoding="utf-8"?>
<ScrollView  xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical"
        tools:context=".MainActivity">
	
	.
	.
	.
	
    </LinearLayout>
</ScrollView>
```

### Imagenes e ImageView

Podemos importar imagenes a nuestro proyecto dentro de la carpeta **drawable**, si solo arrastramos las imagenes en esa carpeta se insertara la imagen, pero si queremos que la imagen este lista para varias resouluciones sera necesario insertar el pluging **Android Drawable Importer**

[Android Drawable Importer](https://stackoverflow.com/a/37321194)

Lo primero que debemos es insertar el pluging para lo cual nos vamos a **File/settings**

Seleccionamos la opción **Pluging** y buscamos **Android Drawable Importer**

<img src="/imgDocumentacion/android_drawable_import.png">

Una vez que instalemos el Pluging se nos pedira Resetear el IDE.

Una vez que se ha reiniciado el IDE ya podemos colocarnos en la carpeta **res/drawable** dar un clic derecho, seleccionar **new** y al final de la lista veremos 4 nuevas opciones que se han inluido gracias al pluging. Seleccionamos la opción de **Batch Drawable Import**

<img src="/imgDocumentacion/android_drawable_import_4_opciones.png">

Nos saldra una ventana donde pulsamos el simbolo + para seleccionar la imagen que deseamos añadir:

<img src="/imgDocumentacion/android_drawable_import_add_image.png">

Se mostrara todos los tamaños que se crearan:

<img src="/imgDocumentacion/android_drawable_import_size.png">

Una vez que aceptamos todas las opciones podemos ver como se han añadido las diferentes resoluciones para nuestra imagen:

<img src="/imgDocumentacion/android_drawable_import_files.png">







//setear imagen
ImageView imagen_pantera = findViewById(R.id.pantera);
imagen_pantera.setImageResource(R.drawable.pantera_rosa);


