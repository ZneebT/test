
public class Fahrzeug {

			//variable erzeugen
	
		private int AnzahlRaeder;
		
			//Standardkonstruktor
		
		public Fahrzeug() {
			
			this.AnzahlRaeder = 0;
			
		}
		
			//Parameterkonstruktor
		
		public Fahrzeug (int name) {
			
			this.AnzahlRaeder = name;
			
		}
	
		//get-Methode: anzahl der Räder
	
	public int getAnzahlRaeder () {
		
		return this.AnzahlRaeder;
		
	}

}
