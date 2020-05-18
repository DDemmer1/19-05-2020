package de.demmer.dennis;


public class Application {

	public static void main(String[] args) {
		int[][] grid = new int[9][9];
		
		grid[0]= new int[]{9, 6, 3, 1, 7, 4, 2, 5, 8};
		grid[1]= new int[]{1, 7, 8, 3, 2, 5, 6, 4, 9};
		grid[2]= new int[]{2, 5, 4, 6, 8, 9, 7, 3, 1};
		grid[3]= new int[]{8, 2, 1, 4, 3, 7, 5, 9, 6};
		grid[4]= new int[]{4, 9, 6, 8, 5, 2, 3, 1, 7};
		grid[5]= new int[]{7, 3, 5, 9, 6, 1, 8, 2, 4};
		grid[6]= new int[]{5, 8, 9, 7, 1, 3, 4, 6, 2};
		grid[7]= new int[]{3, 1, 7, 2, 4, 6, 9, 8, 5};
		grid[8]= new int[]{6, 4, 2, 5, 9, 8, 1, 7, 3};
		
		
		Sudoku sudoku = new Sudoku();
		if(sudoku.isValid(grid)) {
			System.out.println("Das Sudoku ist gelöst!");
		} else {
			System.out.println("Das Sudoku ist nicht gelöst!");

		}
		
	
	}

}
