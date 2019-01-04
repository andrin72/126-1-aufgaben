package main;

public class Kunde {

	private String name;
	private String vorname;
	private int kundenNummer;
	
	public Kunde(String name, String vorname, int kundenNummer) {
		
		this.name = name;
		this.vorname = vorname;
		this.kundenNummer = kundenNummer;
		
	}

	public String getName() {
		
		return this.name;
		
	}
	
	
}
