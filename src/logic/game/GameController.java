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
	//TODO: Write your code here.
	private void initGame() {
		
		setHp(10);
		setScore(0);
		
		addNewActor(new Villager());
		
		for(int i = 0;i < 10;++i) {
			addNewGhost(GameUtils.getRandomGhost(false));
		}
		
	}
	//===========================
	public static GameController getInstance() {
		if(instance == null)
			instance = new GameController();
		return instance;
	}
	public void updateGameController() {
		
		GameIO.showGameState();
		
		GameIO.showCurrentGhost(ghosts);
		Actor selectedActor = GameIO.selectActor(this.actors);
		GameIO.showItemList(this.items);
		//TODO: Write your code here.
		for(Item item:items) {
			item.effect();
		}
		Ghost currentGhost = this.getGhosts().get(0);
		currentGhost.attack();
		
		selectedActor.attack();
		
		//===========================
		
		
		
		if(currentGhost.isDestroyed()) {
			//TODO: Write your code here.
			this.getGhosts().remove(0);
			this.score += currentGhost.getLevel();
			//===========================
			this.getGhosts().add(GameUtils.getRandomGhost(true));
		}
		
		
		
	}
	//TODO: Write your code here.
	public Boolean isGameOver() {
		return this.getHp() <= 0 || actors.isEmpty();
	}
	//=============================
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
