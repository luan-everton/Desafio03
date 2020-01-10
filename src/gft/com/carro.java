package gft.com;

public class carro  extends veiculo {
	
	private int portas;
	private int ano;
	
	
	
	
	public carro(String marca, String modelo, String cor, int portas, int ano, int velocidade) {
		super(marca, modelo, cor,velocidade);
		this.portas = portas;
		this.ano = ano;
	}

	public void acelerar () {
		if (isligado == true) {

			this.velocidade += 20;
			this.Combustivel -= 1;

		} else {
			System.out.println("voce precisa ligar o carro primeiro ");
		}

		
		
	}
	@Override
	public void abastecer ( int QtdCombustivel) {


    }

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	public void status () {
		
		System.out.println("marca :"+ this.getMarca());	
		System.out.println("Modelo :"+this.getModelo());
		System.out.println("Cor :"+this.getCor());
		System.out.println("quantidade portas :"+this.getPortas());
		System.out.println("ano do carro :" +this.getAno());
		System.out.println("A velocidade é : " + velocidade);

		
	}
	
	
}