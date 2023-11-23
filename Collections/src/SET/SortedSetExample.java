package SET;
import java.util.*;

public class SortedSetExample {
    
	public static void main(String[] args) {
		
		//generic olarak tanımlandı
		SortedSet<Integer> sortedSet= new TreeSet<>();
		sortedSet.add(3);
		sortedSet.add(5);
		sortedSet.add(1);
		
		// sortedSet iççerisinde gezmek için iterator nesnesi oluşturalım.
		
		Iterator<Integer> ıterator=sortedSet.iterator();
		
		while(ıterator.hasNext()) {
			System.out.println(ıterator.next());
		}
		
		
		//Kullanıcı tarafından oluşturulan nesneleri tutmak için;
		 
		SortedSet<Ogrenci> sortedSet2=new TreeSet<>(); 
		sortedSet2.add(new Ogrenci(1,"john"));
		sortedSet2.add(new Ogrenci(2,"wick"));
		sortedSet2.add(new Ogrenci(3,"nick"));
		sortedSet2.add(new Ogrenci(3,"ella"));//bu degerin no numarası set içerisinde var olduğundan eklenmeyecektir.
		
		Iterator<Ogrenci> ıterator2 =sortedSet2.iterator();	
		while(ıterator2.hasNext()) {
			System.out.println(ıterator2.next());
		}
		
		
	}
}
