package gft.com;

public class aviao extends veiculo {

	private String tipo;
	private String uso;

	public aviao(String marca, String modelo, String cor, String tipo, String uso,int velocidade) {
		super(marca, modelo, cor, velocidade);
		this.tipo = tipo;
		this.uso = uso;
	}

	@Override
	public void acelerar() {
		if (isligado == true) {

			this.velocidade += 20;
			this.Combustivel -= 1;

		} else {
			System.out.println("voce precisa ligar o  aviao primeiro ");

		}
	}

	public void abastecer(String Qntd) {
		super.abastecer(Integer.parseInt(Qntd));

	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getUso() {
		return uso;
	}

	public void setUso(String uso) {
		this.uso = uso;
	}

	public void status() {

		System.out.println("marca :" + this.getMarca());
		System.out.println("Modelo :" + this.getModelo());
		System.out.println("Cor :" + this.getCor());
		System.out.println("tipo :" + this.getTipo());
		System.out.println("Usado para :" + this.getUso());
		System.out.println("A velocidade é : " + velocidade);

	}

}
