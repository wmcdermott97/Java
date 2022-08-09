package BinaryTree;

public class BinaryNode<T> {
    /**
     * The data this BinaryNode holds.
     */
    private T data = null;

    /**
     * The left child of this BinaryNode.
     */
    private BinaryNode<T> left = null;

    /**
     * The right child of this BinaryNode.
     */
    private BinaryNode<T> right = null;

    /**
     * Construct a BinaryNode without a left or right child.
     * 
     * @param data The data that goes in the leaf BinaryNode.
     */
    public BinaryNode(T data) {
        this.data = data;
    }

    /**
     * Construct a complete Binary Node.
     * 
     * @param data The data that goes in the BinaryNode.
     * @param left The left child of this BinaryNode, or null if there isn't one.
     * @param right The right child of this BinaryNode, or null if there isn't one.
     */
    public BinaryNode(T data, BinaryNode<T> left, BinaryNode<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    /**
     * Returns the object held by this BinaryNode.
     * 
     * @return The data for the BinaryNode.
     */
    public T getData() {
        return this.data;
    }

    /**
     * Replaces the object this BinaryNode holds.
     * 
     * @param data The data to put in this BinaryNode.
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * Gets the left child of this BinaryNode.
     * 
     * @return A BinaryNode<T> that is the left child.
     */
    public BinaryNode<T> getLeft() {
        return this.left;
    }

    /**
     * Sets the left child to another BinaryNode.
     * 
     * @param left The BinaryNode to set as the left child.
     */
    public void setLeft(BinaryNode<T> left) {
        this.left = left;
    }

    /**
     * Gets the right child of this BinaryNode.
     * 
     * @return A BinaryNode<T> that is the right child.
     */
    public BinaryNode<T> getRight() {
        return this.right;
    }

    /**
     * Sets the left child to another BinaryNode.
     * 
     * @param left The BinaryNode to set as the left child.
     */
    public void setRight(BinaryNode<T> right) {
        this.right = right;
    }
}
