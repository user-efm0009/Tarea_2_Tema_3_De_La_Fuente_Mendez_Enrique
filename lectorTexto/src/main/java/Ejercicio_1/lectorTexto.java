package Ejercicio_1;

import java.io.*;

public class lectorTexto {

    public static void main(String[] args) {

        File archivo = new File("C://Users//Usuario1//IdeaProjects//lectorTexto//entrada.txt");

        if (!archivo.exists()) {

            System.err.println("Se ha producido un error: El archivo 'entrada.txt' no existe.");
            return;

        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivo));

             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                bw.write(linea);
                bw.newLine();

            }

            bw.flush();

        } catch (IOException e) {

            System.err.println("Error al leer el archivo.");
            e.printStackTrace();

        }

    }

}

