package Librarie_online;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Achizitii {

	private Integer ISBN;
	private Date data;
	private Integer sumaVanzari;
	private List<ArticoleAchizitiiCarti> carti = new ArrayList<ArticoleAchizitiiCarti>();
	private ClientiLibrarie client;
	public Integer getISBN() {
		return ISBN;
	}
	public void setISBN(Integer iSBN) {
		ISBN = iSBN;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Integer getSumaVanzari() {
		return sumaVanzari;
	}
	public void setSumaVanzari(Integer sumaVanzari) {
		this.sumaVanzari = sumaVanzari;
	}
	public List<ArticoleAchizitiiCarti> getCarti() {
		return carti;
	}
	public void setCarti(List<ArticoleAchizitiiCarti> carti) {
		this.carti = carti;
	}
	public ClientiLibrarie getClient() {
		return client;
	}
	public void setClient(ClientiLibrarie client) {
		this.client = client;
	}
	public Achizitii(Integer iSBN, Date data, Integer sumaVanzari, List<ArticoleAchizitiiCarti> carti, ClientiLibrarie client) {
		super();
		ISBN = iSBN;
		this.data = data;
		this.sumaVanzari = sumaVanzari;
		this.carti = carti;
		this.client = client;
	}
	public Achizitii() {
		super();
	}
	@Override
	public int hashCode() {
		return Objects.hash(ISBN, carti, client, data, sumaVanzari);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Achizitii other = (Achizitii) obj;
		return Objects.equals(ISBN, other.ISBN) && Objects.equals(carti, other.carti)
				&& Objects.equals(client, other.client) && Objects.equals(data, other.data)
				&& Objects.equals(sumaVanzari, other.sumaVanzari);
	}
	
	

}
