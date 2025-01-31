package exercicio5;

import java.util.Scanner;

import filas.FilaString;;

public class Consultorio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		FilaString filaPacientes = new FilaString();
		filaPacientes.Init();
		int opcao = 0;
		do {
			System.out.println("0 - Encerrar atendimento");
			System.out.println("1 - Inserir Paciente na fila");
			System.out.println("2 - Atender Paciente");
			System.out.println("Opcao: ");
			opcao = teclado.nextInt();
			switch (opcao) {
			case 0:
				if(filaPacientes.IsEmpty())
					System.out.println("Encerrado o atendimento!");
				else{
					System.out.println("Ainda h� Pacientes aguardando atendimento");
				opcao = -1;
				}
					
				break;
			case 1:
				teclado.nextLine();
				System.out.println("Digite o Nome do paciente: ");
				filaPacientes.Enqueue(teclado.nextLine());
				break;
			case 2:
				if(!filaPacientes.IsEmpty()){
				System.out.println("Nome: " + filaPacientes.first() + " foi para o atendimento: ");
				filaPacientes.Dequeue();
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
