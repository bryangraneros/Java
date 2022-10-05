
public class CajaFuerte {
	private int [] clave;
	private int x;
	private int y;
	private int z;
	private boolean f = false;
	
	final static int MAX = 2;
	
	CajaFuerte(int x, int y, int z) {
		this.clave = new int[3];
		clave[0] = x;
		clave[1] = y;
		clave[2] = z;
		
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	
	public void girarIzq() {
		
		if(f == true) {
			this.y++;
			if(this.y == MAX)
				this.y = 0;
		} 
		else {
			this.x++;
			if(this.x == MAX)
				this.x = 0;
		}
	}
	
	public void girarDer() {
		f = true;
		this.z++;
		if(this.z == MAX)
			this.z = 0;
	}
	
	public boolean tirarPalanca() {
		if(	x == clave[0] && 
			y == clave[1] && 
			z == clave[2])
			return true;
		
		x = y = z = 0;
		return false;
	}
	
	public void imprimir() {
		System.out.println("x: " + x + " y: " + y + " z: " + z);
	}
}
