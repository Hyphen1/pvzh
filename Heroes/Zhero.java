import PVZH;

public class Zhero {
	
	public int hp;
	public int blockmeter;
	public String name;
	//public Zprotected specials;
	
	public Zhero () {
		hp = 20;
		blockmeter = 0;
		name = "";
	}
	
	public void setVals(int i, int j, int k) {
		hp = i;
		blockmeter = j;
		name = k;
	}
	
	//Super Brains
	public void setSB() {
		hp = 20;
		blockmeter = 0;
		name = "Super Brains";
	}
}