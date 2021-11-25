
public class Main {

	public static void main(String[] args) {
		final String WINNER = "\"And the Winner is : \"";
		final String LOSER = "\"the loser is : \"";
		  
		Participant participant1 = new Participant("participant1",Arme.typeArme.PISTOLET, 10, 1, 5);
		  Adversaire adversaire1 = new Adversaire("adversaire1",Arme.typeArme.ARC, 5, 3, 9);
		  
		  
		  System.out.println(participant1.toString());
		  System.out.println(adversaire1.toString());
		  
		  System.out.println(participant1.getForceArme());
		  System.out.println(adversaire1.getForceArme());
		  
			/*Quand le joueur dont la force * santé * expérience * puissance de l’arme est la plus grande
			gagne 1 point de force. L’autre joueur perd un point de santé.*/
		
				if(participant1.getForceArme() > adversaire1.getForceArme()) {
					participant1.setPower(participant1.getForce() +1);
					//On affiche le nom du vainqueur 
					System.out.println(WINNER + participant1.getNom());
					adversaire1.setSante(adversaire1.getSante()-1);
				}else {
					adversaire1.setPower(adversaire1.getForce() +1);
					//et le nom du perdant
					System.out.println(LOSER + adversaire1.getNom());
					participant1.setSante(participant1.getSante()-1);
				}
					//Les deux joueurs gagent un point d’expérience.					friend.setExperience(this.getExperience() +1);
				participant1.setExperience(participant1.getExperience() +1);
				adversaire1.setExperience(adversaire1.getExperience() +1);

	}/*END MAIN TO BE CONTINUED...*/

}
