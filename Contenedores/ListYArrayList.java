import java.util.LinkedList;
import java.util.List;

public class ListYArrayList {
	public static void main(String[] args) {
		
		String str1 = "Hola, ", str2 = "como ", str3 = "estas? ";
		
		List<String> lista = new LinkedList<String>();
		
		lista.add(str1);
		lista.add(str3);
		lista.add(1, str2);
		
		for(String item : lista) {
			System.out.println(item);
		}
		
		System.out.println("");
		System.out.println(lista.get(0));
		
		System.out.println("");
		lista.remove(0);
		for(String item : lista) {
			System.out.println(item);
		}
		
		System.out.println("");
		System.out.println(lista.contains(str1));
		
		System.out.println("");
		System.out.println(lista.indexOf(str2));
		
		System.out.println("");
		System.out.println(lista.isEmpty());
		
		System.out.println("");
		System.out.println(lista.size());
		
		
		
 	}
}
