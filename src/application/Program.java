package application;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.function.Predicate;

import entities.Produto;
import util.ProdutoPredicate;

public class Program {
	
	public static final double MINIMO = 300.0;
	public static final double MAXIMO = 300.0;

	public static void main(String[] args) {
		
		
		
		System.out.println("\nInterface funcional Predicate\n"
				+ "\tContém apenas um método abstrato chamado teste.\n"
				+ "\tUsa Generics como argumento\n");
		
		Locale.setDefault(Locale.US);
		
		List<Produto> list = new ArrayList<Produto>();

		list.add(new Produto("Televisão", 1900.00));
		list.add(new Produto("Mouse", 50.00));
		list.add(new Produto("Mouse sem fio",80.0));
		list.add(new Produto("Tablet", 750.50));
		list.add(new Produto("HD Case", 90.90));
		list.add(new Produto("Monitor", 300.90));

		
		System.out.println("Remover da lista os produtos com valor menor que r$ 90.0 (SEM interface PREDICATE)");
		//list.removeIf( prod -> prod.getPreco() >= 90.0);
		
		for(Produto produtos : list) {
			System.out.println(produtos);
		}
		
		System.out.println("\nRemover da lista os produtos com valor menor que r$ 300.0 (COM interface PREDICATE)");
		list.removeIf(new ProdutoPredicate());
		
		for(Produto produtos : list) {
			System.out.println(produtos);
		}
		
		Set<Produto> conjunto = new HashSet<Produto>();
		conjunto.add(new Produto("Televisão", 1900.00));
		conjunto.add(new Produto("Mouse", 50.00));
		conjunto.add(new Produto("Mouse sem fio",80.0));
		conjunto.add(new Produto("Tablet", 750.50));
		conjunto.add(new Produto("HD Case", 90.90));
		conjunto.add(new Produto("Monitor", 300.90));
		
		System.out.println("\nReference method com método estático\n"
				+ "Aceita uma referência para o método ao invés de apenas um objeto instanciado para a classe.");
		
		//conjunto.removeIf(Produto::staticProdutoPredicate);
		for(Produto produtos : conjunto ) {
			System.out.println(produtos);
		}
		
		System.out.println("\nReference metho com método NÃO estático\n"
				+ "Condição é remover produtos com preço maior que r$ 60.0");
		
		//conjunto.removeIf(Produto::naoStaticProdutoPredicate);
		for(Produto nickname : conjunto) {
			System.out.println(nickname);
		}
		
		System.out.println("\nExpressão lambda declarada\n"
				+ "Condição é remover produtos com preço maior que r$ 300.0");
		
		Predicate<Produto> lambda = prod -> prod.getPreco() >= MINIMO; 
		conjunto.removeIf(lambda);
		
		for(Produto nickname : conjunto) {
			System.out.println(nickname);
		}
		
		System.out.println("\nExpressão lambda inline (coloca a expressão lambida como argumento)\n"
				+ "Condição é remover produtos com preço menor que r$ 299.0");
		conjunto.removeIf(prod -> prod.getPreco() <=MAXIMO);
		// vai ter que retornar um SET vazio, pois na operação anterior removeu os maiores que 300
		for(Produto nickname : conjunto) {
			System.out.println(nickname);
		}
		
		
		

	}

}
