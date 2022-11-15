package n1exercici7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class n1exercici7 {

	public static void main(String[] args) {
			List<String> lista = new ArrayList<String>(List.of("Alegre", "Casa","1","55","Azul","Sur","Norte","10000"));
						
			System.out.println ("\nLista ordenada desde la cadena más larga");
			
			lista.stream().sorted((s1, s2) -> -Integer.compare(s1.length(), s2.length()))
			  			  .forEach((n)-> System.out.println(n));	
		

	}

}
