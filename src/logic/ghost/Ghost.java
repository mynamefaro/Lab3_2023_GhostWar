package logic.ghost;

abstract public class Ghost {
	private int hp;
	public Ghost(int hp) {
		this.hp = hp;
	}
	public boolean isDestroyed() {
		return getHp() <= 0;
	}
	public int getHp() {
		return hp;
	}
	public void decreaseHp(int amount) {
		this.hp -= amount;
		if(this.hp < 0) this.hp = 0;
	}
	public abstract int getLevel();
	abstract public void attack();
}
