package it.jdbccinemamanager.model;

public class Film {

	private int codfilm;
	private int annoproduzione;
	private String titolo;
	private String nazionalita;
	private String regista;
	private String attori;
	private String genere;

	public Film() {
	}

	public Film(int annoproduzione, String titolo, String nazionalita, String regista, String attori,
			String genere) {
		this.annoproduzione = annoproduzione;
		this.titolo = titolo;
		this.nazionalita = nazionalita;
		this.regista = regista;
		this.attori = attori;
		this.genere = genere;
	}
	
	public Film(int codfilm, int annoproduzione, String titolo, String nazionalita, String regista, String attori,
			String genere) {
		this.codfilm = codfilm;
		this.annoproduzione = annoproduzione;
		this.titolo = titolo;
		this.nazionalita = nazionalita;
		this.regista = regista;
		this.attori = attori;
		this.genere = genere;
	}

	@Override
	public String toString() {
		return "Film [codfilm=" + codfilm + ", annoproduzione=" + annoproduzione + ", titolo=" + titolo
				+ ", nazionalita=" + nazionalita + ", regista=" + regista + ", attori=" + attori + ", genere=" + genere
				+ "]" + "\n";
	}

	public int getCodfilm() {
		return codfilm;
	}

	public void setCodfilm(int codfilm) {
		this.codfilm = codfilm;
	}

	public int getAnnoproduzione() {
		return annoproduzione;
	}

	public void setAnnoproduzione(int annoproduzione) {
		this.annoproduzione = annoproduzione;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getNazionalita() {
		return nazionalita;
	}

	public void setNazionalita(String nazionalita) {
		this.nazionalita = nazionalita;
	}

	public String getRegista() {
		return regista;
	}

	public void setRegista(String regista) {
		this.regista = regista;
	}

	public String getAttori() {
		return attori;
	}

	public void setAttori(String attori) {
		this.attori = attori;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}
}
