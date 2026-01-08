package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom,int force)
	{
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
		System.out.println(minus.getNom());
	}
	public void parler(String text) {
		System.out.println("Le romain"+ getNom() + ": <<" + text + ">>.");
	}
	public void recevoirCoup(int force)
	
}
	
