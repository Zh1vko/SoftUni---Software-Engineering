package rpg_lab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AxeTests {

        private final static int AXE_ATTACK = 10;
        private final static int AXE_DURABILITY = 10;
        private final static int EXPECTED_DURABILITY = 9;
        private final static int BROKEN_DURABILITY = 0;
        private final static int DUMMY_HEALTH = 20;
        private final static int DUMMY_EXPERIENCE = 10;

        Axe currentAxe;
        Axe brokenAxe;
        Dummy currentDummy;

        @Before
        public void information(){
                currentAxe = new Axe(AXE_ATTACK, AXE_DURABILITY);
                currentDummy = new Dummy(DUMMY_HEALTH, DUMMY_EXPERIENCE);
                brokenAxe = new Axe(AXE_ATTACK, BROKEN_DURABILITY);
        }


        //•	Test if weapon loses durability after each attack;
        @Test
        public void testWeaponLoseDurabilityAfterAttack() {
                currentAxe.attack(currentDummy);
                Assert.assertEquals(EXPECTED_DURABILITY, currentAxe.getDurabilityPoints());
        }


        //•	Test attacking with a broken weapon
        @Test (expected = IllegalStateException.class)
        public void testWeaponAttackWithBrokenDurability() {
                brokenAxe.attack(currentDummy);
        }

}