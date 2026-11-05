package vorarbeit.bibliotheksVerwaltung;

public abstract class Medium {
	private final String titel;
	private boolean ausgeliehen;
	private final String isbn; //Kennung
	private final String medium;
	
	public Medium(String titel, boolean ausgeliehen, String isbn, String medium) {
		this.titel = titel;
		this.ausgeliehen = ausgeliehen;
		this.isbn = isbn;
		this.medium = medium;
	}
	
	public void setAusgeliehen(boolean ausgeliehen) {
		this.ausgeliehen = ausgeliehen;
	}
}
// abstract, damit keine Objekte von dieser Klasse erzeugt werden können.
// Konstruktor um Attribute eines grundlegenden Mediums nutzen zu können.
// Setter-Methoden für die Kapselung
// Konstruktor legen Wert beim anlegen fest, Setter nach der erstellung ermöglichen änderungen