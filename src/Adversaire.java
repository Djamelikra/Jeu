
public class Adversaire extends Joueur {

	public Adversaire(String nom, int sante, int experience) {
		super(nom, sante, experience);
		
	}

	public Adversaire(String nom, Arme.typeArme arme, int sante, int force, int experience) {
		super(nom, arme, sante, force, experience);
		
	}
	

}
