package entities;

public class Produto {
	
	private String nome;
	private Double preco;
	
	
	public Produto ( ) {
		
	}
	
	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
		
	}	
	
	public String getNome () {
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public Double getPreco () {
		return preco;
	}
	
	public void setPreco (Double preco) {
		this.preco = preco;
	}
	
	public static boolean staticProdutoPredicate(Produto prod) {
		
		return prod.getPreco() >= 300; 
		
	}
	
	public boolean naoStaticProdutoPredicate( ) {
		
		// m?todo da instancia, vai trabvalhar com o pr?prio objeto
		return this.preco >= 60; 
		
	}
	

	@Override
	public String toString() {
		return "Produto [nome = " + nome + ", preco = " + String.format("%.2f", preco) + "]";
	}	
	
	
}