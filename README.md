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
- Example path: C(0,2) → F(1,2) → I(2,2) then backtracks
### Approach 3: Backtracking
- Oops, wrong path! Let me undo and try another way
- Uses # to mark visited cells
- Removes # when going back
- Like leaving breadcrumbs and picking them up
