
public class Arme {
	private String nom;
	private typeArme type;
	private int puissance;
	
	public enum typeArme{
		EPEE,
		COUTEAU,
		MASSE,
		PISTOLET,
		ARC;

		
	int getPuissanceArme(Arme.typeArme arme) {
			
			return 0;
		}

	int getPuissanceArmes() {
		
		return 0;
	}
	}

	public Arme() {
		super();
		
	}

	public Arme(String nom, typeArme type, int puissance) {
		super();
		this.nom = nom;
		this.type = type;
		this.puissance = puissance;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public typeArme getTypeArm() {
		return type;
	}

	public void setTypeArme(typeArme type) {
		this.type = type;
	}
	


	public int setPuissanceArme(int newPuissance) {
		return this.puissance = newPuissance;
	}

	public typeArme getTypeArc() {
		return typeArme.ARC;
	}
	
	
}
