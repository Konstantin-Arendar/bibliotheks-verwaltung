package vorarbeit.bibliotheksVerwaltung;

import java.util.Scanner;

public class Gast {
	
	
	Scanner scan = new Scanner(System.in);
	
	public Gast(Scanner scan) {
		
		this.scan = scan;
	}

	public BibliothekUseCase start() {
		return gastMenu();
	}
	
	private BibliothekUseCase gastMenu() {
		BibliothekUseCase status = BibliothekUseCase.GAST_MENU;
		System.out.println("Ihre Login-Daten (Gast):" + "\n");
		String loginDaten = scan.nextLine();
		System.out.println(loginDaten);
		return status;
		
	}
}
