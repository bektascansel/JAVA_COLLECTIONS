package LİST;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		//vectorlerde boyut belirtilebilir. varsayılan olarak 10 olan boyut istenildiğinde değiştirilebilir.
		//elemanlar verilen boyutu aşarsa vector kendi kapasitesini otomatik olarak arttırabilir.
		Vector<String> vector=new Vector<String>(4);
		vector.add("Kedi");
		vector.add("Kopek");
		vector.add("Kaplan");
		
		
		for(int i=0;i<vector.size();i++) {
			System.out.println(vector.get(i));
		}
		
		System.out.println("Vector kapasitesi: ");
		System.out.println(vector.capacity());
		
		System.out.println(vector.contains("Kedi"));
		
		vector.clear();
		System.out.println(vector.size());
		System.out.println(vector.capacity());
	}
}
