package rpg_lab;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DummyTests {
    private final static int AXE_ATTACK = 10;
    private final static int AXE_DURABILITY = 10;
    private final static int DUMMY_HEALTH = 20;
    private final static int DUMMY_EXP = 10;

    private Axe axe;
    private Dummy aliveDummy;
    private Dummy deadDummy;

    @Before
    public void information() {
        axe = new Axe(AXE_ATTACK, AXE_DURABILITY);
        aliveDummy = new Dummy(DUMMY_HEALTH, DUMMY_EXP);
        deadDummy = new Dummy(0, DUMMY_EXP);
    }

    @Test
    public void testDummyLosesHealthWhenAttacked() {
        //•	Dummy loses health if attacked.
        axe.attack(aliveDummy);
        Assert.assertEquals(DUMMY_HEALTH - AXE_ATTACK, aliveDummy.getHealth());
    }

    @Test (expected = IllegalStateException.class)
    public void testDeadDummyThrowsException() {
        //•	Dead Dummy throws exception if attacked.
        axe.attack(deadDummy);
    }


    @Test
    public void testDeadDummyCanGiveEXP() {
        //•	Dead Dummy can give XP.
        Assert.assertEquals(DUMMY_EXP, deadDummy.giveExperience());
    }


    @Test (expected = IllegalStateException.class)
    public void aliveDummyCannotGiveEXP() {
        //•	Alive Dummy can't give XP.

        aliveDummy.giveExperience();
    }

}