package logic.item;

import logic.game.GameController;

public class Amulet extends Item{

	@Override
	public int getLevel() {
		return 1;
	}

	@Override
	public void effect() {
		if(GameController.getInstance().getHp() <= 5) {
			GameController.getInstance().setHp(5);
		}
		
	}

	@Override
	public String toString() {
		return "Amulet";
	}

}
