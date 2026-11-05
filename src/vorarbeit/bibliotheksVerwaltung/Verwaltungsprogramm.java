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
	
		while(true) {
			
			int a = 0;
			a++;
			System.out.println("Das ist der "+ a + " Loop im Anwendungsprogramm.");
			switch (status) {
				case START_MENU:
					
					switch (zustand) {
					case ENTRY:
						System.out.println("Hallo, willkommen!");
						status = start.start();
						zustand = ZustandUseCase.ENTRY;
						break;
					
					case DO:
						
						zustand = ZustandUseCase.EXIT;
						break;
						
					case EXIT:
						zustand = ZustandUseCase.ENTRY;
						break;
					}
					break;
				
				
				case GAST_MENU:
					
					switch(zustand) {
					case ENTRY:
						System.out.println("Gastmenü erriecht");
						status = gast.start();
						zustand = ZustandUseCase.DO;
						break;
						
					case DO:
						
						zustand = ZustandUseCase.EXIT;
						break;
						
					case EXIT:
						zustand = ZustandUseCase.ENTRY;
						break;
					}
					break;
				
					
				case MITARBEITER_MENU:
					
					switch(zustand) {
					case ENTRY:
						mitarbeiterMenu.start();
						zustand = ZustandUseCase.DO;
						break;
					
					case DO:
						
						zustand = ZustandUseCase.EXIT;
						break;
						
					case EXIT:
						zustand = ZustandUseCase.ENTRY;
						break;
					}
					
					break;
					
					
				case BEENDEN:
					
					System.out.println("Beenden erreicht");
					break;
					
					
				}
			break;
		}
		
		return status;
	}

}	
	
	
	

