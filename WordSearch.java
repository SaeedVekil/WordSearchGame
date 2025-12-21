public class WordSearch {
    
    public boolean exist(char[][] board, String word) {
        int m = board.length; // the number of m (rows)
        int n = board[0].length; // the number of n (columns)
        
        // Iterate through each cell in the grid
        for (int i = 0; i < m; i++) { // current row index(0 to m-1)m-1 means last index
            for (int j = 0; j < n; j++) {
                // If the first character matches and DFS finds the word, return true
                if (board[i][j] == word.charAt(0) && dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean dfs(char[][] board, String word, int i, int j, int index) {
        // If we've found all characters in the word
        if (index == word.length()) {
            return true;
        }
        
        // Check boundaries and character match
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || 
            board[i][j] != word.charAt(index)) {
            return false;
        }
        
        // Mark the current cell as visited by changing its value temporarily
        char temp = board[i][j];
        board[i][j] = '#';  // Mark as visited
        
        // Explore all four directions
        boolean found = dfs(board, word, i + 1, j, index + 1) ||  // down // row from top to down
                       dfs(board, word, i - 1, j, index + 1) ||  // up // from last row to the first row
                       dfs(board, word, i, j + 1, index + 1) ||  // right // from the first top column to the last down column
                       dfs(board, word, i, j - 1, index + 1);    // left // from the last bottom column to the first top column
        
        // Restore the original character (backtrack)
        board[i][j] = temp;
        
        return found;
    }
    
    // Main method with test cases
    public static void main(String[] args) {
        WordSearch solution = new WordSearch();
        
        // Test case 1: The example from the problem
        char[][] board1 = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };
        String word1 = "ABCCED";
        System.out.println("Board 1:");
        printBoard(board1);
        System.out.println("Word: " + word1);
        System.out.println("Exists: " + solution.exist(board1, word1));
        System.out.println();
        
        // Test case 2: Another word from the same board
        char[][] board2 = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };
        String word2 = "SEE";
        System.out.println("Board 2:");
        printBoard(board2);
        System.out.println("Word: " + word2);
        System.out.println("Exists: " + solution.exist(board2, word2));
        System.out.println();
        
        // Test case 3: Word that doesn't exist
        char[][] board3 = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };
        String word3 = "ABCB";
        System.out.println("Board 3:");
        printBoard(board3);
        System.out.println("Word: " + word3);
        System.out.println("Exists: " + solution.exist(board3, word3));
        System.out.println();
        
        // Test case 4: Single character board
        char[][] board4 = {
            {'A'}
        };
        String word4 = "A";
        System.out.println("Board 4:");
        printBoard(board4);
        System.out.println("Word: " + word4);
        System.out.println("Exists: " + solution.exist(board4, word4));
    }
    
    // Helper method to print the board
    private static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}