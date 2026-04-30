// Madiha, Hana, Laura, and Samia
// Intro to CS Final Project
// Minesweeper in Java
// Spring 2026

import java.util.Random;

public class Minesweeper{
    public static void main (String[] args){
    	int [][] matrix = new int [5][5];
		
		int valueOfBomb = 9;
		int numberOfBombs = 5;
		Random rand = new Random();
		
		//Placing bombs in random spots
		int placedBombs = 0;
		while (placedBombs < numberOfBombs) {
			int r = rand.nextInt(5);
			int c = rand.nextInt(5);
			
			//Only place a bomb if there isn't one there already
			if (matrix[r][c] != valueOfBomb) {
				matrix[r][c] = valueOfBomb;
				placedBombs ++ ;
			}
		}
int i = 0; int j = 0; int row = 0; int column = 0;
		//counter for how many bombs our tile is touching!!!
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				if (matrix[i][j] != valueOfBomb) {
					int thenumber = 0;
					for (row = Math.max(0,i-1); row <= Math.min(4, i+1); row++) {
						for (column = Math.max(0,j-1); column <= Math.min(4, j+1); column++) {
							if (matrix[row][column] == valueOfBomb) {
								thenumber++;
							}
						}			
					}
					matrix[i][j] = thenumber;
				}
			}
		}
		//Printing the board
		int k = 0;
		int l = 0;
		
		for (k = 0; k < 5; k++) {
			for(l = 0; l < 5; l++) {
			
			System.out.print(matrix [k][l] + " ");
			}
		//new line for each row	
		System.out.println();
			}
    }
}
