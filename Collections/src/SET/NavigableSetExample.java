package SET;
import java.util.*;

public class NavigableSetExample {

	public static void main(String[] args) {
		
		NavigableSet<Integer> navigableSet=new TreeSet<>();
		navigableSet.add(30);
		navigableSet.add(9);
		navigableSet.add(13);
		navigableSet.add(8);
		navigableSet.add(21);
		
		
		Iterator<Integer> ıterator=navigableSet.iterator();
		
		
		while(ıterator.hasNext()) {
		System.out.println(ıterator.next());
		
	    }
		
		//ceiling 9 veya 9 büyük en küçük değeri bulur.(9)
		System.out.println(navigableSet.ceiling(9));
		
		//higher 9 büyük en küçük değeri bulur(13)
		System.out.println(navigableSet.higher(9));
		
		
		//13 veya 13'ten küçük en büyük deger (13)
		System.out.println(navigableSet.floor(13));
        
		//13'ten küçük en büyük deger (9)
		System.out.println(navigableSet.lower(13));
		
		//HeadSet parametre olarak verdiğimiz degerleri bize ayrı bir set olarak verir
		SortedSet<Integer> sortedSet=navigableSet.headSet(5);
		while(ıterator.hasNext()) {
			System.out.println(ıterator.next());
		}
}
}