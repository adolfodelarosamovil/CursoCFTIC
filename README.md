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

Documentación Profesor

* [1. Introducción Android](/Documentacion/ANDROID.pdf)
* [3 – LAYOUTS y VISTAS Básicas ](/Documentacion/ANDROID3.pdf)
* [4 – LAYAOUTS y VISTAS Avanzadas](/Documentacion/ANDROID4.pdf)
* [5 – ALMACENAMIENTO INTERNO](/Documentacion/ANDROID5.pdf)
* [6 – CLASES PRINCIPALES](/Documentacion/ANDROID6.pdf)
* [7 – PERIFÉRICOS Y SERVICIOS DE GOOGLE](/Documentacion/ANDROID7.pdf)
* [Colecciones en JAVA](/Documentacion/Colecciones.pdf)
* [El CONTEXTO en ANDROID](/Documentacion/CONTEXT.pdf)
* [TRANSICIONES](/Documentacion/TRANSICIONES.pdf)


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

**Algunos comandos importantes**

```
>ls -las

>cat .gitignore
	/idea
	/build
	/capture
	
>git init

>git add .

>git commit -m "Commit Inicial"

>git remote add origin

>remote -u {fetch/push}

>git push -u origin master

>git pull

>git reset --hard origin/master

>rm -Rf .git

```

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

### Android Drawable Importer

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

### ImageView

El **view ImageView** nos permitirá pintar una imagen en la pantalla del móvil basta con agregar un **ImageView** en nuestra **activity.xml** y poner todas las propiedades, por ejemplo:

```
 <ImageView
        android:id="@+id/imageView"
        android:layout_width="339dp"
        android:layout_height="643dp"
        android:layout_marginStart="36dp"
        android:layout_marginLeft="36dp"
        android:layout_marginTop="44dp"
        android:layout_marginEnd="36dp"
        android:layout_marginRight="36dp"
        android:layout_marginBottom="44dp"
        android:scaleType="fitXY"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:srcCompat="@drawable/pantera_rosa" />
```

En el atributo ` app:srcCompat="@drawable/pantera_rosa"` ponemos el nombre de la imagen, otro atributo importante es `android:scaleType` el cual nos permite scalar la imagen de diferentes formas, sus opciones son:

* centerInside
* fitStart
* fitEnd
* center
* matrix
* fitXY
* fitCenter
* centerCrop

<img src="/imgDocumentacion/image_view_1.png">

En el dispositivo se vera así:

<img src="/imgDocumentacion/image_view_2.png">

#### Insertar Imagen de Forma Dinámica

En el XML metemos el view para la imagen:

```
<ImageView
  android:id="@+id/img_pantera"
  android:layout_width="wrap_content"
  android:layout_height="wrap_content"
  tools:ignore="MissingConstraints">

</ImageView>
```

Y en el java metemos los atributos necesarios para que la imagen se cargue:

```
ImageView imagenPanteraRosa = findViewById(R.id.img_pantera);
imagenPanteraRosa.setImageResource(R.drawable.pantera_rosa);
```

En el dispositivo se ve así:

<img src="/imgDocumentacion/image_view_3.png">

Existe el método `setVisibility` el cual nos permite hacer la imagen visible, invisible e incluso quitarla del XML.

```
imagenPanteraRosa.setVisibility(View.VISIBLE);
imagenPanteraRosa.setVisibility(View.INVISIBLE);
imagenPanteraRosa.setVisibility(View.GONE);
```

## Viernes 27/09/2019

### Linear Layout

Un Layout que organiza otras vistas, ya sea horizontalmente en una sola columna o verticalmente en una sola fila.

El LinearLayout tiene el atributo `android:orientation="vertical/horizontal"` que puede ser `vertical` u `horizontal` para determinar la orientación de los `view` que contenga. Cada `view` a su vez hara uso de los atributos:

```
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:layout_weight="1"
```

Los dos primeros pueden tener valores:
```
match_parent
wrap_content
0dp
```

