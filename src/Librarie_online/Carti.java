package Librarie_online;

public class Carti {
	Integer ISBN;
	String denumire;
	String editura;
	Integer anAparitie;
	Double pretUnitar;
	public Integer getIdProdus() {
		return ISBN;
	}

	public void setISBN(Integer ISBN) {
		this.ISBN = ISBN;
	}

	public String getEditura() {
		return editura;
	}

	public void setEditura(String editura) {
		this.editura = editura;
	}

	public Integer getAnAparitie() {
		return anAparitie;
	}

	public void setAnAparitie(Integer anAparitie) {
		this.anAparitie = anAparitie;
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public Double getPretUnitar() {
		return pretUnitar;
	}

	public void setPretUnitar(Double pretUnitar) {
		this.pretUnitar = pretUnitar;
	}

	public Carti(Integer ISBN, String denumire, String editura, Integer anAparitie, Double pretUnitar) {
		this.ISBN = ISBN;
		this.denumire = denumire;
		this.editura=editura;
		this.anAparitie=anAparitie;
		this.pretUnitar = pretUnitar;

	}

	public Carti() {
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ISBN == null) ? 0 : ISBN.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carti other = (Carti) obj;
		if (ISBN == null) {
			if (other.ISBN != null)
				return false;
		} else if (!ISBN.equals(other.ISBN))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ISBN carte: " + this.ISBN + ", denumire: " + this.denumire + ", pret unitar: " + this.pretUnitar;
	}

	/*@Override
	public int compareTo(Carti other) {
		// Produse ordonate dupa id
		// return this.idProdus.compareTo(other.getIdProdus());
		
		// Produse ordonate dupa id reverse(desc)
		return -this.idProdus.compareTo(other.getIdProdus());
		/*if (this.idProdus.intValue() < other.idProdus.intValue())
			return -1;
		else if (this.idProdus.intValue() == other.idProdus.intValue())
			return 0;
		else
			return 1;*/
}
