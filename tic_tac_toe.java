import java.util.ArrayList;
import java.util.Scanner;
public class tic_tac_toe {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
	    ArrayList<String> pos = new ArrayList<String>();
	    int your_turn;
	    boolean a = false;
	    String Turn = " ";
	    
		for (int i=0; i<=9; i++) {
			pos.add(" ");
		}
	    
	    System.out.println("Сега е X");
	    print(pos);
	    
while (true) {
	your_turn = scan.nextInt();

	while (pos.get(your_turn) == "X" || pos.get(your_turn) == "O") {
		System.out.println("ТАМ ВЕЧЕ ИМА!");
		print(pos);
		your_turn = scan.nextInt();
	}
		if (a == false) {
			Turn = "X";
			System.out.println("Сега е O   ");
			a = true;
		} else {
			Turn = "O";
			System.out.println("Сега е X   ");
			a = false;
		}
		pos.set(your_turn, Turn);
		print(pos);
		CheckWin(pos);
	}
}
	public static void print(ArrayList<String> pos) {
		System.out.println("-----------------------");	
		System.out.println("--| "+ pos.get(1) +" |--| "+ pos.get(2) +" |--| "+ pos.get(3) +" |--");
		System.out.println("-----------------------");
		System.out.println("--| "+ pos.get(4) +" |--| "+ pos.get(5) +" |--| "+ pos.get(6) +" |--");
		System.out.println("-----------------------");
		System.out.println("--| "+ pos.get(7) +" |--| "+ pos.get(8) +" |--| "+ pos.get(9) +" |--");
		System.out.println("-----------------------");
	}
	public static void CheckWin (ArrayList<String> pos) {
		if ((pos.get(1) == "X" && pos.get(2) == "X" && pos.get(3) == "X") || (pos.get(4) == "X" && pos.get(5) == "X" && pos.get(6) == "X") || (pos.get(7) == "X" && pos.get(8) == "X" && pos.get(9) == "X") || (pos.get(1) == "X" && pos.get(4) == "X" && pos.get(7) == "X") || (pos.get(2) == "X" && pos.get(5) == "X" && pos.get(8) == "X") || (pos.get(3) == "X" && pos.get(6) == "X" && pos.get(9) == "X") || (pos.get(1) == "X" && pos.get(5) == "X" && pos.get(9) == "X") || (pos.get(3) == "X" && pos.get(5) == "X" && pos.get(7) == "X")) {
			System.out.println("X Печели");
			System.exit(0);
		} else if ((pos.get(1) == "O" && pos.get(2) == "O" && pos.get(3) == "O") || (pos.get(4) == "O" && pos.get(5) == "O" && pos.get(6) == "O") || (pos.get(7) == "O" && pos.get(8) == "O" && pos.get(9) == "O") || (pos.get(1) == "O" && pos.get(4) == "O" && pos.get(7) == "O") || (pos.get(2) == "O" && pos.get(5) == "O" && pos.get(8) == "O") || (pos.get(3) == "O" && pos.get(6) == "O" && pos.get(9) == "O") || (pos.get(1) == "O" && pos.get(5) == "O" && pos.get(9) == "O") || (pos.get(3) == "O" && pos.get(5) == "O" && pos.get(7) == "O")) {
			System.out.println("O Печели");
			System.exit(0);
		} else if ((pos.get(1) == "X" || pos.get(1) == "O") && (pos.get(2) == "X" || pos.get(2) == "O") && (pos.get(3) == "X" || pos.get(3) == "O") && (pos.get(4) == "X" || pos.get(4) == "O") && (pos.get(5) == "X" || pos.get(5) == "O") && (pos.get(6) == "X" || pos.get(6) == "O") && (pos.get(7) == "X" || pos.get(7) == "O") && (pos.get(8) == "X" || pos.get(8) == "O") && (pos.get(9) == "X" || pos.get(9) == "O")) {
			System.out.println("РАВНИ!");
			System.exit(0);
		}
	}
}