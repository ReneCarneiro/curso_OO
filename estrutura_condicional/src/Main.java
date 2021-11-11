import java.io.InputStream;
import java.util.Scanner;
public class Main {
	
public static void main(String[] args) {

	Scanner sc = newScanner(System.in);
	int x = sc.nextInt();
	String dia;
	
	switch (x) {
		case 1:
			dia ="domingo";
			break;
			
		case 2:
			dia ="segunda";
			break;
			default:
				dia = "valor indefinido";
				
}
System.out.println("Dia da semana: " + dia);
sc.close();
}

private static Scanner newScanner(InputStream in) {
	// TODO Auto-generated method stub
	return null;
}
}