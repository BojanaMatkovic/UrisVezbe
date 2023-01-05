package urisVezbe;

import java.util.Arrays;

public class Nizovi {
	
	
	public static int findIndex(int[] niz6, int t) {
		if(niz6==null) {
			return -1;
		}
		int len = niz6.length;
		int i = 0;
		while (i<len) {
			if(niz6[i] == t) {
				return i;
			}
			else {
				i= i+1;
			}
		}
		return -1;
	}
	
	public int max(int [] niz10) {
		int max = 0;
		for(int i = 0; i<niz10.length;i++) {
			if(niz10[i] > max) {
				max=niz10[i];
			}
		}
		return max;
	}
	
	public int min(int[] niz10) {
		int min = niz10[0];
		for(int i = 0; i<niz10.length; i++) {
			if(niz10[i]<min) {
				min=niz10[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		
		/* KREIRANJE NIZOVA:
		 * int[] niz = new int[5] - kreiramo novi niz tipa int koji ima 5 elemenata.
		 * int[] niz = {2,4,8,16,32} - kreiramo novi niz koji ima elemente navedene u {}
		 * int[5] = 55 - pristupanje elementima niza, elementu na mestu 5 smo dodelili vrednost 55
		 * indeksi u nizovima se krecu od 0
		 */

		//Zadaci za vezbu
		//1.zadatak - sortirati nizove tipa int i tipa String
		int[] niz = {3,2,6,1,8};
		String[] niz1 = {"Java", "Pyton", "c++", "c#"};
		System.out.println("Original numeric array: " + Arrays.toString(niz));
		Arrays.sort(niz);
		System.out.println("Sorted array int : " + Arrays.toString(niz));
		
		System.out.println("Original string array: " + Arrays.toString(niz1));
		Arrays.sort(niz1);
		System.out.println("Sorted string array: " + Arrays.toString(niz1));
		
		
		/*primer
		int[] niz2 = {5,7,2,9,3,1};
		System.out.println(Arrays.toString(niz2));
		Arrays.sort(niz2);
		System.out.println("Sortiran niz: " + Arrays.toString(niz2));
		*/
		
		//2.zadatak - sabrati sve elemente u nizu
		int[] niz2 = {1,2,4,3,5};
		int sum = 0;
		for(int i : niz2) {
			sum = sum + i;
		}
		double avg = sum / niz2.length;
		System.out.println(avg);
		System.out.println(sum);
		
		//3.zadatak
		int [][]a = new int[10][10];
		for(int i = 0; i<10;i++) {
			for(int j = 0; j<10; j++) {
				System.out.printf("%2d", a[i][j]);
			}
			System.out.println();
		}
		
		//4.zadatak - prosecna vrednost elemenata u nizu
		int[] niz4 = {1,2,3,4,5};
		int suma = 0;
		for(int i = 0; i<niz4.length; i++) {
			suma = suma + niz4[i];
		}
		double prosecno = suma / niz4.length;
		System.out.println(suma);
		System.out.println(prosecno);
		
		
		//6.zadatak - pronaci indeks nekog elementa u nizu
		int[] niz6 = {25,14,56,15,36};
		System.out.println("Pozicija broja 25 je: " + findIndex(niz6,25));
		System.out.println("Pozicija broja 36 je: " + findIndex(niz6,36));
		
		
		//7.zadatak - brisanje elemenata po indeksima
		int[] niz7 = {1,2,6,4,5,10,7};
		System.out.println("Niz izgleda ovako: " + Arrays.toString(niz7));
		Arrays.sort(niz7);
		System.out.println("Niz nakon sortiranja izgleda ovako: " + Arrays.toString(niz7));
		
		int removeIndex = 2;
		for(int i = removeIndex; i<niz7.length-1; i++) {
			niz7[i] = niz7[i+1];
		}
		
		System.out.println("Niz nakon brisanja elementa na indeksu 2 izgleda ovako: " + Arrays.toString(niz7));
		
		//8.zadatak - kreiranje novog niza na osnovu nekog postojeceg
		int[] niz8 = {25,14,56,15,36};
		int[] noviNiz = new int[5];
		System.out.println(Arrays.toString(niz8));
		
		for(int i = 0; i<niz8.length; i++) {
			noviNiz[i] = niz8[i];
		}
		System.out.println("Novi niz: " + Arrays.toString(noviNiz));
		
		//9.zadatak - ubacivanje elementa u niz
		int[] niz9 = {1,2,3,4,5,6,7,8};
		System.out.println(Arrays.toString(niz9));
		int indexPosition = 2;
		int newValue = 5;
		
		for(int i = niz9.length-1; i>indexPosition; i--) {
			niz9[i] = niz9[i-1];
		}
		
		niz9[indexPosition] = newValue;
		System.out.println(Arrays.toString(niz9));
		
		
		//10.zadatak - pronaci minimalni i maksimalni element u nizu
		int[] niz10 = {2,5,3,6,4};
		System.out.println(Arrays.toString(niz10));
		
		Nizovi n = new Nizovi();
		System.out.println("Najveca vrednost u nizu je: " + n.max(niz10));
		System.out.println("Najmanja vrednost u nizu je : " + n.min(niz10));
		
		//17.zad - pronaci drugi najveci element u nizu
		int[] niz17 = {34,65,765,234,453,1,45,32};
		System.out.println("Sadasnji niz je: " + Arrays.toString(niz17));
		Arrays.sort(niz17);
		int najveci = niz17[niz17.length-2];
		int najmanji = niz17[1];
		System.out.println("Najveci: " + najveci);
		System.out.println("Drugi najmanji: " + najmanji);
		
		//Ispisati niz obrnuto
		int[] nekiNiz= {1,2,3,4,5};
		for(int i = nekiNiz.length-1; i>=0; i--) {
			System.out.print(nekiNiz[i] + " ");
		}
		
		//12 zad - pronaci duplikate
		int[] niz12 = {1,1,3,4,6};
		for(int i = 0; i<niz12.length;i++) {
			for (int j = i+1; i<niz12.length-1;j++) {
				if((niz12[i]==niz12[j]) && (i!=j)){
					System.out.println(niz12[j]);
				}
			}
		}
		
		
		
		

		
		
		
	}

}
