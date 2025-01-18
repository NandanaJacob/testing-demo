// for n array three, visit= https://www.studytonight.com/advanced-data-structures/nary-tree

package collectionprog;
class Node{
    int value;
    Node left;
    Node right;
    public Node(int value) {
        this.value = value;
        left = null;
        right = null;
    }
}

class BinarySearchTree{
    Node root;

    //insertion
    void insert(int value){
        root = insertRec(root, value);
    }
    Node insertRec(Node root, int value){
        if(root == null){
            root = new Node(value);
            return root;
        }
        if(value < root.value){
            root.left = insertRec(root.left, value);
        }
        else if(value > root.value){
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    //inorder traversal
    void inorderTraversal(){
        System.out.println("Inorder traversal:");
        inorderRec(root);
        System.out.println();
    }
    private void inorderRec(Node root){
        if(root != null){
            inorderRec(root.left);
            System.out.println("    "+ root.value);
            inorderRec(root.right);
        }
    }

    //preorder traversal
    void preorderTraversal(){
        System.out.println("Preorder traversal:");
        preorderRec(root);
        System.out.println();
    }
    private void preorderRec(Node root){
        if(root != null){
            System.out.println("    "+ root.value);
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    //postorder traversal
    void postorderTraversal(){
        System.out.println("Preorder traversal:");
        postorderRec(root);
        System.out.println();
    }
    private void postorderRec(Node root){
        if(root != null){
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.println("    "+ root.value);
        }
    }
}
public class TreeEx {
        public static void main(String[] args) {
            BinarySearchTree bst = new BinarySearchTree();
            bst.insert(50);
            bst.insert(30);
            bst.insert(70);
            bst.insert(20);
            bst.insert(40);
            bst.insert(60);

            bst.inorderTraversal();
            bst.preorderTraversal();
            bst.postorderTraversal();
        }
}


// [10:48] Tilaka
// class BinaryTreeNode {

//     int value;

//     BinaryTreeNode left, right;
 
//     BinaryTreeNode(int value) {

//         this.value = value;

//         left = right = null;

//     }

// }
 
// class TreeEx {

//     BinaryTreeNode root;
 
//     // Pre-order Traversal (Root -> Left -> Right)

//     void preOrder(BinaryTreeNode node) {

//         if (node != null) {

//             System.out.print(node.value + " ");

//             preOrder(node.left);

//             preOrder(node.right);

//         }

//     }
 
//     // In-order Traversal (Left -> Root -> Right)

//     void inOrder(BinaryTreeNode node) {

//         if (node != null) {

//             inOrder(node.left);

//             System.out.print(node.value + " ");

//             inOrder(node.right);

//         }

//     }
 
//     // Post-order Traversal (Left -> Right -> Root)

//     void postOrder(BinaryTreeNode node) {

//         if (node != null) {

//             postOrder(node.left);

//             postOrder(node.right);

//             System.out.print(node.value + " ");

//         }

//     }
 
//     public static void main(String[] args) {

//         TreeEx tree = new TreeEx();
 
//         // Manually creating a binary tree

//         tree.root = new BinaryTreeNode(50);

//         tree.root.left = new BinaryTreeNode(30);

//         tree.root.right = new BinaryTreeNode(70);

//         tree.root.left.left = new BinaryTreeNode(20);

//         tree.root.left.right = new BinaryTreeNode(40);

//         tree.root.right.left = new BinaryTreeNode(60);

//         tree.root.right.right = new BinaryTreeNode(80);

//         System.out.println("Pre-order Traversal:");

//         tree.preOrder(tree.root); // Output: 1 2 4 5 3
 
//         System.out.println("\nIn-order Traversal:");

//         tree.inOrder(tree.root); // Output: 4 2 5 1 3
 
//         System.out.println("\nPost-order Traversal:");

//         tree.postOrder(tree.root); // Output: 4 5 2 3 1

//     }

// }

