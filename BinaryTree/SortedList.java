package BinaryTree;

import java.util.Comparator;
import java.lang.IndexOutOfBoundsException;

public interface SortedList<T> {
    /**
     * Gets the comparator used to sort this SortedList.
     * 
     * @return The comparator used to order elements in this SortedList.
     */
    public Comparator<T> getComparator();

    /**
     * Add some data to the SortedList.
     * 
     * @param data The data to add to this SortedList.
     */
    public void add(T data);

    /**
     * Retrieves an element via a binary search.
     * 
     * @throws IndexOutOfBoundsException If the index is not within the current size.
     * @param index The index to retrieve an element from.
     * @return The element found at the index, or null if it cannot be found.
     */
    public T get(int index);

    /**
     * Removes one element from the SortedList, based on a provided element.
     * 
     * @param data The element to attempt to remove.
     * @return True if the element was removed, False otherwise.
     */
    public boolean remove(T data);

    /**
     * Removes an element by its index.
     * 
     * @throws IndexOutOfBoundsException If the index is not within the current size.
     * @param index 
     * @return True if the element was removed, False otherwise.
     */
    public boolean remove(int index);

    /**
     * Outputs the size of this tree in terms of data elements.
     * 
     * @return The number of data elements in the tree, equals 0 if the tree is empty.
     */
    public int size();

    /**
     * Test whether the SortedList is empty or not.
     * 
     * @return True if there is no data in the SortedList, and False otherwise.
     */
    public boolean isEmpty();

    /**
     * Remove all data from the SortedList.
     */
    public void clear();
}
