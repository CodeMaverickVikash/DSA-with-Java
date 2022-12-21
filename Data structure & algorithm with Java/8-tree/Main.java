//Build a Tree from its Preorder traversal
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree {
    static int idx = -1; // Index
    public static Node buildTree(int nodes[]) {
        idx++;
        if(nodes[idx] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[idx]); // root
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode; // return root
    }

    public static void preorder(Node root) { // O(n)
        if(root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void postorder(Node root) {
        if(root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelOrder(Node root) {
        if(root == null) {
           return;
        }
       Queue<Node> q = new LinkedList<>();
       q.add(root);
       q.add(null);
       while(!q.isEmpty()) {
           Node curr = q.remove();
           if(curr == null) {
               System.out.println();
               //queue empty
               if(q.isEmpty()) {
                   break;
               } else {
                   q.add(null);
               }
           } else {
               System.out.print(curr.data+" ");
               if(curr.left != null) {
                   q.add(curr.left);
               }
               if(curr.right != null) {
                   q.add(curr.right);
               }
           }
       }
    }

}

class ProblemBT {
     public static int countOfNodes(Node root) { // O(n)
       if(root == null) {
           return 0;
       }
 
       int leftNodes = countOfNodes(root.left);
       int rightNodes = countOfNodes(root.right);
       return leftNodes + rightNodes + 1;
    }

    public static int sumOfNodes(Node root) {
       if(root == null) {
           return 0;
       }
 
       int leftSum = sumOfNodes(root.left);
       int rightSum = sumOfNodes(root.right);
       return leftSum + rightSum + root.data;
   }
    public static int height(Node root) {
       if(root == null) {
           return 0;
       }
 
       int leftHeight = height(root.left);
       int rightHeight = height(root.right);
       return Math.max(leftHeight, rightHeight) + 1;
    }
}

class Main {
    public static void main(String args[]) {
       int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}; // Given in preorder sequence
       BinaryTree tree = new BinaryTree();
      
       Node root = tree.buildTree(nodes);
    //    System.out.println(root.data);

        // BinaryTree.preorder(root);
        // BinaryTree.inorder(root);
        // BinaryTree.postorder(root);
        // BinaryTree.levelOrder(root);

        ProblemBT p = new ProblemBT();
        // System.out.print(p.countOfNodes(root));
        // System.out.print(p.sumOfNodes(root));
        System.out.print(p.height(root));
   }
}