package collections;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> students = new ArrayList<String>();
		
		students.add("Engin");
		students.add("Mert");
		students.add("Emrah");
		
		students.remove("Engin");
		
		//burada kod satır satır çalıştığı için array boşa çıkar.
		 students.remove(0);
		 students.remove(0);
		 students.remove(0);
		 
		 
		 students.clear();//her şeyi siler
		 boolean hasMert = students.contains("Mert");//boolean değer döndürür ve içerisine yazdığımız şey var mı diye bakar.
		 for (String student : students) {
			 System.out.println(student);
			
		}

	}

}
