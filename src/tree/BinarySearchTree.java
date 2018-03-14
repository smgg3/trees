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

    public BinaryNode<T> search(T value) {
        return search(root, value);
    }

    public BinaryNode<T> search(BinaryNode root, T value) {
        if (root == null)
            return null;
        int compare = root.compareTo(value);
        if (compare == 0) {
            return root;
        } else if (compare > 0) {
            return search(root.left, value);
        } else {
            return search(root.right, value);
        }
    }

}
