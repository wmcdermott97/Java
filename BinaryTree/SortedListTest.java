package BinaryTree;

import java.lang.reflect.Constructor;
import java.lang.Integer;

/**
 * Test class for the SortedList Interface.
 * 
 * Filled with unit tests, a random test harness, and lots of love <3
 */
public class SortedListTest {
    
    /**
     * The number of tests in this class.
     */
    private final int NUM_TESTS = 0;

    /**
     * The provided SortedList, which a special test can be run with.
     */
    private SortedList<Integer> list;

    /**
     * The class of the provided SortedList, for instantiating new SortedLists.
     * 
     * This will help make a new SortedList of the correct kind.
     */
    private final Class<?> listClass;

    /**
     * Construct a new SortedListTest with the appropriate fields.
     * 
     * @param list The SortedList instance to test on, dependent on implementation.
     */
    public SortedListTest(SortedList<Integer> list) {
        this.list = list;
        this.listClass = list.getClass();
        this.reset();
    }

    /**
     * Run all Tests, printing results to the console.
     * 
     * @return Number of tests that passed, in case it's necessary.
     */
    public int printTestReport() {
        int numPassed = 0;
        for (int id = 0; id < NUM_TESTS; id++) {
            boolean test = runTestMethodById(id);
            if (test) {
                numPassed++;
            }
            else {
                System.out.println("Implementation failed for test number: " + id);
            }
            reset();
        }
        System.out.println(numPassed + " out of " + NUM_TESTS + " tests passed.");
        return numPassed;
    }

    /**
     * Runs a test method by a numerical id.
     * This method only exists so that I can loop over all tests.
     * 
     * @param id The numerical test to run by its number.
     * @return true if the test passes, false if it fails.
     */
    private boolean runTestMethodById(int id) {
        switch(id) {
            case 0:
            return testSizeZero();
            case 1:
            return testAddAny();
            // TODO add more test names as I go
            default:
            System.out.println("Inappropriate test id called.");
            return false;
        }
    }

    /**
     * Test the isEmpty() method.
     * 
     * @return true if the list can detect it is empty, false if it fails.
     */
    public boolean testSizeZero() {
        boolean target = list.isEmpty(); // should return true
        this.reset();
        return target;
    }

    /**
     * Test the add method and size method for some element.
     * 
     * @return true if the list can add an element, false if it fails.
     */
    public boolean testAddAny() {
        list.add(Integer.valueOf(3));
        boolean target = (list.size() == 1);
        this.reset();
        return target;
    }

    /**
     * Reset the SortedList to a new one for the next test.
     * No clue if this works right now... TODO
     */
    private void reset() {
        try {
            // Next two lines taken from StackOverflow, more or less
            Constructor<?> constr = listClass.getConstructor(String.class);
            Object obj = constr.newInstance(""); // This will call the constructor with no arguments I think
            // With wild abandon, hope this private method with no arguments doesn't hiccup here.
            this.list = (SortedList<Integer>) obj;
        }
        catch (Exception e) {
            System.out.println("Encountered an exception while in reset method:");
            System.out.println(e);
        }
    }
}
