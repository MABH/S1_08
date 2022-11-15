package n3exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class n3exercici1 {

	public static void main(String[] args) {
		ArrayList<Alumne> alumnes = new ArrayList<Alumne>();
		alumnes.add(new Alumne("Jose",25,"Java",5));
		alumnes.add(new Alumne("Manel",55,"PHP",7));
		alumnes.add(new Alumne("Rosa",27,"React",6));
		alumnes.add(new Alumne("Lluis",65,"Vue",8));
		alumnes.add(new Alumne("Andres",48,"Java",4));
		alumnes.add(new Alumne("Ana",30,"PHP",4));
		alumnes.add(new Alumne("Maria",25,"Angular",9));
		alumnes.add(new Alumne("Toni",45,"Angular",8));
		alumnes.add(new Alumne("Esther",56,"React",7));
		alumnes.add(new Alumne("Juab",25,"Vue",5));
		
		System.out.println("\nnom i edat de cada alumne.");
		alumnes.stream().forEach(alum-> System.out.println("Nom:" +alum.getNom()+ ", Edat: " + alum.getEdat()
				));
		
		
		System.out.println("\nnom comença per ‘a’.");
		List<Alumne> alumnes2 = alumnes.stream()
				.filter(alum-> alum.getNom().startsWith("a")||alum.getNom().startsWith("A"))
				.collect(Collectors.toList());
		alumnes2.stream().forEach(alum-> System.out.println("Nom:" +alum.getNom()+ ", Edat: " + alum.getEdat()
				));
		
		
		System.out.println("\nnota de 5 o superior");
		alumnes.stream()
				.filter(alum-> alum.getNota()>=5)
				.forEach(alum-> System.out.println("Nom:" +alum.getNom()+ ", Nota: " + alum.getNota()));
		
		
		System.out.println("\nnota de 5 o més, i que no són de PHP");
		alumnes.stream()
		.filter(alum-> alum.getNota()>=5 && alum.getCurs()!="PHP")
		.forEach(alum-> System.out.println("Nom:" +alum.getNom()+ ", Nota: " + alum.getNota()+ ", Curs: " + alum.getCurs()));

		
		System.out.println("\nalumnes que fan JAVA i són majors d’edat");
		alumnes.stream()
		.filter(alum-> alum.getEdat()>=18 && alum.getCurs()=="Java")
		.forEach(alum-> System.out.println("Nom:" +alum.getNom()+ ", Edat: " + alum.getEdat()+ ", Curs: " + alum.getCurs()));

	}

}
