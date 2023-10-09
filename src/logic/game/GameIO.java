package logic.game;

import java.util.ArrayList;
import java.util.Scanner;

import logic.actor.Actor;
import logic.actor.Monk;
import logic.ghost.Ghost;
import logic.item.Item;
import utils.GameUtils;

public class GameIO {
	private static final Scanner sc = new Scanner(System.in);
	
	public static Actor selectActor(ArrayList<Actor> actors){
		Actor selectedActor = null;
		int x;
		System.out.print("Actor =>\n");
		for(int i = 0;i < actors.size();++i) {
			System.out.print("<" + i + "> " + actors.get(i).toString() + "\n");
		}
		System.out.print("<" + actors.size() + "> " + "For Get New Actor" + "\n");
		System.out.print("Please Select Your Actor : ");
		x = sc.nextInt();
		if(x == actors.size()) {
			buyNewActor();
			
			System.out.print("Actor =>\n");
			for(int i = 0;i < actors.size();++i) {
				System.out.print("<" + i + "> " + actors.get(i).toString() + "\n");
			}
			System.out.print("<" + actors.size() + "> " + "For Get New Actor" + "\n");
			System.out.print("Please Select Your Actor : ");
			x = sc.nextInt();
		}
		selectedActor = actors.get(x);
		return selectedActor;
	}
	public static void showCurrentGhost(ArrayList<Ghost> ghosts) {
		Actor selectedActor = null;
		System.out.print("Current Ghost => \n" + ghosts.get(0).toString() + "\n");
	}
	public static void showGameState() {
		System.out.print("===Attact !!===\n");
		System.out.print("Your Score => " + GameController.getInstance().getScore() + "\n");
		System.out.print("Your HP => " + GameController.getInstance().getHp() + "\n");
		System.out.print("===============\n");
	}
	public static void buyNewActor() {
		System.out.print("==========Actor Shop==========\n"
				+ "The Cost of Actor is Actor Level"
				+ "<0> Villager\n"
				+ "<1> Monk\n"
				+ "<2> GhostDoctor\n"
				+ "<3> LopburiMonkey\n");
		int x = sc.nextInt();
		GameController.getInstance().addNewActor(GameUtils.getNewActor(x));
	}
}
