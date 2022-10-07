package Lec10;


public class WordSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };

		String woard = "SEE";
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == woard.charAt(0)) {
					boolean ans = WordSearch(board, i, j, woard, 0);
					if (ans) {
						System.out.println(ans);
						return;
					}
				}

			}
		}

	}

	private static boolean WordSearch(char[][] board, int cr, int cc, String woard, int idx) {
		// TODO Auto-generated method stub
		if (idx == woard.length()) {
			return true;
		}

		if (cr < 0 || cc < 0 || cr >= board.length || cc >= board[0].length || board[cr][cc] != woard.charAt(idx)) {
			return false;
		}

		board[cr][cc] = '*';
		int[] r = { -1, 1, 0, 0 };
		int[] c = { 0, 0, -1, 1 };

		for (int i = 0; i < c.length; i++) {
			boolean ans = WordSearch(board, cr + r[i], cc + c[i], woard, idx + 1);
			if (ans) {
				return ans;
			}

		}
//		boolean a1 = WordSearch(board, cr - 1, cc, woard, idx + 1);
//		boolean a2 = WordSearch(board, cr + 1, cc, woard, idx + 1);
//		boolean a3 = WordSearch(board, cr, cc - 1, woard, idx + 1);
//		boolean a4 = WordSearch(board, cr, cc + 1, woard, idx + 1);

		board[cr][cc] = woard.charAt(idx);
		return false;

	}

}
