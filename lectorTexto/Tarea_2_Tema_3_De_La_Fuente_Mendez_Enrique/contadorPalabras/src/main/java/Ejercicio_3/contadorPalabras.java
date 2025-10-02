package Ejercicio_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class contadorPalabras {
    public static void main(String[] args) {

        try {

            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            OutputStreamWriter osw = new OutputStreamWriter(System.out);
            BufferedWriter bw = new BufferedWriter(osw);

            int numeroPalabras = 0;

            String linea = null;
            while ((linea = br.readLine()) != null){

                String[] palabras = linea.split("\\s+");

                for (String palabra : palabras){

                    if (!palabra.isEmpty()){

                        numeroPalabras++;

                    }
                }
            }

            bw.write(String.valueOf(numeroPalabras));
            bw.flush();
            bw.close();

        }catch(Exception e){

            throw new RuntimeException(e);

        }
    }
}