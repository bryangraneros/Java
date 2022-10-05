
public class AdapterCerraduraDigital extends CerraduraDigital{
	private CajaFuerte cf;
	
	AdapterCerraduraDigital(CajaFuerte cf) {
		super(0,0,0);
		this.cf = cf;
	}

	public void introducirCodigo(int x, int y, int z) {

		//this.x = x;
		for(int i = 0; i < x; i ++)
			cf.girarIzq();
		//this.y = y;
		for(int i = 0; i < y; i ++)
			cf.girarDer();
		//this.z = z;
		for(int i = 0; i < z; i ++)
			cf.girarIzq();
		
	}
	
	public boolean presionarOK() {
		return cf.tirarPalanca();
	}
}
