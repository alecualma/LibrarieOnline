package Librarie_online;

public class ArticoleAchizitiiCarti {
	Carti carte;
	Double cantitate;
	Double valoareCarte;

	Double calculValoare() {
		Double valoare = null;
		if (carte != null && cantitate != null)
			valoare = carte.getPretUnitar() * cantitate;
		return valoare;
	}
}
