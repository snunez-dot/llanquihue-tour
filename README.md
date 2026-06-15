# llanquihue-tour
Proyecto: Base de datos, tours de la empresa Llanquihue Tours.
El proyecto busca abastecer de una base de datos a Llanquihue Tours, creando una interfaz que identifica tours disponibles y los clasifica, desde tours express, dentro de Chile, pudiendo identificar al guía del tour y los precios por persona.
La estructura al momento de ser ejecutada debe verse como:
Llanquihue Tour
files/
├── tour.txt
src/
├── model/
├── data/
└── ui/

Para ejecutarlo correctamente y agregar información a éste, se debe almacenar en cada carpeta:
files/
└── tour.txt/

src/
├── model/
└ Direccion.java, Empleado.java, Persona.java, Rut.java, Tours.java.
├── data/
└ GestorDatos.java
├── ui/
└ MainTours.java

Es posible ejecutar el código sin usar la carpeta "model", con el propósito único de simplemente almacenar datos de la empresa y no de sus usuarios, el código main para recibir usuarios no está incluído para evitar confusiones.
Para actualizar la información del stock, se puede editar libremente desde tours.txt siguiendo el modelo otorgado.
