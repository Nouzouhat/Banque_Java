import java.util.Scanner;

public class Bourse extends Courant
{
		private int nbActions;
		private float valAction;
		
		
		public Bourse () {
		super();
		this.nbActions= 0;
		this.valAction= 0;
		}
		
		public Bourse (int numero, String nom, String prenom, int nbActions, float valActions) {
			super(numero, nom, prenom);
			this.valAction = valAction;
			this.nbActions = nbActions;
		}
		
		public void ouvrir () {
			super.ouvrir();
			Scanner sc= new Scanner(System.in);
			System.out.println("donner le nb Ation:");
			this.nbActions= sc.nextInt();
			System.out.println("donner la valeur Action:");
			this.valAction=sc.nextFloat();
			
		}
		
		public void consulter () {
			super.consulter();
			System.out.println("le nb Action est de:"+this.nbActions);
			System.out.println("la valeur Action est de:" +this.valAction);
			
		}
		
		public void vendre () {
			int nb;
			Scanner sc = new Scanner(System.in);
			System.out.println("nb Action à vendre :");
			nb=sc.nextInt();
			this.nbActions=this.nbActions-nb;
			this.solde = nb*this.valAction+this.solde;
			System.out.println("opérations de vente réalisée ");
			
		}
		
		public void acheter () {
			int nb;
			Scanner sc = new Scanner(System.in);
			System.out.println("nb Action à acheter :");
			nb=sc.nextInt();
			this.nbActions=this.nbActions+nb;
			this.solde = this.solde-nb*this.valAction;
			System.out.println("opérations d'achat réalisée ");
		}
		
		public void menu () {
			Scanner sc = new Scanner (System.in);
			int choix = 0;
			do {
				System.out.println("_______________ COMPTE BOURSE ___________");
				System.out.println("1- ouvrir");
				System.out.println("2- consulter ");
				System.out.println("3- deposer ");
				System.out.println("4- retirer ");
				System.out.println("5- Vendre des actions ");
				System.out.println("6- Achat des actions ");
				System.out.println("0- Quitter");
				System.out.println("Votre choix  :");
				choix = sc.nextInt();
				switch (choix) {
				case 1 : this.ouvrir();break;
				case 2 : this.consulter(); break;
				case 3 : this.deposer();break;
				case 4 : this.retirer(); break;
				case 5 : this.vendre();break;
				case 6 : this.acheter();break;
				}
			}while (choix !=0);
		
		}

		public int getNbActions() {
			return nbActions;
		}

		public void setNbActions(int nbActions) {
			this.nbActions = nbActions;
		}

		public float getValAction() {
			return valAction;
		}

		public void setValAction(float valAction) {
			this.valAction = valAction;
		}
		
		//getters and setters
		
}
