
public class Ville {
private String	nomVille;
private String nomPays;
private int nbreHabitants;

public Ville() {
	System.out.println(" Creation d'une ville !");
	nomVille = "Inconnu";
	nomPays = "Inconnu";
	nbreHabitants = 0;
}

public Ville(String pnomVille, String pnomPays, int pnbreHabitants) {
	System.out.println(" Creation d'une ville !");
	nomVille = pnomVille;
	nomPays = pnomPays;
	nbreHabitants = pnbreHabitants;
}


public void decrisToi() {
	System.out.println("VILLE :"+this.getnomVille()+" \n Pays :"+this.getnomPlays());
}

// GET / SET
public String getnomVille () {
	return this.nomVille;
}

public String getnomPlays () {
	return this.nomPays;
}

public int getnbreHabitants () {
	return this.nbreHabitants;
}

public void setnomVille (String nomVille) {
	this.nomVille = nomVille;
}

public void setnomPlays (String nomPays) {
	this.nomPays=nomPays;
}

public void setnbreHabitants (int nbreHabitants) {
	this.nbreHabitants= nbreHabitants;
}

}
