import java.util.Scanner;

public class OppgaveO2 {
	public static void main(String[] args) {
		Scanner lesInn = new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {

			boolean gyldig = false;

			while (!gyldig) {
				gyldig = true;

				try {
					System.out.println("Skriv inn din poengsum: ");
					int poengsum = Integer.parseInt(lesInn.nextLine());

					System.out.println("Studentnr. " + (i) + ", poeng: " + poengsum);
					if (poengsum >= 0 && poengsum <= 39) {
						System.out.println("Karakter: F");
					} else if (poengsum >= 40 && poengsum <= 49) {
						System.out.println("Karakter: E");
					} else if (poengsum >= 50 && poengsum <= 59) {
						System.out.println("Karakter: D");
					} else if (poengsum >= 60 && poengsum <= 79) {
						System.out.println("Karakter: C");
					} else if (poengsum >= 80 && poengsum <= 89) {
						System.out.println("Karakter: B");
					} else if (poengsum >= 90 && poengsum <= 100) {
						System.out.println("Karakter: A");
					} else {
						System.out.println("Ugyldig poeng");
						gyldig = false;
					}
				} catch (Exception error) {
					System.out.println("Feilmelding: " + error.getMessage());
				}
			}
		}
		lesInn.close();
	}
}