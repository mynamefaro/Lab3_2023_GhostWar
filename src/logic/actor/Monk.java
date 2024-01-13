package logic.actor;

import logic.game.GameController;
import logic.ghost.Ghost;
import logic.ghost.HighGhost;
import utils.Config;

public class Monk extends Actor{
	
	@Override
	public int getLevel() {
		return Config.MonkLevel;
	}
	@Override
	public void attack() {
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
