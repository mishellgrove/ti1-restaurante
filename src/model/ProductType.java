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

	public void registerClients(String typeId, String id, String fullNam, String phone, String address) {
		ClientAccount ca = new ClientAccount(typeId, id, fullNam, phone, address);
		if(clients.isEmpty()) {
			clients.add(ca);
		}else {			
			int i = 0;
			while (i<clients.size() && ca.compareTo(clients.get(i))<0) {
				i++;
			}
			clients.add(i, ca);
		}
	}

	public void sortCustomersBySurnamesAndNames() {

		for (int i = 1; i < clients.size(); i++) { 

			ClientAccount temp = clients.get(i);
			int j = i - 1;
			while (j >= 0 && clients.get(j).compareToBySurnamesAndName(temp)>0) {

				clients.set(j+1, temp);
				j = j - 1; 
			} 
			clients.set(j+1, temp);
		}

	}
}
