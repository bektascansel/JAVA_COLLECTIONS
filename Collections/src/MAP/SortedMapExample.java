package MAP;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {
    
	public static void main(String[] args) {
		
		//Sorted set anahtar degerlerine göre sıralanır 
		
		SortedMap<String, String> sortedMap=new TreeMap<String, String>();
		sortedMap.put("Araba", "Car");
		sortedMap.put("Ev", "Home");
		sortedMap.put("Kalem", "Pen");
		
		System.out.println(sortedMap.size());
		
		System.out.println(sortedMap.get("Araba"));
		
		System.out.println("---------------");
		//sortedMap içerisinde dolaşma 
		//Anahtar degerlerini gezer
		Set<String> keySet=sortedMap.keySet();
		Iterator<String>iterator=keySet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		System.out.println("------------------");
		//Value degerlerini döndürme 
		Collection<String> valueSet=sortedMap.values();
		Iterator<String>iterator2=valueSet.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
			
		}
	}
}
