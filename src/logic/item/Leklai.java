package logic.item;

import logic.game.GameController;
import logic.ghost.Ghost;
import logic.ghost.HighGhost;
import logic.ghost.LowGhost;
import utils.Config;

public class Leklai extends Item{

	@Override
	public int getLevel() {
		return Config.LeklaiLevel;
	}
	@Override
	public void effect() {
		for(Ghost ghost: GameController.getInstance().getGhosts()) {
			if(ghost.getLevel() > getLevel() )
				continue;
			if(ghost instanceof LowGhost) {
				((LowGhost) ghost).decreaseHp(5);
			}
			if(ghost instanceof HighGhost) {
				((HighGhost) ghost).decreaseHp(4);
			}
		}
		
	}
	public String toString() {
		return "Leklai";
	}

}
