package NLP;

import java.util.ArrayList;

public class CharNode {

    private char data;
    private String keys;
    private ArrayList<CharNode> values;

    public CharNode(char data) {
        this.data = data;
        this.keys = "";
        this.values = new ArrayList<CharNode>();
    }

    public char getData() {
        return this.data;
    }

    /**
     *  Sets a node, or overwrites an existing node if it already exists.
     */
    public boolean setNode(CharNode next) {
        int pos = this.keys.indexOf(next.data);
        if (pos != -1) {
            // keys remains the same
            values.remove(pos);
            try {
                values.add(pos, next);
                return true;
            }
            catch (IndexOutOfBoundsException e) {
                return false;
            }
        }
        else {
            keys = keys + next.data;
            return values.add(next);
        }
    }

    public CharNode getNode(char data) {
        int pos = keys.indexOf(data);
        if (pos == -1) {
            return null;
        }
        else {
            return values.get(pos);
        }
    }
}