y `android:layout_weight` tiene un valor de peso con respecto a los demas `view`.

Otros atributos importantes son:

```
android:gravity="centerl"
android:layout_gravity="center_horizontal"
```

Combinando estos tres atributos más la orientación se puede hacer infinidad de diseños. Como los ejemplos que se ven a continuación:

**LinearLayout Vertical**
```
<?xml version="1.0" encoding="utf-8"?>
<!-- Vertical Orientation is set -->
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <!-- Text Displayed At Top -->

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textAppearance="?android:attr/textAppearanceLarge"
        android:text="Linear Layout (Sin Weight)"
        android:id="@+id/textView"
        android:layout_gravity="center_horizontal" />

    <!-- Button Used -->

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Botón 1"
        android:background="#009300" />

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Botón 2"
        android:background="#e6cf00" />

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Botón 3"
        android:background="#0472f9" />

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Botón 4"
        android:background="#e100d5" />
</LinearLayout>
```
<img src="/imgDocumentacion/linearlayout_1.png">

**LinearLayout Vertical con Weight**

El `Weight` es un peso que se le da a cada uno de los views que  se pinten

```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:weightSum="4"
    android:orientation="vertical">

    <!-- Text Displayed At Top -->

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textAppearance="?android:attr/textAppearanceLarge"
        android:text="Linear Layout (Con Weight)"
        android:id="@+id/textView"
        android:layout_gravity="center_horizontal"
        android:layout_weight="0"/>

    <!-- Button Used -->

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Botón 1"
        android:background="#009300"
        android:layout_weight="1"/>

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Botón 2"
        android:background="#e6cf00"
        android:layout_weight="1"/>

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Botón 3"
        android:background="#0472f9"
        android:layout_weight="1"/>

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Botón 4"
        android:background="#e100d5"
        android:layout_weight="1"/>
</LinearLayout>
```

<img src="/imgDocumentacion/linearlayout_2.png">

**LinearLayout Horizontal con Weight**
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <!-- Text Displayed At Top -->

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center_horizontal"
        android:text="Linear Layout Horizontal (Sin Weight)"
        android:textAppearance="?android:attr/textAppearanceLarge" />

    <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="horizontal"
        android:weightSum="4">

        <!-- Button Used -->
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:background="#009300"
            android:text="Botón 1" />

        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:background="#e6cf00"
            android:text="Botón 2" />

        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:background="#0472f9"
            android:text="Botón 3" />

        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:background="#e100d5"
            android:text="Botón 4" />
    </LinearLayout>
</LinearLayout>
```
<img src="/imgDocumentacion/linearlayout_3.png">

**LinearLayout Horizontal con Weight y wrap_content**

```
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <!-- Text Displayed At Top -->

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center_horizontal"
        android:text="Linear Layout Horizontal (Con Weight)"
        android:textAppearance="?android:attr/textAppearanceLarge" />

    <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="horizontal"
        android:weightSum="4">

        <!-- Button Used -->
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:background="#009300"
            android:text="Botón 1" />

        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:background="#e6cf00"
            android:text="Botón 2" />

        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:background="#0472f9"
            android:text="Botón 3" />

        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:background="#e100d5"
            android:text="Botón 4" />
    </LinearLayout>
</LinearLayout>
```
<img src="/imgDocumentacion/linearlayout_4.png">


**LinearLayout Horizontal con Weight y match_parent**

```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <!-- Text Displayed At Top -->

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center_horizontal"
        android:text="Linear Layout Horizontal (Con Weight)"
        android:textAppearance="?android:attr/textAppearanceLarge" />

    <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="horizontal"
        android:weightSum="4">

        <!-- Button Used -->
        <Button
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:background="#009300"
            android:text="Botón 1" />

        <Button
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:background="#e6cf00"
            android:text="Botón 2" />

        <Button
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:background="#0472f9"
            android:text="Botón 3" />

        <Button
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:background="#e100d5"
            android:text="Botón 4" />
    </LinearLayout>
