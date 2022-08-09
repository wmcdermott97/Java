package BinaryTree;

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
     * @param data The data to add to this BinaryTree.
     */
    public void add(T data);

    /**
     * Removes an element from the BinaryTree, based on a provided element.
     * 
     * @param data The element to attempt to remove.
     * @return True if the element was removed, False otherwise.
     */
    public boolean remove(T data);

    /**
     * Outputs the size of this tree in terms of data elements.
     * 
     * @return The number of data elements in the tree, equals 0 if the tree is empty.
     */
    public int size();

    /**
     * Remove all data from the BinaryTree.
     */
    public void clear();
}
