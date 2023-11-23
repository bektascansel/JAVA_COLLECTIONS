package SET;

public class Calısan {
	
      private String tcNo;
      private String isim;
      
	public Calısan() {
		super();
	}
	public Calısan(String tcNo, String isim) {
		super();
		this.tcNo = tcNo;
		this.isim = isim;
	}
	public String getTcNo() {
		return tcNo;
	}
	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
     
	public String toString() {
		return "Tc no: "+tcNo+" isim: "+isim;
	}
	
	@Override 
	public int hashCode() {
		return Integer.valueOf(tcNo);
	}
	
	//unique yapar
	@Override
	public boolean equals(Object other) {
		Calısan calısan= (Calısan) other;
		return this.tcNo.equals(calısan.tcNo);
		
		
	}
      
}
