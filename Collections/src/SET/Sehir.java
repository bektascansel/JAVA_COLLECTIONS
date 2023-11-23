package SET;

public class Sehir implements Comparable<Sehir>{
       
	private String plakaKodu;
	private String isim;
	
	
	
	public Sehir() {
		super();
	}
	public Sehir(String plakaKodu, String isim) {
		super();
		this.plakaKodu = plakaKodu;
		this.isim = isim;
	}
	public String getPlakaKodu() {
		return plakaKodu;
	}
	public void setPlakaKodu(String plakaKodu) {
		this.plakaKodu = plakaKodu;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	@Override
	public String toString() {
		return "Plaka Kodu: "+plakaKodu+" İsim: "+isim;
	}
	
	//sıralamanın nasıl olması gerektiğini bu metotta belirtebirliz.
	@Override
	public int compareTo(Sehir o) {
		return this.getPlakaKodu().compareTo(o.plakaKodu);
	}
	
	
	
}
