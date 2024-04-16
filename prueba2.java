import java.util.Scanner;

public class prueba2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int nFilas = 5, nColumnas = 5;
        int random = 0, lanzar = -11;

        int [][] matriz1 = new int[nFilas][nColumnas];

        System.out.println("Juego de escalera");

        int suma = 0;

        for (int a = 0; a < matriz1.length; a++) {
            for (int b = 0; b < matriz1[a].length; b++) {
                suma = suma + 1;
                matriz1[a][b] = suma;
            }
        }

        for (int a = 0; a < matriz1.length; a++) {
            for (int b = 0; b < matriz1[a].length; b++) {
                System.out.print(matriz1[a][b] + " ");
            }
            System.out.println();
        }

        System.out.println();

        int posicion=0;

        while ((lanzar != 0) ) {
            System.out.println("Escaleras:");
            System.out.println("1. Caes a la casilla 3 y subes a la casilla 11");
            System.out.println("2. Caes a la casilla 6 y subes a la casilla 17");
            System.out.println("3. Caes a la casilla 9 y subes a la casilla 18");
            System.out.println("4. Caes a la casilla 10 y subes a la casilla 12\n");

            System.out.println("Serpientes:");
            System.out.println("1. Caes a la casilla 14 y bajas a la casilla 4");
            System.out.println("2. Caes a la casilla 19 y bajas a la casilla 8");
            System.out.println("3. Caes a la casilla 22 y bajas a la casilla 20");
            System.out.println("4. Caes a la casilla 24 y bajas a la casilla 16\n");

            System.out.print("Arroje el dado [1]Si - [0]No: ");
            lanzar = entrada.nextInt();

            if (lanzar == 1) {
                random = (int) (Math.random() * 6) + 1;
                System.out.println("Dado arrojado: " + random);

                posicion = posicion + random;

                for (int a = 0; a < matriz1.length; a++) {
                    for (int b = 0; b < matriz1[a].length; b++) {
                        if (posicion == matriz1[a][b]) {
                            System.out.println("Jugador queda en el cuadro " + (posicion));
                        }

                        //Escaleras ----------------------------------------------------
                        if (posicion == 3) {
                            System.out.println("Jugador avanza al cuadro " + (posicion) + " y sube por medio de la escalera");
                            posicion = posicion + 8;
                        }

                        if (posicion == 6) {
                            System.out.println("Jugador avanza al cuadro " + (posicion) + " y sube por medio de la escalera");
                            posicion = posicion + 11;
                        }

                        if (posicion == 9) {
                            System.out.println("Jugador avanza al cuadro " + (posicion) + " y sube por medio de la escalera");
                            posicion = posicion + 9;
                        }

                        if (posicion == 10) {
                            System.out.println("Jugador avanza al cuadro " + (posicion) + " y sube por medio de la escalera");
                            posicion = posicion + 2;
                        }

                        //Serpientes ----------------------------------------------------
                        if (posicion == 14) {
                            System.out.println("Jugador avanza a cuadro " + (posicion));
                            posicion = posicion - 10;
                            System.out.println("Jugador desciende al cuadro " + (posicion) + " por medio de la serpiente");
                        }

                        if (posicion == 19) {
                            System.out.println("Jugador avanza a cuadro " + (posicion));
                            posicion = posicion - 11;
                            System.out.println("Jugador desciende al cuadro " + (posicion) + " por medio de la serpiente");
                        }

                        if (posicion == 22) {
                            System.out.println("Jugador avanza a cuadro " + (posicion));
                            posicion = posicion - 2;
                            System.out.println("Jugador desciende al cuadro " + (posicion) + " por medio de la serpiente");
                        }

                        if (posicion == 24) {
                            System.out.println("Jugador avanza a cuadro " + (posicion));
                            posicion = posicion - 8;
                            System.out.println("Jugador desciende al cuadro " + (posicion) + " por medio de la serpiente");
                        }

                        if (posicion > 25) {
                            System.out.println("Sacaste " + posicion + ". Se sobrepasó de la casilla 25. Tire el dado de nuevo");
                            posicion = posicion - random;
                        }
                    }
                }

                System.out.println();
            } else {
                System.out.println("Te esperamos a que vuelvas, gracias por jugar");
            }

            if (posicion == 25) {
                System.out.println("Ganaste, gracias por jugar");
                lanzar = 0;
            }

        }

    }
}