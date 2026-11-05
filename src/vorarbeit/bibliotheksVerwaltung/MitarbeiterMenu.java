package vorarbeit.bibliotheksVerwaltung;

import java.util.Scanner;

public class MitarbeiterMenu {
	
	StartMenu starter;
	Scanner scan = new Scanner(System.in);
	private final MitarbeiterService mitarbeiter = new MitarbeiterService(scan);
	
	
	
	public MitarbeiterMenu(Scanner scan) {
		this.scan = scan;
	}


	public BibliothekUseCase start() {
		return mitarbeiterMenu();
	}

	
	private BibliothekUseCase mitarbeiterMenu() {
		//BibliothekUseCase status = BibliothekUseCase.MITARBEITER_MENU; //Reminder for me 
		MitarbeiterMenuCase menuCase = MitarbeiterMenuCase.DEFAULT;
		ZustandUseCase zustand = ZustandUseCase.ENTRY;
		
		
		String auswahl;
		
		while (true) {
			switch(menuCase) {
					
				case DEFAULT:
					switch(zustand) {
					case ENTRY:
						System.out.println("Mitarbeiter-Menü:");
						System.out.println("(1) für anmelden, (2) für Registrierung, (3) zurück.");
						auswahl = scan.nextLine();
						if (auswahl.equals("1")) { menuCase = MitarbeiterMenuCase.ANMELDEN;}
						if (auswahl.equals("2")) { menuCase = MitarbeiterMenuCase.REGISTRIEREN;}
						if (auswahl.equals("3")) { menuCase = MitarbeiterMenuCase.ZURUCK;}
						
						break;
					case DO:
						
						break;
						
					case EXIT:
						break;
						
					}	
					
				case ANMELDEN:
					switch(zustand) {
						case ENTRY:
							System.out.println("Im Case Anmelden");
							zustand = ZustandUseCase.DO;
							break;
						case DO:
							
							mitarbeiter.start("1");
							break;
						case EXIT:
							break;
					}
					
					
				case REGISTRIEREN:
					switch(zustand) {
					case ENTRY:
						break;
					case DO:
						mitarbeiter.start("2");
						break;
					case EXIT:
						break;
					}
				
				case ZURUCK:
					switch(zustand) {
					case ENTRY:
						
						break;
					case DO:
						
						starter.start();
						break;
					case EXIT:
						break;
				}
					
			}
		}
		
	}


	
}
