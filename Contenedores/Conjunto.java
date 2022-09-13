import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Conjunto {
	public static void main(String[] args) {
		Set<String> conjunto = new HashSet<String>();
		// NO HAY REPETIDOS
		// TREESET -> ORDEN ALFABETICO
		// HASHSET -> ORDEN SEGUN EL HASH 
		
		String str1 = "Hola, ", str2 = "como ", str3 = "estas? ";
		
		conjunto.add(str1);
		conjunto.add(str3);
		//conjunto.add(1, str2);
		conjunto.add("000 ");
		conjunto.add("AAA ");
		conjunto.add("bbb ");
		
		for(String item : conjunto) {
			System.out.println(item);
		}
		
		System.out.println("");
		//System.out.println(conjunto.get(0));
		
		System.out.println("");
		//conjunto.remove(0);
		for(String item : conjunto) {
			System.out.println(item);
		}
		
		System.out.println("");
		System.out.println(conjunto.contains(str1));
		
		//System.out.println("");
		//System.out.println(conjunto.indexOf(str2));
		
		System.out.println("");
		System.out.println(conjunto.isEmpty());
		
		System.out.println("");
		System.out.println(conjunto.size());
		
		
		
	}
}
