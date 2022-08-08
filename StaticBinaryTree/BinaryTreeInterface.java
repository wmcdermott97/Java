package StaticBinaryTree;

import java.util.Comparator;

public interface BinaryTreeInterface<T> {
    
    /**
     * Gets the comparator used to sort this BinaryTree.
     * 
     * @return The comparator used to order elements in this BinaryTree.
     */
    public Comparator<T> getComparator();

    /**
     * Add some data to the BinaryTree.
     * 
     * @param data The data to add to this binary tree.
     */
    public void add(T data);

    /**
     * Outputs the size of this tree in terms of data elements.
     * 
     * @return The number of data elements in the tree, equals 0 if the tree is empty.
     */
    public int size();
}
