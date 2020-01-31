package restMatriz;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.print("Escreva o tamanho da matriz: ");
		int num = input.nextInt();
		
		int [][] mat = new int[num][num];
		
		for (int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = input.nextInt();
			}
		}
		
		System.out.print("Valores da linha principal diagonal: ");
		
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		int count = 0; 
		System.out.println();
	
		for (int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] < 0) {
					
				count++;
				
				}
			}
		}
		
		System.out.println("Quantidade de valor negativos na matriz: " + count);
		input.close();
	}

}
