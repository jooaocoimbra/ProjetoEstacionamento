
public class Paciente {

	//atributo ou propriedade ou vari�vel de inst�ncia 
	String nome;
	int idade;
	
	//m�todo para calcular a frequ�ncia m�xima
	public int frenquenciaMaxima() {
		return 220-idade;
	}
	
	//m�todo para calcular o alvo m�nimo
	public double alvoMinimo() {
		return frenquenciaMaxima()*0.5;
	}
	
	//m�todo para calcular o alvo m�nimo
		public double alvoMaximo() {
			return frenquenciaMaxima()*0.85;
		}
	
}
