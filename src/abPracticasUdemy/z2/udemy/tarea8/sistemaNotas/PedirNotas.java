package abPracticasUdemy.z2.udemy.tarea8.sistemaNotas;

import java.util.Scanner;

public class PedirNotas {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        double nota;
        int contador = 0, contBaja = 0, contAlta = 0;
        double mediaAlta = 0, mediaBaja = 0, cantUnos = 0, notasSinContar = 0, mediaTotal = 0;

        for (int i = 0; i < 20; i++) {

            System.out.print("Introduzca la nota " + i + " de 20: ");
            nota = sc.nextDouble();

            if (nota != 0) {

                while (nota < 1 || nota > 7) {
                    System.out.println("La nota introducida es incorrecta. Debe estar entre 1 y 7");
                    System.out.print("Introduzca la nota " + i + " de 20: ");
                    nota = sc.nextDouble();
                }

                if (nota > 5) {
                    mediaAlta += nota;
                    contAlta++;
                }

                if (nota < 4) {
                    mediaBaja += nota;
                    contBaja++;
                }

                if (nota == 5) {
                    notasSinContar++;
                }

                if (nota == 1) {
                    cantUnos++;
                }

            } else {
                System.out.println("Pulsando 0 ha apretado el botón de autodestrucción. BOOM");
                i = 19;
            }

            mediaTotal += nota;
            ++contador;
        }

        if (contador >= 19) {
            double mediaAltaFinal = mediaAlta / contAlta;
            double mediaBajaFinal = mediaBaja / contBaja;
            mediaTotal = mediaTotal / contador;

            System.out.println("La media de todas las notas más altas de 5 es: " + mediaAltaFinal);
            System.out.println("La media de todas las notas más bajas de 5 es: " + mediaBajaFinal);
            System.out.println("La cantidad de notas que no se han contado es: " + notasSinContar);
            System.out.println("La cantidad de notas que son uno es: " + cantUnos);
            System.out.println("La media total es: " + mediaTotal);
        } else {
            System.out.println("Pulsó 0, el programa está muerto. MUERTO, MUERTO, MUERTO");
        }

    }
}
