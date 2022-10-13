package BinaryTree;

import java.util.Comparator;

public class SortedTree<T> implements SortedList<T> {
    
    private Comparator<T> order;

    /**
     * Place holder constructor for SortedListTest.
     */
    public SortedTree() {
        // A lonely broken method.
    }

     /**
      * Actual Constructor when I get around to it.
      * 
      * @param order
      */
    public SortedTree(Comparator<T> order) {
        this.order = order;
    }

	@Override
	public Comparator<T> getComparator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(T data) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(int index) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
}
