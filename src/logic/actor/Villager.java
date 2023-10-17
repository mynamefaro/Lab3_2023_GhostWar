package logic.actor;

import logic.game.GameController;
import logic.ghost.Ghost;
import logic.ghost.HighGhost;
import logic.ghost.LowGhost;
import logic.item.Amulet;
import logic.item.Item;
import utils.Config;

public class Villager extends Actor{
	
	@Override
	public int getLevel() {
		return Config.VillagerLevel;
	}
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		Ghost currentGhost = GameController.getInstance().getGhosts().get(0);
		
		boolean isHaveAmulet = false;
		for(Item item : GameController.getInstance().getItems()) {
			if(item instanceof Amulet) {
				isHaveAmulet = true;
				break;
			}
		}
		if(currentGhost instanceof LowGhost) {
			if(isHaveAmulet) {
				((LowGhost) currentGhost).decreaseHp(getLevel() + 1);
			}else {
				((LowGhost) currentGhost).decreaseHp(getLevel());
			}
		}
	}
	public String toString() {
		return "Villager";
		
	}
}
