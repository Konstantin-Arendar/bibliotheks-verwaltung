package vorarbeit.bibliotheksVerwaltung;
import java.io.*;
import java.util.*;


public class MitarbeiterRepository implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private List<Mitarbeiter> mitarbeiterListe = new ArrayList<>();
	
	
	public void mitarbeiterHinzufügen(Mitarbeiter mitarbeiter) {
		
        mitarbeiterListe.add(mitarbeiter);
	}

	public void mitarbeiterSpeichern() {

        try (ObjectOutputStream out =
                new ObjectOutputStream(new FileOutputStream("employee.ser"))) {

            out.writeObject(mitarbeiterListe);

            System.out.println("Mitarbeiter gespeichert: " + mitarbeiterListe);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    public void mitarbeiterLaden() {

        try (ObjectInputStream in =
                new ObjectInputStream(new FileInputStream("employee.ser"))) {

            Object obj = in.readObject();

            if (obj instanceof List<?> listen) {

                mitarbeiterListe = new ArrayList<>();

                for (Object element : listen) {

                    if (element instanceof Mitarbeiter mitarbeiter) {
                        mitarbeiterListe.add(mitarbeiter);
                    } else {
                        throw new IOException("Ungültiger Datentyp in der Mitarbeiterliste");
                    }
                }
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public int neueMitarbeiterID() {

        if (mitarbeiterListe.isEmpty()) {
            return 1;
        }

        return mitarbeiterListe.get(mitarbeiterListe.size() - 1).getID() + 1;
    }
    
    public Mitarbeiter mitarbeiterSuchen(String name) {

        for (Mitarbeiter m : mitarbeiterListe) {
            if (m.getName().equals(name)) {
                return m;
            }
        }

        return null;
    }
    
	public void mitarbeiterListeLöschen() {
	    mitarbeiterListe.clear();
	}
	
	public void mitarbeiterListeAusgeben() {
	    for (Mitarbeiter m : mitarbeiterListe) {
	        System.out.println(m);
	    }
	}

}

