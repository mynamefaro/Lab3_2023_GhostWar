package logic.ghost;

import logic.game.GameController;

public class PooYaGhost extends HighGhost{
	int power;
	public PooYaGhost(int power) {
		super();
		this.power = power;
	}
	public void attact() {
		GameController.getInstance().setHp(GameController.getInstance().getHp() - this.power);
		GameController.getInstance().setScore(GameController.getInstance().getScore() - this.power);
	}
	public String toString() {
		return "PooYaGhost [HP: " + this.getHp() + " , Power" + this.power + "]";
	}
	@Override
	public int getLevel() {
		return 10;
	}
	@Override
	public void damange() {
		for(Ghost ghost : GameController.getInstance().getGhosts()) {
			if(ghost instanceof LowGhost) {
				((LowGhost)ghost).decreaseHp(-power);
			}
			if(ghost instanceof HighGhost) {
				((HighGhost)ghost).decreaseHp(-power);
			}
		}
		
	}
}
