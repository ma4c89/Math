package io;

public class Teste {
	public static void main(String[] args) {

		// Menor valor entre 15 e 5
		System.out.println("Min: " + Math.min(15, 5));
		System.out.println();

		// Maior valor entre 12 e 50
		System.out.println("Max: " + Math.max(12, 50));
		System.out.println();

		// Raiz quadrada de n1
		double res, n1, n2;
		n1 = 64;
		n2 = 3;
		res = Math.sqrt(n1);
		System.out.println("Raiz quadrada: " + res);
		System.out.println();

		// Valor absoluto (remove o sinal negativo)
		n1 = -64;
		res = Math.abs(n1);
		System.out.println("Valor absoluto: " + res);
		System.out.println();

		// Número aleatório entre 0.0 e 1.0
		res = Math.random();
		System.out.println("Aleatório [0.0 - 1.0): " + res);
		System.out.println();

		// Número aleatório entre 0.0 e 10.0
		res = Math.random() * 10;
		System.out.println("Aleatório [0.0 - 10.0): " + res);
		System.out.println();

		// 10 números aleatórios inteiros entre 0 e 100
		System.out.println("10 números aleatórios entre 0 e 100:");
		for (int i = 0; i < 10; i++) {
			res = (int)(Math.random() * 101); // De 0 até 100
			System.out.println((int)res);
		}
		System.out.println();

		// 10 números aleatórios arredondados para baixo (floor)
		double resp, a, b;
		a = -45;
		b = 20;

		System.out.println("10 números aleatórios arredondados para baixo:");
		for (int x = 0; x < 10; x++) {
			resp = Math.floor(Math.random() * 101); // Arredonda para baixo
			System.out.println(resp);
		}
		System.out.println();

		// Potência
		double pot = Math.pow(2, 3);
		System.out.println("Potência: " + pot);
		System.out.println();

		// Raiz cúbica
		double razCubica = Math.cbrt(27);
		System.out.println("Raiz cúbica: " + razCubica);
		System.out.println();

		// Arredonda para cima 
		double valor = Math.ceil(4.5);
		System.out.println("Teto: " + valor);
		System.out.println();

		// Funções trigonométricas (em radianos)
		System.out.println("Seno de 90°: " + Math.sin(Math.toRadians(90)));
		System.out.println("Cosseno de 0°: " + Math.cos(Math.toRadians(0)));
		System.out.println("Tangente de 45°: " + Math.tan(Math.toRadians(45)));
		System.out.println();

		// Converte graus para radianos e vice-versa
		System.out.println("45° em radianos: " + Math.toRadians(45));
		System.out.println("π/2 radianos em graus: " + Math.toDegrees(Math.PI / 2));
	}
}
