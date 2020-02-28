
public class Paciente {

	//atributo ou propriedade ou variável de instância 
	String nome;
	int idade;
	
	//método para calcular a frequência máxima
	public int frenquenciaMaxima() {
		return 220-idade;
	}
	
	//método para calcular o alvo mínimo
	public double alvoMinimo() {
		return frenquenciaMaxima()*0.5;
	}
	
	//método para calcular o alvo mínimo
		public double alvoMaximo() {
			return frenquenciaMaxima()*0.85;
		}
	
}
