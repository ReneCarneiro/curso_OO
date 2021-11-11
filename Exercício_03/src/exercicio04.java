import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int NUMBER, HORAS;
        double $HORAS, SALARY;
        
	    NUMBER = sc.nextInt();
	    HORAS = sc.nextInt();
	    double $HORA = sc.nextDouble();
	    
	    SALARY = HORAS * $HORA;	 
	    
	    System.out.println("NUMBER = " + NUMBER);
	    System.out.println("SALARY = " + SALARY);

	    

	          
        sc.close();

	}

}
