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
			
			status = switch (status) {
		    case START_MENU -> start.start();
		    
		    case GAST_MENU -> {
		    	gast.start();  
		    	yield BibliothekUseCase.START_MENU;
		    	
		    	}
		    
		    case MITARBEITER_MENU -> {
		    	MitarbeiterMenuCase ergebnis = mitarbeiterMenu.start();
		    	yield switch (ergebnis) {
		    		case ANMELDEN -> BibliothekUseCase.MITARBEITER_MENU;
		    		case REGISTRIEREN -> BibliothekUseCase.MITARBEITER_MENU;
	            	case ZURUCK -> BibliothekUseCase.START_MENU;
	            	default -> throw new IllegalStateException();
		    		};
		    	}
		    
		    case BEENDEN -> BibliothekUseCase.BEENDEN;
			};
		}
		return status;
	}
}	
	
	
	

