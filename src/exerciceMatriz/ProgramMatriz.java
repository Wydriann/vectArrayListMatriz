package exerciceMatriz;

import java.util.Scanner;

public class ProgramMatriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();

		int n = sc.nextInt();

		int[][] mat = new int[m][n];

		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {

				mat[i][j] = sc.nextInt();

			}

		}

		int x = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {

				if (mat[i][j] == x) {
																	   	//  i , j	i , j		i , j
					System.out.println("Position " + i + "," + j + ":"); // 0 , 1 	1 , 3		2 , 3

					if (j > 0) {

						System.out.println("Left: " + mat[i][j - 1]);

					}

					if (i > 0) {

						System.out.println("Up: " + mat[i - 1][j]);

					}

					if (j < mat[i].length - 1) { // Verifica se a quantidade de colunas ultrapassa a quatidade de caracters existente na linha

						System.out.println("Right: " + mat[i][j + 1]);

					}

					if (i < mat.length - 1) { // Verifica se a quatidades de linhas ultrapassam a quantidade de caracters dentro da coluna 

						System.out.println("Down: " + mat[i + 1][j]); 

					}

				}

			}

		}
		
		System.out.println();
		System.out.println();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}