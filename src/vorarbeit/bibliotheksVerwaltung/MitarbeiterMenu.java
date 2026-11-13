package vorarbeit.bibliotheksVerwaltung;

import java.util.Scanner;

public class MitarbeiterMenu {
	
	
	Scanner scan = new Scanner(System.in);
	private final MitarbeiterService mitarbeiter = new MitarbeiterService(scan);
	
	
	public MitarbeiterMenu(Scanner scan) {
		this.scan = scan;
	}


	public MitarbeiterMenu() {
		
	}


	public MitarbeiterMenuCase start() {
		return mitarbeiterMenu();
		
	}

	
	private MitarbeiterMenuCase mitarbeiterMenu() {
		
		MitarbeiterMenuCase menuCase;
		String auswahl;
		
		
		System.out.println("Mitarbeiter-Menü:");
		System.out.println("(1) für anmelden, (2) für Registrierung, (3) Liste löschen, (4) Liste ausgeben, (5) zurück.");
		
		
		while (true) {
			auswahl = scan.nextLine();
			
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
		    	mitarbeiter.start(auswahl);
		    	yield MitarbeiterMenuCase.TEST;
		    											//3 und 4 nur für admin tests
		    }
		    case "4" ->  {
		    	mitarbeiter.start(auswahl);
		    	yield MitarbeiterMenuCase.TEST;
		    	
		    }
		    case "5" ->  {
		    	yield MitarbeiterMenuCase.ZURUCK;
		    }
		    
		    default -> null;
		    };

		    if (menuCase == null) {
		        System.out.println("Ungültige Eingabe. Bitte erneut versuchen.");
		        System.out.println("");
				
		        System.out.println("Mitarbeiter-Menü:");
				System.out.println("(1) für anmelden, (2) für Registrierung, (3) zurück.");
		        continue;
		    }
			return menuCase;
		}
	}
}
	

