package exercicios3;

import filas.FilaInt;
import java.util.Scanner;;

public class AtendeAluno {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		FilaInt filaAlunos = new FilaInt();
		filaAlunos.Init();
		int opcao = 0;
		do {
			System.out.println("0 - Encerrar atendimento");
			System.out.println("1 - Inserir aluno na fila");
			System.out.println("2 - Atender aluno");
			System.out.println("Opcao: ");
			opcao = teclado.nextInt();
			switch (opcao) {
			case 0:
				if(filaAlunos.IsEmpty())
					System.out.println("Encerrado o atendimento!");
				else{
					System.out.println("Ainda h� alunos aguardando atendimento");
				opcao = -1;
				}
					
				break;
			case 1:
				System.out.println("Digite o Rm do aluno: ");
				filaAlunos.Enqueue(teclado.nextInt());
				break;
			case 2:
				if(!filaAlunos.IsEmpty()){
				System.out.println("Aluno: " + filaAlunos.first() + " foi para o atendimento: ");
				filaAlunos.Dequeue();
				}else{
					System.out.println("N�o � possivel remover");
				}
				break;
			default:
				System.out.println("Opcao Invalida!\n");
			}
		} while (opcao != 0);
		teclado.close();
	}

}
