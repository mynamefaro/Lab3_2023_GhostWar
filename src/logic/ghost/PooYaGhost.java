package logic.ghost;

import logic.game.GameController;
import utils.Config;

public class PooYaGhost extends HighGhost{
	int power;
	public PooYaGhost(int power) {
		super();
		this.power = power;
	}
	public void attack() {
		GameController.getInstance().setHp(GameController.getInstance().getHp() - this.power);
		GameController.getInstance().setScore(GameController.getInstance().getScore() - this.power);
	}
	public String toString() {
		return "PooYaGhost [HP: " + this.getHp() + " , Power: " + this.power + "]";
	}
	@Override
	public int getLevel() {
		return Config.PooYaGhostLevel;
	}
	@Override
	public void damange() {
		for(Ghost ghost : GameController.getInstance().getGhosts()) {
			ghost.decreaseHp(-power);
		}
		
	}
}
