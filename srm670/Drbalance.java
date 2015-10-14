package srm670;
/*
 * SRM 670 Div II
 * Oct 10, 2015
 * 
// PROBLEM STATEMENT

// A plus/minus string is a string in which each character is either a '+' or a '-'.

The balance of a plus/minus string is computed as the number of '+' characters
minus the number of '-' characters.

For example, the balance of the string "++-+" is 3-1 = 2,
and the balance of the string "---" is 0-3 = -3.

The prefix of a string S is any string that can be obtained
by removing some (possibly none, possibly all) characters from the end of S.

For example, the prefixes of the string "++-+" are the strings "++-+", "++-", "++", "+", and "".

Given a plus/minus string,
its negativity is the number of its prefixes that have a negative balance.

For example, the negativity of the string "++-+" is 0,
as none of its prefixes have a negative balance.

The negativity of the string "---" is 3.
Its three prefixes with a negative balance are "-", "--", and "---".

You are given a String s that is a plus/minus string.
You are also given an int k.
Your goal is to change s into a string with negativity at most k.

In other words, you want to change s into a string
that has at most k prefixes that have a negative balance.

In order to change s you are going to perform a sequence of zero or more steps.
In each step you can change a single '-' character in s into a '+' or vice versa.
Compute and return the smallest number of steps needed.

DEFINITION

Class:Drbalance
Method:lesscng
Parameters:String, int
Returns:int
Method signature:int lesscng(String s, int k)


CONSTRAINTS
-s will contain between 1 and 50 characters, inclusive.
-k will be between 0 and the length of s, inclusive.
-Each character in s will be either '+' or '-'.


EXAMPLES

0)
"---"
1

Returns: 1

One step is sufficient.
If we change character 0 of s into a '+', we will obtain the string "+--".
This string has only one prefix with a negative balance - namely, the entire string "+--".
As k=1, we have reached our goal.


1)
"+-+-"
0

Returns: 0



2)
"-+-+---"
2

Returns: 1



3)
"-------++"
3

Returns: 3



4)
"-+--+--+--++++----+"
3

Returns: 2



*/


//import org.junit.Test;
//import static org.junit.Assert.*;


public class Drbalance {

	public int lesscng(String s, int k) {
		int [] nega = new int[s.length()];
		nega[0] = s.charAt(0) == '-' ? -1 : 1;
		
		for (int i=1; i < s.length(); ++i) {
			nega[i] = nega[i-1] + (s.charAt(i) == '+' ? 1 : -1);
		}
		
		int increment = 0;
		int negaCount = 0;
		
		while (true) {
			negaCount = 0;
			
			for (int n : nega) {
				if (n + increment < 0) {
					negaCount ++;
				}
			}
			
			if (negaCount <= k) {
				break;
			} else {
				increment += 2;
			}
		}
		
		return (increment / 2);
	}

	
	/*
	@Test
	public void testCase_3() {
		Drbalance db = new Drbalance();
		String s = "-------++";
		int k = 3;

		assertEquals(db.lesscng(s, k), 3);
	}
	
	
	@Test
	public void testCase_4() {
		Drbalance db = new Drbalance();
		String s = "-+--+--+--++++----+";
		int k = 3;
		
		assertEquals(db.lesscng(s, k), 2);
	}
	
	public static void main(String[] args) {
		Drbalance db = new Drbalance();
		String s = "+-+-";
		int k = 0;
		
		db.lesscng(s, k);
	}
	*/
}
