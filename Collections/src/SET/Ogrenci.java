package SET;

public class Ogrenci implements Comparable<Ogrenci>{
	
	
      private int no;
      private String name;
      
      
	public Ogrenci() {
		super();
	}
	public Ogrenci(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
      
	@Override
	public String toString() {
		return "No: "+no+" name: "+name;
	}
	
	//SIRALAMA METODU BELİRTİLMELİDİR.
	//TreeSet içrisindeki değerlerin unique olup olmadığını bu metottan dönen değer ile anlar.
	// Eğer donen deger 0 ise nesnelerin aynı olduğunu belirtir. aşagıda verilen nesnenin no ozelliği ile bu kıyaslamayı yapar.
	// Aynı deger verilirse set içerisine eklenme yapılmaz çünkü treeSet unique degerler tutar
	@Override
	public int compareTo(Ogrenci o) {
		//numaraya göre küçükten büyüye doğru sıralar.
		return this.no-o.no; 
		
		/*büyükten küçük numaraya doğru
		 * return o.no-this.no
		 */
	}
      
      
}
