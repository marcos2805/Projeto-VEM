import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Seja bem vindo a central do VEM!");
		System.out.println("**************");
		System.out.println("Digite o tipo da sua conta: \n[1]VEM comum  [2]VEM estudante [3]VEM trabalhador [4]VEM livre acesso");
		int tipo = input.nextInt();
		
			if(tipo == 1) {
				ContaComum user1 = new ContaComum();
			} else if (tipo == 2) {
				ContaEstudante user1 = new ContaEstudante();
			} else if (tipo == 3) {
				ContaTrabalhador user1 = new ContaTrabalhador();
			} else if (tipo == 4) {
				ContaEspecial user1 = new ContaEspecial();
			}
		
		
			

		

	}

	}