</LinearLayout>
```

<img src="/imgDocumentacion/linearlayout_5.png">

### Cerrar una Activity

Los siguientes métodos permiten cerrar una activity o la App.

* `finish()` Cierra la activity (pantalla) actualmente visible y regresa a la anterior pantalla, si es la primera la App se cierra.
* `finishAffinity()` Cierra la App (versión 15 en adelante).

### :iphone: App Cajas :iphone:

## Lunes 30/09/2019 

### Toasts

Son avisos que proporciona información simple sobre una acción en una pequeña ventana emergente. Solo ocupa la cantidad de espacio necesario para el mensaje, y la actividad en curso permanece visible y admite la interacción. Los avisos desaparecen automáticamente después de un tiempo.

```
 Toast toast = Toast.makeText(this, "Sending message...", Toast.LENGTH_LONG);
 toast.show();
```

<img src="/imgDocumentacion/toast.png">

Toast necesita tres parámetros el contexto, el mensaje y la duración, existen dos valores para la duracción del mensaje:

```
Toast.LENGTH_LONG
Toast.LENGTH_SHOR
```

## Martes 01/10/2019

### Clase MediaPlayer

**Documentación Oficial**
* [Audio & Video](https://developer.android.com/guide/topics/media/)
* [android-SimpleMediaPlayer](https://github.com/googlearchive/android-SimpleMediaPlayer)

La clase **MediaPlayer** nos permitira reproducir archivos de sonido en nuestra App. Lo primero que tenemos que hacer es crear el directorio **res/raw** y dentro colocamos nuestros archivos **.mp3** (jazz_in_paris.mp3) que queramos reproducir. En nuestro archivo **.java** incluimos las siguientes instrucciones:

```
@Override
protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);
	
  //Reproducir archivo de sonido
  MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.jazz_in_paris);
  mediaPlayer.setLooping(false);
  mediaPlayer.setVolume(1300, 1300);
  mediaPlayer.start();
}
```
************************************************************************************************************************************
### Intents

Los Intents nos permiten ir de una actividad a otra, incluso podemos pasar datos entre las actividades. Existen dos tipos de Intent:

* **Explicitos**: Indicamos la vista a la que queremos movernos. 
* **Implicitos**: 

Vamos a ver un ejemplo de un **Intent Explicito** para que nos lleve de la activity inicial a una segunda activity:




### Animación de Secuencias de Imagenes

[Info Vale](https://github.com/Valexx55/AppTurismoRivas/blob/master/app/src/main/res/drawable/introduccion.xml)



### :iphone: App Cajas :iphone:

EJERCICIO:

1) AÑADIR UNA CAJA DE TEXTO Y UN BOTÓN AL LAYOUT
2) EL FIN DEL JUEGO CAMBIA: CUANDO EL USUARIO CREA TENER LA SUMA DE TODOS LOS NÚMEROS, INTRODUCIRÁ EL TOTAL EN LA CAJA DE TEXTO ANTERIOR Y PULSARÁ EL BOTÓN
2.1 SI ACIERTA, SE LE MUESTRA EL TIEMPO TOTAL INVERTIDO
2.2 SI FALLA, SE LE AVISA Y EL TIEMPO SIGUE CORRIENDO

CV
ACTIVITY SPLASH RIVAS
https://github.com/Valexx55/AppTurismoRivas/blob/master/app/src/main/java/edu/val/idel/rivas/turismorivas/actividades/SplashActivity.java


## Miercoles 02/10/2019

CV
MUESTRARIO APP BOTONES
Para que podáis ver los distintos tipos de botones que podéis emplear
una app de ejemplo
https://github.com/Valexx55/ANDROID_BOTONES


CV
INTENT COMUNES
https://developer.android.com/guide/components/intents-common?hl=es-419

## Jueves 03/10/2019

CV
PROYECTO MENU
https://github.com/Valexx55/MENU_GETAFE

CV
MICROFONO RIVAS
https://github.com/Valexx55/AppTurismoRivas/blob/master/app/src/main/java/edu/val/idel/rivas/turismorivas/actividades/CreditosActivity.java

CV
Una web dinámica para explicar los comandos de git
https://ndpsoftware.com/git-cheatsheet.html



## Viernes 04/10/2019

CV
Editor
http://collabedit.com/vbd6g

CV
TRANSPARENCIAS

CV
CORREO DNI
https://okdiario.com/howto/como-saber-letra-del-dni-2336724


## Lunes 07/10/2019

CV
Letra dni mejorado
http://www.nie.com.es/letra.html

CV
IMC intents
https://github.com/adolfodelarosamovil/IMC



## Martes 08/10/2019

CV
COLLABEDIT HOY
http://collabedit.com/mssdc
//para cargar la web localmente almacenada
webView.loadUrl("file:///android_asset/ayuda.html");

<html>
<div>
    <i><b>FichApp</b></i> es una aplicación para dispositivos con Sistema Operativo Android,
    creada con
</div>
<div>
    el objetivo de registrar las horas laborales de un empleado dentro de una
    empresa, en
</div>
<div>
    la cual actuará como administrador. Para ello se debe seguir los siguientes
    pasos:
</div>
<div>
    <br/>
    1) Una vez descargada e instalada la aplicación en el dispositivo, se debe
    dar de alta el usuario Administrador(responsable en la empresa), rellenando los campos del formulario inicial, id(identificador del responsable), contraseña que va a
    usar.
</div>
<div>
    <br/>
    <b>Inicio sesión como Administrador/Gestor:</b>
</div>
<div>
    <br/>
    2) El Administrador rellena los datos de la empresa en los campos correspondientes.
</div>
<div>
    <br/>
</div>
<div>
    3) El Administrador inicia sesión rellenando id y contraseña y en la
    siguiente pantalla
</div>
<div>
    elige su rol: Gestor.
</div>
<div>
    <br/>
</div>
<div>
    4) El Gestor accede a Menú Gestor que tiene las siguientes opciones:
</div>
<div>
    - Editar Datos (Gestor)
</div>
<div>
    - Editar Datos (Empresa)
</div>
<div>
    - Registro de Empleados: El Gestor registra a los empleados, rellenando
    datos personales(del empleado), le asigna un id(empleado) y una contraseña inicial.
</div>
<div>
    - Consulta de Datos Empleado
</div>
<div>
    - Enviar Informe
</div>
<div>
    <br/>
    <b>Inicio sesión como Empleado:</b>
</div>
<div>
    <br/>
    1) El Empleado rellena los campos: id(Usuario) y contraseña.
</div>
<div>
    2) Accede a Menú Empleado que tiene las opciones:
</div>
<div>
    - Registro horas Empleado
</div>
<div>
    - Consulta de horas
</div>
</html>


CV
Enlace wikiimc
https://es.wikipedia.org/wiki/%C3%8Dndice_de_masa_corporal

CV
MENU CONTEXT
https://developer.android.com/guide/topics/ui/menus?hl=es-419#FloatingContextMenu

CV
url FICHAPP
https://github.com/Valexx55/FICHApp

### Shared Preferences [5 – ALMACENAMIENTO INTERNO](/Documentacion/ANDROID5.pdf)

Los Shared Preferences son archivos XML que residen en la memoria del dispositivo y me permiten almacenar información en la forma:

CLAVE: VALOR

Los tipos de datos que me permite almacenar son:
* Boolean
* String
* Numéricos: float, int, long

Son parecidos a los ficheros de propiedades, pero se almacenan como un XML

```
<?xml version='1.0' encoding='utf-8' standalone='yes' ?>
<map>
  <string name="nombre">prueba</string>
  <string name="email">modificado@email.com</string>
