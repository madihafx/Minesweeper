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

		//counter for how many bombs our tile is touching !!!unreviewed!!!
		for (i = 0; i < 5; i++) {
			for j = 0; j<5; j++) {
				if (matrix[i][j] != valueOfBomb) {
					int thenumber = 0;
					for (int row = Math.max(1,i-1); row <= Math.max(i+1); row++) {
						for (int column = Math.max(1,j-1); column <= Math.max(j+1); column++) {
							if ([row][column] == valueOfBomb) {
								thenumber++
						}
					}
							thenumber = matrix[row][column]; 
				}
			}
		}
		
		//Printing the board
		int i = 0;
		int j = 0;
		
		for (i = 0; i < 5; i++) {
			for(j = 0; j < 5; j++) {
			
			System.out.print(matrix [i][j] + " ");
			}
		//new line for each row	
		System.out.println();
		}

		
	}
}
