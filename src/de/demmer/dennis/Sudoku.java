package de.demmer.dennis;

import java.util.Arrays;

public class Sudoku {

	public boolean isValid(int[][] grid) {

//		Jede Reihe 1-9 
//		Wenn nicht: 
//		return false;
		for (int i = 0; i < 9; i++) {
			if (!is1To9(grid[i])) {
				return false;
			}
		}

//		Jede Zeile 1-9
//		Wenn nicht: 
//		return false;

		for (int i = 0; i < 9; i++) {
			int[] column = new int[9];

			for (int j = 0; j < 9; j++) {
				column[j] = grid[j][i];
			}

			if (!is1To9(column)) {
				return false;
			}
		}

//		Jede 3x3 box die Zahlen 1 bis 9
//		Wenn nicht: 
//		return false;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				int k = 0;
				int[] list = new int[9];

				for (int row = i * 3; row < i * 3 + 3; row++) {
					for (int column = j * 3; column < j * 3 + 3; column++) {
						list[k++] = grid[row][column];
					}
				}

				if (!is1To9(list)) {
					return false;
				}
			}
		}

		return true;
	}

	private boolean is1To9(int[] list) {
//		Mit Arrays.equals und arraycopy:
//		
//		int[] temp = new int[list.length];
//		System.arraycopy(list, 0, temp, 0, list.length);
//		Arrays.sort(temp);
//		return Arrays.equals(temp, new int[] {1,2,3,4,5,6,7,8,9});

// 		Ohne Arrays.equals und arraycopy:
		int[] temp = new int[9];
		for (int i = 0; i < 9; i++) {
			temp[i] = list[i];
		}

		Arrays.sort(temp);

		for (int i = 0; i < 9; i++) {
			if (temp[i] != i + 1) {
				return false;
			}
		}

		return true;
	}
}
