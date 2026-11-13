package vorarbeit.bibliotheksVerwaltung;
import java.util.*;
public class Nutzer {
	
	protected String name;
	protected int ID;
	protected String pw;
	private Scanner scan;
	
	
	public Nutzer(String name, String pw, int ID) {
		this.name = name;
		this.pw = pw;
		this.ID = ID;
	}
	
	public Nutzer(Scanner scan) {
		this.scan = scan;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
}
