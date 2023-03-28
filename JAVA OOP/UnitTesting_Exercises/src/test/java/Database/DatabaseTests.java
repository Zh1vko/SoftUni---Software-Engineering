package Database;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

public class DatabaseTests {

    public Database database;
    private static final Integer[] NUMBERS = {
            7, 45, 34, 12, 98, 23
    };

    @Before
    public void prepareDatabase() throws OperationNotSupportedException {
        database = new Database(NUMBERS);
    }

    @Test
    public void testConstructorHasCreatedValidObject()  {
        Integer[] elements = database.getElements();
        Assert.assertArrayEquals(elements, NUMBERS);
    }

    // elements > 16
    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorThrowWhenMoreThanSixteenElements() throws OperationNotSupportedException {
         Integer[] numbers = new Integer[17];
         new Database(numbers);
     }


    // elements < 1
    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorThrowWhenZeroElements() throws OperationNotSupportedException {
        Integer[] numbers = new Integer[0];
        new Database(numbers);
     }


    // add element
    @Test
    public void testAddElement () throws OperationNotSupportedException {
        database.add(67);
        Integer[] elements = database.getElements();
        Assert.assertEquals("Invalid Add operation", elements.length, NUMBERS.length + 1);
        Assert.assertEquals(elements[elements.length-1], Integer.valueOf(67));
    }


    // add null element
    @Test(expected = OperationNotSupportedException.class)
    public void testAddNullElement () throws OperationNotSupportedException {
        database.add(null);
     }

    // Remove element
    @Test
    public void testRemoveLastElement () throws OperationNotSupportedException {
        database.remove();      // removed 23
        Integer[] elements = database.getElements();

        Assert.assertEquals(elements.length, NUMBERS.length - 1);
        Assert.assertEquals(elements[elements.length - 1], Integer.valueOf(98));
    }


    // Remove an element from empty DB
    @Test(expected = OperationNotSupportedException.class)
    public void testRemoveElementFromEmptyDatabase () throws OperationNotSupportedException {
        for (int index = 0; index < NUMBERS.length; index++) {
            database.remove();
        }
        database.remove();
    }

}