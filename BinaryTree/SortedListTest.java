package BinaryTree;

/**
 *  Test class for the SortedList Interface, filled with wonderful unit tests.
 */
public class SortedListTest {

    /**
     * The SortedList to test on. Reset to fixedList after every run.
     */
    private final SortedList<Integer> list;
    
    /**
     * The number of tests in this class, which I am hardcoding.
     */
    private final int NUM_TESTS = 0;

    /**
     * Construct a new SortedListTest with the appropriate fields.
     * 
     * @param list The SortedList instance to test on, dependent on implementation.
     */ 
    public SortedListTest(SortedList<Integer> list) {
        this.list = list;
        this.reset();
    }

    /**
     * Run all Tests, printing results to the console.
     * 
     * @return Number of tests that passed, which is the 
     */
    public boolean getTestReport() {
        boolean target = true;
        // I should probably make this a loop, but I had some difficulty without using FunctionalInterfaces,
        // as I'd have to somehow invoke different methods by name. A manual case statement could improve this.
        boolean test = this.testSizeZero();
        System.out.println("List can test for no size: ", test);
        target = target && test;
        reset();
        // rinse and repeat. It's ugly, but it runs.
        boolean test = this.testAddAny();
        System.out.println("Testpassed: ", test);
        target = target && test;
        reset();

        System.out.println("All unit tests passed: " + target);
        return target;
    }

    /**
     * Runs a test method by a numerical id.
     * This method only exists so that I can loop over all tests.
     * 
     * @param id The numerical test to run by it's number.
     * @return true if the test passes, false if it fails.
     */
    private boolean runTestMethodById(int id) {
        
    }

    /**
     * Test the isEmpty() method
     * 
     * @return true if the test passes, false if it fails.
     */
    public boolean testSizeZero() {
        boolean target = list.isEmpty(); // should return true
        list.reset();
        return target;
    }

    /**
     * Test the add method for some element.
     * 
     * @return true if the list can add an element, false if it fails.
     */
    public boolean testAddAny() {
        list.add(3);

        this.reset();
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
