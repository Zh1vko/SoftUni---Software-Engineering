package magicGame;

import org.junit.Assert;
import org.junit.Test;

public class MagicianTests {



    @Test
    public void testConstructorMagician() {
        Magician magician = new Magician("Pesho", 100);

        Assert.assertEquals(magician.getHealth(), 100);
        Assert.assertEquals(magician.getUsername(), "Pesho");
    }

    @Test (expected = NullPointerException.class)
    public void testUsernameThrowNull() {
        Magician magician = new Magician(null, 100);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testMagicianNegativeHealthThrowException() {

        Magician magician = new Magician("Pesho", -1);
    }

    @Test
    public void testGetMagics() {
        Magician magician = new Magician("Pesho", 100);

        Magic magic1 = new Magic("Lighting", 10);
        Magic magic2 = new Magic("Fire", 20);
        Magic magic3 = new Magic("Wind", 15);

        magician.addMagic(magic1);
        magician.addMagic(magic2);
        magician.addMagic(magic3);

        Assert.assertEquals(3, magician.getMagics().size());
        Assert.assertEquals(magic1, magician.getMagics().get(0));
        Assert.assertEquals(magic2, magician.getMagics().get(1));
        Assert.assertEquals(magic3, magician.getMagics().get(2));
    }

    @Test (expected = IllegalStateException.class)
    public void testDeadMagicianTakeDamageThrow() {
        Magician magician = new Magician("Pesho", 0);
        magician.takeDamage(5);
    }

    @Test
    public void testAliveMagicianTakeDamage() {
        Magician magician = new Magician("Pesho", 50);
        magician.takeDamage(5);
        magician.takeDamage(15);
    }

    @Test
    public void testMagicianDiesDuringTakeDamage() {
        Magician magician = new Magician("Pesho", 50);
        magician.takeDamage(5);
        magician.takeDamage(55);
    }

    @Test (expected = NullPointerException.class)
    public void testAddNullMagicThrow() {
        Magician magician = new Magician("Pesho", 50);
        magician.addMagic(null);
    }

    @Test
    public void testRemoveMagic() {
        Magician magician = new Magician("Pesho", 50);
        Magic magic1 = new Magic("Lighting", 10);
        magician.addMagic(magic1);

        Assert.assertTrue(magician.removeMagic(magic1));
    }

    @Test
    public void testGetMagicByName() {
        Magician magician = new Magician("Pesho", 50);
        Magic magic1 = new Magic("Lighting", 10);
        magician.addMagic(magic1);

        Assert.assertEquals(magic1, magician.getMagic("Lighting"));
    }
}
