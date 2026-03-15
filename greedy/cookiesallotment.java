public class cookiesallotment {
    
}
A group of children in a school cafeteria are waiting for cookies.
Each child has a greed factor, which represents the minimum size of a cookie 
that can satisfy them.
The cafeteria has a batch of cookies, each with a certain size.
A child can only be given one cookie, and a cookie cannot be split or shared 
between children.

Your task is to determine the maximum number of children that can be satisfied 
with the available cookies.

Input Format:
-------------
Line-1: An integer n, the number of children.
Line-2: n space-separated integers representing the greed factors of the children.
Line-3: An integer m, the number of cookies.
Line-4: m space-separated integers representing the sizes of the cookies.

Output Format:
--------------
Line-1: An integer, the maximum number of children that can be satisfied.

Constraints
------------
1 ≤ n, m ≤ 3 * 10^4
1 ≤ greed factor, cookie size ≤ 10^4

Sample Input-1:
---------------
2
1 2
3
1 2 3


Sample Output-1:
----------------
2

Explanation:
------------
The child with greed factor 1 gets a cookie of size 1.
The child with greed factor 2 gets a cookie of size 2 or 3.
Both children are satisfied.

Sample Input-2:
---------------
2
1 2
1
1


Sample Output-2:
----------------
1

Explanation:
------------
Only one cookie is available, so at most one child can be satisfied.

