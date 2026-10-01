package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		for(int[] rad : matrise) {
			for (int tall : rad) {
				System.out.print(tall + " ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String resultat ="";

		for (int[] rad : matrise) {

			boolean første = true;

			for (int tall : rad) {
				if (!første) {
					resultat += " ";
				}
				resultat += tall;
				første = false;
			} resultat += "\n";
		} return resultat;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] nyMatrise = new int[matrise.length][matrise[0].length];

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[0].length; j++) {
				nyMatrise[i][j] = matrise[i][j]*tall;
			}
		} return nyMatrise;
	}

	// d)
	public static boolean erLik(int[][] mat1, int[][] mat2) {

		if (mat1.length != mat2.length){
			return false;
		}

		for (int i = 0; i < mat1.length; i++) {
			if (mat1[i].length != mat2[i].length) {
				return false;
			} for (int j = 0; j < mat1[i].length; j++) {
				if (mat1[i][j] != mat2[i][j]) {
					return false;
				}
			}
		} return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");

	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
