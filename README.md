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

La clase **MediaPlayer** nos permitira reproducir archivos de sonido en nuestra App. Lo primero que tenemos que hacer es crear el directorio **res/raw** y dentro colocamos nuestros archivos **.mp3** <audio src="/audio_video/jazz_in_paris.mp3">Jazz in Paris</audio>
que queramos resproducir. En nuestro archivo **.java** incluimos las siguientes instrucciones:

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

