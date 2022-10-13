package NLP;

public class Recognizer {
    
    /**
     * Language name?
     */
    private String name;

    /**
     * Root node for the trie.
     */
    private MultiNode<Character> root;

    public Recognizer() {
        this.name = "default";
        this.root = new MultiNode<Character>();
    }

    /**
     * Parse a string of text, separated by spaces, into a trie.
     */
    public void parse(String[] words) {
        for (String word : words) {
            char[] currWord = (word + " ").toCharArray();
            MultiNode<Character> currNode = this.root;
            for (char ch : currWord) {
                MultiNode<Character> nextNode = currNode.getNode(ch);
                // Create a new character in the trie
                if (!nextNode) {
                    MultiNode<Character> nextNode = new MultiNode<Character>(ch)
                    currNode.addNode(nextNode);
                }
                currNode = nextNode;
            }
        }
    }
}
