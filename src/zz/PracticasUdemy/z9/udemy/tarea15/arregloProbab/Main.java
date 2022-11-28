package zz.PracticasUdemy.z9.udemy.tarea15.arregloProbab;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> listaNumeros = new ArrayList<Integer>();
        int numPos = 0, numNeg = 0;
        int contPos = 0, contNeg = 0, contCero = 0;

        for (int i = 0; i < 7; i++) {
            System.out.print("Introduzca un número: ");
            int numUsuario = sc.nextInt();
            listaNumeros.add(numUsuario);
        }

        for (int numero : listaNumeros) {

            if (numero > 0) {
                numPos += numero;
                contPos++;
            } else if (numero < 0) {
                numNeg += numero;
                contNeg++;
            } else if (numero == 0) {
                contCero++;
            }
        }

        System.out.println("El promedio de números positivos es: " + (numPos / contPos));
        System.out.println("El promedio de números negativos es: " + (numNeg / contNeg));
        System.out.println("El número de ceros introducidos es: " + (contCero));

    }
}
