package zz.PracticasUdemy.T12.Arreglos.tarea13.ordArreglo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> listaNumeros = new ArrayList<>();
        int numeroUsuario;

        for (int i = 0; i < 10; i++) {
            System.out.print("Introduzca un nuevo número a nuestra lista: ");
            numeroUsuario = sc.nextInt();
            listaNumeros.add(numeroUsuario);
        }

        for (int i = listaNumeros.size(); i > 0; i--) {
            System.out.print(listaNumeros.get(i - 1) + " - ");
        }

    }
}
