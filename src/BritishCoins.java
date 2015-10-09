/*
// 
 * SRM 232 DIV II * 

 * Problem 250 points * 

Prior to 1971, Britain used a system of coins that can be traced back to the time of Charlemagne.
The three main units of coinage were the penny, the shilling, and the pound.

There were 12 pennies in a shilling and 20 shillings in a pound.

Given a number pence of pennies, convert this amount into pounds, shillings, 
and pennies by first converting as many pennies as possible into pounds, 
and then converting as many of the remaining pennies as possible into shillings.


Return a int[] of size three containing the number of pounds,
the number of shillings, and the number of pennies, in that order. 


DEFINITION
Class:BritishCoins
Method:coins
Parameters:int
Returns:int[]
Method signature:int[] coins(int pence)


CONSTRAINTS
-pence is between 0 and 10000, inclusive.


EXAMPLES

0)
533

Returns: { 2,
  4,
  5 }

First, we make 2 pounds, leaving 53 pence.  Then, we make 4 shillings, leaving 5 pence.

1)
0

Returns: { 0,
  0,
  0 }

2)
6

Returns: { 0,
  0,
  6 }

3)
4091

Returns: { 17,
  0,
  11 }

4)
10000

Returns: { 41,
  13,
  4 }

*/

public class BritishCoins {
	
	public int[] coins(int pence) {
		int [] res = {0, 0, 0};
		
		res[0] = pence/240;
		res[1] = (pence%240) / 12;
		res[2] = (pence%12);
	
		return res;
	}
	
	/*
	public static void main(String[] args) {
		BritishCoins bc = new BritishCoins();
		
		int [] res = bc.coins(10000);
	
		System.out.println(res[0] + "," + res[1] + "," + res[2]);
	}
	*/
}

