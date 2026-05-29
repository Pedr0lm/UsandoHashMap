package exerc2_12;

		import java.util.HashMap;
		import java.util.Scanner;
		
		public class Produtos {
		
		public static void main(String[] args) {
		HashMap produtos = new HashMap<>();
		
		produtos.put(1, "Pão");
		produtos.put(2, "Leite");
		
		System.out.println(produtos);
		
		Scanner entrada = new Scanner(System.in);
		
		int codigoProcurado;
		
		do {
			System.out.println("Digite o codigo: ");
			codigoProcurado = entrada.nextInt();
			System.out.println(produtos.get(codigoProcurado));
		} while (codigoProcurado != 0);
	
	}

}