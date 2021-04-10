package fr.ibformation.exceptions.debug.exos;

public class LauncherExo2 {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		String price = "50�";

		try {
			numbers[1] = 12;
			numbers[2] = 25;
			numbers[3] = Integer.parseInt(price);
			numbers[4] = 42;
			numbers[5] = 34;
		}
		catch (ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			System.out.println("Il y eu une erreur sur les index du tableau !");
		}
		catch (NumberFormatException e){
			e.printStackTrace();
			System.out.println("Il y eu une erreur  sur le parseInt(price)!");
		}
		
		
		
		// ------------------------ Correction -------------------------------------------
		// Exercice 2 : D�tecter o� se situe l'erreur avec le debug
/*		
		int[] numbers = new int[5];
		String price = "50�";
		
		try {
			numbers[1] = 12;
			numbers[2] = 25;
			numbers[3] = Integer.parseInt(price);
			numbers[4] = 42;
			numbers[5] = 34;
		} catch (NumberFormatException e) {
			System.err.println("Erreur dans le prix");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Erreur dans l'index du tableau");
			e.printStackTrace();
		} finally {
			System.out.println("Le programme est termin�");
		}*/
	}
}
