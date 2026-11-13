package vorarbeit.bibliotheksVerwaltung;

import java.util.Scanner;

public class Mitarbeiter extends Nutzer {

	public Mitarbeiter(String name, String pw, int id) {
		super(name, pw, id);
		// TODO Auto-generated constructor stub
	}
	
	public Mitarbeiter(Scanner scan) {
		super(scan);
	}

	@Override
	public String toString() {
	    return "ID: " + ID + ", Name: " + name;
	}

}
