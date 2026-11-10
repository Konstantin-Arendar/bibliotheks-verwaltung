package vorarbeit.bibliotheksVerwaltung;
import java.io.Serializable;
import java.util.*;


public class MitarbeiterRipository implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	private List<String> mitarbeiterNamen = new ArrayList<>();
	private List<String> mitarbeiterPassworter = new ArrayList<>();
	
	
	private int index_name = -2;
	private int index_pw = -10;
	
	
	
	public List<String> getMitarbeiterPassworter() {
		return mitarbeiterPassworter;
	}
	
	public List<String> getMitarbeiterNamen() {
		return mitarbeiterNamen;
	}
	
	public void mitarbeiterNameHinzufügen(String name) {
		mitarbeiterNamen.add(name);
	}
	public void mitarbeiterPasswortHinzufügen(String passwort) {
		mitarbeiterPassworter.add(passwort);
	}

	public int mitarbeiterNameSuchen(String name) {
		index_name = mitarbeiterNamen.indexOf(name);
		return index_name;
		
	}

	public int mitarbeiterPasswortSuchen(String pw) {
		index_pw = mitarbeiterPassworter.indexOf(pw);
		return index_pw;
	}

	public int getIndexName() {
		return index_name;
	}
	
	public int getIndexPW() {
		return index_pw;
	}
	
	
	
}
