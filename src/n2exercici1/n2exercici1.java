package n2exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class n2exercici1 {

	public static void main(String[] args) {
		List<String> noms = new ArrayList<String>(
				Arrays.asList("Marcos","Joan","Albert","Oscar","Ana","Jaume",
						"Ali","Almudena"));

		System.out.println(LletraA(noms));
	}

	public static List<String> LletraA(List<String> llista) {
		List llistaA = llista.stream().filter(l->l.length()==3)
									  .filter(l -> l.charAt(0)=='A').collect(Collectors.toList());		
		return llistaA;		
	}
}
