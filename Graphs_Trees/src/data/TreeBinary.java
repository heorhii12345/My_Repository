package data;

public class TreeBinary {
    Node root;

    public static void main(String[] args) {
        TreeBinary tree = new TreeBinary();
        tree.root = new Node(3);
        tree.root.left = new Node(1);
        tree.root.right = new Node(8);
        tree.root.left.left = new Node(10);
        tree.root.left.right = new Node(12);
        tree.root.right.right = new Node(2);
        tree.root.right.right.left = new Node(4);
        tree.root.right.right.right = new Node(7);
        tree.root.right.right.right.left = new Node(9);
        tree.root.right.right.right.right = new Node(5);
        tree.root.left.left.left = new Node(6);
        tree.root.left.left.left.left = new Node(11);

        System.out.println("Inorder traversal");
        tree.inorder(tree.root);

        System.out.println("\nPreorder traversal ");
        tree.preorder(tree.root);

        System.out.println("\nPostorder traversal");
        tree.postorder(tree.root);
    }

    TreeBinary() {
        root = null;
    }

    void postorder(Node node) {
        if (node == null)
            return;

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.item + " ");
    }

    void inorder(Node node) {
        if (node == null)
            return;

        inorder(node.left);
        System.out.print(node.item + " ");
        inorder(node.right);
    }

    void preorder(Node node) {
        if (node == null)
            return;

        System.out.print(node.item + " ");
        preorder(node.left);
        preorder(node.right);
    }
}
