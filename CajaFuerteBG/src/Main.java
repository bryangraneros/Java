import java.util.concurrent.locks.Lock;

public class Main {
	public static void main(String[] args) {
		CajaFuerte cf = new CajaFuerte(1,1,2);
		
		cf.girarIzq();
		cf.girarIzq();
		
		cf.girarDer();
		//cf.girarDer();
		
		cf.girarIzq();
		cf.girarIzq();
		
		cf.imprimir();
		if(cf.tirarPalanca())
			System.out.println("Se abrio");
		else
			System.out.println("No se abrio");
		
		cf.girarIzq();
		cf.girarIzq();
		
		cf.girarDer();
		cf.girarDer();
		cf.girarDer();
		cf.girarDer();
		
		cf.girarIzq();
		cf.girarIzq();
		
		cf.imprimir();
		if(cf.tirarPalanca())
			System.out.println("Se abrio");
		else
			System.out.println("No se abrio");
		
		CerraduraDigital cd = new CerraduraDigital(2, 2, 2);
		
		cd.introducirCodigo(2, 2, 2);

		System.out.println("Cerradura Digital");
		if(cd.presionarOK())
			System.out.println("Se abrio");
		else
			System.out.println("No se abrio");

		System.out.println("Lock Picker Cerradura Digital");
		int [] r = LockPicker.abrir(cd);
		System.out.println(r[0]);
		System.out.println(r[1]);
		System.out.println(r[2]);
		
		System.out.println("Lock Picker Caja Fuerte");
		AdapterCerraduraDigital cf2 = new AdapterCerraduraDigital(cf);
		int [] s = LockPicker.abrir(cf2);
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		
		
		
	}
}
