import java.util.HashMap;

public class Map {
	public static void main(String[] args) {
		
		java.util.Map<String, String> mapa = new HashMap<>();
		
		mapa.put("Brian", "24");
		mapa.put("Faq", "23");
		mapa.put("Brayan", "24");
		mapa.put("Ariel", "22");
		
		System.out.println(mapa.containsKey("Brian"));
		System.out.println(mapa.containsValue("22"));
		
		mapa.put("Ariel", "32");
		
		for(String key : mapa.keySet()) {
			System.out.println("key: " + key);
		}
		
		System.out.println("");
		System.out.println(mapa.toString());
		
		/*
		contiene -> containsKey / constainsValue
		agregar -> put
		repetir -> 
		obtener
		recorrer
		tamaño
		vaciar
		estaVacio
		
		como obtengo las entradas? -> entryset
		imprimir
		*/
		
	}
}
