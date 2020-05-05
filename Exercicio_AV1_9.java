import java.util.Scanner;

public class Exercicio_AV1_9 {

	public static void main(String[] args) {
		
		
		Scanner leitor= new Scanner(System.in);
		
		int n1;
		int lucro;
		
		System.out.println("Digite o preço que você pagou no produto:");
		n1= leitor.nextInt();
		
	 lucro = (n1*100)/30;
		
		if(n1<20) {
			System.out.println("O seu produto revendido terá um lucro de 30%");
			System.out.println(+lucro+ " é o valor da venda em Reais");

		}
		else {
			System.out.println("O produto terá um lucro de 45%");
			System.out.println(+lucro+ " é o valor do lucro em Reais");
		}
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
