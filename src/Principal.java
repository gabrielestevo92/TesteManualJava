
public class Principal {

	public static void main(String[] args) {
		
		DeveEncontrarMaiorEMenorComProdutosEmOrdemDecrescente();
		DeveEncontrarMaiorEMenorComProdutosEmOrdemCrescente();
		DeveEncontrarMaiorEMenorComProdutosEmOrdemAleatoria();
		DeveEncontrarMaiorEMenorComUnicoProduto();
		DeveEncontrarMaiorEMenorComProdutosDeMesmoValor();
		DeveEncontrarMaiorEMenorComCarrinhoVazio();
		
	}
	public static void DeveEncontrarMaiorEMenorComProdutosEmOrdemDecrescente() {
		// criando o contexto
		
		Produto banana = new Produto("banana",10.0);
		Produto ovos = new Produto("Ovos",2);
		Produto peixe = new Produto("Peixe",50.0);		
		Produto queijo = new Produto("Queijo",1.0);		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.AdicionarProduto(peixe);
		carrinho.AdicionarProduto(banana);
		carrinho.AdicionarProduto(ovos);
		carrinho.AdicionarProduto(queijo);
		BuscadorDeMaiorEMenor buscador = new BuscadorDeMaiorEMenor();
		// Ação
		buscador.Buscar(carrinho);
		//Validação
		//JUNIT - 
		System.out.println("Teste com carrinho em ordem Decrescente");
		System.out.print("Produto de maior valor: " + buscador.GetProdutoDeMaiorValor());
		System.out.println("Produto de menor valor: " + buscador.GetProdutoDeMenorValor());
	}
	public static void DeveEncontrarMaiorEMenorComProdutosEmOrdemCrescente() {
		// criando o contexto
		Produto banana = new Produto("banana",10.0);		
		Produto peixe = new Produto("Peixe",50.0);
		Produto ovos = new Produto("Ovos",2);
		Produto Queijo = new Produto("Queijo",1.0);
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.AdicionarProduto(ovos);
		carrinho.AdicionarProduto(peixe);
		carrinho.AdicionarProduto(banana);
		carrinho.AdicionarProduto(Queijo);
		
		
		BuscadorDeMaiorEMenor buscador = new BuscadorDeMaiorEMenor();
		// Ação
		buscador.Buscar(carrinho);
		System.out.println("Teste com carrinho em ordem Crescente");
		System.out.print("Produto de menor valor: " + buscador.GetProdutoDeMenorValor());
		System.out.println("Produto de maior valor: " + buscador.GetProdutoDeMaiorValor());
		
	}
	public static void DeveEncontrarMaiorEMenorComProdutosEmOrdemAleatoria() {
		// criando o contexto
		Produto banana = new Produto("banana",10.0);		
		Produto peixe = new Produto("Peixe",50.0);
		Produto ovos = new Produto("Ovos",2);
		Produto Queijo = new Produto("Queijo",1.0);
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.AdicionarProduto(banana);
		carrinho.AdicionarProduto(peixe);
		carrinho.AdicionarProduto(ovos);	
		carrinho.AdicionarProduto(Queijo);
		
		
		BuscadorDeMaiorEMenor buscador = new BuscadorDeMaiorEMenor();
		// Ação
		buscador.Buscar(carrinho);
		System.out.println("Teste com carrinho em ordem Aleatória");
		System.out.print("Produto de menor valor: " + buscador.GetProdutoDeMenorValor());
		System.out.println("Produto de maior valor: " + buscador.GetProdutoDeMaiorValor());
		
	}
	
	public static void DeveEncontrarMaiorEMenorComUnicoProduto() {
		// criando o contexto
		
		Produto peixe = new Produto("Peixe",50.0);
		
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.AdicionarProduto(peixe);
			
	
		
		
		BuscadorDeMaiorEMenor buscador = new BuscadorDeMaiorEMenor();
		// Ação
		buscador.Buscar(carrinho);
		System.out.println("Teste com carrinho Com Um Unico Produto");
		System.out.print("Produto de menor valor: " + buscador.GetProdutoDeMenorValor());
		System.out.println("Produto de maior valor: " + buscador.GetProdutoDeMaiorValor());
		
	}
	public static void DeveEncontrarMaiorEMenorComProdutosDeMesmoValor() {
		// criando o contexto
		
		Produto peixe = new Produto("Peixe",50.0);
		Produto banana = new Produto("banana",50.0);
		Produto ovos = new Produto("ovos",2.0);
		
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.AdicionarProduto(peixe);
		carrinho.AdicionarProduto(banana);
		carrinho.AdicionarProduto(ovos);
			
	
		
		
		BuscadorDeMaiorEMenor buscador = new BuscadorDeMaiorEMenor();
		// Ação
		buscador.Buscar(carrinho);
		System.out.println("Teste com carrinho Com Produtos de mesmo valor");
		System.out.print("Produto de menor valor: " + buscador.GetProdutoDeMenorValor());
		System.out.println("Produto de maior valor: " + buscador.GetProdutoDeMaiorValor());
		
	}
	
	public static void DeveEncontrarMaiorEMenorComCarrinhoVazio() {
		// criando o contexto
		
		
		
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
	
	
		
		
		BuscadorDeMaiorEMenor buscador = new BuscadorDeMaiorEMenor();
		// Ação
		buscador.Buscar(carrinho);
		System.out.println("Teste com carrinho Com Carrinho Vazio");
		
		System.out.println("Produto de menor valor: " + buscador.GetProdutoDeMenorValor());
		System.out.println("Produto de maior valor: " + buscador.GetProdutoDeMaiorValor());
		
	}
}
