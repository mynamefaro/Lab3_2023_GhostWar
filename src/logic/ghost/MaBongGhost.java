package logic.ghost;

import logic.game.GameController;

public class MaBongGhost extends LowGhost{
	private int power;
	private int speed;
	public MaBongGhost(){
		this.power = 4;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public MaBongGhost(int power){
		this.power = power;
		this.speed = 1;
	}
	public MaBongGhost(int power,int speed) {
		this.power = power;
		this.speed = speed;
	}
	public void attact() {
		GameController.getInstance().setHp(GameController.getInstance().getHp() - this.power*this.speed);
		
	}
	public String toString() {
		return "MabongGhost [HP: " + this.getHp() + " , Power" + this.power + " , Speed" + this.speed + "]";
		
	}
}
