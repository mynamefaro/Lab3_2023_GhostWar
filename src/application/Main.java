package application;

import logic.game.GameController;

import java.util.*;

public class Main {
    public static void main(String[] args) {
    	System.out.println(" _       _____    ____  _   _______   __________\r\n"
    			+ "| |     / /   |  / __ \\/ | / /  _/ | / / ____/ /\r\n"
    			+ "| | /| / / /| | / /_/ /  |/ // //  |/ / / __/ / \r\n"
    			+ "| |/ |/ / ___ |/ _, _/ /|  // // /|  / /_/ /_/  \r\n"
    			+ "|__/|__/_/  |_/_/ |_/_/ |_/___/_/ |_/\\____(_)   \r\n"
    			+ "                                                ");
        GameController gameInstance = GameController.getInstance();
        gameInstance.updateGameController();
        
        System.out.println("  _________    __  _____________ _    ____________ \r\n"
        		+ "  / ____/   |  /  |/  / ____/ __ \\ |  / / ____/ __ \\\r\n"
        		+ " / / __/ /| | / /|_/ / __/ / / / / | / / __/ / /_/ /\r\n"
        		+ "/ /_/ / ___ |/ /  / / /___/ /_/ /| |/ / /___/ _, _/ \r\n"
        		+ "\\____/_/  |_/_/  /_/_____/\\____/ |___/_____/_/ |_|  \r\n"
        		+ "                                                    ");
        
    }
}
