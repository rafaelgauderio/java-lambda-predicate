package application;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import entities.Produto;
import util.ProdutoPredicate;

public class Program {

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
		
		System.out.println("\nReference metho com método estático\n"
				+ "Aceita uma referência para o método ao invés de apenas um objeto instanciado para a classe.");
		
		conjunto.removeIf(Produto::staticProdutoPredicate);
		for(Produto produtos : conjunto ) {
			System.out.println(produtos);
		}
		
		

	}

}
