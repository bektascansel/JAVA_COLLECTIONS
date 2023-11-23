package SET;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	
	public static void main(String [] args) {
		
		HashSet<String> hashSet=new HashSet<String>();
		hashSet.add("istanbul");
		hashSet.add("Ankara");
		hashSet.add("Aydın");
		
		Iterator<String> iterator=hashSet.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		HashSet<Calısan> hashSet2=new HashSet<>();
		hashSet2.add(new Calısan("123456","john"));
		hashSet2.add(new Calısan("789456","wich"));
		hashSet2.add(new Calısan("456123","allison"));
		
		Iterator<Calısan> iterator2=hashSet2.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
	}

}
