package n1exercici3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class n1exercici3 {

	public static void main(String[] args) {
		List<String> mesos = new ArrayList<String>(
				Arrays.asList("Gener","Febrer","Març","Abril","Maig","Juny",
						"July","Agost","Septembre","Octubre","Novembre","Decembre"));

		mesos.forEach(m->System.out.println(m));
	}

}
