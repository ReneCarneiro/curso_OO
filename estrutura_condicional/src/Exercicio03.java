import java.util.Scanner;

class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os n�meros:");
		
		int A = sc.nextInt();
		int B = sc.nextInt();
			
		
		if (A % B ==0 || B % A ==0) {
			System.out.println("S�o Multiplos");
		}
		else {
			System.out.println("N�o s�o multiplos");
		}
		sc.close();
		
	}
}
