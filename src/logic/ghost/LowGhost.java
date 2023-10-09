package logic.ghost;

public abstract class LowGhost extends Ghost{
	private int Hp;
	public LowGhost() {
		this.Hp = 5;
	}
	public boolean isDestroyed() {
		return getHp() <= 0;
	}
	public int getLevel() {
		return 1;
	}
	public int getHp() {
		return Hp;
	}
	public void decreaseHp(int amount) {
		this.Hp -= amount;
	}
	public abstract void attact();
}
