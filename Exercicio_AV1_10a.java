import java.util.Scanner;
 
public class Exercicio_AV1_10a{


    public static void main(String[] args){       
        Scanner leitor = new Scanner(System.in);

       double n1 = 72.7;
       double n2 = 62.1;
          String sexo; 
          String sexoh = "Homem" ;
          String sexom = "Mulher";    
       double altura;
       
System.out.println("Digite seu sexo (homem ou mulher)?");
sexo = leitor.next();
System.out.println("Digite sua altura(escreva com ,)?");
altura = leitor.nextDouble();




if(sexo.equalsIgnoreCase(sexoh)) {
	System.out.printf("Seu peso ideal é ="+((n1*altura)-58));
	}
else if(sexo.equalsIgnoreCase(sexom)) {
	System.out.printf("Seu peso ideal é ="+((n2*altura)-44.7));
}


    

}
}