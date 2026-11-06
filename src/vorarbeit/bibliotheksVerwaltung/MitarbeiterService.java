package vorarbeit.bibliotheksVerwaltung;

import java.util.Scanner;

public class MitarbeiterService {
	
	String auswahl;
	String name;
	int  ID;
	String pw;
	
	Scanner scan = new Scanner(System.in);
	
	
	public MitarbeiterService(Scanner scan) {
		this.scan = scan;
	}
	
	public MitarbeiterMenuCase start(String auswahl) {
		
		if (auswahl.equals("1")){
			mitarbeiterAnmeldung();
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
		System.out.println("Passwort:");
		pw = scan.nextLine();
		return null;
		
		
	}


	private void mitarbeiterAnmeldung() {
		
		System.out.println("Ihre Login-Daten:");
		System.out.println("Name:");
		name = scan.nextLine();
		System.out.println("Passwort:");
		pw = scan.nextLine();
		
		
	}
	
	
}
