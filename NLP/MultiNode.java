package NLP;

public class MultiNode<T> {
    private T data;

    private LinkedList<MultiNode<T>> ptrs;

    public MultiNode<T>() {
        this.data = null;
        this.ptrs = new LinkedList<MultiNode<T>>();
    }

    
}
