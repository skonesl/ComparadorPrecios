package zz.PracticasUdemy.z4.udemy.tarea10.menu;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcionIndice = 0;
        Scanner sc = new Scanner(System.in);


// los Map (o mapas) los veremos mas adelante en el curso en profundidad
// pero son como un arreglo asociativo, asocia un nombre (o indice) a un valor
// también se les conoce como diccionarios para almacenar datos en base a un nombre.
        Map<String, Integer> opciones = new HashMap();
        opciones.put("Actualizar", 1);
        opciones.put("Eliminar", 2);
        opciones.put("Agregar", 3);
        opciones.put("Listar", 4);
        opciones.put("Salir", 5);

        Object[] opArreglo = opciones.keySet().toArray();

        Object opcion = JOptionPane.showInputDialog(null,
                "Seleccione un Opción",
                "Mantenedor de Productos",
                JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

        if (opcion == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
        } else {
            opcionIndice = opciones.get(opcion.toString());
            do {

                switch (opciones.get(opcion).intValue()) {
                    case 1:
                        System.out.println("Contenido actualizado");
                        break;
                    case 2:
                        System.out.println("Contenido eliminado");
                        break;
                    case 3:
                        System.out.println("Contenido agregado");
                        break;
                    case 4:
                        System.out.println("Contenido listado");
                        break;
                    case 5:
                        System.out.println("Ha decidido salir del programa");
                        break;
                    default:
                        System.out.println("Número introducido incorrecto. Vuelva a intentarlo");
                        break;
                }

                opcion = JOptionPane.showInputDialog(null,
                        "Seleccione un Opción",
                        "Mantenedor de Productos",
                        JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

            } while (opciones.get(opcion).intValue() != 5);

            System.out.println("Programa cerrado con éxito");

        }

    }
}
