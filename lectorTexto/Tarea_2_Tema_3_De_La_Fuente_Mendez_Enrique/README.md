📘 Actividad Tema 3.1 – Procesamiento de texto con Java

🧩 Descripción general
Esta actividad consiste en desarrollar tres aplicaciones Java que se comunican entre sí mediante entrada y salida estándar, formando una cadena de procesamiento de texto. El objetivo es leer un archivo, filtrar líneas según su longitud y contar el número total de palabras resultantes.

🛠 Aplicaciones desarrolladas
1. lectorTexto
📥 Entrada: Archivo de texto llamado entrada.txt.

📤 Salida: Imprime cada línea del archivo por salida estándar.

⚠️ Validación: Si el archivo no existe, muestra un mensaje de error y termina.

2. filtraLineas
📥 Entrada: Recibe líneas por entrada estándar.

📤 Salida: Imprime solo aquellas líneas que contienen más de 20 caracteres.

🔍 Filtro: Se basa en la longitud de cada línea.

3. contadorPalabras
📥 Entrada: Recibe líneas por entrada estándar.

📤 Salida: Muestra el número total de palabras encontradas.

📚 Definición de palabra: Cualquier secuencia separada por espacios.

🔗 Flujo de ejecución
Las tres aplicaciones están diseñadas para ejecutarse encadenadas mediante tuberías en CMD:

java -jar lectorTexto.jar | java -jar filtraLineas.jar | java -jar contadorPalabras.jar

Este comando realiza lo siguiente:

- lectorTexto.jar lee el archivo entrada.txt.

- filtraLineas.jar filtra las líneas largas.

- contadorPalabras.jar cuenta las palabras de las líneas filtradas.

📁 Requisitos
Java 8 o superior.

Archivo entrada.txt ubicado en el mismo directorio que lectorTexto.jar.

Los tres .jar deben estar compilados correctamente y accesibles desde la terminal.

🧪 Ejemplo de uso
Contenido de entrada.txt:

Hola mundo
Esta línea tiene más de veinte caracteres
Otra línea corta
Esta también es bastante larga y debería pasar el filtro

Resultado esperado:

Código
Total de palabras: 15
