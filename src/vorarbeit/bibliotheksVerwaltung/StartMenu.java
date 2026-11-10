package vorarbeit.bibliotheksVerwaltung;

import java.util.*;


public class StartMenu {
	
	
	BibliothekUseCase status;
	private Scanner scan;
	//private StartMenu starter;

	public StartMenu(Scanner scan) {
		this.scan = scan;
	}
	
	/*public StartMenu(StartMenu starter) {
		this.setStarter(starter);
	}

	

	public void setStarter(StartMenu starter) {
		this.starter = starter;
	}
*/
	public BibliothekUseCase start() {
		return startMenu();
	}
	
private BibliothekUseCase startMenu() {
		
		while(true) {
			
			System.out.println("Willkommen!");
			System.out.println("(m): Mitarbeiter" + "\n" + "(k): Kunde" + "\n" + "(a): Ausschalten" );
			String auswahl = scan.nextLine();
			
			
			switch (auswahl) {
				case "m" -> {
					return BibliothekUseCase.MITARBEITER_MENU;
				}
				
				case "k" -> {
					return BibliothekUseCase.GAST_MENU;
				}
				
				case "a" -> {
					System.out.println("Auf Wiedersehen!");
					return BibliothekUseCase.BEENDEN;
				}
				
				default -> System.out.println("Bitte m, k oder a!");  
			}
		}
	}
}
