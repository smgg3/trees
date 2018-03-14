package tree;

public class BinaryNode<T> {
    T value;
    BinaryNode left, right;

    public BinaryNode(T value) {
        this.value = value;
    }

    public BinaryNode(T value, BinaryNode left, BinaryNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
