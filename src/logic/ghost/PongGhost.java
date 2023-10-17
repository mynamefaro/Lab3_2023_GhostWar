package logic.ghost;

import logic.game.GameController;
import utils.Config;

public class PongGhost extends HighGhost{
	int power;
	public PongGhost() {
		super();
		this.power = Config.PongGhostPower;
	}
	public PongGhost(int power) {
		super();
		this.power = power;
	}
	public void attack() {
		GameController.getInstance().setHp(GameController.getInstance().getHp() - this.power);
	}
	public String toString() {
		return "PongGhost [HP: " + this.getHp() + " , Power: " + this.power + "]";
	}
	@Override
	public int getLevel() {
		return Config.PongGhostLevel;
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
