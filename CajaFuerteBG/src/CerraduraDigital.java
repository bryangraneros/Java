
public class CerraduraDigital {
	protected int [] clave;
	protected int x;
	protected int y;
	protected int z;
	
	CerraduraDigital(int x, int y, int z) {
		this.clave = new int[3];
		clave[0] = x;
		clave[1] = y;
		clave[2] = z;
		
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	
	public void introducirCodigo(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	
	public boolean presionarOK() {
		if(		x == clave[0] && 
				y == clave[1] && 
				z == clave[2])
				return true;
			
			x = y = z = 0;
			return false;
	}
}
