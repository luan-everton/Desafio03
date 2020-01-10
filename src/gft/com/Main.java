package gft.com;


public class Main {

	public static void main(String[] args) {
		System.out.println("Carro");
		carro v1 = new carro("Hyndai", "Elantra" , "preto", 4, 2020,30);
		v1.isligado=true;
		v1.acelerar();
		v1.abastecer(50);
		v1.status();
		System.out.println("---------------------------");
		
		System.out.println("Caminhao");
		caminhao v2 = new caminhao("Scania", "Fh550" , "preto", 20000,50);
		v2.isligado=true;
		v2.acelerar();
		v2.abastecer(50); 
		v2.status();
		System.out.println("---------------------------");

		
		System.out.println("Aviao");
		aviao v3 = new aviao ("Emirates", "Boing" , "Branco", "747","Comercial", 100);
		v3.isligado=true;
		v3.acelerar();
		v3.abastecer("50");
		v3.status();
		System.out.println("---------------------------");

		
		}
		
	

	
	
	
	

}