</map>
```

El procedimiento general de trabajo con estos ficheros será:

1 Obtener referencia
2 Añadir/Consultar valores
3 Guardar los cambios

**1 Obtener referencia**

`SharedPreferences prefs = getSharedPreferences(String nombre,MODO);`

Donde, MODO, es una constante de Context y puede ser:

`MODE_PRIVATE` Sólo nuestra aplicación tiene acceso a estas preferencias.
`MODE_WORLD_READABLE`
`MODE_WORLD_WRITABLE`

**2 Consultar/Añadir Valores**

```
String correo = prefs.getString("email", "por_defecto@email.com");
SharedPreferences.Editor editor = prefs.edit();
editor.putString("email", "modificado@email.com");
```

**3 Guardar**

`editor.commit();// Hago efectivos los cambios`

## Miercoles 09/10/2019

### :iphone: PreferenciasAPP :iphone:

El siguiente es un código de ejemplo para usar las `SharedPreferences` para saber si es la primera vez o no en entrar a una APP.

```
public class MainActivity extends AppCompatActivity {

    public static final String NOMBRE_FICHERO_PREFS = "preferencias";
    public static final String CLAVE_PRIMERA_VEZ = "primera_vez";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Si es la primera vez
            //informo
        //SI NO
            //informo
        SharedPreferences sp = getSharedPreferences(NOMBRE_FICHERO_PREFS, MODE_PRIVATE);
        boolean primera_vez = sp.getBoolean(CLAVE_PRIMERA_VEZ, true);

        if(primera_vez){
            Log.d("MIAPP", "Es la primera vez que entra");
            SharedPreferences.Editor editor = sp.edit();
            editor.putBoolean(CLAVE_PRIMERA_VEZ, false);
            editor.commit();
        }else{
            Log.d("MIAPP", "NO Es la primera vez que entra");
        }
    }
}


//OUTPUT
2019-10-14 17:53:49.754 14441-14441/com.example.preferenciasapp D/MIAPP: NO Es la primera vez que entra
```

