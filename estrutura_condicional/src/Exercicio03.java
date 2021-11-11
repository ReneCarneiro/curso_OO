import java.util.Scanner;

class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os números:");
		
		int A = sc.nextInt();
		int B = sc.nextInt();
			
		
		if (A % B ==0 || B % A ==0) {
			System.out.println("São Multiplos");
		}
		else {
			System.out.println("Não são multiplos");
		}
		sc.close();
		
	}
}
