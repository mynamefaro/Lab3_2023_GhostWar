package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import logic.actor.Actor;
import logic.actor.GhostDoctor;
import logic.actor.Monk;
import logic.actor.Monkey;
import logic.actor.Villager;
import logic.ghost.GaGhost;
import logic.ghost.Ghost;
import logic.ghost.MaBongGhost;
import logic.ghost.PongGhost;
import logic.ghost.PooYaGhost;
import logic.ghost.PryGhost;
import logic.item.Amulet;
import logic.item.Banana;
import logic.item.Item;
import logic.item.Leklai;
import logic.item.Sult;

public class GameUtils {
	
	
	public static Ghost getNewGhost(int x) {
		Random rand = Randomizer.getRandomizer();
		Ghost GaGhost = new GaGhost(rand.nextInt(6));
		Ghost MaBongGhost = new MaBongGhost(rand.nextInt(4), 1);
		Ghost PongGhost = new PongGhost(rand.nextInt(2));
		Ghost PooYaGhost = new PooYaGhost(rand.nextInt(2));
		Ghost PryGhost = new PryGhost(rand.nextInt(3),rand.nextInt(1));
		
		ArrayList<Ghost> GhostList = new ArrayList<Ghost>(Arrays.asList(GaGhost, MaBongGhost, PongGhost, PooYaGhost, PryGhost));
		
		return GhostList.get(x);
		
	}
	public static Ghost getRandomGhost() {
		Random rand = Randomizer.getRandomizer();
		return getNewGhost(rand.nextInt(5));
	}
	
	public static Actor getNewActor(int x) {
		Random rand = Randomizer.getRandomizer();
		Actor villager = new Villager();
		Actor monk = new Monk();
		Actor ghostDoctor = new GhostDoctor();
		Actor monkey = new Monkey();
		
		ArrayList<Actor> ActorList = new ArrayList<Actor>(Arrays.asList(villager, monk, ghostDoctor, monkey));
		
		return ActorList.get(x);
		
	}
	public static Item getNewItem(int x) {
		Random rand = Randomizer.getRandomizer();
		Item amulet = new Amulet();
		Item banana = new Banana();
		Item leklai = new Leklai();
		Item sult = new Sult(2);
		
		ArrayList<Item> ItemList = new ArrayList<Item>(Arrays.asList(amulet, banana, leklai, sult));
		
		return ItemList.get(x);
		
	}
}
