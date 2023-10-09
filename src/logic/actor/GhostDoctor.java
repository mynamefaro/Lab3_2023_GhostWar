package logic.actor;

import logic.game.GameController;
import logic.ghost.Ghost;
import logic.ghost.HighGhost;
import logic.ghost.LowGhost;
import logic.item.Amulet;
import logic.item.Banana;
import logic.item.Item;

public class GhostDoctor extends Actor{
	
	@Override
	public int getLevel() {
		return 5;
	}
	@Override
	public void attact() {
		// TODO Auto-generated method stub
		Ghost currentGhost = GameController.getInstance().getGhosts().get(0);
		
		if(currentGhost instanceof LowGhost) {
			((LowGhost) currentGhost).decreaseHp(((LowGhost) currentGhost).getHp());
		}
	}
	@Override
	public String toString() {
		return "GhostDoctor";
		
	}

}
