package MAP;

import java.io.Serializable;

public class Sehir implements Serializable{

	private  String isim;
	private long nufus;
	
	
	public Sehir() {
		super();
	}
	public Sehir(String isim, long nufus) {
		super();
		this.isim = isim;
		this.nufus = nufus;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public long getNufus() {
		return nufus;
	}
	public void setNufus(long nufus) {
		this.nufus = nufus;
	}
	@Override
	public String toString() {
		return "İsim: "+isim+" Nufus: "+nufus;
	}
	
	@Override
	public int hashCode() {
		return isim.hashCode();
	}
	@Override
	public boolean equals(Object o) {
		Sehir sehir=(Sehir)o;
		return sehir.isim.equals(this.isim);
	}
	
	
}
