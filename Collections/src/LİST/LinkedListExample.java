package LİST;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
      
	public static void main(String[] args) {
		
		LinkedList<Integer> integers=new LinkedList<Integer>();
		
		integers.add(10);
		integers.add(20);
		integers.add(30);
		integers.add(20); //bu deger liste eklenecektir. çünkü list unique değer tutmaz.
		
		//istenilen index'e eleman eklemek 
		integers.add(2, 55);

		System.out.println("Eleman sayısı: "+integers.size());
		
		Iterator<Integer> iterator=integers.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//istenilen index'e elemanı döndürme
		System.out.println(integers.get(0));
		
		//ilk index'e eleman ekleme
		integers.addFirst(1);
		//Son index'e eleman ekleme
		integers.addLast(9);
		
		
		System.out.println(integers.getFirst());
		System.out.println(integers.getLast());
		System.out.println(integers.indexOf(30));
		//sondan index araması yapar
		System.out.println(integers.lastIndexOf(30));
		
		
		System.out.println("------------------------");
		
		
		LinkedList<Ogrenci> linkedList=new LinkedList<Ogrenci>();
		linkedList.add(new Ogrenci(1,"john","wick"));
		linkedList.add(new Ogrenci(2,"jenne","john"));
		linkedList.add(new Ogrenci(3,"oscar","desert"));
		
		System.out.println("linkedList elemanları:");
		Iterator<Ogrenci> iterator2=linkedList.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
		System.out.println("Liste başı:");
		System.out.println(linkedList.getFirst());
		
		
	}
}
