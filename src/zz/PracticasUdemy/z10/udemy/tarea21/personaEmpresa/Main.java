package zz.PracticasUdemy.z10.udemy.tarea21.personaEmpresa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int porcentaje, opcion;
        Gerente jefazoUno = new Gerente("Nekkane", "Yers", "012345678Y", "C/ Falsa", 27500.00, 110596, 180000);

        System.out.print("Introduzca el porcentaje de salario que desea aumentar a " + jefazoUno.getNombre() + ": ");
        jefazoUno.devolverSueldo(sc.nextInt());

        System.out.println("Si quiere cambiar el presupuesto del gerente " + jefazoUno.getNombre() + " pulse 1. De lo contrario pulse 0");
        System.out.print("Elija una opción: ");
        opcion = sc.nextInt();
        switch (opcion) {
            case 0:
                System.out.println("Ha decidido no cambiar el presupuesto del que dispone el gerente. Procedemos a mostrar sus datos");
                break;
            case 1:
                System.out.println("Ha elegido cambiar el presupuesto del que dispone el gerente");
                System.out.print("Introduzca el nuevo presupuesto: ");
                double nuevoPresupuesto = sc.nextInt();
                jefazoUno.setPresupuesto(nuevoPresupuesto);
                break;
            default:
                System.out.println("Ha elegido una opción no válida. Procedemos a cerrar el programa mostrando la información disponible hasta el momento");
                break;
        }

        System.out.println(jefazoUno.toString());

    }
}
