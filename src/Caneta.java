
public class Caneta {

	boolean tampada;
	String marca;
	String cor;
	
	
	//metodos acoes 
	
	public void tampar() {
		tampada = true;

}
	public void destampar() {
		tampada = false;
	}
	
	public void escrever() {
		if(tampada == true){
			System.out.println("não dá para escrever com a caneta tampada");
		} else {
				System.out.println("agora destampada você consegue escrever");
			}
		}
		
}
