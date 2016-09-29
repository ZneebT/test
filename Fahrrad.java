
public class Fahrrad extends Fahrzeug {

	private int reifendurchmesser;
	
			//Standardkonstruktor
		
		public Fahrrad() {
			
			this.reifendurchmesser = 0;
			
		}
		
			//Parameterkonstruktor
			
		public Fahrrad (int name) {
			
			this.reifendurchmesser = name;
			
		}
	
			//get-Methode: Reifendurchmesser
	
		public int getreifendurchmesser () {
			
			return this.reifendurchmesser;
			
		}
		
}