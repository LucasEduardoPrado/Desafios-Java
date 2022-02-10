import java.io.IOException;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        double soma = 0;

        char O = scan.next().toUpperCase().charAt(0);

        double[][] M = new double[12][12];

        // M é a matriz.

        for (int i = 0; i < M.length; i++) {

            for (int j = 0; j < M[i].length; j++) {

                M[i][j] = scan.nextDouble();

            }

        }

        // Matriz alimentada.

        for (int i = 0; i < M.length; i++) {

            for (int j = 0; j < M[i].length; j++) {

                if (j > i) {

                    soma += M[i][j];

                }

            }

        }


        if (O == 'S') {

            System.out.println(soma);

        }

        if (O == 'M') {

            soma /= ((M.length * M.length) - 12) / 2;

            System.out.println(String.format("%.1f", soma));

        }

    }
    

}
