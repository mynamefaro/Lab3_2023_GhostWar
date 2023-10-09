package logic.item;

import logic.game.GameController;
import logic.ghost.Ghost;
import logic.ghost.PryGhost;

public class Sult extends Item{
	private int ppt;
	public Sult(int ppt) {
		this.ppt = ppt;
	}
	@Override
	public int getLevel() {
		return 1;
	}
	@Override
	public void effect() {
		for(Ghost ghost : GameController.getInstance().getGhosts()) {
			if(ghost instanceof PryGhost) {
				((PryGhost) ghost).setPpt(((PryGhost) ghost).getPpt() + this.ppt);
			}
		}
	}
	public String toString() {
		return "Sult [PPT: " + this.ppt + "]";
	}
}
