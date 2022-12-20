package urisVezbe;

public class Pokemon {
	
	private static int brojPokemona;
	private String ime;
	private String tip;
	private int redniBroj;
	private static final char generacija = 'x';
	
	

	public Pokemon() {
		
	}
	
	public Pokemon(String ime, String tip, int brojPokemona, int redniBroj) {
		this.ime=ime;
		if(tip=="vatreni" || tip=="vodeni" || tip=="zemljani" || tip=="elektricni") {
			this.tip=tip;
		}else {
			System.out.println("Pokemon moze biti samo vodeni, vatreni, zemljani ili elektricni");}
		Pokemon.brojPokemona++;
		this.redniBroj=Pokemon.brojPokemona;
		}

	
	@Override
	public String toString() {
		return ime + " je pokemon " +  generacija + " generacije, on je " + tip + 
				" i u ovom programu kreiran je kao " + redniBroj + " od trenutno postojecih " + brojPokemona +
				" pokemona ";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Pokemon) {
			Pokemon temp = (Pokemon) obj;
			if(temp.getIme()==ime && temp.getTip()==tip && temp.getRedniBroj()==redniBroj && temp.generacija==generacija
				&& temp.getBrojPokemona()==brojPokemona){
					return true;
				}
		}
		return false;
	}
	

	public static int getBrojPokemona() {
		return brojPokemona;
	}

	public static void setBrojPokemona(int brojPokemona) {
		Pokemon.brojPokemona = brojPokemona;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip=tip;
	}

	public int getRedniBroj() {
		return redniBroj;
	}

	public void setRedniBroj(int redniBroj) {
		this.redniBroj = redniBroj;
	}
	
	
	
	
	}


