package zz.PracticasUdemy.T10.ClaseMath.tarea12.radio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double radio, area;

        System.out.print("Introduzca el area de su círculo: ");
        radio = sc.nextInt();

        area = Math.PI * Math.pow(radio, 2);

        System.out.println("El área de su círculo es " + area);

    }

}
