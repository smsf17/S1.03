package n1exercici1SamayoaS;

import java.util.*;
import java.util.Set;

public class N1exercici1 {

	public static void main(String[] args) {
		
		Set<Month> nameMonth = new HashSet<>();
		
		nameMonth.add(new Month("Enero"));
		nameMonth.add(new Month("Febrero"));
		nameMonth.add(new Month("Febrero"));
		nameMonth.add(new Month("Marzo"));
		nameMonth.add(new Month("Abril"));
		nameMonth.add(new Month("Mayo"));
		nameMonth.add(new Month("Junio"));
		nameMonth.add(new Month("Julio"));
		nameMonth.add(new Month("Agosto"));
		nameMonth.add(new Month("Septiembre"));
		nameMonth.add(new Month("Octubre"));
		nameMonth.add(new Month("Noviembre"));
		nameMonth.add(new Month("Diciembre"));

		for (Month mes : nameMonth) {
			System.out.print(mes.toString());
		}	
}
}
