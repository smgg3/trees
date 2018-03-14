package tree;

public class BinarySearchTree<T extends Comparable<T>> {

    BinaryNode root = null;
    int size;

    public BinarySearchTree(T value) {
        this.root = new BinaryNode(value);
    }

    public BinaryNode<T> insert(T value) {
        root = insertRecursively(root, value);
        return root;
    }

    public BinaryNode<T> insertRecursively(BinaryNode root, T value) {
        if (root == null) {
            root = new BinaryNode(value);
            return root;
        } else {
            if (root.compareTo(value) > 0) {
                root.left = insertRecursively(root.left, value);

            } else {
                root.right = insertRecursively(root.right, value);
            }
        }
        return root;
    }

}
