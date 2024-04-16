import java.util.Scanner;

public class prueba1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int arreglo[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int piso = arreglo[0];
        ;
        int pisoSeleccionado = 0;
        int opcion = 1;

        while (opcion != 0) {
            System.out.println("Número de pisos");
            for (int a = 0; a < arreglo.length; a++) {
                System.out.println("Piso: " + (a + 1));
            }

            System.out.println();

            System.out.print("Piso en la que te encuentras: Piso " + piso + "\n");

            System.out.print("¿En qué piso quiere estar?: ");
            int seleccionar = entrada.nextInt();

            System.out.println();

            while ((seleccionar < 0) || (seleccionar > 15)) {
                System.out.println("Error al seleccionar el piso");
                System.out.print("¿En qué piso quiere estar?: ");
                seleccionar = entrada.nextInt();
                System.out.println();
            }

            for (int b = 0; b < arreglo.length; b++) {
                if ((seleccionar - 1) == b) {
                    pisoSeleccionado = b + 1;
                    System.out.println("Se seleccionó el piso: " + pisoSeleccionado + "\n");
                }
            }

            if (pisoSeleccionado > piso) {
                System.out.println("Se encuentra subiendo");
                System.out.println("Llegó al piso: " + pisoSeleccionado + "\n");
            } else if (pisoSeleccionado < piso) {
                System.out.println("Se encuentra bajando");
                System.out.println("Llegó al piso: " + pisoSeleccionado + "\n");
            } else {
                System.out.println("Sigue en el mismo piso\n");
            }

            piso = pisoSeleccionado;

            System.out.print("¿Deseas continuar? [1]Si - [0]No: ");
            opcion = entrada.nextInt();

            while ((opcion < -1) || (opcion > 1)) {
                System.out.println("No se encuentra esta opción, elija las opciones predeterminadas");
                System.out.print("¿Deseas continuar? [1]Si - [0]No: ");
                opcion = entrada.nextInt();
            }
        }
        System.out.println("Gracias por utilizar nuestro servicio");
    }
}