El método `getSharedPreferences` es el encargado de crear el archivo si es que no existe y si existe lo recupera, la sentencia completa es:
`SharedPreferences sp = getSharedPreferences(NOMBRE_FICHERO_PREFS, MODE_PRIVATE);`

Para recuperar un valor del archivo usamos el método `get` la sentencia completa es:
`boolean primera_vez = sp.getBoolean(CLAVE_PRIMERA_VEZ, true);`.

Si lo que queremos es meter un valor en el archivo usamos el método `put` pero previo debemos usar un editor:

```
SharedPreferences.Editor editor = sp.edit();
editor.putBoolean(CLAVE_PRIMERA_VEZ, false);
```

Para salvar la información en el archivo usamos el método `commit` del `editor`:

`editor.commit();`

### Examen Escrito

Resultado: 7.8

### Ejercicio en la :iphone: App DNI :iphone:

Al pulsar el botón hacia atrás guardar el valor del DNI y radio seleccionado.

Cuando se presiona el botón hacia atrás se dispara el método **onBackPressed()** es allí cuando vamos a aprovechar para guardar los valores:

```
@Override
public void onBackPressed() {
  super.onBackPressed();
  Log.d("MIAPP", "El usuario le ha dado al Botón Retroceso");
  EditText dniView = findViewById(R.id.dni);
  String dniString = dniView.getText().toString();

  RadioGroup radioGroup = findViewById(R.id.radioGroup);
  int radioId = radioGroup.getCheckedRadioButtonId();
  
  SharedPreferences sp = getSharedPreferences(NOMBRE_FICHERO_PREFS, MODE_PRIVATE);
  SharedPreferences.Editor editor = sp.edit();
  editor.putString(DNI, dniString);
  editor.putInt(RADIO, radioId);
  editor.commit();
}
```

### Ejercicio en la :iphone: App DNI :iphone:

Al pulsar el botón hacia atrás presentar un cuadro de dialogo que pregunte si deseamos o no almacenar los valores del DNI y radio seleccionado.

