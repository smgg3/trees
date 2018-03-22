package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tree.BinarySearchTree;

public class TestBinarySearchTree {
    @Test
    public void testInsertBinarySearchTree() {
        BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
        tree.insert(10);
        assertEquals(tree.size, 1);
    }
}