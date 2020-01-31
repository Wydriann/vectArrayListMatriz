package testList;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(); // Cria uma interface atravez de uma instanciação de uma classe com interface;
		
		System.out.println("Add String value at list:  ");
		list.add("Wydrian"); // Adiciona um valor String a Lista
		list.add("Igor");
		list.add("Julia");
		list.add("Marcio");
		list.add("Mara");
		list.add("Mario");
		
		list.add(2,"Maria"); // Adiciona o String "Maria" a posição 2 da lista
		
		System.out.println(list.size()); // Mostra o tamanho total da lista
		
		for (String x : list) {
			System.out.println(x);
		}
		
		
		System.out.println("------------------------------------------");
		
		System.out.println("Remove String at position 1: ");
		list.remove(1); // Remove o que estiver na posição 1 da lista
		
		System.out.println(list.size());
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------------------------");
		
		System.out.println("Remove all String starting with M: (Predicado)");
		list.removeIf(x -> x.charAt(0) == 'M');
		/* Predicado, retorna em true or false, 
				remove da lista Todos os valores String que o caracter na posição 0 for "M"
 					*/	
		System.out.println(list.size());
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------------------------");
		System.out.println("Show String position: ");
		
		System.out.println("Index of Julia: " + list.indexOf("Julia")); // Mostra em que posição está o String
		
		System.out.println("Index of Mara: " + list.indexOf("Mara")); // Se for um String que nao tenha na lista, ela retorna -1
		
		
		System.out.println("------------------------------------------");
		
		System.out.println("Show all String starting with M: ");
		
		list.add("Igor");
		list.add("Marcio");
		list.add("Mara");
		list.add("Mario");
		
		 List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		// Cria uma nova lista que recebe a anterior, filtrando e mostando apenas os String que começam com "M"
		 
		 
		 System.out.println(list.size());
			
			for (String x : result) {
				System.out.println(x);
			}
			
		System.out.println("------------------------------------------");
	
		System.out.println("Shows the first String value that starts with M and if not, returns nul ");
		String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
		// Filtra e retorna a primeira String que começa com A, se não ouver, retorna nulo
		
		System.out.println(name);
		
		
		
		
		
	}

}
