import java.util.Locale;
import java.util.Scanner;

public class exercicioestrutura {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double numero1 = sc.nextInt();
		double numero2 = sc.nextInt();
		
		double Soma = numero1 + numero2;
		
		System.out.printf("Soma = %.2f%n", Soma);
		sc.close();
		
		
		
		
		

	}

}
