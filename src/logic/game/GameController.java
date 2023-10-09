package logic.game;

import java.util.ArrayList;

import logic.actor.Actor;
import logic.actor.Villager;
import logic.ghost.Ghost;
import logic.item.Item;
import utils.GameUtils;

public class GameController {
	private int hp;
	private int score;
	private static GameController instance;
	private ArrayList <Actor> actors;
	private ArrayList <Ghost> ghosts;
	private ArrayList <Item> items;
	public GameController() {
		
		this.actors = new ArrayList <Actor> ();
		this.ghosts = new ArrayList <Ghost> ();
		this.items = new ArrayList <Item> ();

		initGame();
		
		
	}
	private void initGame() {
		setHp(10);
		setScore(0);
		
		addNewActor(new Villager());
		
		for(int i = 0;i < 5;++i) {
			addNewGhost(GameUtils.getRandomGhost());
		}
	}
	public static GameController getInstance() {
		if(instance == null)
			instance = new GameController();
		return instance;
	}
	public void updateGameController() {
		GameIO.showCurrentGhost(ghosts);
		Actor selectedActor = GameIO.selectActor(this.actors);
		
		
		for(Item item:items) {
			item.effect();
		}
		selectedActor.attact();
		
		Ghost currentGhost = this.getGhosts().get(0);
		currentGhost.attact();
		
		GameIO.showGameState();
		
		if(currentGhost.isDestroyed()) {
			this.getGhosts().remove(0);
			this.getGhosts().add(GameUtils.getRandomGhost());
		}
		if(isGameOver()) {
			
		}else {
			updateGameController();
		}
			
		
	}
	public Boolean isGameOver() {
		return this.getHp() <= 0 || actors.isEmpty();
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getScore() {
		return score;
	}
	public ArrayList<Ghost> getGhosts() {
		return ghosts;
	}
	public ArrayList<Item> getItems() {
		return items;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void addNewActor(Actor actor) {
		this.actors.add(actor);
	}
	public void addNewItem(Item item) {
		this.items.add(item);
	}
	public void addNewGhost(Ghost ghost) {
		this.ghosts.add(ghost);
	}
}
