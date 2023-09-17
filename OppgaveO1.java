
import java.util.Scanner;


public class OppgaveO1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Skriv inn din bruttolønn");
		int salary = scanner.nextInt();
		
		int Trinn0 = 0;
		int Trinn1 = 16401;
		int Trinn2 = 230951;
		int Trinn3 = 580651;
		int Trinn4 = 934051;
		
		double taxrate = 0;
		
		if (salary >= Trinn0 && salary <= Trinn1) {
				taxrate = 0;
			} else if (salary > Trinn1 && salary <= Trinn2) {
				taxrate = 0.93;
			} else if (salary > Trinn2 && salary <= Trinn3) {
				taxrate = 2.41;
			} else if (salary > Trinn3 && salary <= Trinn4) {
				taxrate = 11.52;
			} else if (salary > Trinn4) {
				taxrate = 14.52;
			}
		
	System.out.println("Dette er det du betaler i trinnskatt "+(taxrate * salary)/100+" kr");
	
		scanner.close();
	
		}
	}

