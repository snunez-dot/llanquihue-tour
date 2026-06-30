# llanquihue-tour
Proyecto: Especificaciones en tours de Llanquihue Tours.
El proyecto busca una base de datos funcional e interactiva para Llanquihue Tours, creando una interfaz que identifica tours disponibles y los clasifica, desde tours express, dentro de Chile, pudiendo identificar al guía del tour y los precios por persona.
La estructura al momento de ser ejecutada debe verse como:
Estructura del proyecto
LlanquihueTourApp
│
├── src
│   └── main
│       └── java
│           └── cl.llanquihuetour
│               │
│               ├── data
│               │   └── GestorDatos.java
│               │   └── GestorServicios.java
│               │
│               ├── model
│               │   └── Tours.java
│               │   └── ServicioTuristico.java
│               │   └── RutaGastronomica.java
│               │   └── PaseoLacustre.java
│               │   └── ExcursionCultural.java
│               │
│               ├── ui
│               │   └── Main.java
│               │
│               └── files
│                   └── tours.txt
│
├── target
│
└── pom.xml

Para agregar información a éste, se debe almacenar en:
files/
└── tours.txt/

Formato del archivo:
id;destino;pais;guia;duracion;precio

Para ejecutar: 
Abrir desde proyecto como proyecto Maven, adoptar el órden especificado de carpetas y clases, asegurarse de que cada carpeta venga de la principal "cl.llanquihuetour". Una vez instalado, proceder a un "clean and build" del programa completo, luego de cada cambio se debe realizar nuevamente este proceso. Abrir el .jar del programa y ejecutarlo usando "java -jar .\target\llanquihueTourApp-1.0-SNAPSHOT.jar".
