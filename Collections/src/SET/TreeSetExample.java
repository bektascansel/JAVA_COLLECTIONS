package SET;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<String> treeSet=new TreeSet<>();
		treeSet.add("Siyah");
		treeSet.add("Beyaz");
		treeSet.add("Mavi");
		treeSet.add("Siyah");//eklenmez.treeSet içerisinde degerler eşsizdir.
		
		Iterator<String> ıterator=treeSet.iterator();
		while(ıterator.hasNext()) {
			System.out.println(ıterator.next());
		}
		
		System.out.println("-------------");
		TreeSet<Sehir> treeSet2=new TreeSet<>();
		treeSet2.add(new Sehir("49","Mus"));
		treeSet2.add(new Sehir("01","Adana"));
		treeSet2.add(new Sehir("35","İzmir"));
		treeSet2.add(new Sehir("06","Ankara"));
		Iterator<Sehir> iterator=treeSet2.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		
		
	}
}
