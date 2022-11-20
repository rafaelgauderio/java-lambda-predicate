package util;

import java.util.function.Predicate;

import entities.Produto;

public class ProdutoPredicate  implements Predicate <Produto>{

	@Override
	public boolean test(Produto prod) {
		
		return prod.getPreco() <= 300.0;
	}

}
