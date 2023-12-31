package logic.ghost;

import logic.game.GameController;
import utils.Config;

public class PryGhost extends LowGhost{
	private int power;
	private int ppt;
	public PryGhost() {
		this.power = Config.PryGhostPower;
		this.ppt = 0;
	}
	public PryGhost(int power) {
		this.power = power;
		this.ppt = 0;
	}
	public PryGhost(int power,int ppt) {
		this.power = power;
		this.ppt = ppt;
	}
	public int getPpt() {
		return ppt;
	}
	public void setPpt(int ppt) {
		this.ppt = ppt;
	}
	public void attack() {
		GameController.getInstance().setHp(GameController.getInstance().getHp() - this.power + this.ppt);
	}
	public String toString() {
		return "PryGhost [HP: " + this.getHp() + " , Power: " + this.power + " , PPT: " + this.ppt + "]";
	}
}
