package N1exercici1SamayoaconArray;

import java.util.ArrayList;

public class n1exercici1conArray {

	public static void main(String[] args) {
		ArrayList<Month> nameMonth = new ArrayList<>();
		
			nameMonth.add(new Month("Enero"));
			nameMonth.add(new Month("Febrero"));
			nameMonth.add(new Month("Marzo"));
			nameMonth.add(new Month("Abril"));
			nameMonth.add(new Month("Mayo"));
			nameMonth.add(new Month("Junio"));
			nameMonth.add(new Month("Julio"));
			nameMonth.add(new Month("Septiembre"));
			nameMonth.add(new Month("Octubre"));
			nameMonth.add(new Month("Noviembre"));
			nameMonth.add(new Month("Diciembre"));

		for (Month mes : nameMonth) {
			System.out.print(mes.toString());
		}
		
			nameMonth.add(7, new Month("Agosto"));
			
			System.out.println(" ");
			for (Month meses : nameMonth) {				
				System.out.print(meses.toString());
			}

	}

}
