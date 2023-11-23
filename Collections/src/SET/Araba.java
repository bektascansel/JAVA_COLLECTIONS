package SET;

public class Araba {
      
	  private String plaka;
	  private String marka;
	  private String model;
	  
	  
	  
	
	public Araba() {
		super();
	}
	
	public Araba(String plaka, String marka, String model) {
		super();
		this.plaka = plaka;
		this.marka = marka;
		this.model = model;
	}
	
	
	public String getPlaka() {
		return plaka;
	}
	public void setPlaka(String plaka) {
		this.plaka = plaka;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override 
	public String toString() {
		return "Plaka: "+plaka+" Marka: "+marka+" Model: "+model;
	}
	 
	// linkedHashSetin eşsiz olması için override edilmelidir.
	@Override
	public boolean equals(Object o) {
		Araba araba=(Araba)o;
		return araba.plaka.equals(this.plaka);
		
	}
	
	@Override
	public int hashCode() {
		return this.plaka.hashCode();
	}
	  
}
