
public class Auto extends Fahrzeug {

	private int PS;
	
		//Standardkonstruktor
	
	public Auto() {
		
		this.PS = 0;
		
	}
			
		//Parameterkonstruktor
			
	public Auto (int name) {
		
		this.PS = name;
		
	}
	
		//get-Methode: PS
	
	public int getPS () {
		
		return this.PS;
		
	}

}