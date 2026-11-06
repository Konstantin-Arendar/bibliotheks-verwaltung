package vorarbeit.bibliotheksVerwaltung;

import java.util.Scanner;

public class MitarbeiterMenu {
	
	
	Scanner scan = new Scanner(System.in);
	private final MitarbeiterService mitarbeiter = new MitarbeiterService(scan);
	
	
	public MitarbeiterMenu(Scanner scan) {
		this.scan = scan;
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
			
				/*	
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
				
				
			case "1" -> {
				return MitarbeiterMenuCase.ANMELDEN;
			}
			
			case "2" -> {
				return MitarbeiterMenuCase.REGISTRIEREN;
			}
			case "3" -> {
				return MitarbeiterMenuCase.ZURUCK;
			}
			
			default -> System.out.println("Bitte 1, 2 oder 3.");
		}
		*/
			menuCase = switch (auswahl) {
			
		    case "1" -> {
		    	mitarbeiter.start(auswahl);
		    	yield MitarbeiterMenuCase.ANMELDEN;
		    }
		    case "2" -> {
		    	mitarbeiter.start(auswahl);
		    	yield MitarbeiterMenuCase.REGISTRIEREN;
		    }
		    case "3" -> MitarbeiterMenuCase.ZURUCK;
		    
			default -> throw new IllegalArgumentException("Unexpected value: " + auswahl);
			};
			return menuCase;
		}
	}
}
	

