package logic.ghost;

import logic.game.GameController;

public class PongGhost extends HighGhost{
	int power;
	public PongGhost() {
		super();
		this.power = 1;
	}
	public PongGhost(int power) {
		super();
		this.power = power;
	}
	public void attact() {
		GameController.getInstance().setHp(GameController.getInstance().getHp() / this.power);
	}
	public String toString() {
		return "PongGhost [HP: " + this.getHp() + " , Power" + this.power + "+]";
	}
	@Override
	public int getLevel() {
		return 5;
	}
	@Override
	public void damange() {
		for(Ghost ghost : GameController.getInstance().getGhosts()) {
			if(ghost instanceof LowGhost) {
				((LowGhost)ghost).decreaseHp(-power);
			}
		}
		
	}
}
