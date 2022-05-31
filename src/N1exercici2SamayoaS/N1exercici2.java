package N1exercici2SamayoaS;

import java.util.*;

public class N1exercici2 {

	public static void main(String[] args) {
		
		List<Integer> Lista1 = new ArrayList<>();
		Lista1.add(3);
		Lista1.add(8);
		Lista1.add(23);
		Lista1.add(6);
		Lista1.add(11);
		Lista1.add(7);
		
		List<Integer> Lista2 = new ArrayList<>();
		Lista2.add(5);
		Lista2.add(4);
		Lista2.add(1);
		Lista2.add(2);
		Lista2.add(9);
		Lista2.add(10);

		int size = Lista1.size() + Lista2.size();
		int id = Lista1.size()-1;
		int[] Concate = new int[size];
        int i = 0;
        
        ListIterator<Integer> iterate = Lista1.listIterator();
        iterate.next();
        iterate.next();
        iterate.next();
        iterate.next();
        iterate.next();
        iterate.next();

        while (iterate.hasPrevious()) {  
        	Concate [i] = iterate.previous();
        	i++;
        }
        
       for (int aux2 : Lista2) {
            Concate[i] = aux2;
            i++;
        }
        
        System.out.println("Lista 1: " + Lista1.toString());
        System.out.println("Lista 2: " + Lista2.toString());
        System.out.println("Lista unida : " + Arrays.toString(Concate));
 
        }
	}

