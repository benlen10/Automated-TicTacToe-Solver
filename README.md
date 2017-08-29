# Automated Tic-Tac-Toe Solver

NOTICE: This project was recently moved to its own repository. It was originally developed in the ‘Current’ repository (Now renamed to [UniCade](https://github.com/benlen10/UniCade)) which contains the previous commits and versions.  

# Project Description
- This Java class contains several methods designed to solve and validate a traditional 3x3 tic-tac-toe game

- This code was originally developed as a school project at Purdue University.

# Basic Usage
- This repository only contains the 'TicTacToe' class. You will need to create an instance of this class and call the appropriate methods 
- Launch the program with 
# Supported Arguments
-	The first argument must either by ‘Y’ or ‘N’. ‘Y’ will print each state and ‘N’ will not. 
-	You can also supply additional char arguments (‘x’ or ‘o’) to add pieces to the board. 
-	Example:  ./TicTacToe Y x x o x

# Supported Methods
-	boolean AddPieceToInitialBoard(char piece)
-	boolean WinningState(char[][] state, boolean player)
-	int TreeSearch(boolean player,TreeNode n ,int alpha, int beta)
-	void PrintState(TreeNode n, int alpha, int beta)


