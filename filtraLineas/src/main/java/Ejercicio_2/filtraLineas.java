package Ejercicio_2;
import java.io.*;
import java.util.Arrays;

public class filtraLineas {

    public static void main(String[] args) {

        try {

            InputStreamReader isr = new InputStreamReader(System.in);

            BufferedReader br = new BufferedReader(isr);
            OutputStreamWriter osw = new OutputStreamWriter(System.out);
            BufferedWriter bw = new BufferedWriter(osw);

            String linea = null;

            while ((linea = br.readLine()) != null) {

                linea = Arrays.toString(linea.split("\\s+|\n"));

                if (linea.length() >= 20) {

                    bw.write(linea);
                    bw.newLine();

                }

            }

            bw.flush();
            bw.close();

        } catch(Exception e) {

            throw new RuntimeException(e);

        }
    }
}