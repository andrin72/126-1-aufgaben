package main;

public class Konto {

	private double saldo;
	private double zinsSatz = 1;
	private Kunde inhaber;
	
	public Konto(double zinsSatz, Kunde kunde) {
		
		this.zinsSatz = zinsSatz;
		this.inhaber = kunde;
		
	}
	
	public void einzahlen(double betrag) {
		
		this.saldo += betrag;
		
	}
	
	public void verzinsen(int laufzeit) {
		
		double zins = 0;
		
		if(this.saldo > 50000) {
			
			if(this.saldo > 500000) {
				
				return;
				
			}
			
			this.zinsSatz = this.zinsSatz / 2;
			
		}
		
		zins = this.saldo * zinsSatz * laufzeit / 365;
		this.saldo += zins;
		
	}
	
	public double getSaldo() {
		
		return this.saldo;
		
	}
	
	public Kunde getInhaber() {
		
		return this.inhaber;
	}
}
