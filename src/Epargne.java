import java.util.Scanner;

public class Epargne extends Courant
{
	
	private float taux, interets;
	
	public Epargne () {
		super();
		this.taux=0;
		this.interets=0;
	} 
	
	public Epargne (int numero, String nom, String prenom, float taux) {
		super(numero, nom, prenom);
		this.taux =taux;
		this.interets=0;
	}
	
	public void ouvrir () {
		super.ouvrir();
		Scanner sc = new Scanner (System.in);
		System.out.println("Donner le taux :");
		this.taux=sc.nextFloat();
	}
	
	public void consulter () {
		super.consulter();
		System.out.println("Le taux est de  :" +this.taux);
		System.out.println("L'intêret est de :" +this.interets);
	}
	
	public void calculInterets () {
		this.interets=this.taux*this.solde/100;
		System.out.println("interet :" +this.interets);
	}
	
	public void menu () {
		Scanner sc = new Scanner (System.in);
		int choix = 0;
		do {
			System.out.println("_______________ COMPTE EPARGNE ___________");
			System.out.println("1- ouvrir");
			System.out.println("2- consulter ");
			System.out.println("3- deposer ");
			System.out.println("4- retirer ");
			System.out.println("5- Calcul interets ");
			System.out.println("0- Quitter");
			System.out.println("Votre choix  :");
			choix = sc.nextInt();
			switch (choix) {
			case 1 : this.ouvrir();break;
			case 2 : this.consulter(); break;
			case 3 : this.deposer();break;
			case 4 : this.retirer(); break;
			case 5 : this.calculInterets();break;
			}
		}while (choix !=0);
	
	}

	
	
	//getters and setters 
	public float getTaux() {
		return taux;
	}

	public void setTaux(float taux) {
		this.taux = taux;
	}

	public float getInterets() {
		return interets;
	}

	public void setInterets(float interets) {
		this.interets = interets;
	}
	

}
