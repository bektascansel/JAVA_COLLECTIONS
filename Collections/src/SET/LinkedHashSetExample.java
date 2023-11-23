package SET;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> hashSet= new LinkedHashSet<>();
		hashSet.add(2);
		hashSet.add(9);
		hashSet.add(15);
		hashSet.add(3);
		
		
		System.out.println(hashSet.size());
		System.out.println(hashSet.isEmpty());
		System.out.println("------------");
		
		Iterator<Integer> ıterator=hashSet.iterator();
		while(ıterator.hasNext()) {
			System.out.println(ıterator.next());
			
		}
		
		
		System.out.println("--------------");
		LinkedHashSet<Araba> linkedHash= new LinkedHashSet<Araba>();
		linkedHash.add(new Araba("41 Can 1999","volvo","xr"));
		linkedHash.add(new Araba("35 dsg 1269","porsche","xyz"));
		
		//hashCode ile equals metotlarını override edildiğinden dolayı bu nesne eklenmeyecektir.
		linkedHash.add(new Araba("35 dsg 1269","porsche","xyz"));
		
		Iterator<Araba> iterator2=linkedHash.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
	}
	
}
