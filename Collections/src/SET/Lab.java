package SET;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Lab {
	
	public static void doldur(SortedSet<Integer> integers,int sutunSayısı) {
		integers.clear();
		Random random=new Random();
		while(integers.size()<sutunSayısı) {
			int sayi=random.nextInt(49)+1;
			integers.add(sayi);
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Satır sayısını giriniz: ");
		int satirSayisi=scanner.nextInt();
		System.out.println("sutun sayısını giriniz");
		int sutunSayisi=scanner.nextInt();
		
		SortedSet<Integer> integers= new TreeSet<Integer>();
		
		for(int i=0;i<satirSayisi;i++) {
			doldur(integers, sutunSayisi);
		    Iterator<Integer> iterator=integers.iterator();
		    while(iterator.hasNext()) {
		    	System.out.print(iterator.next()+"  ");
		    }
		    System.out.println();
			
		}
		
		
		
	}

}
