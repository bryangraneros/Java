
public class HolaBryan {
	public static void main(String[] args) {
		long n = 11309768L;
		//int[] coleccionista1 = { 11, 1, 3, 8, 2, 10, 8, 3, 1, 8, 4 }, 
		//		coleccionista2 = { 1, 5, 10, 15, 20, 25, 30, 35 };
		int [] coleccionista1 = {1, 2, 3, 4, 4, 4, 4},
				 coleccionista2 = {5, 6, 7, 8};

		System.out.println(difFiguritas_2(coleccionista1, coleccionista2));

		// System.out.println(streetNumbers(n));

	}

	private static int difFiguritas_1(int[] c1, int[] c2) {
		int cont1 = 0, cont2 = 0;

		for (int i = 0; i < c1.length; i++) {
			int rep1 = 0;
			for (int j = i + 1; j < c1.length; j++) {
				if (c1[i] == c1[j])
					rep1++;
			}
			if (rep1 == 0)
				cont1++;
		}

		for (int i = 0; i < c2.length; i++) {
			int rep2 = 0;
			for (int j = i + 1; j < c2.length; j++) {
				if (c2[i] == c2[j])
					rep2++;
			}
			if (rep2 == 0)
				cont2++;
		}

		return cont1 - cont2;
	}
	
	private static int difFiguritas_2(int[] c1, int[] c2) {
		return contNoRep(c1) - contNoRep(c2);
	}
	
	private static int contNoRep(int[] c) {
		int cont = 0;
		
		for (int i = 0; i < c.length; i++) {
			int rep = 0;
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j])
					rep++;
			}
			if (rep == 0)
				cont++;
		}
		return cont;
	}
	

	private static long streetNumbers(long n) {

		if (n <= 2)
			return -1;

		for (long i = n * 7 / 10; i < n; i++) {
			long ri = 0L, rd = 0L;

			for (long j = i + 1; j < n + 1; j++) {
				rd += j;
			}
			for (long j = i - 1; j > 0; j--) {
				ri += j;
			}
			System.out.println(ri + " " + rd + " " + i);

			if (ri == rd)
				return i;
			if (ri > rd)
				return -1;
		}
		return -1;
	}
}
