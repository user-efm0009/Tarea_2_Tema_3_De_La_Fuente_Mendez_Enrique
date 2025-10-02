package Ejercicio_2;

import java.io.*;

public class filtraLineas {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                if (linea.length() > 20) {

                    bw.write(linea);
                    bw.newLine();

                }
            }

            bw.flush();

        } catch (IOException e) {

            System.err.println("Se ha producido un erro al filtrar las líneas.");
            e.printStackTrace();

        }

    }

}
