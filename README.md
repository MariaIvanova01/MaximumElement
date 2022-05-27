# MaximumElement

You have an empty sequence, and you will be given N commands. Each command is one of the following types:

•	"1 X" - Push the element X into the stack.

•	"2" - Delete the element present at the top of the stack.

•	"3" - Print the maximum element in the stack.

Input
-----

•	The first line of input contains an integer N, where 1 ≤ N ≤ 105.

•	The next N lines contain commands. All commands will be valid and in the format described.

•	The element X will be in the range 1 ≤ X ≤ 109.

•	The type of the command will be in the range 1 ≤ Type ≤ 3.

Output
-------

•	For each command of type "3", print the maximum element in the stack on a new line.

Examples
---------

Input	| Output |	Comments
-----|---------|----------|
9 | 26  | 9 commands
1 97 | 91 |Push 97
2 | |Pop an element
1 20 | | Push 20
2| | Pop an element
1 26 | | Push 26
1 20 | | Push 20
3 | | Print the maximum element (26)
1 91 | | Push 91
3 | | Print the maximum element (91)
