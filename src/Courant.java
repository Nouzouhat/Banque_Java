import java.util.Scanner;

public class Courant {
	protected int numero;
	protected String nom, prenom;
	protected float solde;


	public Courant (){
	this.numero = 0;
	this.nom="";
	this.prenom="";
	this.solde=80;
	}
	
	public Courant(int numero, String nom, String prenom) { 
		this.numero=numero;
		this.nom=nom;
		this.prenom=prenom;
		this.solde=80;
	}
	
	
	
	public void ouvrir() {
		Scanner sc = new Scanner (System.in);
		System.out.println("donner le numéro : ");
		this.numero = sc.nextInt();
		System.out.println("donner le nom : ");
		this.nom = sc.next();
		System.out.println("donner le prenom : ");
		this.prenom = sc.next();
		
	}
	
	public void consulter () {
		System.out.println("Le numero :" +this.numero);
		System.out.println("Le nom:" +this.nom);
		System.out.println("Le prenom :" +this.prenom);
	}
	
	public void deposer () {
		float somme;
		Scanner sc = new Scanner (System.in);
		System.out.println("Donner la somme à déposer :");
		somme = sc.nextFloat();
		this.solde = this.solde+somme;
		System.out.println("new solde :" +this.solde);
	}
	
	
	
	public void retirer () {
		float somme;
		Scanner sc = new Scanner (System.in);
		System.out.println("Donner la somme à retirer :");
		somme = sc.nextFloat();
		this.solde = this.solde-somme;
		System.out.println("new solde :" +this.solde);
		
	}
	
	public void menu () {
		Scanner sc = new Scanner (System.in);
		int choix = 0;
		do {
			System.out.println("_______________ COMPTE COURANT ___________");
			System.out.println("1- ouvrir");
			System.out.println("2- consulter ");
			System.out.println("3- deposer ");
			System.out.println("4- retirer ");
			System.out.println("0- Quitter");
			System.out.println("Votre choix  :");
			choix = sc.nextInt();
			switch (choix) {
			case 1 : this.ouvrir();break;
			case 2 : this.consulter(); break;
			case 3 : this.deposer();break;
			case 4 : this.retirer(); break;
			}
		}while (choix !=0);
	
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}
	
	//getters and setters 
	
}
