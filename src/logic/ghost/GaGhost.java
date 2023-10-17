package logic.ghost;

import logic.game.GameController;
import utils.Config;

public class GaGhost extends LowGhost{
	private int energy;
	public GaGhost() {
		super();
		this.energy = Config.GaGhostPower;
	}
	public GaGhost(int energy) {
		super();
		this.energy = energy;
	}
	public void attack() {
		GameController.getInstance().setHp(GameController.getInstance().getHp() - this.energy);
		
	}
	public String toString() {
		return "GaGhost [HP: " + this.getHp() + " , Energy: " + this.energy + "]";
	}
}
