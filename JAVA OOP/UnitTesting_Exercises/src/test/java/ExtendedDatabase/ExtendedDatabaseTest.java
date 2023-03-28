package ExtendedDatabase;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

public class ExtendedDatabaseTest {
    private Database database;
    private final static Person[] PEOPLE = {
            new Person(1, "Boris"),
            new Person(2, "Petar"),
            new Person(3, "Miroslav")
    };

    @Before
    public void prepareDatabase() throws OperationNotSupportedException {
        database = new Database(PEOPLE);
    }

    @Test
    public void testConstructorHasCreatedValidObject()  {
        Person[] elements = database.getElements();
        Assert.assertArrayEquals(elements, PEOPLE);
    }

    // elements > 16
    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorThrowWhenMoreThanSixteenElements() throws OperationNotSupportedException {
        Person[] people = new Person[17];
        new Database(people);
    }

    // elements < 1
    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorThrowWhenZeroElements() throws OperationNotSupportedException {
        Person[] people = new Person[0];
        new Database(people);
    }

    // add element
    @Test
    public void testAddElement () throws OperationNotSupportedException {
        database.add(new Person(4, "Desi"));
        Person[] people = database.getElements();

        Assert.assertEquals(people.length, PEOPLE.length + 1);
        Assert.assertEquals(Integer.valueOf(people[people.length-1].getId()), Integer.valueOf(4));
        Assert.assertEquals(people[people.length-1].getUsername(), "Desi");
    }

    // Add null element
    @Test(expected = OperationNotSupportedException.class)
    public void testAddNullElement () throws OperationNotSupportedException {
        database.add(null);
    }

    // Remove element
    @Test
    public void testRemoveLastElement () throws OperationNotSupportedException {
        database.remove();      // removed Miroslav
        Person[] elements = database.getElements();

        Assert.assertEquals(elements.length, PEOPLE.length - 1);
        Assert.assertEquals(Integer.valueOf(2), Integer.valueOf(elements[elements.length - 1].getId()));
        Assert.assertEquals("Petar", elements[elements.length - 1].getUsername());
    }

    // Remove an element from empty DB
    @Test(expected = OperationNotSupportedException.class)
    public void testRemoveElementFromEmptyDatabase () throws OperationNotSupportedException {
        database = new Database();
        database.remove();
    }

    // Remove invalid index
    @Test(expected =  OperationNotSupportedException.class)
    public void testInvalidIndexRemove () throws OperationNotSupportedException {
        database = new Database();
        for (int index = 0; index < 100; index++) {
            database.remove();
        }

    }

    // Find by null username
    @Test (expected = OperationNotSupportedException.class)
    public void testFindByUsernameThrowNullParameter () throws OperationNotSupportedException {
        database.findByUsername(null);
    }

    // Find by Username in empty DB
    @Test (expected = OperationNotSupportedException.class)
    public void testFindByUsernameThrowEmptyDatabase () throws OperationNotSupportedException {
        database = new Database();
        database.findByUsername("Desi");
    }

    // Find existing username
    @Test
    public void testFindByExistingUsername() throws OperationNotSupportedException {
        Person person = database.findByUsername("Petar");

        Assert.assertEquals(2, person.getId());
        Assert.assertEquals("Petar", person.getUsername());
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testFindByUsernameMoreThanOnePerson() throws OperationNotSupportedException {
        database.add(new Person(4, "Miroslav"));
        database.findByUsername("Miroslav");
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testFindByInvalidUsername() throws OperationNotSupportedException {
        database.findByUsername("Pesho");
    }

    // Find existing ID
    @Test
    public void testFindByExistingID() throws OperationNotSupportedException {
        Person person = database.findById(1);

        Assert.assertEquals(1, person.getId());
        Assert.assertEquals("Boris", person.getUsername());
    }

    @Test (expected = OperationNotSupportedException.class)
    public void testFindByIdMoreThanOneID() throws OperationNotSupportedException {
        database.add(new Person(2, "Pesho"));
        database.findById(2);
    }

    @Test(expected =  OperationNotSupportedException.class)
    public void testFindByIdEmptyDatabase() throws OperationNotSupportedException {
        database = new Database();
        database.findById(2);
    }
}