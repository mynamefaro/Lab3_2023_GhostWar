package logic.item;

import logic.game.GameController;
import logic.ghost.Ghost;

public class Banana extends Item{

	@Override
	public int getLevel() {
		return 3;
	}
	@Override
	public void effect() {
		for(Ghost ghost : GameController.getInstance().getGhosts()) {
			System.out.print(ghost + " ");
		}
		System.out.print("\n");
	}
	public String toString() {
		return "Banana";
	}
}
