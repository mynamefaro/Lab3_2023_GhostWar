package grader.student;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import logic.actor.Actor;
import logic.actor.GhostDoctor;
import logic.actor.Villager;
import logic.game.GameController;
import logic.game.GameIO;
import logic.ghost.GaGhost;
import logic.ghost.Ghost;
import logic.ghost.PooYaGhost;
import logic.ghost.PryGhost;
import logic.item.Item;
import logic.item.Leklai;

class GameControllerTest {
    @Test
    void testPlayNotDestroyedGhost() {
        Actor actor = new Villager();
        
        Ghost g1 = new PooYaGhost(8);
        Ghost g2 = new GaGhost();
        Ghost g3 = new PryGhost();
        
        GameController.getInstance().getGhosts().clear();
        GameController.getInstance().getItems().clear();
        GameController.getInstance().addNewGhost(g1);
        GameController.getInstance().addNewGhost(g2);
        GameController.getInstance().addNewGhost(g3);
        
        GameController.getInstance().play(actor);
        
        assertEquals(g1, GameController.getInstance().getGhosts().get(0));
        assertEquals(3, GameController.getInstance().getGhosts().size());
    }
    
    @Test
    void testPlayDestroyedGhost() {
    	Actor actor = new GhostDoctor();
        
        Ghost g1 = new GaGhost();
        Ghost g2 = new PryGhost();
        Ghost g3 = new PooYaGhost(5);
        
        GameController.getInstance().getGhosts().clear();
        GameController.getInstance().getItems().clear();
        GameController.getInstance().addNewGhost(g1);
        GameController.getInstance().addNewGhost(g2);
        GameController.getInstance().addNewGhost(g3);
        
        GameController.getInstance().play(actor);
        
        assertEquals(g2, GameController.getInstance().getGhosts().get(0));
        assertEquals(3, GameController.getInstance().getGhosts().size());
    }
    
    @Test
    void testPlayWithItem() {
    	Actor actor = new Villager();
        
        Ghost g1 = new GaGhost();
        Ghost g2 = new PryGhost();
        Ghost g3 = new PooYaGhost(0);
        
        Item item = new Leklai();
        
        GameController.getInstance().addNewItem(item);
        
        GameController.getInstance().getGhosts().clear();
        GameController.getInstance().getItems().clear();
        GameController.getInstance().addNewGhost(g1);
        GameController.getInstance().addNewGhost(g2);
        GameController.getInstance().addNewGhost(g3);
        
        GameController.getInstance().play(actor);
        
        assertEquals(0, g1.getHp());
        assertEquals(3, g2.getHp());
        assertEquals(10, g3.getHp());
    }
    @Test 
    void testIsGameOver() {
    	assertEquals(true, GameController.getInstance().isGameOver());
    	GameController.getInstance().setHp(-3);
    	assertEquals(true, GameController.getInstance().isGameOver());
    	GameController.getInstance().setHp(10);
    	GameController.getInstance().addNewActor(new Villager());
    	assertEquals(false, GameController.getInstance().isGameOver());
    	GameController.getInstance().setHp(-3);
    	assertEquals(true, GameController.getInstance().isGameOver());
    }

}