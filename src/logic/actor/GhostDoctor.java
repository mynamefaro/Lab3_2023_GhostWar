package logic.actor;

import logic.game.GameController;
import logic.ghost.Ghost;
import logic.ghost.HighGhost;
import logic.ghost.LowGhost;
import logic.item.Amulet;
import logic.item.Banana;
import logic.item.Item;
import utils.Config;

public class GhostDoctor extends Actor{
	
	@Override
	public int getLevel() {
		return Config.GhostDoctorLevel;
	}
	@Override
	public void attack() {
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
