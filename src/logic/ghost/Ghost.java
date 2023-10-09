package logic.ghost;

public abstract class Ghost {
	abstract public int getLevel();
	abstract public int getHp();
	abstract public boolean isDestroyed();
	abstract public void attact();
}
