package qIca;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Boil E = new Boil();
		int n = 0;
		Scanner cn = new Scanner(System.in);
		System.out.println("How much eggs do you want to boil?");
		n = Integer.parseInt(cn.nextLine());
		E.set_br(n);
		if(E.set_utensil()) {
			System.out.println("You are boiling " + E.get_br() + " in " + E.get_utensil());
			System.out.println("In " + (3+E.get_extraTime()) + " minutes the eggs will be loose. In " + 
			(5 + E.get_extraTime()) + " minutes the yolk will be still liquid. And in " + 
			(7 + E.get_extraTime()) + " they will be ready!");
			System.out.println("After you get them put of the utensil wash them with lukewarm water!");
		}
	}

}
