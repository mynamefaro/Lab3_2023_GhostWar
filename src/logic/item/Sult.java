package logic.item;

import logic.game.GameController;
import logic.ghost.Ghost;
import logic.ghost.PryGhost;
import utils.Config;

public class Sult extends Item{
	private int ppt;
	public Sult(int ppt) {
		this.ppt = ppt;
	}
	@Override
	public int getLevel() {
		return Config.SultLevel;
	}
	@Override
	//TODO: Write your code here.
	public void effect() {
		for(Ghost ghost : GameController.getInstance().getGhosts()) {
			if(ghost instanceof PryGhost) {
				((PryGhost) ghost).setPpt(((PryGhost) ghost).getPpt() + this.ppt);
			}
		}
	}
	//==========================
	public String toString() {
		return "Sult [PPT: " + this.ppt + "]";
	}
}
