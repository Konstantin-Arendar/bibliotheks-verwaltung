package vorarbeit.bibliotheksVerwaltung;
import java.util.Scanner;

public class MitarbeiterService {
	
	String auswahl;
	String name;
	int  ID;
	String pw;
	
	
	
	
	Scanner scan = new Scanner(System.in);
	private MitarbeiterRipository mitarbeiter = new MitarbeiterRipository();

	
	int index_name = mitarbeiter.getIndexName();
	int index_pw = mitarbeiter.getIndexPW();
	
	
	public MitarbeiterService(Scanner scan) {
		this.scan = scan;
	}
	
	public MitarbeiterService() {
		
	}

	public MitarbeiterMenuCase start(String auswahl) {
		
		if (auswahl.equals("1")){
			mitarbeiterAnmeldung();
			return MitarbeiterMenuCase.DEFAULT;
		}
		
		if (auswahl.equals("2")) {
			mitarbeiterRegistrierung();
		}
		return null;
	}
	
	private MitarbeiterService mitarbeiterRegistrierung() {
		System.out.println("Ihre Login-Daten:");
		System.out.println("Name:");
		name = scan.nextLine();
		mitarbeiter.mitarbeiterNameHinzufügen(name);
		System.out.println("Passwort:");
		pw = scan.nextLine();
		mitarbeiter.mitarbeiterPasswortHinzufügen(pw);
		return null;
		
		
	}


	private void mitarbeiterAnmeldung() {
		System.out.println("Ihre Login-Daten oder Z für zurück:");
		System.out.println("Name:");
		name = scan.nextLine();
		System.out.println(name);
		if (name.equals("Z")) {
			System.out.println("Z-Bedingung erreicht");
			return;
			}
		
		mitarbeiter.mitarbeiterNameSuchen(name);
		System.out.println("Passwort:");
		pw = scan.nextLine();
		mitarbeiter.mitarbeiterPasswortSuchen(pw);
		
		mitarbeiterAnmelden();
			
	}
	
	public void mitarbeiterAnmelden() {
		while(true) {
			if (index_name == -1 || index_pw == -1) {
				System.out.println("Unbekannter Name oder falsches Passwort.");
				start("1");
				
			}
			if(index_name == index_pw) {
				System.out.println("Anmeldung erfolgreich. Mitarbeiter-Menü bitte implementieren.");
				break;
			}else {
				System.out.println("Falsche Indexierung anscheinend.");
				start("1");
			}
		}
	}
	
	
}
