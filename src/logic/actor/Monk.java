package logic.actor;

import logic.game.GameController;
import logic.ghost.Ghost;
import logic.ghost.HighGhost;

public class Monk extends Actor{
	
	@Override
	public int getLevel() {
		return 3;
	}
	@Override
	public void attact() {
		// TODO Auto-generated method stub
		Ghost currentGhost = GameController.getInstance().getGhosts().get(0);
		if(currentGhost instanceof HighGhost) {
			((HighGhost) currentGhost).decreaseHp(getLevel());
		}
	}
	public String toString() {
		return "Monk";
		
	}
}
