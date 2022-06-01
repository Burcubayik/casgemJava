package oop1;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
	
	private List<Product> products;
	//iş yapan class
	//add sadece ekleme yapar
	public ProductManager() {//consturctor bloğu
		
		products = new ArrayList<Product>();
	}
	public void add(Product product) {
		if(!checkIfProductNameExists(product.getName())) {
			products.add(product);
		}
		else {
			System.out.println("Ürün Mevcut");
		}
		
		
	}
	public void update(Product product) {
		Product productToUpdate = getById(product.getId());
		productToUpdate.setDescription(product.getDescription());
		productToUpdate.setName(product.getName());
		productToUpdate.setUnitPrice(product.getUnitPrice());
		
	}
	
	public void delete(Product product) {
		products.remove(getById(product.getId()));
		
	}
	public List<Product> getAll(){
		return products;
	}
	private boolean checkIfProductNameExists(String productName) {
		boolean exists = false;
		for(Product item: products) {
			if(item.getName()==productName) {
				exists=true;
			}
		}
		return exists;
		
	}
	private Product getById(int id) {
		Product productToFind = null;
		for(Product item : products) {
			if(item.getId()==id) {
				productToFind=item;
			}
		}
		return productToFind;
	}

}
