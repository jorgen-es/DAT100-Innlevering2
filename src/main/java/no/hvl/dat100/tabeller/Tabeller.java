package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for(int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i] + ", ");
		}
		System.out.println();
	}

	// b)
	public static String tilStreng(int[] tabell) {

		String tekst = "[";
		int i = 0;

		for (i = 0; i < tabell.length; i++) {
			tekst = tekst + tabell[i];
			if (i < tabell.length - 1) {
				tekst = tekst + ",";
			}
		}
		tekst = tekst + "]";
		return tekst;
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;

		for(int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean finnes = false;

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				finnes = true;
			}
		}
		return finnes;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int posisjon = -1;

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				posisjon = i;
				return posisjon;
			}
		} return posisjon;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] nyTabell = new int[tabell.length];

		for (int i = 0; i < tabell.length; i++) {
			nyTabell[i] = tabell[(tabell.length)-1 - i];
		}
		return nyTabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
