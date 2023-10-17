package logic.ghost;

import utils.Config;

public abstract class HighGhost extends Ghost{
	//TODO: Write your code here.
	public HighGhost() {
		super(Config.HighGhostHp);
	}
	
	//TODO: Write your code here.
	public abstract void damange();
	//===========================
}
