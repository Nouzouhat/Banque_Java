import java.util.ArrayList;
import java.util.Scanner;

public class Banque {
	
	private ArrayList<Courant> lesComptes ;
	
	public Banque () {
		this.lesComptes = new ArrayList<Courant>();
	}
	
	public void ajouterCompte () {
		Scanner sc = new Scanner (System.in);
		int choix = 0;
		do {
			System.out.println("_______________ AJOUT COMPTE ___________");
			System.out.println("1- ouvrir un courant");
			System.out.println("2- Ouvrir une epargne ");
			System.out.println("3- Ouvrir une bourse ");
			System.out.println("0- quitter ");
			System.out.println("Votre choix");
			choix = sc.nextInt();
			switch (choix) {
			case 1 : {
				Courant unCourant = new Courant();
				unCourant.ouvrir();
				this.lesComptes.add(unCourant);
				System.out.println("Compte courant ajouté ");
			} break;
			
			
			case 2 : {
				Epargne unEpargne = new Epargne();
				unEpargne.ouvrir();
				this.lesComptes.add(unEpargne);
				System.out.println("Compte epargne ajouté ");
			} break;
			
			case 3 : {
				Bourse uneBourse = new Bourse();
				uneBourse.ouvrir();
				this.lesComptes.add(uneBourse);
				System.out.println("Compte bourse ajouté ");
			} break;
			}
			
		}while (choix !=0);
	
	}
	
	public void listerComptes () {
		System.out.println("_______________ LISTER COMPTE ___________");
		for (Courant unCompte : this.lesComptes) {
			unCompte.consulter();
		}
	}
	
	public void gererCompte () {
		int numero;
		Scanner sc = new Scanner (System.in);
		System.out.println("Donner le numero du compte à gérer :");
		numero = sc.nextInt();
		for (Courant unCompte : this.lesComptes) {
			if (unCompte.getNumero()==numero) {
				unCompte.menu();
			}
		}
		
		
	}
	
	public void menu () {
		int choix ;
		Scanner sc = new Scanner (System.in);
		do {
			System.out.println("_______________ GESTION BANQUE ___________");
			System.out.println("1- ouvrir un compte");
			System.out.println("2- Lister les comptes ");
			System.out.println("3- Gerer un compte ");
			System.out.println("0- Quitter");
			System.out.println("Votre choix  :");
			choix = sc.nextInt();
			switch (choix) {
			case 1 : this.ajouterCompte();break;
			case 2 : this.listerComptes(); break;
			case 3 : this.gererCompte();break;
			}
		}while (choix !=0);
	} 
	
	public static void main(String[] args) {
		Banque maBanque = new Banque();
		maBanque.menu();
	}
	

}
