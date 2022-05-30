package n1exercici3;

//Puedo resumir con Import java.io.* pero para tener presente todo lo que he usado lo deje.
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class N1exercici3 {
	
	//conectamos en texto con el codigo.
	final static String filePath = "C:\\Users\\Pau\\Downloads\\Countries.txt";
	final static String outputFilePath = "C:\\Users\\Pau\\Downloads\\Clasificacio.txt";
	
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);

		//Inicializamos nuestra collección donde manejaremos los
		//datos que tiene el documento ".txt".  Llamamos al metodo
		//que se encargara de traer los datos.
		Map<String, String> capitalCountry = getHashMapFromTextFile();
		// en el Hash Map los valores entran como Key:Pais Value:Capital
		/*for(Map.Entry<String,String> entry: capitalCountry.entrySet()); {
			System.out.println(entry.getKey()+ " " +entry.getValue());
		}*/
		
		int size = capitalCountry.size(); 
		System.out.println("Introduce nombre de usuari@:");
		String usuario = scn.nextLine();
		
		int puntos = 0;
		
		for(int i=1; i<11; i++){
			int numeroRandom = (int) Math.ceil((Math.random() * size));
			@SuppressWarnings("unlikely-arg-type")
			String pais = capitalCountry.get(numeroRandom);
			
			int id = 10;
			boolean b = true;
			do {
				  System.out.println("Cual es la capital de "+pais +" tiene " + id +" intentos.");
				  String intento = scn.nextLine();
				  if (pais.equalsIgnoreCase(intento)) {
				  	puntos = puntos + 1;
				  	System.out.println("Has ganado un punto!");
				  	b = false;
				  }					  
				  id = id-1;
			} while (b == false && i>0);
		}
		
		System.out.println ("Felicidades!  Has conseguido "+puntos +"puntos");
		Map<String, Integer> UsuarioPuntos = new HashMap<String,Integer>();	
		Integer puntosInter = puntos;
		UsuarioPuntos.put(usuario, puntosInter);
		
		 File file = new File(outputFilePath);
		  	
	        BufferedWriter bf = null;
	  
	        try {
	  
	        	//Creamos un BufferedWriter para la salida del texto.
	            bf = new BufferedWriter(new FileWriter(file));
	
	            for (Map.Entry<String, Integer> entry: UsuarioPuntos.entrySet()) {
	  
	                // Separamos Key de Value por espacio
	                bf.write(entry.getKey() + " "+ entry.getValue());

	                bf.newLine();
	            }
	  
	            bf.flush();
	        }
	        catch (IOException e) {
	            e.printStackTrace();
	        }
	        finally {
	  
	            try {
	  
	                // Cerramos
	                bf.close();
	            }
	            catch (Exception e) {
	            }
	        }
	   }

		 
	//Metodo para coger los datos de nuestro txt y poder usarlos en el programa.
	private static Map<String, String> getHashMapFromTextFile() {
		
		Map<String,String>capitalCities = new HashMap<String,String>();
		BufferedReader br = null;
		
		try {
			File file = new File(filePath);
			
			//Crear un BufferedReader para la lectura del contenido del archivo.
			br = new BufferedReader(new FileReader(file)); 
			
			String line = null;
			
			while ((line = br.readLine()) !=null) {
				
				String[] parts = line.split(" ");
				//divide en 2 palabras la linea, en este caso Pais y Capital
				String country = parts[0].trim();
				String capital = parts[1].trim();
				
				// Meter en el HashMap el pais y la capital buscando que la linea no este vacia
				if(!country.equals("")&&!capital.equals(""))
					capitalCities.put(country, capital);
			}
		}catch (Exception e) {
				e.printStackTrace();
		}finally {
				//Cerramos en BufferedReader SIEMPRE!!!
				if(br != null) {
					try {
						br.close();
					}catch (Exception e) {};
				}
			}
		
		return capitalCities;
	}
}


