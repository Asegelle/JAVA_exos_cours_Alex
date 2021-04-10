package fr.ibformation.exceptions.debug.exos;

public class LauncherExo1 {

	public static void main(String[] args) {
		// Exercice 1 : D�tecter o� se situe l'erreur avec le debug

		int a, b, c, d, e;

		a = 1;
		b = 3;
		c = 5;
		d = 7;
		e = 2;

		try {
		int firstCalculation = a + b;
		int secondCalculation = d - c - e;

			int finalCalculation = firstCalculation / secondCalculation;
			System.out.println("test");
			System.out.println(finalCalculation);
		}
		catch (ArithmeticException g) {
			g.printStackTrace();
			System.out.println("Il y eu une erreur !");
		}
		
		// ------------------------ Correction -------------------------------------------
		// Exercice 1 : D�tecter o� se situe l'erreur avec le debug
/*		
		int a, b, c, d, e;
		
		a = 1;
		b = 3;
		c = 5;
		d = 7;
		e = 2;
		
		int firstCalculation = 0;
		int secondCalculation = 0;
		int finalCalculation = 0;
		
		try {
			firstCalculation = a + b;
			secondCalculation = d - c - e;
			
			finalCalculation = firstCalculation / secondCalculation;
		} catch (ArithmeticException exception) {
			System.out.println("Erreur de calcul");
			exception.printStackTrace();
		}
		
		System.out.println(finalCalculation);
	
*/		
	}
}

