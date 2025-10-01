package Ejercicio_1;

import java.util.*;
import java.io.*;
import java.util.Scanner;

public class lectorTexto {

    public static void main(String[] args) {

        File archivoleer = null;
        FileReader fr;
        BufferedReader br;
        OutputStreamWriter osw;
        BufferedWriter bw;

        try {

            archivoleer = new File("C://Users//Usuario1//IdeaProjects//lectorTexto//entrada.txt");

            fr = new FileReader(archivoleer);
            br = new BufferedReader(fr);
            osw = new OutputStreamWriter(System.out);
            bw = new BufferedWriter(osw);
            String linea = null;

            while ((linea = br.readLine()) != null) {

                bw.write(linea);
                bw.newLine();

            }

            bw.flush();
            bw.close();

        } catch (Exception e) {

            throw new RuntimeException(e);

        }

    }

}

