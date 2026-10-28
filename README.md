# Sistema de Gestión de Listas de Reproducción

## Descripción

Este proyecto implementa una lista de reproducción musical que permite agregar canciones y navegar entre ellas utilizando métodos controlados. Aplica encapsulamiento para proteger la colección de canciones y el índice de reproducción, evitando que se modifique directamente desde otras clases.

## Funcionamiento

El programa realiza las siguientes operaciones:

1. Crea una lista de reproducción llamada `Favoritas`.
2. Agrega tres canciones: `Canción A`, `Canción B` y `Canción C`.
3. Muestra la primera canción de la lista.
4. Avanza por las canciones hasta llegar a la última pista.
5. Intenta avanzar nuevamente, pero la operación se rechaza porque no hay una canción siguiente.
6. Retrocede hasta llegar a la primera canción.
7. Intenta retroceder nuevamente, pero la operación se rechaza porque no hay una canción anterior.

## Clases principales

### Clase `ListaReproduccion`

Representa una lista de reproducción y controla la navegación entre sus canciones.

**Atributos:**

* `nombre`: nombre de la lista de reproducción.
* `canciones`: colección de canciones almacenada mediante una lista dinámica.
* `indiceActual`: posición de la canción seleccionada actualmente.

**Métodos principales:**

* `ListaReproduccion(String nombre)`: inicializa la lista con un nombre, una colección vacía y el índice en cero.
* `getNombre()`: devuelve el nombre de la lista.
* `agregarCancion(String cancion)`: agrega una canción si su nombre no es `null`, vacío o contiene únicamente espacios.
* `siguiente()`: avanza a la próxima canción si existe. Devuelve `true` si avanza y `false` si la lista está vacía o ya se encuentra en la última pista.
* `anterior()`: retrocede a la canción anterior si existe. Devuelve `true` si retrocede y `false` si la lista está vacía o ya se encuentra en la primera pista.
* `obtenerPistaActual()`: devuelve el nombre de la canción actual o `null` si la lista está vacía.

## Conceptos de programación utilizados

* **Encapsulamiento:** los atributos se declaran `private` para proteger los datos internos.
* **Colecciones dinámicas:** se utiliza `ArrayList` para almacenar una cantidad variable de canciones.
* **Interfaces de colección:** se declara el atributo como `List<String>`, separando la interfaz de su implementación.
* **Validación de datos:** se impide agregar nombres de canciones nulos o vacíos.
* **Control de límites:** se evita avanzar más allá de la última pista o retroceder antes de la primera.
* **Condicionales:** permiten verificar si las operaciones de navegación son válidas.
* **Retorno booleano:** los métodos `siguiente()` y `anterior()` indican si la navegación se realizó correctamente.

## Tecnologías utilizadas

* Java.
* IntelliJ IDEA.
* Programación orientada a objetos (POO).
* Colecciones de Java (`List` y `ArrayList`).

## Ejecución

<img width="521" height="506" alt="image" src="https://github.com/user-attachments/assets/5457be29-8896-435e-895b-5b201b9b5bee" />

## Resultado esperado

La canción inicial será `Canción A`. El programa avanzará a `Canción B` y luego a `Canción C`. Al intentar avanzar nuevamente, mostrará un mensaje indicando que ya se encuentra en la última pista.

Después, retrocederá hasta `Canción A`. Un intento adicional de retroceso mostrará un mensaje indicando que ya se encuentra en la primera pista.

El programa debe impedir que el índice salga de los límites de la colección.

## Objetivo del ejercicio

Aplicar encapsulamiento y colecciones dinámicas para administrar una lista de reproducción, permitiendo agregar canciones y navegar de forma segura entre ellas sin exponer directamente la lista ni su índice interno.

## Estructura del proyecto

```text
GestionListaReproduccion/
├── src/
│   ├── ListaReproduccion.java
│   └── Main.java
└── README.md
```
