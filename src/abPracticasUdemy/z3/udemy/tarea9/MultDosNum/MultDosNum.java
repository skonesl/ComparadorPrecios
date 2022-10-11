package abPracticasUdemy.z3.udemy.tarea9.MultDosNum;

import java.util.Scanner;

public class MultDosNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int resultado = 0;
        int numeroUno;
        System.out.print("Introduzca el primer número: ");
        numeroUno = sc.nextInt();
        int numeroDos;
        System.out.print("Introduzca el segundo número: ");
        numeroDos = sc.nextInt();

        for (int i = 1; i <= numeroDos; i++) {
            resultado += numeroUno;
        }



        System.out.println(resultado);

    }

}
