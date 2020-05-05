import java.util.Scanner;

public class Exercicio_AV1_6 {

	public static void main(String[] args) {
		
			Scanner leitor= new Scanner(System.in);
		
		int m1,m2,m3;
		int media;
		
		System.out.println("Digite sua nota na primeira prova: ");
		m1= leitor.nextInt();
		System.out.println("Digite sua segunda nota: ");
		m2= leitor.nextInt();
		System.out.println("Digite a terceira nota: ");
		m3= leitor.nextInt();
		
		media = (m1+m2+m3) /3;
		
		if(m1>2)
			System.out.println("1° prova OK");
		else
			System.out.println("O peso da prova era 2 e você tirou abaixo");
		
		if(m2>3)
			System.out.println("2° prova OK");
		else
			System.out.println("O peso da prova era 3 e você tirou abaixo");
		if(m3>=5)
			System.out.println("3° prova OK");
		else
			System.out.println("O peso da prova era 5 e você tirou abaixo");
		
		
		if(media>7)
			System.out.println("Passou");
		else
			System.out.println("Reprovado");
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
