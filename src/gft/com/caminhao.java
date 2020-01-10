package gft.com;

public class caminhao extends veiculo{
	private int capacidadeKG;
	
	
	
	
	
public caminhao(String marca, String modelo, String cor, int capacidadeKG, int velocidade) {
		super(marca, modelo, cor,velocidade);
		this.capacidadeKG = capacidadeKG;
	}

public void acelerar () {	if (isligado == true) {

	this.velocidade += 20;
	this.Combustivel -= 1;

} else {
	System.out.println("voce precisa ligar o  caminhao primeiro ");

}
		
	}
	
	public void abastecer (float QtdCombustivel) {


    }

	public int getCapacidadeKG() {
		return capacidadeKG;
	}

	public void setCapacidadeKG(int capacidadeKG) {
		this.capacidadeKG = capacidadeKG;
	}
	
public void status () {
		
		System.out.println("marca :"+ this.getMarca());	
		System.out.println("Modelo :"+this.getModelo());
		System.out.println("Cor :"+this.getCor());
		System.out.println("Copaciade Max :"+this.capacidadeKG+" MIL KG");	
		System.out.println("A velocidade é : " + velocidade);

			
			
}
		
		
		
	}
