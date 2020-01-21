package qIca;

public class Boil {
	private int br;
	private int exTime = 0;
	private	String utensil;
	public void set_br(int a) {
		br = a;
	}
	public boolean set_utensil() {
		if(br==1) {
			utensil = "Jazz";
			return true;
		} else if(br>1 && br<=5) {
			utensil = "Paninkin";
			exTime = 1;
			return true;
		}else if(br>5 && br<=20) {
			utensil = "Pot";
			exTime = 3;
			return true;
		}else {
			System.out.println("You cant boil that amount of eggz");
			return false;
		}
	}
	public int get_br() {
		return br;
	}
	public String get_utensil() {
		return utensil;
	}
	public int get_extraTime() {
		return exTime;
	}
}
