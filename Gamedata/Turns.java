import PVZH;
import java.util.*;

public class Turns {
	
	public int turnNum; //the numberth turn it is
	
	public void setOne() {
		turnNum = 1;
	}
	
	public void increase() {
		turnNum += 1;
	}
	
	public void startGame() {
		
		this.setOne();
		
		//configuring heroes
		Phero gs;
		Zhero sb;
		gs.setGS;
		sb.setSB;
		
		//configuring sun and brains
		Currency current = new Currency(1, 1);
		Currency standard = new Currency(turnNum, turnNum);
		
		//populate deck
		Deck d = new Deck();
		d.zPopulate();
		d.pPopulate();
		
		//no mulligan yet, 4 random cards from deck
		Hand ph = new Hand();
		ph.add(pPickRandom());
		ph.add(pPickRandom());
		ph.add(pPickRandom());
		ph.add(pPickRandom());
		
		Hand zh = new Hand();
		zh.add(zPickRandom());
		zh.add(zPickRandom());
		zh.add(zPickRandom());
		zh.add(zPickRandom());
		
		//instantiating the field
		Field field = new Field();
		
		//phase one: zombies place actors. Using Scanner right now for UI.
		while (true) {
			Scanner input = new Scanner(System.in);
			System.out.println("Play a card? y/n ");
			String ans = input.next();
			if (ans.equals("y")) {
				System.out.println("Which one? Enter index ");
				System.out.println(zh.hand);
				int ind = input.nextInt();
				if (zh.hand[ind].isActor()) {
					Zombiephase zphase = new Zombiephase(zh.hand[ind]);
					System.out.prinln("Which lane? 1, 2, 3, 4, 5 ");
					int lane = input.nextInt();
					if (field.lanes[lane-1] == 'W' && !zphase.zombie.props.contains('aq')) {
						System.out.println("Can't get that");
					}
					else {
						zphase.placeActor(lane, 2);
						zh.discard(ind);
					}
				}
				else {
					System.out.println("Can't get that");
				}
			}
			else {
				break;
			}
			
		}
		
		//phase two: plants place actors and use actions
		while (true) {
			Scanner input = new Scanner(System.in);
			System.out.println("Play a card? y/n ");
			String ans = input.next();
			if (ans.equals("y")) {
				System.out.println("Which one? Enter index ");
				System.out.println(ph.hand);
				int ind = input.nextInt();
				if (ph.hand[ind].isActor()) {
					Plantphase pphase = new Plantphase(ph.hand[ind]);
					System.out.prinln("Which lane? 1, 2, 3, 4, 5 ");
					int lane = input.nextInt();
					if (field.lanes[lane-1] == 'W' && !pphase.plant.props.contains('aq')) {
						System.out.println("Can't get that");
					}
					else {
						pphase.placeActor(lane, 2);
						ph.discard(ind);
					}
				else if (ph.hand[ind].isTrick()) {
					;
				}
				//temporary can't get, protected class cards not yet programmed
				else {
					System.out.println("Can't get that");
				}
			}
			else {
				break;
			}
			
		}
		
		//phase three: zombies use actions
		
	}
}