package urisVezbe;

public class PokemonTest {

	public static void main(String[] args) {
		
		Pokemon p = new Pokemon("Pikacu", "elektricni", 10, 7);
		System.out.println(p);
		
		Pokemon p1 = new Pokemon("Stefan", "brzi", 9, 2);
		System.out.println(p1);
		
		System.out.println(p.equals(p1));
		
		Pokemon david = new Pokemon("Hibrid", "mehanicki", 10,12);
		System.out.println(david);

	}

}
