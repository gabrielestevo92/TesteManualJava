import java.util.*;

public class CarrinhoDeCompras {
	private ArrayList<Produto> produtos;
	
	public CarrinhoDeCompras() {
		produtos = new ArrayList<Produto>();
	}
	public ArrayList<Produto> GetProdutos(){
		return produtos;
	}
	public void AdicionarProduto(Produto produto) {
		produtos.add(produto);
	}
	public void RemoverProduto(Produto produto) {
		produtos.remove(produto);
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		for(Produto produto: produtos) {
			String strProduto = produto.toString();			
			stringBuilder.append(strProduto);
		}
		return stringBuilder.toString();
	}
}
