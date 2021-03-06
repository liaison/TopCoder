package srm670;
/*
 * SRM 670 Div II
 * Oct 10, 2015
 * 
 * 
// PROBLEM STATEMENT

// Two players are playing a game with some tokens on a tree.
Player A has one or more red tokens.
Player B has one or more blue tokens.

Initially, each vertex of the tree is either empty or contains exactly one token
(either a red one or a blue one, not both).

During the game there can be arbitrarily many tokens of each color in each vertex.

You are given the description of the initial state of the game.
More precisely, you are given the int[]s tree, A, and B.

The length of tree is n-1, where n is the number of vertices in the tree.
The vertices in the tree are numbered 0 through n-1.

For each i between 1 and n-1, inclusive,
there is an edge between the vertices i and tree[i-1].

The elements of A are the numbers of vertices that initially contain player A's tokens.
The elements of B are the vertices with player B's tokens.

The game is played in rounds.
Each round consists of two phases.
In the first phase player A may move some of his tokens, 
and in the second phase player B may move some of her tokens.

More precisely, the current player always examines all of their tokens, 
and for each of them the player either decides to keep it in its current vertex, 
or decides to move it to one of the adjacent vertices.

Player B wins if after some round there is a vertex that contains both a red and a blue token.
(There can even be multiple red or blue tokens in that vertex.)

Player B wants to win in as few rounds as possible.

Player A wants the game to go for as many rounds as possible.
Assume that both players play the game optimally.
Compute and return the number of rounds the game will take.

Note that it can be shown that the answer is always finite: 
player B always has a winning strategy.

Also note that you are supposed to return the number of rounds,
not the total number of phases.


DEFINITION
Class:Treestrat
Method:roundcnt
Parameters:int[], int[], int[]
Returns:int
Method signature:int roundcnt(int[] tree, int[] A, int[] B)


CONSTRAINTS
-tree will contain n - 1 element.
-n will be between 2 and 50, inclusive.
-i-th elements in tree will be between 0 and i, inclusive.
-A will contain between 1 and 50 elements, inclusive.
-B will contain between 1 and 50 elements, inclusive.
-Each element in A and B will be between 0 and n - 1, inclusive.
-No element will occur more than once in the concatenation of A and B.


EXAMPLES

0)
{0}
{0}
{1}

Returns: 1

This is a tree with a single edge 0-1.
Initially there is a red token in vertex 0 and a blue token in vertex 1.

Regardless of where player A moves the red token, 
player B can move the blue token to the same vertex and win.

1)
{0,1}
{1}
{2}

Returns: 2

This tree is a line that consists of two edges: 0-1 and 1-2.
We start with a red token on vertex 1 and a blue token on vertex 2.
Player A's optimal strategy is to start by moving his token into vertex 0.
Player B will then move her token into vertex 1.
In the second round player B will then win the game in the same way as in Example 0.

2)
{0,0,0,3,4}
{2}
{1}

Returns: 2



3)
{0,0,0,3,4,2}
{1}
{6}

Returns: 5



4)
{0,0,0,3,4,2}
{1}
{6,5}

Returns: 3



5)
{0,0,0,3,4,2}
{4,1}
{3,6}

Returns: 2



*/

public class Treestrat {

	// TODO:
	public int roundcnt(int[] tree, int[] A, int[] B) {
	
		return 0;
	}

	public static void main(String[] args) {
		Treestrat temp = new Treestrat();
	}
}
