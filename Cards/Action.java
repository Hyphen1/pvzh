import java.util.ArrayList;
import PVZH;

public class Action {
	public ArrayList<String> targets;
	
	public Action() {
		targets = new ArrayList<String>();
	}
	
	public Action(ArrayList<String> inp) {
		targets = inp;
	}
	
}