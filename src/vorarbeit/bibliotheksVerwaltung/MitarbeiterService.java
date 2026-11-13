package vorarbeit.bibliotheksVerwaltung;
import java.util.Scanner;

public class MitarbeiterService extends Mitarbeiter{
	
	
	public MitarbeiterService(String name, String pw, int id) {
		super(name, pw, id);
		
	}
	

	public MitarbeiterService(Scanner scan) {
		super(scan);
	}


	String auswahl;
	
	Scanner scan = new Scanner(System.in);
	private MitarbeiterRepository repository = new MitarbeiterRepository();
	
	int id = repository.neueMitarbeiterID();

	public MitarbeiterMenuCase start(String auswahl) {
		
		if (auswahl.equals("1")){
			mitarbeiterAnmeldungMenu();
			return MitarbeiterMenuCase.DEFAULT;
		}
		
		if (auswahl.equals("2")) {
			mitarbeiterRegistrierungMenu();
		}
		
		if (auswahl.equals("3")) {
			repository.mitarbeiterListeLöschen();
			System.out.println("Liste gelöscht.");
		}
		
		if (auswahl.equals("4")) {
			repository.mitarbeiterListeAusgeben();
			
		}
		return null;
	}


	private void mitarbeiterRegistrierungMenu() {
		
		int id = repository.neueMitarbeiterID();
		
		
		System.out.println("Ihre Login-Daten:");
		
		System.out.println("Name:");
		name = scan.nextLine();
		
		
		System.out.println("Passwort:");
		pw = scan.nextLine();
		
		Mitarbeiter mitarbeiter = new Mitarbeiter(name , pw, id);
		
		
		repository.mitarbeiterHinzufügen(mitarbeiter);
		System.out.println("Mitarbeiter erfolgreich registriert");
		
	}
	
	
	private void mitarbeiterAnmeldungMenu() {
		
		System.out.println("Ihre Login-Daten oder Z für zurück:");
		System.out.println("Name:");
		name = scan.nextLine();
		System.out.println(name);
		if (name.equalsIgnoreCase("Z")) {
			System.out.println("Z-Bedingung erreicht");
			return;
			}
		
		repository.mitarbeiterSuchen(name);
		
		System.out.println("Passwort:");
		pw = scan.nextLine();
		if (pw.equalsIgnoreCase("Z")) {
			System.out.println("Z-Bedingung erreicht");
			return;
			}
		
		
		mitarbeiterVerifizierung(name, pw);
		
	}
	
	
	public boolean mitarbeiterVerifizierung(String name, String pw) {

	    Mitarbeiter m = repository.mitarbeiterSuchen(name);

	    if (m == null) {
	        return false;
	    }

	    return m.getPw().equals(pw);
	}	
}
