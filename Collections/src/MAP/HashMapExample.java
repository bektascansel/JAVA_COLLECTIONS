package MAP;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap=new HashMap<>();
		hashMap.put(34, "İstabul");
		hashMap.put(35, "İzmir");
		hashMap.put(6, "Ankara");
		hashMap.put(34, "İstabul2");//ilk girilen 34 anahtar değerini ezer
		
	    System.out.println(hashMap.size());
		System.out.println(hashMap.get(34));
		
		
		//map iterator interface'ini implemente etmediğinden içinde dönmemiz mümkün degil.
		//İçerisinde dönmemiz için key degerlerini tutan bir keySet oluşturulur;
		Set<Integer> keySet=hashMap.keySet();
		//Oluşturulan keySet üzerinden iterator oluşturulabilir.
		Iterator<Integer> iterator=keySet.iterator();
		while(iterator.hasNext()) {
			System.out.println(hashMap.get(iterator.next()));
		}
	}
}
