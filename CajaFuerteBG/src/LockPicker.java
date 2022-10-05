
public class LockPicker {

	public static int[] abrir(CerraduraDigital cd) {
		int[] clave = new int[3];

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					cd.introducirCodigo(i, j, k);
					if (cd.presionarOK()) {
						clave[0] = i;
						clave[1] = j;
						clave[2] = k;
						return clave;
					}
				}
			}
		}
		return null;
	}
	
	
}
