package hs.aalen;

public class methods {

	// Bestehende Methode: gibt nur eine Nachricht aus
	public void schreiben() {
		System.out.println("Hello Team, Auto-Deploy laeuft");
	}

	// Addiert zwei Zahlen
	public int addiere(int a, int b) {
		return a + b;
	}

	// Prueft ob eine Zahl gerade ist
	public boolean istGerade(int zahl) {
		return zahl % 2 == 0;
	}

	// Baut einen Begruessungstext fuer einen Namen
	public String begruessung(String name) {
		if (name == null || name.isBlank()) {
			return "Hallo Gast";
		}
		return "Hallo " + name;
	}
}
