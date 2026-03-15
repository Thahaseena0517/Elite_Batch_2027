 package Tree_Traversal;
/*
1.Given a root of a binary tree, perform depth first search (Pre-order traversal) 
of the tree and display the result. 

Note: Use Recursive approach.

Note: A Binary tree data structure is built from the user input and the root 
node is provided, you just need to implement the dfsTreePreOrderRecursive()
An array element having value -1 represents NULL.

case=1
input=7
3 9 20 -1 -1 15 7
output=[3, 9, 20, 15, 7]

case=2
input=9
2 -1 3 -1 4 -1 5 -1 6
output=[2, 3, 4, 5, 6]
*/




// import java.util.*;
// class Node
// {
//     int data;
//     Node left, right;
//     Node(int data)
//     {
//         this.data = data;
//     }
// }
// class BinaryTree
// {
//     Node buildTree(int[] arr)
//     {
//         if (arr.length == 0 || arr[0] == -1)
//             return null;
//         Node root = new Node(arr[0]);
//         Queue<Node> queue = new LinkedList<>();
//         queue.add(root);
//         int i = 1; 
//         while (!queue.isEmpty() && i < arr.length)
//         {
//             Node current = queue.poll();

//             if (i < arr.length && arr[i] != -1)
//             {
//                 current.left = new Node(arr[i]);
//                 queue.add(current.left);
//             }
//             i++;
//             if (i < arr.length && arr[i] != -1)
//             {
//                 current.right = new Node(arr[i]);
//                 queue.add(current.right);
//             }
//             i++;
//         }
//         return root;
//     }
// }
// class test
// {
//     void dfsTreePreOrderRecursive(Node root, List<Integer> res)
//     {
//         if (root==null) return;
        
//         res.add(root.data);
//         dfsTreePreOrderRecursive(root.left, res);
//         dfsTreePreOrderRecursive(root.right, res);
        
//     }
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0; i < n; i++)
//         {
//             arr[i] = sc.nextInt();
//         }
//         sc.close();

//         BinaryTree tree = new BinaryTree();
//         Node root = tree.buildTree(arr);

//         List<Integer> res = new ArrayList<>();
//         new test().dfsTreePreOrderRecursive(root, res);
//         System.out.println(res);
//     }
// }
















/*
Given a root of a binary tree, perform depth first search (Pre-order traversal) 
of the tree and display the result. 

Note: Use Iterative approach.

Note: A Binary tree data structure is built from the user input and the root 
node is provided, you just need to implement the dfsTreePreOrderIterative ()
An array element having value -1 represents NULL.

case=1
input=7
3 9 20 -1 -1 15 7
output=[3, 9, 20, 15, 7]

case=2
input=9
2 -1 3 -1 4 -1 5 -1 6
output=[2, 3, 4, 5, 6]
*/



// import java.util.*;
// class Node
// {
//     int data;
//     Node left, right;
//     Node(int data)
//     {
//         this.data = data;
//     }
// }

// class BinaryTree
// {
//     // Build binary tree from level-order array. -1 means null.
//     Node buildTree(int[] arr)
//     {
//         if (arr.length == 0 || arr[0] == -1)
//             return null;

//         Node root = new Node(arr[0]);
//         Queue<Node> queue = new LinkedList<>();
//         queue.add(root);

//         int i = 1; // Start from the second element
//         while (!queue.isEmpty() && i < arr.length)
//         {
//             Node current = queue.poll();

//             // Assign left child
//             if (i < arr.length && arr[i] != -1)
//             {
//                 current.left = new Node(arr[i]);
//                 queue.add(current.left);
//             }
//             i++;

//             // Assign right child
//             if (i < arr.length && arr[i] != -1)
//             {
//                 current.right = new Node(arr[i]);
//                 queue.add(current.right);
//             }
//             i++;
//         }

//         return root;
//     }
// }

// class test
// {
//     void dfsTreePreOrderIterative(Node root, List<Integer> res)
//     {
//         if (root==null) return;
//         Deque<Node> stack = new ArrayDeque<>();
//         stack.push(root);
//         while (!stack.isEmpty()){
//             Node temp = stack.pop();
//             res.add(temp.data);
//             if (temp.right!=null) stack.push(temp.right);
//             if (temp.left!=null) stack.push(temp.left);
//         }
//     }

//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0; i < n; i++)
//         {
//             arr[i] = sc.nextInt();
//         }
//         sc.close();

//         BinaryTree tree = new BinaryTree();
//         Node root = tree.buildTree(arr);

//         List<Integer> res = new ArrayList<>();
//         new test().dfsTreePreOrderIterative(root, res);
//         System.out.println(res);
//     }
// }









/*

Given a binary tree, find its minimum depth using Depth First Search approach.
The minimum depth is the number of nodes along the shortest path from the root 
node down to the nearest leaf node.
Note: A leaf is a node with no children and -1 represents null value.

Note: A Binary tree data structure is built from the user input and the root 
node is provided, you just need to implement the dfsMinDepth()
An array element having value -1 represents NULL.

case=1
input=7
3 9 20 -1 -1 15 7
output=2

case=2
input=9
2 -1 3 -1 4 -1 5 -1 6
output=5

*/

// import java.util.*;
// class Node
// {
//     int data;
//     Node left, right;
//     Node(int data)
//     {
//         this.data = data;
//         left = right = null;
//     }
// }
// class BinaryTree
// {
//     Node buildTree(int[] arr)
//     {
//         if(arr.length == 0 || arr[0] == -1)
//         {
//             return null;
//         }
//         Queue<Node> queue = new LinkedList<>();
//         Node root = new Node(arr[0]);
//         queue.add(root);
//         int i = 1;
//         while(!queue.isEmpty() && i < arr.length)
//         {
//             Node current = queue.poll();

//             if (i < arr.length && arr[i] != -1)
//             {
//                 current.left = new Node(arr[i]);
//                 queue.add(current.left);
//             }
//             i++;
//             if (i < arr.length && arr[i] != -1)
//             {
//                 current.right = new Node(arr[i]);
//                 queue.add(current.right);
//             }
//             i++;
//         }
//         return root;
//     }
// }
// class test
// {
//     int minDepth(Node node)
//     {
//         //Implement your code here
//     }

//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0; i < n; i++)
//         {
//             arr[i] = sc.nextInt();
//         }
//         sc.close();

//         BinaryTree tree = new BinaryTree();
//         Node root = tree.buildTree(arr);

//         int res = new test().minDepth(root);
//         System.out.println(res);
//     }
// }//same for the max depth also