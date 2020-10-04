

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Data.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Data
{
    private ListOfStrings listOfSt1;

    /**
     * Default constructor for test class Data
     */
    public Data()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        listOfSt1 = new ListOfStrings(7);
        listOfSt1.addWord("Ib");
        listOfSt1.addWord("Bo");
        listOfSt1.addWord("Ann");
        listOfSt1.addWord("Kaj");
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
