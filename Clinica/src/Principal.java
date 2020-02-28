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
		//saída de dados
		
		System.out.println("A frequência máxima do(a) paciente "+p.nome+" é: "+p.frenquenciaMaxima());
		System.out.println("O alvo máximo do(a) paciente "+p.nome+" é: "+p.alvoMaximo());
		System.out.println("O alvo mínimo do(a) paciente "+p.nome+" é: "+p.alvoMinimo());
		
		teclado.close();
	}

}
