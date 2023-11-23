package MAP;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDriver {
       
	public static void main(String[] args) {
		
		HashMap<Integer, Sehir> hashMap=new HashMap<Integer, Sehir>();
		hashMap.put(34, new Sehir("İstanbul",20000));
		hashMap.put(35, new Sehir("izmir",6000));
		hashMap.put(6, new Sehir("ankara",62000));
		
		System.out.println(hashMap.size());
		System.out.println(hashMap.get(34));
		
		System.out.println("---------------------");
		
		
		
		//Map'in içerisinden sadece anahtarları çekmek istersek 
		Set<Integer>keySet=hashMap.keySet();
		Iterator<Integer> iterator=keySet.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(hashMap.get(iterator.next()));
		}
		
		
		System.out.println("--------------------------");
		
		//Map içerisindeki degerleri çekmek istersek;
		Collection<Sehir> values=hashMap.values();
		Iterator<Sehir> iterator2=values.iterator();
		
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
		System.out.println("--------------------------");
		
		//Map içerisinden hem anahtarı hemde degerleri çekmek istersek
		
		Set<java.util.Map.Entry<Integer, Sehir>> entries=hashMap.entrySet();
		Iterator<java.util.Map.Entry<Integer, Sehir>> iterator3=entries.iterator();
		
         while(iterator3.hasNext()) {
        	 System.out.println(iterator3.next());
         }
	}
	
}
