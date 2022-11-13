package zz.PracticasUdemy.zzPruebas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> listaNombres = new ArrayList<>();
        int condicion = 1;

        while (condicion != 0) {
            System.out.print("Introduzca un nuevo nombre: ");
            listaNombres.add(sc.nextLine());

            System.out.print("Pulse 0 si quiere cerrar el programa: ");
            condicion = sc.nextInt();

            sc.nextLine();
        }

        for (String texto : listaNombres) {
            System.out.println(texto);
        }


    }
}
