const val neverChange: String = "Always the same" // [const val] es igual a [const] en otros lenguajes

fun main(args: Array<String>) {
    println("Hello World!")
    var money: Int = 10
    val name: String = "Arturo" // [val] significa variable de SOLO lectura, no pueden reasignarse
    println(name)
    println(money)
    println(neverChange)

    val largeNumber: Long = 3000000000000000000 // Tipo de dato para tener mayor precision en números altos
    var anotherLargeNum = 300000L // [L] para decir que es un numero [long]
    val float: Float = 0.5f // [float] es para indicar porcentajes a diferencia de [double]. (debe agregarse la [f])

    when (name) { // Es algo muy parecido a un Switch
        "Juan" -> println("Juan es el nombre que entró al when") // Puede ser SIN llaves...
        "Arturo" -> { println("Arturo es el que entró") } // ...o CON llaves
        "Jose", "Daniel" -> println("El nombre es Jose o Daniel") // Es parecido al OR [||]
        else -> println("No existe el nombre")
    }

    when (money) {
        in 0..50 -> println("El valor está entre 0 y 50") // Podría usarse como un AND [&&]
        else -> println("No sabemos cual es el valor")
    }

    var contador = 5
    while (contador > 0) {
        println("El valor del contador es $contador")
        contador--
    }

    do {
        println("Generando numero aleatorio...")
        val randomNumber = (0..100).random() // Genera número aleatorio entre 0 y 10
        println("El numero generado fue: $randomNumber")
    } while (randomNumber > 50)

    var fruitsList: List<String> = listOf("Manzana", "Pera", "Naranja")
    for (fruit in fruitsList) {
        println("Comprar la siguiente fruta: $fruit")
    }

    // Null-safety
    // [!!] es igual que [!] en Dart
    // Integer! en Java significa Int? para Kotlin
    // Elvis operator [?:] igual que [??] en Dart (para hacer algo en caso de ser nulo)
    // [?] es igual que en Dart, "si el valor no es nulo, continúe"

    val inmutableList = listOf<String>("Hola", "Chao")
    val mutableList = mutableListOf<String>()
    mutableList.add("Como vas")
    println(mutableList[0])

    // array directamente procesa los datos en bytecode, las listas son más manejables por el desarrollador
    // array sirve para optimizaciones muy fuertes de código

    val inmutableNamesAndAges = mapOf(
        "Carolina" to 30,
        "Juana" to 18
    )

    val mutableNamesAndAges = mutableMapOf<String, Int>(
        "Alberta" to 26,
        "Daniela" to 22
    )
    mutableNamesAndAges["Daniela"] = 24

    // Unit == Void (tipo de retorno vacío)
    // Funciones en amarillo son funciones de extensión (extiende las funcionalidades de otros objetos) Ej.
    // String.randomCase() y aquí se utiliza [this] https://platzi.com/clases/2245-kotlin/36608-funciones-y-funciones-de-extension/

    // Parámetros nombrados: se usan cuando una función recibe dos o más parámetros del mismo tipo de dato
    // Lambda: Son básicamente funciones anónimas (funciones sin nombre). Son un tipo de dato igual que lo demás. Ver el video de Lambdas y High Order Functions para entenderlo mejor
    // High order functions (HOF): Funciones que reciben otras funciones como parámetros. Suele usarse el nombre "block" en lugar de "callback" para dar nombre a una función pasada como parámetro

    // Scope functions
    // [let]: función que se ejecuta si quien la llama NO es un valor nulo [null]. Retorna el último valor de la lambda
    // [with]: función que permite acceder directamente a las propiedades de la variable utilizando [this]. Retorna el último valor de la lambda
    // [run]: función que permite ejecutar una serie de instrucciones luego de declarar una variable utilizando [this] (esta NO devuelve/retorna un valor). Retorna el último valor de la lambda
    // [apply]: función igual a [run] pero retorna un valor al final de la misma. Retorna el objeto completo directamente
    // [also]: función que permite obtener una variable luego ejecutar un código con esa variable y luego devolverla como parámetro para luego ser utilizada. Retorna el objeto completo directamente

    fun miFuncion(nombre: String, apellido: String) = nombre + apellido // Manera rápida de crear una función sencilla

    // Activity: Es básicamente un screen, que se pueden poner unas sobre otras (pantallas)
    // Fragments: Componentes reutilizables, depende totalmente del ciclo de vida de la [Activity]/pantalla.
    // Transacción: Reemplazar un [fragment] por otro
    // Intent: Utilidad para que los componentes de Android se comuniquen
    // Service: Sirven para ejecutar algo (código, musica, etc) en background (cuando la app no está abierta directamente)
    // Broadcast receivers: Listeners (Observable pattern) a que ocurre en nuestra app, esto ocurre en el archivo "Manifest" que también se encarga de escuchar todo lo que suceda relacionado al smartphone (como llamadas o mensajes entrantes, wifi, carga de batería conectada, etc)

    // Gradle: Es una herramienta o asistente que hace más rápida la construcción de proyectos de desarrollo (integra dependencias, crea un sistema de archivos, genera un ejecutable APK, etc.)

    // SQLite: Base de datos SOLO accesible desde la app la cual la creó
    // Content provider: Base de datos accesible desde cualquier app del smartphone

    // Carpeta "res" en un proyecto Android
    // drawable: Imágenes; Representa gráficos (todo aquello que pueda ser dibujado en una pantalla)
    // layout: Representa todas las estructuras de pantallas(activities) que creemos (diseños)
    // mipmap: iconos
    // values: Aquí administraremos los recursos compartidos en la app (Colores, cadenas, estilos, temas, dimensiones o arreglos)
        // dimens: Dimensiones que estarán en varios lugares de nuestra app
    // font: fuentes
    // anim: contendrá xml para animaciones
    // xml: Contendrá preferencias de usuario y datos mas complejos
    // raw: Contendrá archivos como videos o audios

    // Tags:
    // View: Elemento único que se muestra por pantalla
    // ViewGroup: conjunto de elementos [view]
    // EditText: Input de texto
    // ImageView: Tag para agregar una imagen, utiliza el atributo android:[src]="" (recordar que esto debe traerse de la carpeta [res]
    // TextView: Texto sencillo
    // Button: Botón
    // Space: Es una caja de espacio vacío (como un Spacer en Flutter). A este se le agrega un [layout_weight]="1" para darle prioridad número 1 al tamaño de este Widget

    // Namespace: da contexto a un tag, ej. android:gravity="center" (android: es el namespace)
    // Todos los atributos que contengan el namespace [tools:] son solo para desarrollador, no se verán en la versión final de la app
    // Los atributos que contengan [android:] SI se verán en la app final

    // Alineación(tags):
    // LinearLayout: [androidx.appcompat.widget. LinearLayoutCompat] se debe agregar una orientación (vertical/horizontal), esta orientación puede combinarse
    // RelativeLayout: [androidx.appcompat.widget. RelativeLayoutCompat] No hay una alineación con respecto a la pantalla sino con respecto a otros elementos
    // FrameLayout: Sirve para hacer diseños ocupando solo una región o parte de la pantalla en lugar de toda. El tamaño de FrameLayout está dado por su contenido (su child)
    // ConstraintLayout: Es esencialmente lo mismo que RelativeLayout, pero tiene una ventaja y es que considera los elementos con los cuales se va alineando (cada elemento de este deben tener una alineación horizontal y vertical como mínimo para que no muestre errores)

    // Attributes/properties for tags:
    // layout_height/width: [match_parent]: tomará todo el tamaño de su padre, [wrap_content]: tomará únicamente el tamaño que ocupa el elemento que estamos creando (se usa [dp] densityPoints (y [sp] para textos) para establecer tamaño en pixeles de acuerdo al tamaño de pantalla ej. 120dp)
    // gravity: centrar o posicionar a un elemento Y A TODOS SUS HIJOS
    // layout_gravity: posicionar SOLO el elemento especifico donde yo estoy usando este atributo
    // margin: margen (hacia afuera)
    // padding: padding (hacia adentro)
    // id: [@+id/[myId], con este [myId] la clase [R] (que hace referencia a la carpeta [res]) podrá encontrar los elementos e interactuar con ellos
    // hint: Pista para un EditText tag
    // inputType: Cambiar el tipo de teclado
    // drawableStart: Poner un icono al inicio de la caja de texto
    // drawablePadding: Poner padding entre el icono y el texto
    // background: (@ para referirnos a una imagen)
    // backgroundTint: para especificar un color

    // Imágenes o iconos predeterminados: file -> new -> vector asset

    // Style: Es la forma de compartir código XML entre tags para no estar repitiendo las mismas propiedades en los tags. Este archivo se encuentra dentro de res/values/styles.xml
}