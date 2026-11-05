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
			
			int i = 0;
			i++;
			System.out.println("Das ist i: "+ i);
			System.out.println("(m): Mitarbeiter," + "\n" + "(k) Kunde" + "\n" + "(a) Ausschalten" );
			String auswahl = scan.nextLine();
			System.out.println("Value von auswahl: "+ auswahl);
		
			if (auswahl.equals("m")) {		//statt auswahl == "m", da "==" referenz auf Objekt und nicht inhalt prüft
				
				
				return BibliothekUseCase.MITARBEITER_MENU;
				
			}	
				
			if(auswahl.equals("k")){
				
				return BibliothekUseCase.GAST_MENU;
			}
			
			if(auswahl.equals("a")) {
				
				System.out.println("Auf Wiedersehen!");
				return BibliothekUseCase.BEENDEN;
				
						
					}else {
						System.out.println("Bitte m, k oder a!");   
					}
					
			}
		
	}


}
