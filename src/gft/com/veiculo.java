package gft.com;

public class veiculo {

	private String marca;
	private String modelo;
	private String cor;
	protected int Combustivel;
	protected boolean isligado;
	protected int velocidade;

	public veiculo(String marca, String modelo, String cor, int velocidade) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.velocidade= velocidade;

	}

	public void acelerar() {
		if (isligado == true) {

			this.velocidade += 20;
			this.Combustivel -= 1;

		} else {
			System.out.println("voce precisa ligar o vaiculo primeiro ");
		}

	}

	public void abastecer(int QtdCombustivel) {
		this.Combustivel += QtdCombustivel;

	}

	public void ligar() {
		if (this.isligado == true) {
			System.out.println("veiculo esta ligado");

		} else {
			this.isligado = true;

		}

	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getCombustivel() {
		return Combustivel;
	}

	public void setCombustivel(int Combustivel) {
		this.Combustivel = Combustivel;
	}

	public boolean isIsligado() {
		return isligado;
	}

	public void setIsligado(boolean isligado) {
		this.isligado = isligado;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

}