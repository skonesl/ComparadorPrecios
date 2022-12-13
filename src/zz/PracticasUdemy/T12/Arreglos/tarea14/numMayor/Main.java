package zz.PracticasUdemy.T12.Arreglos.tarea14.numMayor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        List<Integer> listaNumeros = new ArrayList<>();
        int numUsuario;
        int numMayor = 0;
        boolean repetido = false;

        while (listaNumeros.size() < 7) {

            System.out.print("Introduzca un nuevo número: ");
            numUsuario = entrada.nextInt();

                for (int numero: listaNumeros) {
                    if (numUsuario == numero) {
                        repetido = true;
                    }
                }

            if (repetido == false) {
                listaNumeros.add(numUsuario);
            } else {
                System.out.println("numero repetido, vuelva a intentarlo");
            }
            repetido = false;
        }

        for (int numero: listaNumeros) {
            if (numero > numMayor) {
                numMayor = numero;
            }
        }
        System.out.println("El número más alto introducido es: " + numMayor);
    }
}
