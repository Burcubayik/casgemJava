package oop1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product();//referans oluştur.
		product1.setId(1);//set
		product1.setName("klavye");
		product1.setUnitPrice(250);
		product1.setDescription("Dell bir şey klavye");
		
		Product product2 = new Product();//referans oluştur.
		product2.setId(2);
		product2.setName("mouse");
		product2.setUnitPrice(350);
		product2.setDescription("Microsoft mouse");
		
		Product product3 = new Product(3,"Telefon",10000,"Iphone 11");
		Product product4 = new Product(3,"Telefon",10000,"Iphone 11");
		Product product5 = new Product(1,"Klavye",500,"Dell");
		ProductManager productManager = new ProductManager();
		productManager.add(product1);
		productManager.add(product2);
		productManager.add(product3);
		productManager.add(product4);
		
		productManager.update(product5);
		for (Product product : productManager.getAll()) {
			System.out.println(product.getName() + "/" + product.getUnitPrice());
			
		}
		
		
	
		//yazma set
		//okuma get
		//default consturctor 
		

	}

}
