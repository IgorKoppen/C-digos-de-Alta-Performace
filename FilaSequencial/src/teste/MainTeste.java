package teste;

import filas.FilaInt;
import java.util.Scanner;;

public class MainTeste {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		FilaInt fila = new FilaInt();
		fila.Init();
		System.out.println("Digite o RM:");
		fila.Enqueue(teclado.nextInt());
		
		System.out.println(fila.first());
		teclado.close();
	}
}