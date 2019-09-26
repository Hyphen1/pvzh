public class Currency {
	public int sunCount;
	public int brainsCount;
	
	public Currency() {
		sunCount = 0;
		brainsCount = 0;
	}
	
	public Currency(int s, int b) {
		sunCount = i;
		brainsCount = b;
	}
	
	public void setSun(int s) {
		sunCount = s;
	}
	
	public void setBrains(int b) {
		brainsCount = b;
	}
	
	public void increaseSun(int amount) {
		sunCount += amount;
	}
	
	public void decreaseSun(int amount) {
		sunCount -= amount;
	}
	
	public void increaseBrains(int amount) {
		brainsCount += amount;
	}
	
	public void decreaseBrains(int amount) {
		brainsCount -= amount;
	}
}