You’re helping an e-commerce team design the largest possible storefront number 
for a daily promotion. You’re given a list of non-negative product IDs (integers). 

You may reorder these IDs in any way and concatenate them (as strings) to form 
one big number. 

Your goal is to arrange them so that the resulting concatenation is numerically 
the largest.

Input Format:
--------------
Line-1: An integer n — the number of IDs.
Line-2: n space-separated non-negative integers a1 a2 ... an.

Output Format:
--------------
A single line containing the largest possible number as a string 
(no leading spaces, no extra characters).

Constraints:
------------
1 ≤ n ≤ 10^4
0 ≤ ai ≤ 10^9
At least one element is present.
The output can be very large; print as a string (do not convert to numeric types that may overflow).


Sample Input-1:
---------------
2
10 2

Sample Output-1:
----------------
210

Explanation: 
------------
"2" + "10" = "210" is larger than "10" + "2" = "102".


Sample Output-2:
----------------
5
3 30 34 5 9

Sample Output-2:
----------------
9534330

Explanation: 
------------
Ordering by concatenation preference yields 9, 5, 34, 3, 30 → "9534330".


