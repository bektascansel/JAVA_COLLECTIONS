package LİST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListExample {

	
	public static void main(String[] args) {
		
		ArrayList<String> arrayList=new ArrayList<String>();
		Scanner scanner=new Scanner(System.in);
		String line=null;
		while(!(line=scanner .nextLine()).equals("exit")) {
			arrayList.add(line);
		}
		
		
		Iterator<String> iterator=arrayList.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		arrayList.remove(0);
		
		
		System.out.println("------------------");
		
		ArrayList<Film> arrayListFilm=new ArrayList<Film>();
		arrayListFilm.add(new Film("X filmi","ali can",FilmTipi.BELGESEL,2002));
		arrayListFilm.add(new Film("XY filmi","can hulk",FilmTipi.KOMEDI,2008));
		
		
		for(int i=0;i<arrayListFilm.size();i++) {
			System.out.println(arrayListFilm.get(i));
		}
	}
}
