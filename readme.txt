Author: COS30019
Sample code base for the N-Puzzle (or, NxN-Puzzle) problem

Features/Bugs/Missing
-===================-
USAGE:
	nPuzzler.bat <file> <method>

nPuzzler takes two arguments.
The first refers to a text file which contains one or more n-puzzles.
The second refers to the method that you want to use to solve the puzzle(s) in the above file. See Search Table for a list of valid methods.

Search Table
Parameter	|Method Name
----------------+----------
BFS			|Breadth-first Search
GBFS		|Greedy Best-first Search


Known Bugs:
 - Error handling is limited, invalid arguments and incorrect puzzle files will cause the program to crash
 - Cannot handle any puzzle larger than an 80-puzzle. This is because coordinates can only be single digit and a 99 puzzle has 10 rows and columns.

Known limitations:
  - It is very slow. Can you improve it?
