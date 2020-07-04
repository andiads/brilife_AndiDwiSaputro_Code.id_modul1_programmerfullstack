package com.nusacamp.app.model;

public class ViewReportEntity {
	
	private int idPropinsi;
	private String namaPropinsi;
	private int pil;
	private int kondom;
	private int iud;
	private int jumlahHorizontal;
	private int jumlahVertical;
	
	public ViewReportEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdPropinsi() {
		return idPropinsi;
	}

	public void setIdPropinsi(int idPropinsi) {
		this.idPropinsi = idPropinsi;
	}

	public String getNamaPropinsi() {
		return namaPropinsi;
	}

	public void setNamaPropinsi(String namaPropinsi) {
		this.namaPropinsi = namaPropinsi;
	}

	public int getPil() {
		return pil;
	}

	public void setPil(int pil) {
		this.pil = pil;
	}

	public int getKondom() {
		return kondom;
	}

	public void setKondom(int kondom) {
		this.kondom = kondom;
	}

	public int getIud() {
		return iud;
	}

	public void setIud(int iud) {
		this.iud = iud;
	}

	public int getJumlahHorizontal() {
		return jumlahHorizontal;
	}

	public void setJumlahHorizontal(int jumlahHorizontal) {
		this.jumlahHorizontal = jumlahHorizontal;
	}

	public int getJumlahVertical() {
		return jumlahVertical;
	}

	public void setJumlahVertical(int jumlahVertical) {
		this.jumlahVertical = jumlahVertical;
	}

	@Override
	public String toString() {
		return "ViewReportEntity [idPropinsi=" + idPropinsi + ", namaPropinsi=" + namaPropinsi + ", pil=" + pil
				+ ", kondom=" + kondom + ", iud=" + iud + ", jumlahHorizontal=" + jumlahHorizontal + ", jumlahVertical="
				+ jumlahVertical + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idPropinsi;
		result = prime * result + iud;
		result = prime * result + jumlahHorizontal;
		result = prime * result + jumlahVertical;
		result = prime * result + kondom;
		result = prime * result + ((namaPropinsi == null) ? 0 : namaPropinsi.hashCode());
		result = prime * result + pil;
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
		ViewReportEntity other = (ViewReportEntity) obj;
		if (idPropinsi != other.idPropinsi)
			return false;
		if (iud != other.iud)
			return false;
		if (jumlahHorizontal != other.jumlahHorizontal)
			return false;
		if (jumlahVertical != other.jumlahVertical)
			return false;
		if (kondom != other.kondom)
			return false;
		if (namaPropinsi == null) {
			if (other.namaPropinsi != null)
				return false;
		} else if (!namaPropinsi.equals(other.namaPropinsi))
			return false;
		if (pil != other.pil)
			return false;
		return true;
	}
	
	
}
