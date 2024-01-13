package grader.student;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import logic.game.GameController;
import logic.ghost.GaGhost;

class GaGhostTest {

    GaGhost gaGhost;

    @BeforeEach
    void setUp() {
        gaGhost = new GaGhost(); 
    }
    @Test
    void testConstructor() {
    	GaGhost a = new GaGhost();
    	GaGhost b = new GaGhost(2);
    	assertEquals("GaGhost [HP: 3 , Energy: 6]",a.toString());
    	assertEquals("GaGhost [HP: 3 , Energy: 2]",b.toString());
    }
    @Test
    void testIsDestroyedFalse() {
        assertFalse(gaGhost.isDestroyed()); 
    }

    @Test
    void testIsDestroyedTrue() {
        gaGhost.decreaseHp(5); 
        assertTrue(gaGhost.isDestroyed());
    }

    @Test
    void testDecreaseHp() {
        gaGhost.decreaseHp(3);
        assertEquals(0, gaGhost.getHp()); 
    }

    @Test
    void testDecreaseHpBelowZero() {
        gaGhost.decreaseHp(15);
        assertEquals(0, gaGhost.getHp());
    }

    @Test
    void testAttack() {
        GameController.getInstance().setHp(6); // Assuming initial HP of GameController is 20
        gaGhost.attack();
        assertEquals(0, GameController.getInstance().getHp()); // After GaGhost attack with energy 10
    }

    @Test
    void testToString() {
        assertEquals("GaGhost [HP: 3 , Energy: 6]", gaGhost.toString());
    }

    // Add more tests specific to GaGhost behavior if needed
}