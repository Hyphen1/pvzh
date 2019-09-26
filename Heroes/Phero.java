import PVZH;

public class Phero {
	
	public int hp;
	public int blockmeter;
	public String name;
	//public Pprotected specials;
	
	public Phero () {
		hp = 20;
		blockmeter = 0;
		name = "";
	}
	
	public void setVals(int i, int j, int k) {
		hp = i;
		blockmeter = j;
		name = k;
	}
	
	//Green Shadow
	public void setGS() {
		hp = 20;
		blockmeter = 0;
		name = "Green Shadow";
	}
}