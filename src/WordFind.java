import org.junit.Test;


/*
// PROBLEM STATEMENT
 * 
 * 500 Points
 * 
 * 

You have been given a "word search" puzzle, which consists of a rectangular grid
of letters, in which several words are hidden.

Each word may begin anywhere in the puzzle, 
and may be oriented in any straight line horizontally, vertically, or diagonally.

However, the words must all go down, right, or down-right.  (see examples)

You are given a String[], grid, indicating the letters in the grid to be searched.
Character j of element i of grid is the letter at row i, column j.

You are also given a String[], wordList, indicating the words to be found in the grid.
You are to return a String[] indicating the locations of each word within the grid.

The return value should have the same number of elements as wordList. 
Each element of wordList corresponds to the element of the return value with the same index.

Each element of the return value should be formatted as "row col" (quotes added for clarity),
where row is the 0-based row in which the first letter of the word is found,
and col is the 0-based column in which the first letter of the word is found.

If the same word can be found more than once, 
the location in the lowest-indexed row should be returned.
If there is still a tie, return the location with the lowest-indexed column.
If a word cannot be found in the grid, return an empty string for that element.



DEFINITION
Class:WordFind
Method:findWords
Parameters:String[], String[]
Returns:String[]
Method signature:String[] findWords(String[] grid, String[] wordList)


CONSTRAINTS
-grid will contain between 1 and 50 elements, inclusive.
-Each element of grid will contain between 1 and 50 characters, inclusive.
-Each element of grid will contain the same number of characters.
-Each character of each element of grid will be 'A'-'Z'.
-wordList will contain between 1 and 50 elements, inclusive.
-Each element of wordList will contain between 1 and 50 characters, inclusive.
-Each character of each element of wordList will be 'A'-'Z'.


EXAMPLES

0)
{"TEST",
 "GOAT",
 "BOAT"}
{"GOAT", "BOAT", "TEST"}

Returns: { "1 0",
  "2 0",
  "0 0" }

These words are pretty easy to find.

1)
{"SXXX",
 "XQXM",
 "XXLA",
 "XXXR"}
{"SQL", "RAM"}

Returns: { "0 0",
  "" }

While "RAM" may be found going up at "3 3", we are only allowing words that go down and right.

2)
{"EASYTOFINDEAGSRVHOTCJYG",
 "FLVENKDHCESOXXXXFAGJKEO",
 "YHEDYNAIRQGIZECGXQLKDBI",
 "DEIJFKABAQSIHSNDLOMYJIN",
 "CKXINIMMNGRNSNRGIWQLWOG",
 "VOFQDROQGCWDKOUYRAFUCDO",
 "PFLXWTYKOITSURQJGEGSPGG"}

{"EASYTOFIND", "DIAG", "GOING", "THISISTOOLONGTOFITINTHISPUZZLE"}

Returns: { "0 0",
  "1 6",
  "0 22",
  "" }

*/


public class WordFind {

	protected boolean canReach(String [] grid, int row, int col,
							   String word, int charIndex) {
		
		if (charIndex == word.length()) {
			return true;	
		}
		
		int i = row;
		int index = -1;
		char charToFind = word.charAt(charIndex);
		
		// TODO: 
		return false;
	}
	
	
	public String[] findWords(String[] grid, String[] wordList) {
		String [] res = new String[wordList.length];
		
		for (int i=0; i<wordList.length; ++i) {
			String word = wordList[i];
			char initial = word.charAt(0);
			
			int row = 0;
			for (; row < grid.length; ++ row) {
				int index = grid[row].indexOf(initial);
				
				if(index != -1) {
					if(canReach(grid, row, index, word, 1)){
						res[i] = row + " " + index;
						break;
					}
				}
			}
			
			// Did not find the match.
			if (row == grid.length)
				res[i] = "";
		}

		return res;
	}

	
	@Test
	public void testCase_1() {
		WordFind wf = new WordFind();
		String [] grid = {"TEST",
						  "GOAT",
						  "BOAT"};
		
		String [] wordList = {"GOAT", "BOAT", "TEST"};

		// Should return : { "1 0", "2 0", "0 0" }
		Utils.printStringArray(wf.findWords(grid, wordList));	
	}
	
	@Test
	public void testCase_2() {
		WordFind wf = new WordFind();
		String [] grid = {"SXXX",
						  "XQXM",
						  "XXLA",
						  "XXXR"};
		
		String [] wordList = {"SQL", "RAM"};

		// Should returns: { "0 0",  "" }
		Utils.printStringArray(wf.findWords(grid, wordList));
	}
	
	@Test
	public void testCase_3() {
		WordFind wf = new WordFind();
		String [] grid = {"EASYTOFINDEAGSRVHOTCJYG",
						  "FLVENKDHCESOXXXXFAGJKEO",
						  "YHEDYNAIRQGIZECGXQLKDBI",
						  "DEIJFKABAQSIHSNDLOMYJIN",
						  "CKXINIMMNGRNSNRGIWQLWOG",
						  "VOFQDROQGCWDKOUYRAFUCDO",
						  "PFLXWTYKOITSURQJGEGSPGG"};

		String [] wordList =
			{"EASYTOFIND", "DIAG", "GOING", "THISISTOOLONGTOFITINTHISPUZZLE"};

		// Should returns: { "0 0", "1 6", "0 22", "" }
		Utils.printStringArray(wf.findWords(grid, wordList));
	}
		
	public static void main(String[] args) {
	}
	
}
