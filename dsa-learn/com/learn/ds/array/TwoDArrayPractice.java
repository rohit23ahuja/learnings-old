package com.learn.ds.array;

import java.util.HashSet;
import java.util.Set;

public class TwoDArrayPractice {
	static Set<String> set = new HashSet<String>();

	static void makeSet() {
//		set.add("GEEKS");
//		set.add("FOR");
//		set.add("QUIZ");
//		set.add("GO");
		set.add("GOI");
	}

	public static void main(String[] args) {
		makeSet();
	//	char[][] boggle = { { 'G', 'I', 'Z' }, { 'U', 'E', 'K' }, { 'Q', 'S', 'E' } };
		char[][] boggle = { { 'G', 'I' }, { 'U', 'O' } };
		System.out.println("Boggle :");
		printMatrix(boggle);
		System.out.println("\nWords:");
		printWords(boggle);
	}

	private static void printWords(char[][] boggle) {
		int M = boggle.length;
		int N = boggle[0].length;
		boolean[][] visited = new boolean[M][N];
		String str = "";
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				DFSUtil(boggle, visited, i, j, str);
			}
		}
	}

	private static void DFSUtil(char[][] boggle, boolean[][] visited, int i, int j, String str) {
		visited[i][j] = true;
		str += boggle[i][j];
		//str.concat(String.valueOf(boggle[i][j]));
		if (isValidWord(str)) {
			System.out.println(str);
		}
		for (int row = i-1; row <= i+1 && row<boggle.length; row++) {
			for (int col = j-1; col <= j+1 && col<boggle[0].length; col++) {
				if(row>=0&&col>=0&&!visited[row][col]) {
					DFSUtil(boggle, visited, row, col, str);
				}
			}
		}
		String temp = str.substring(0, str.length()-1);
		str=temp;
		visited[i][j]=false;
	}

	private static boolean isValidWord(String str) {
		return set.contains(str);
	}

	public static void printMatrix(char[][] boggle) {
		for (int i = 0; i < boggle.length; i++) {
			for (int j = 0; j < boggle.length; j++) {
				System.out.print(boggle[i][j] + "\t");
			}
			System.out.println();
		}
	}

	// print all words present in dictionary
	private static void findWords(char[][] boggle, String[] dictionary) {
		// mark all characters as not visited
		boolean visited[][] = { { false, false, false }, { false, false, false }, { false, false, false } };

		// initialize current string
		String str = " ";
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				findWordsUtil(boggle, visited, i, j, str, dictionary);
			}
		}

	}

	// A recursive function to print all words present on boggle
	private static void findWordsUtil(char[][] boggle, boolean[][] visited, int i, int j, String str,
			String[] dictionary) {
		System.out.println("i: " + i + ", j:");
		// mark current cell as visited and append current character to str
		visited[i][j] = true;
		str = str + boggle[i][j];
		System.out.println("str : " + str);

		// if str is present in dictionary print it
		if (isWord(str, dictionary))
			System.out.println(str);

		// Traverse 8 adjacent cells of boggle[i][j]
		for (int row = i - 1; row <= i + 1 && row < 3; row++) {
			for (int col = j - 1; col <= j + 1 && col < 3; col++) {
				if (row >= 0 && col >= 0 && !visited[row][col]) {
					System.out.println("{row: " + row + ", col: " + col + "}");
					findWordsUtil(boggle, visited, i, j, str, dictionary);
				}
			}
		}

		// Erase current character from string and mark visited of current cell
		// as false
		str = str.substring(0, str.length() - 1);
		visited[i][j] = false;

	}

	// A given function to check if a given string is present in dictionary.
	// The implmentation is naive for simplicity. As per the question dictionary
	// is directly given to us.
	private static boolean isWord(String str, String[] dictionary) {
		// Linearly search all words
		for (int i = 0; i < dictionary.length; i++) {
			if (str.compareTo(dictionary[i]) == 0)
				return true;
		}
		return false;
	}

}