Vamos a crear el método `mostrarDialogoSalir()` que será el encargado de salvar o no lo s datos y salir de la actividad el cual sera llamado al invocar el método `onBackPressed()` observese que se tuvo que comentar ` //super.onBackPressed();` ya que el final de la actividad es manejado por el método `mostrarDialogoSalir()`.
```
@Override
public void onBackPressed() {
  //super.onBackPressed();
  mostrarDialogoSalir()
}

private void mostrarDialogoSalir()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("¿Deesea almacenar los datos?");

        builder.setPositiveButton("Sí", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
               Log.d(TAG_APP, "Tocó SÍ");

               Log.d("MIAPP", "El usuario le ha dado al Botón Retroceso");
               EditText dniView = findViewById(R.id.dni);
               String dniString = dniView.getText().toString();

               RadioGroup radioGroup = findViewById(R.id.radioGroup);
               int radioId = radioGroup.getCheckedRadioButtonId();
		
	       //Guarda valores
               SharedPreferences sp = getSharedPreferences(NOMBRE_FICHERO_PREFS, MODE_PRIVATE);
  	       SharedPreferences.Editor editor = sp.edit();
               editor.putString(DNI, dniString);
               editor.putInt(RADIO, radioId);
               editor.commit();

               dialog.dismiss();
               MainActivity.this.finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // User cancelled the dialog
                Log.d(TAG_APP, "Tocó NO");
                
		//Limpia valores almacenados
		SharedPreferences sp = getSharedPreferences(NOMBRE_FICHERO_PREFS, MODE_PRIVATE);
  	        SharedPreferences.Editor editor = sp.edit();
                editor.putString(DNI, "");
                editor.putInt(RADIO, 0);
                editor.commit();
                
		dialog.cancel();
                MainActivity.this.finish();
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }
```

### Contextos

[El CONTEXTO en ANDROID](/Documentacion/CONTEXT.pdf)

### Ejercicio en la :iphone: App DNI :iphone:

Realizar una clase que gestione el almacenamiento en Preferencias.

**Un punto importante a considerar es que en al usar las `SharedPreferences` necesitamos el contexto de la Activity y al estar en una clase comuún y corriente el contexto no lo tenemos por lo que debemos pasarlo a cada método que lo necesite.**

```
public class Preferencias {

    public static final String FICHERO_LISTA_DNIS = "lista_dnis";
    public static final String FICHERO_NO_DNIS = "numero_dni";
    public static final String FICHERO_ULTIMO = "ultimo_dni";
    public static final String CLAVE_ULTIMO_DNI = "dni";
    public static final String VALOR_ULTIMO_RADIO = "radio";
    public static int clave = 0;
    public static int noDNIs;


    /**
     * Este método graba en el fichero de preferencias el último dni
     * @param contexto el contexto de la aplicación
     * @param dni el valor a guardar
     */
    public static void guardarDNI(Context contexto, String dni){

        SharedPreferences sp = contexto.getSharedPreferences(FICHERO_ULTIMO, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString(CLAVE_ULTIMO_DNI, dni);
        editor.commit();
    }

    /**
     * Obtiene el valor del último DNI almacenado en las preferences
     *
     * @param context Contexto de la aplicación
     * @return el ultimo dni almacenado y cadena vacía en caso de que no exista
     */
    public static String obtenerUltimoDNI(Context context){
        String ultimo_dni = null;
        SharedPreferences sp = context.getSharedPreferences(FICHERO_ULTIMO, Context.MODE_PRIVATE);
        ultimo_dni = sp.getString(CLAVE_ULTIMO_DNI, "");
        return ultimo_dni;
    }

    /**
     * Este método graba en el fichero de preferencias el último radio seleccionado
     * @param contexto el contexto de la aplicación
     * @param radio el valor a guardar
     */
    public static void guardarRadio(Context contexto, int radio){
        SharedPreferences sp = contexto.getSharedPreferences(FICHERO_ULTIMO, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putInt(VALOR_ULTIMO_RADIO, radio);
        editor.commit();
    }

    /**
     * Obtiene el valor del último RADIO almacenado en las preferences
     *
     * @param context Contexto de la aplicación
     * @return el ultimo radio almacenado y 0 en caso de que no exista
     */
    public static int obtenerUltimoRadio(Context context){
        int radio = 0;
        SharedPreferences sp = context.getSharedPreferences(FICHERO_ULTIMO, Context.MODE_PRIVATE);
        radio = sp.getInt(VALOR_ULTIMO_RADIO, radio);
        return radio;
    }
}
```

