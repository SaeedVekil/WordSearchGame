# Word Search Game
### A Java implementation of the classic Word Search puzzle game where you can determine if a given word exists in a 2D grid of characters. The word can be constructed from sequentially adjacent cells (horizontally or vertically, not diagonally), and each cell may only be used once.

## Three Key Approaches In One Algorithm
### Approach 1: Brute Force Starting Points: 
- Let me check EVERY starting position
- Looks at all 9 cells in a 3×3 grid
- Only proceeds if first letter matches
### Approach 2: Depth-First Search (DFS)
- Let me go as deep as possible before backing up
- Follows one path to the end
- Example path: S(1,3) → E(2,3) → E(2,2) then backtracks
- The 3X3 Board: A B C E
-                S F C S
-                A D E E
### Approach 3: Backtracking
- Oops, wrong path! Let me undo and try another way
- Uses # to mark visited cells
- Removes # when going back
- Like leaving breadcrumbs and picking them up

## Time Complexity
- Time: Exponential O(M × N × 4ᴸ)
## Space Complexity
- Linear O(L)
