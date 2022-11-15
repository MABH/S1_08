package n2exercici3;

public class n2exercici3 {

	public static void main(String[] args) {
		Mates suma = (a,b) -> (a+b);
		System.out.println("Suma: "+suma.operacio(20, 10));
		
		Mates resta = (a,b) -> (a-b);
		System.out.println("Resta: "+resta.operacio(20, 10));
		
		Mates mult = (a,b) -> (a*b);
		System.out.println("Multiplicació: "+mult.operacio(20, 10));
		
		Mates div = (a,b) -> (a/b);
		System.out.println("Divisió: "+div.operacio(20, 10));
	}

}
