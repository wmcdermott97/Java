package NLP;

public class RecognizerTest {
    private Recognizer rcg;
    private String[] args;

    public RecognizerTest(Recognizer rcg, String[] args) {
        this.rcg = rcg;
        this.args = args;
        rcg.parse(args);
    }

    public boolean runAllAccepted() {
        boolean targ = true;
        for (String word : this.args) {
            boolean test = rcg.recognize(word);
            if (!test) {
                System.out.println(word + " was not recognized");
            }
            targ = targ && test;
        }
        return targ;
    }
    
}
