package logic.ghost;

import logic.game.GameController;

public class GaGhost extends LowGhost{
	private int power;
	public GaGhost() {
		super();
		this.power = 6;
	}
	public GaGhost(int power) {
		super();
		this.power = power;
	}
	public void attact() {
		GameController.getInstance().setHp(GameController.getInstance().getHp() - this.power);
		
	}
	public String toString() {
		return "GaGhost [HP: " + this.getHp() + " , Power" + this.power + "]";
	}
}
