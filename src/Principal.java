import java.util.Scanner;
public class Principal {
		public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			
			double valor1 = teclado.nextDouble();
			double valor2 = teclado.nextDouble();
			double resultado;
			
			Calculadora cal = new Calculadora();
			
			System.out.println("Escolha a opera��o:\n1- Adi��o\n2-Subtra��o\n3-Multiplica��o\n4-Divis�o");
			int operacao = teclado.nextInt();
			
			switch(operacao) {
			case 1:
				resultado = cal.somar(valor1, valor2);
				System.out.println("O resultado �:" + resultado);
				break;
			case 2:
				resultado = cal.subtrair(valor1, valor2);
				System.out.println("O resultado �:" + resultado);
				break;
			case 3:
				resultado = cal.multiplicar(valor1, valor2);
				System.out.println("O resultado �:" + resultado);
				break;
			case 4:
				resultado = cal.dividir(valor1, valor2);
				System.out.println("O resultado �:" + resultado);
				break;
		}
	}
}

