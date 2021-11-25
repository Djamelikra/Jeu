
public class Joueur {
	//Les joueurs ont un nom, une santé, une force et une expérience.
	//Ces trois dernières caractéristiques sont des entiers positifs ou nuls.
	private String nom;
	private Arme.typeArme arme;
	private int sante;
	private int force;
	protected int experience;
	
	public Joueur(String nom, int sante, int experience) {
        this.nom = nom;
        this.sante = sante;
        this.experience = 0;
        this.setForce();
    }
	
	public void setForce() {
		int n = 0;
		n = (int)(Math.random() * 10);
        this.force = n;
    }
	


	public Joueur(String nom, Arme.typeArme arme, int sante, int force, int experience) {
		super();
		this.nom = nom;
		this.arme = arme;
		this.sante = sante;
		this.force = force;
		this.experience = experience;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Arme.typeArme getArme() {
		return arme;
	}

	public void setArme(Arme.typeArme arme) {
		this.arme = arme;
	}

	public int getSante() {
		return sante;
	}

	public int setSante(int newSante) {
		return this.sante = newSante;
	}

	public int getForce() {
		return force;
	}

	public int setPower(int newPower) {
		return this.force = newPower;
	}

	public int getExperience() {
		return experience;
	}

	public int setExperience(int newExperience) {
		return this.experience = newExperience;
	}
	

	@Override
	public String toString() {
		return "Joueur [nom:" + nom + ", arme=" + arme + ", sante=" + sante + ", force=" + force + ", experience="
				+ experience + "]";
	}
	//LOGIC METIER
	public void disarmed() {
		this.arme = null;
		
	}
	
	public boolean dead(){
		if(this.sante == 0) {
			return true;
		}
		return false;
	}
	
	public void changeArm(Arme arm) {
		this.arme = arm.getTypeArm();
		
	}
	/*Quand le joueur dont la force * santé * expérience * puissance de l’arme est la plus grande
	gagne 1 point de force.*/
	public void attack() {
		this.experience++;
		this.sante--;
	}
	
	public void etreAttaque() {
		this.sante--;
	}
	

	public int gamerPower() {
	return this.setPower(experience) * this.force * this.experience * this.force;

}
	
	public int getForceArme() {
		return this.force * this.sante * this.experience * getPuissanceArmes(arme) ;
	}
	
	public int getPuissanceArmes(Arme.typeArme weapon) {
		switch (weapon) {
		case PISTOLET: 
			return 1000;
		case EPEE: 
			return 500;
		case COUTEAU: 
			return 300;
		case ARC: 
		case MASSE: 
			return 200;
		default :
			return 0;
		}
	}



}
