package vorarbeit.bibliotheksVerwaltung;

import java.util.Scanner;

public class MitarbeiterMenu {
	
	
	Scanner scan = new Scanner(System.in);
	private final MitarbeiterService mitarbeiter = new MitarbeiterService(scan);
	
	
	public MitarbeiterMenu(Scanner scan) {
		this.scan = scan;
	}


	public MitarbeiterMenu() {
		// TODO Auto-generated constructor stub
	}


	public MitarbeiterMenuCase start() {
		return mitarbeiterMenu();
		
	}

	
	private MitarbeiterMenuCase mitarbeiterMenu() {
		
		//BibliothekUseCase status = BibliothekUseCase.MITARBEITER_MENU; //Reminder for me 
		
		
		MitarbeiterMenuCase menuCase;
		String auswahl;
		
		
		System.out.println("Mitarbeiter-Menü:");
		System.out.println("(1) für anmelden, (2) für Registrierung, (3) zurück.");
		auswahl = scan.nextLine();
		
		while (true) {
			
			
			menuCase = switch (auswahl) {
			
		    case "1" -> {
		    	mitarbeiter.start(auswahl);
		    	yield MitarbeiterMenuCase.ANMELDEN;
		    }
		    case "2" -> {
		    	mitarbeiter.start(auswahl);
		    	yield MitarbeiterMenuCase.REGISTRIEREN;
		    }
		    case "3" ->  {
		    	yield MitarbeiterMenuCase.ZURUCK;
		    }
		    
			default -> throw new IllegalArgumentException("Unexpected value: " + auswahl);
			};
			return menuCase;
		}
	}
}
	

