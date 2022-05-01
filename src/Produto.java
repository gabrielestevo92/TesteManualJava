
public class Produto {
	private String nome;
	private double valor;
	public double GetValor() {
		return valor;
	}
	public void SetValor(double valor) {
		this.valor = valor;
	}
	public String GetNome() {
		return nome;
	}
	public void SetNome(String nome) {
		this.nome = nome;
	}
	public Produto(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		
		return "Nome: "+ nome.toString() + " , Valor: "+ valor+ "\n";
	}
	
}
