package Ejercicio_3;

import java.io.*;

public class contadorPalabras {

    public static void main(String[] args) {

        int totalPalabras = 0;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] palabras = linea.trim().split("\\s+");

                for (String palabra : palabras) {

                    if (!palabra.isEmpty()) {

                        totalPalabras++;

                    }
                }
            }

            bw.write("Total de palabras: " + totalPalabras);
            bw.newLine();
            bw.flush();

        } catch (IOException e) {

            System.err.println("Error al contar palabras.");
            e.printStackTrace();

        }
    }
}
