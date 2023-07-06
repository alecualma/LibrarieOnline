package Librarie_online;

import java.util.Objects;

public class Edituri {
	String Editura;
	String Adresa;
	String Localitatea;
	String Tara;
	public String getEditura() {
		return Editura;
	}
	public void setEditura(String editura) {
		Editura = editura;
	}
	public String getAdresa() {
		return Adresa;
	}
	public void setAdresa(String adresa) {
		Adresa = adresa;
	}
	public String getLocalitatea() {
		return Localitatea;
	}
	public void setLocalitatea(String localitatea) {
		Localitatea = localitatea;
	}
	public String getTara() {
		return Tara;
	}
	public void setTara(String tara) {
		Tara = tara;
	}
	public Edituri(String editura, String adresa, String localitatea, String tara) {
		super();
		Editura = editura;
		Adresa = adresa;
		Localitatea = localitatea;
		Tara = tara;
	}
	public Edituri() {
		super();
	}
	@Override
	public int hashCode() {
		return Objects.hash(Adresa, Editura, Localitatea, Tara);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Edituri other = (Edituri) obj;
		return Objects.equals(Adresa, other.Adresa) && Objects.equals(Editura, other.Editura)
				&& Objects.equals(Localitatea, other.Localitatea) && Objects.equals(Tara, other.Tara);
	}
	

}
