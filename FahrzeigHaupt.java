
public class FahrzeigHaupt {

	public static void main (String [] args) {
		
			//Auto erzeugen
		
		Auto auto1 = new Auto (145);
		
			//Autodaten eingeben
		
//		auto1.setAnzahlRaeder(4);
//		auto1.setPS(145);
		
			//Einleitung zur Autodaten ausgabe
		
		System.out.println("Autodaten");
		System.out.println();
		
			//Autodaten ausgeben
		
		System.out.println("Anzahl der Räder    : " + auto1.getAnzahlRaeder() + " Räder");
		System.out.println("PS Anzahl           : " + auto1.getPS() + " PS");
		
		
			//Kombi erzeugen
		
		Kombi kombi1 = new Kombi ();
		
			//Kombidaten eingeben
		
//		kombi1.setAnzahlRaeder(4);
		kombi1.setAnzahlTueren(5);
//		kombi1.setPS(120);
		
			//Einleitung zur Kombidaten ausgabe
		
		System.out.println();
		System.out.println("  Untergeordnete Autos");
		System.out.println();
		System.out.println("	Kombidaten");
		System.out.println();
		
			//Kombidaten ausgeben
		
		System.out.println("	Anzahl der Räder    : " + kombi1.getAnzahlRaeder() + " Räder");
		System.out.println("	Reifendurchmesser   : " + kombi1.getAnzahlTueren() + " Türen");
		System.out.println("	PS Anzahl           : " + kombi1.getPS() + " PS");
		
			//Coupe erzeugen
		
		Coupe coupe1 = new Coupe ();
		
			//Coupedaten eingeben
		
//		coupe1.setAnzahlRaeder(4);
		coupe1.setAnzahlSitze(2);
//		coupe1.setPS(240);
		
			//Einleitung zur Coupedaten ausgabe
		
		System.out.println();
		System.out.println("	Coupedaten");
		System.out.println();
		
			//Coupedaten ausgeben
		
		System.out.println("	Anzahl der Räder    : " + coupe1.getAnzahlRaeder() + " Räder");
		System.out.println("	Reifendurchmesser   : " + coupe1.getAnzahlSitze() + " Türen");
		System.out.println("	PS Anzahl           : " + coupe1.getPS() + " PS");
		
			//Fahrrad erzeugen
		
		Fahrrad fahrrad1 = new Fahrrad ();
		
			//Fahrraddaten eingeben
		
//		fahrrad1.setAnzahlRaeder(4);
//		fahrrad1.setreifendurchmesser(28);
		
			//Einleitung zur Fahrraddaten ausgabe
		
		System.out.println();
		System.out.println("Fahrraddaten");
		System.out.println();
		
			//Fahrraddaten ausgeben
		
		System.out.println("Anzahl der Räder    : " + fahrrad1.getAnzahlRaeder() + " Räder");
		System.out.println("Reifendurchmesser   : " + fahrrad1.getreifendurchmesser() + " Zoll");
		
	}
	
}