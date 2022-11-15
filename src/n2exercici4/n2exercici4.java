package n2exercici4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class n2exercici4 {

	public static void main(String[] args) {
		List<String> cadenes = new ArrayList<String>(
				Arrays.asList("Mercat","67","Albert","Oscar","Ana","198",
						"9","Almudena","Marcos"));
		
		System.out.println("Ordenar cadenes per primera lletra");
		System.out.println(cadenes.stream() 
                .sorted(Comparator.comparing(e -> (e.charAt(0))))
                .collect(Collectors.toList())); 		
		
		
		System.out.println("\nPosar cadenes amb e primer");
		cadenes.stream()					
				.sorted(Comparator.comparing(e -> (e.contains("E")|| e.contains("e"))))												
				.collect(Collectors.toCollection(LinkedList::new))
		        .descendingIterator().forEachRemaining((cadena)->System.out.print(cadena+", "));	
		
		
	//****només amb lambdes no m'ha sortit bé****
		/*System.out.println("\ncanviar 'a' per '4'");		
		cadenes.forEach(s->s.chars()
				.map(c -> (c == 'a' || c =='A')?'4':c)	
				.mapToObj(c ->(char) c)
				.map(c->c.toString()).collect(Collectors.joining()));*/
		
		
		//Ho he canviat una mica
		System.out.println("\n\nCanviar 'a' per '4'");		
		cadenes = cadenes.stream()
			      .sorted()
			      .collect(Collectors.toList());
		int i=0;	
		List<String> cadenes2 = new ArrayList<String>();
		for(String cadena:cadenes)			
		{
			cadenes2.add(cadena.chars().map(c -> (c == 'a' || c =='A')?'4':c)
					.mapToObj(c ->(char) c)
					.map(c->c.toString())
					.collect(Collectors.joining()));			
		}						
		System.out.println(cadenes2.toString());				
	//**************************************************	
		
		System.out.println("\nMostra només els elements que són numèrics");
		System.out.println(cadenes.stream()
        .filter(s -> s.chars().allMatch(Character::isDigit ))
        .map(c->c.toString())
        .collect(Collectors.toList()));		
	}
	
}
