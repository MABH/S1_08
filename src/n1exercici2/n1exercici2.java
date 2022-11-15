package n1exercici2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class n1exercici2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> llista=new ArrayList<String>();
		
		llista.add("Buho");
		llista.add("Caixa");
		llista.add("Ratolí");
		llista.add("Recepta");
		llista.add("Cuc");
		llista.add("Gos");
		
		llista=LletraO(llista);
	}
	
	public static List<String> LletraO(List<String> llista) {
		List llistaO = llista.stream().filter(l->l.length()>5).filter(o -> o.contains("o")).collect(Collectors.toList());
		llistaO.forEach(e -> System.out.println(e));
		return llistaO;
		
	}
}
