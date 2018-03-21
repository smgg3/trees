package tree;

public class BinarySearchTree<T extends Comparable<T>> {

    static BinaryNode root = null;

    public static int size = 0;

    public BinarySearchTree() {

    }

    public BinarySearchTree(T value) {
        this.root = new BinaryNode(value);
        size++;
    }

    public BinaryNode<T> insert(T value) {
        size++;
        return insertRecursively(root, value);
    }

    public BinaryNode<T> insertListOfValues(T[] values) {
        for (T value : values) {
            size++;
            insertRecursively(root, value);
        }
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

    public boolean delete(T value) {
        if (delete(root, value)) {
            size--;
            return true;
        } else
            return false;
    }

    public boolean delete(BinaryNode<?> root, T value) {
        if (root == null)
            return false;
        BinaryNode replacer = null;
        if (root.compareTo(value) == 0) {
            if (root.left != null) {
                replacer = predecessor(root.left);
            } else if (root.right != null) {
                replacer = successor(root.right);
            }
            replacer.left = root.left;
            replacer.right = root.right;
            root = replacer;
            return true;
        } else if (root.compareTo(value) > 0) {
            return delete(root.left, value);
        } else {
            return delete(root.right, value);
        }
    }

    private BinaryNode successor(BinaryNode<?> right) {
        if (root.left == null) {
            BinaryNode<?> temp = root;
            root = root.right;
            temp.left = null;
            temp.right = null;
            return temp;
        } else
            return successor(root.left);
    }

    private BinaryNode<?> predecessor(BinaryNode<?> left) {
        if (root.right == null) {
            BinaryNode<?> temp = root;
            root = root.left;
            temp.left = null;
            temp.right = null;
            return temp;
        } else
            return predecessor(root.right);
    }
}
