import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Paciente p = new Paciente();
		
		//entrada de dados
		
		System.out.print("Digite o nome do paciente -> ");
		p.nome = teclado.nextLine();
		System.out.print("Digite a idade do paciente -> ");
		p.idade = teclado.nextInt();
		System.out.println();
		//sa�da de dados
		
		System.out.println("A frequ�ncia m�xima do(a) paciente "+p.nome+" �: "+p.frenquenciaMaxima());
		System.out.println("O alvo m�ximo do(a) paciente "+p.nome+" �: "+p.alvoMaximo());
		System.out.println("O alvo m�nimo do(a) paciente "+p.nome+" �: "+p.alvoMinimo());
		
		teclado.close();
	}

}
