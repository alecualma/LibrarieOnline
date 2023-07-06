package Librarie_online;

import java.util.Date;

public class Autori {
	private Integer idAutor;
	private String numeAutor;
	private Date dataNastere;
	private Integer tara;
	public Integer getIdAutor() {
		return idAutor;
	}
	public void setIdAutor(Integer idAutor) {
		this.idAutor = idAutor;
	}
	public String getNumeAutor() {
		return numeAutor;
	}
	public void setNumeAutor(String numeAutor) {
		this.numeAutor = numeAutor;
	}
	public Date getDataNastere() {
		return dataNastere;
	}
	public void setDataNastere(Date dataNastere) {
		this.dataNastere = dataNastere;
	}
	public Integer getTara() {
		return tara;
	}
	public void setTara(Integer tara) {
		this.tara = tara;
	}
	public Autori(Integer idAutor, String numeAutor, Date dataNastere, Integer tara) {
		super();
		this.idAutor = idAutor;
		this.numeAutor = numeAutor;
		this.dataNastere = dataNastere;
		this.tara = tara;
	}
	public Autori() {
		super();
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	
}
