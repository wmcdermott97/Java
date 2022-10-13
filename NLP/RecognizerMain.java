package NLP;

/**
 *  Read text into a simple trie for recognition.
 */
public class RecognizerMain {
    
    public static void main(String[] args) {
        Recognizer thing = new Recognizer();
        (new RecognizerTest(thing, args)).runAllAccepted();
    }
}
