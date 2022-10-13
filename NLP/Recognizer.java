package NLP;

public class Recognizer {
    
    /**
     * Language name?
     */
    private String name;

    /**
     * Root node for the trie.
     */
    private CharNode root;

    public Recognizer() {
        this("default");
    }

    public Recognizer(String name) {
        this.name = name;
        this.root = new CharNode(' ');
    }

    /**
     * Parse a string of text, separated by spaces, into a trie.
     */
    public void parse(String[] words) {
        for (String word : words) {
            char[] currWord = (word + " ").toCharArray();
            CharNode currNode = this.root;
            for (char c : currWord) {
                CharNode nextNode = currNode.getNode(c);
                // Create a new character in the trie
                if (nextNode == null) {
                    nextNode = new CharNode(c);
                    currNode.setNode(nextNode);
                }
                currNode = nextNode;
            }
        }
    }

    public boolean recognize(String word) {
        CharNode currNode = this.root;
        for (char c : word.toCharArray()) {
            currNode = currNode.getNode(c);
            if (c == null) {
                return false;
            }
        }
        return true;
    }
}
