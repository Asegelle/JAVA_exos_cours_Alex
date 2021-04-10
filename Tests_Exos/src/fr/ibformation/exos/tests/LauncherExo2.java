package fr.ibformation.exos.tests;

import java.util.Scanner;

public class LauncherExo2 {

	public static void main(String[] args) {
				/* �Exercice 2 : Faire un algorithme permettant de d�terminer si une personne peut �tre �lecteur
					�Pour pouvoir �tre �lecteur en France, actuellement, un certain nombre de conditions doivent �tre r�unies :
							�Il faut �tre fran�ais
							�Il faut �tre juridiquement majeur (18 ans)
							�Il faut avoir la capacit� juridique et civique
							�Il faut �tre inscrit sur une liste �lectorale	*/
		
				// �tape 1 : d�claration des variables
		
				// �tape 2 : interroger l'utilisateur sur sa nationalit�
		System.out.println("�tes vous de nationalit� Fran�aise ? (true / false) ");
		Scanner inputValues = new Scanner(System.in);
		boolean isFrench = inputValues.nextBoolean();
				// �tape 3 : int�rroger l'utilisateur son age
		System.out.println("quel est votre �ge ? ");
		int age = inputValues.nextInt();
				// �tape 4 : int�rroger l'utilisateur sa capacit� juridique et civique
		System.out.println("avez vous la capacit� juridique et civique ? (true / false) ");
		boolean hasJuridicAndCivicCapacity = inputValues.nextBoolean();
				// �tape 5 : int�rroger l'utilisateur son inscription sur liste electorale
		System.out.println("�tes vous inscrit-e sur une liste �lectorale ? (true / false) ");
		boolean isOnTheList = inputValues.nextBoolean();
		inputValues.close();
				// �tape 6 : d�finir si l'utilisateur est �ligible
		if (isFrench == true && age >= 18 && hasJuridicAndCivicCapacity == true && isOnTheList == true)
				// �tape finale : informer l'utilisateur de son �ligibilit�
		{System.out.println("f�licitation ! vous pouvez voter");
				}
		else 
		{System.out.println("vous ne pouvez pas voter");
		}
	
	}

}