### Tetris

Juego desarrollado por Shaquir
https://github.com/saqibsaleem22/Tetris

### Ejercicio APP VOLUNTARIA
/**
 * HACER UNA APLICACIÓN
 * QUE ADIVINE UN NÚMERO GENERADO ALEATORIAMENTE
 * EL USUARIO TENDRÁ 5 INTENTOS Y CADA VEZ QUE FALLE
 * LA APLICACIÓN LE INFORMARÁ DE SI EL NÚMERO BUSCADO
 * ES MAYOR O MENOR
 * 
 * SI CONSIGUE ADIVINAR, MOSTRAR UNA FELICITACIÓN
 * SI NO, MENSAJE DE CONDOLENCIA
 * 
 * SI EL USUARIO SALE DE LA APLICACIÓN Y VUELVE A ENTRAR
 * GUARDAR LOS INTENTOS QUE YA HA GASTADO
 *
 */
 
 
## Jueves 10/10/2019

CV
COLLABEDIT HOY ALERTDIALOG
http://collabedit.com/crgev

## Viernes 11/10/2019

CV
PRACTICA MAXIM
https://github.com/cmadrid19/Adivinar_Numero

CV
El consejero en nuestra clase de Android
http://www.comunidad.madrid/noticias/2019/10/11/extendemos-oferta-formacion-empleo-cinco-centros-propios


## Lunes 14/10/2019

CV
CARGAR DNI
public static List<Dni>  cargarFicheroDni (Context context)
   {
       List<Dni> lista_dnis = null;
       String clave_actual = null;
       String dni_actual = null;
       Dni objeto_dni = null;
       Gson gson = null;
//http://collabedit.com/
           Log.d(MainActivity.TAG_APP, "Mostrando . . .");
           SharedPreferences sp = context.getSharedPreferences(FICHERO_DNIS, Context.MODE_PRIVATE);
           Map<String, String> mapa_dnis = (Map<String, String>)sp.getAll();
           //recorrer el mapa_dnis
           Set<String> claves = mapa_dnis.keySet();
           gson = new Gson();
           lista_dnis = new ArrayList<Dni>();

           for (String clave : claves) {
               dni_actual = mapa_dnis.get(clave);//obtengo el valor asociado a la clave
               Log.d(MainActivity.TAG_APP, dni_actual);
               objeto_dni = gson.fromJson(dni_actual, Dni.class);//y deserializo
               lista_dnis.add(objeto_dni);//añado a la lista el objeto Dni obtenido
           }

       /*Iterator<String> iterator = claves.iterator();

       while (iterator.hasNext())
       {
           clave_actual = iterator.next();
           dni_actual = mapa_dnis.get(clave_actual);
           Log.d(MainActivity.TAG_APP, dni_actual);
       }*/

    return lista_dnis;
   }

CV
link de colecciones
https://github.com/Valexx55/JavaExamples/tree/master/BasicsExamplesJSE/src/val/examples/basic/collections

CV
LINK REPO RECYCLER
https://github.com/Valexx55/RecyclerCFTIC

CV
PRÁCTICA RECYCLER
HACER UNA NUEVA ACTIVIDAD EN LA APLICACIÓN DEL DNI PARA QUE MUESTRE UNA LISTA CON LOS DNIS ALMACENADOS EN EL FICHERO DE PREFERENCIAS

## Martes 15/10/2019

## Miercoles 16/10/2019

## Jueves 17/10/2019

## Viernes 18/10/2019

## Lunes 19/10/2019

## Martes 20/10/2019

## Miercoles 21/10/2019

## Jueves 22/10/2019

## Viernes 23/10/2019

## Lunes 26/10/2019

## Martes 27/10/2019

## Miercoles 28/10/2019

## Jueves 29/10/2019

## Viernes 30/10/2019
