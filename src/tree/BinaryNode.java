package tree;

public class BinaryNode<T> {
    T value;
    BinaryNode left, right;

    public BinaryNode(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public BinaryNode(T value, BinaryNode left, BinaryNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public <T extends Comparable<T>> int compareTo(T o) {
        return o.compareTo((T) value);
    }
}
