package AV1;
import java.util.Scanner;

public class AV1 {

	public static void main(String[] args) {
		
		int a=20;
		int num1;

		Scanner leitor= new Scanner(System.in);
		
		System.out.println("Olá,Bem vindo");
		
		System.out.print("Digite um número: ");
		num1= leitor.nextInt();
		
		if(num1 > a)
			System.out.println(num1);
		else
			System.out.println("Digite um número acima de 20 por favor");
	
		
		
		
		
		
		
	}

}
