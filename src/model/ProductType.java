package model;

import java.util.ArrayList;
import java.util.List;

public class ProductType {

	private List<ClientAccount> clients;
	private List<Order> orders;
	private List<Product> products;
	private List<LaCasaDorada> restaurants;
	public ProductType() {

		clients = new ArrayList<>();
		orders = new ArrayList<>();
		products = new ArrayList<>();
		restaurants = new ArrayList<>();
	}
	
	public void registerProduct(String name, String description, double cost) {
		Product p = new Product( name, description, cost);
		products.add(p);		
	}
	


}
