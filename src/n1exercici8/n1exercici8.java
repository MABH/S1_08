package n1exercici8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class n1exercici8 {

	public static void main(String[] args) {
	    Voltear voltear = (str) ->{
	    	return Stream.of(str).map(word->new StringBuilder(word).reverse())
	                .collect(Collectors.joining(" "));
	    	
	    };		
		
		System.out.println(voltear.reverse("Hola"));
    }
}
