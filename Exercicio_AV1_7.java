import java.util.Scanner;

public class Exercicio_AV1_7 {

	public static void main(String[] args) {
		
		Scanner leitor= new Scanner(System.in);
			
		String nome1,nome2;
		int idade1,idade2;
		
		
		System.out.println("Digite seu nome: ");
		nome1= leitor.next();
		System.out.println("Digite sua idade: ");
		idade1= leitor.nextInt();
		
		System.out.println("Digite o nome de outra pessoa: ");
		nome2= leitor.next();
		System.out.println("Digite a idade dessa pessoa: ");
		idade2= leitor.nextInt();
		
		if(idade1>idade2)
		System.out.println("Você é mais velho que " +nome2);
		else
		System.out.println("" +nome2+ " é mais velho(a) que você");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

}
