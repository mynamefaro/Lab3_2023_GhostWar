package logic.actor;

import logic.game.GameController;
import logic.ghost.Ghost;
import logic.ghost.HighGhost;
import logic.ghost.LowGhost;
import logic.item.Amulet;
import logic.item.Banana;
import logic.item.Item;

public class Monkey extends Actor{
	
	@Override
	public int getLevel() {
		return 1;
	}
	@Override
	public void attact() {
		// TODO Auto-generated method stub
		Ghost currentGhost = GameController.getInstance().getGhosts().get(0);
		
		boolean isHaveBanana = false;
		for(Item item : GameController.getInstance().getItems()) {
			if(item instanceof Banana) {
				isHaveBanana = true;
				break;
			}
		}
		if(currentGhost instanceof LowGhost) {
			if(isHaveBanana) {
				((LowGhost) currentGhost).decreaseHp(((LowGhost) currentGhost).getHp());
			}else {
				((LowGhost) currentGhost).decreaseHp(getLevel());
			}
		}
	}
	public String toString() {
		return "Monkey";
		
	}
}
