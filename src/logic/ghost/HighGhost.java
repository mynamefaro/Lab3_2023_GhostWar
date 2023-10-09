package logic.ghost;

public abstract class HighGhost extends Ghost{
	private int Hp;
	public HighGhost() {
		this.Hp = 10;
	}
	public boolean isDestroyed() {
		return getHp() <= 0;
	}
	public int getHp() {
		return Hp;
	}
	public void decreaseHp(int amount) {
		this.Hp -= amount;
	}
	public abstract int getLevel();
	public abstract void attact();
	public abstract void damange();
}
