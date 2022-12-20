package urisVezbe;

public class TestAutomobil {
	
	public static void main(String[] args) {
		
		Automobil a = new Automobil (true , 2);
		System.out.println("Trenutna brzina je : " + a.getBrzina());
		System.out.println(a.isUkljucen());
		a.promeniBrzinu(6);
		System.out.println(a.getBrzina());
		
		
		
		
		
		
		
		
	}

}
