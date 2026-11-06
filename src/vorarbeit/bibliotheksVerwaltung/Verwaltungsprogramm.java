package vorarbeit.bibliotheksVerwaltung;
import java.util.*;
//import vorarbeit.bibliotheksVerwaltung.BibliothekUseCase;
// import nicht benötigt da ENUM im selben package liegt



public class Verwaltungsprogramm {
	
	
	public static void main(String[] args) {
		Verwaltungsprogramm verwaltung = new Verwaltungsprogramm();
		verwaltung.anwendung();
	}
	
	BibliothekUseCase status = BibliothekUseCase.START_MENU;
	ZustandUseCase zustand = ZustandUseCase.ENTRY;
	
	private final Scanner scan = new Scanner(System.in);
	private final MitarbeiterMenu mitarbeiterMenu = new MitarbeiterMenu(scan);
	private final StartMenu start = new StartMenu(scan);
	private final Gast gast = new Gast(scan);
	
	

	public BibliothekUseCase anwendung() {
		
		while(status != BibliothekUseCase.BEENDEN) {
		/*	
			switch (status) {  ALTE LÖSUNG ZUM VERGLEICH
				case START_MENU -> {
					
					switch (zustand) {
					case ENTRY ->{
						System.out.println("Hallo, willkommen!");
						status = start.start();
						zustand = ZustandUseCase.ENTRY;
						}
					
					case DO -> {
						
						zustand = ZustandUseCase.EXIT;
						}
						
					case EXIT -> {
						zustand = ZustandUseCase.ENTRY;
						}
					}
				}
				
				
				case GAST_MENU -> {
					
					switch(zustand) {
					case ENTRY -> {
						System.out.println("Gastmenü erriecht");
						status = gast.start();
						zustand = ZustandUseCase.DO;
						}
						
					case DO -> {
						
						zustand = ZustandUseCase.EXIT;
						}
						
					case EXIT -> {
						zustand = ZustandUseCase.ENTRY;
						}
					}
				}
				
					
				case MITARBEITER_MENU -> {
					
					switch(zustand) {
					case ENTRY -> {
						status = mitarbeiterMenu.start();
						zustand = ZustandUseCase.DO;
					}
					
					case DO -> {
						
						zustand = ZustandUseCase.EXIT;
					}
						
					case EXIT -> {
						zustand = ZustandUseCase.ENTRY;
						}
					}
				}	
					
			case BEENDEN -> {
					return BibliothekUseCase.BEENDEN;		
				}
			}
		}
		return status;
		*/
		
			status = switch (status) {
		    case START_MENU -> start.start();
		    case GAST_MENU -> gast.start();
		    case MITARBEITER_MENU -> {
		    	
		    	MitarbeiterMenuCase ergebnis = mitarbeiterMenu.start();

		        if (ergebnis == MitarbeiterMenuCase.ZURUCK) {
		            status = BibliothekUseCase.START_MENU;
		        	}
		        yield status;
		    	}
		    case BEENDEN -> BibliothekUseCase.BEENDEN;
			};
		}
		return status;
	}
}	
	
	
	

