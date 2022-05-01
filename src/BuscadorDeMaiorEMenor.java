
public class BuscadorDeMaiorEMenor {
	
	private Produto produtoDeMaiorValor;
	private Produto getProdutoDeMenorValor;
	
	public Produto GetProdutoDeMaiorValor() {
		
		return produtoDeMaiorValor;
		
	}
	
	public Produto GetProdutoDeMenorValor() {
		return getProdutoDeMenorValor;
	}
	
	public void Buscar(CarrinhoDeCompras carrinho) {
		for (Produto produto: carrinho.GetProdutos()) {
			if (produtoDeMaiorValor == null || produto.GetValor() > produtoDeMaiorValor.GetValor()) {
				produtoDeMaiorValor = produto;
			}
			if (getProdutoDeMenorValor == null || produto.GetValor() < getProdutoDeMenorValor.GetValor()) {
				getProdutoDeMenorValor = produto;
			}
			
		}
	}
}
