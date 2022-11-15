package n2exercici2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class n2exercici2 {

	public static void main(String[] args) {
			List<Integer> nombres = new ArrayList<Integer>(
					Arrays.asList(33,4,25,71,1009,86));

			System.out.println(ParellSenar(nombres));
		}

		public static String ParellSenar(List<Integer> llista) {
			
			return llista.stream().map(x->x%2 == 0 ? "e" + x : "o" +x)
					   .collect(Collectors.joining(", "));	
		}
}
