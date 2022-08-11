package BinaryTree;

/**
 *  Test class for the SortedList Interface, filled with wonderful unit tests.
 */
public class SortedListTest {
    /**
     * The SortedList to test on. Will be reset between runs.
     * 
     * I chose to use Integers for simplicity, but it may be wise to try different types.
     */
    private SortedList<Integer> list;
    
    /**
     * The number of tests in this class, because I may modify the code somehow to be less annoying looking.
     */
    private final int NUM_TESTS = 0;

    /**
     * Construct a new SortedListTest with the appropriate fields.
     * 
     * @param list The SortedList instance to test on, dependent on implementation.
     */ 
    public SortedListTest(SortedList<Integer> list) {
        this.list = list;
    }

    /**
     * Run all Tests, printing results to the console.
     * 
     * @return Number of tests that passed, which is the 
     */
    public boolean getTestReport() {
        boolean target = true;
        for (int testI = 0; testI < NUM_TESTS; testI++) {
            System.out.println("Running test", testI);
            target = target && this.getTestRun(testI, true);
            // Running a test modifies the output, so we'll need to reset each time.
            this.reset();
        }
        System.out.println("All tests passed: ", target);
        return target;
    }

    /**
     * Runs a specific test by its integer id.
     * 
     * @param id The test to run in the sequence.
     * @param verbose Whether or not to print the results of the test individually.
     */
    public boolean getTestRun(int id, boolean verbose) {
        // TODO
        return false;
    }

    /**
     * Reset the SortedList so that it can be used in a new test.
     * 
     * I could be wrong, but if there is a spoof for this, then that messes with the code.
     */
    private void reset() {
        // Anything else that may need to happen.
        list.clear();
    }

}
