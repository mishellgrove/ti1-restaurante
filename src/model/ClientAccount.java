package model;

// @autor:Mishell Arboleda
public class ClientAccount implements Comparable<ClientAccount> {

	private String names;
	private String surnames;
	private String id;
	private String address;
	private String phone;
	private long timeToFind;

	public ClientAccount (String names, String surnames, String id, String address,String phone) {

		this.names = names;
		this.surnames = surnames;
		this.id = id;
		this.address = address;
		this.phone = phone;
	}
	
	@Override
	public int compareTo(ClientAccount c) {
		int comparator;		
		comparator = surnames.compareTo(c.getSurnames());
		if (comparator == 0) {
			comparator =names.compareTo(c.getName()); 
		}		
		return  comparator;
	}
	

	public String getId() {
		return id;
	}

	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	public String getName() {
		return names;
	}
	public String getSurnames() {
		return surnames;
	}

	public void setId(String id2) {
		id = id2;
	}

	public void setPhone(String phon) {
		phone = phon;
	}

	public void setAddress(String add) {
		address = add;
	}
	public long getTimeToFind() {
		return timeToFind;
	}
	public void setTimeToFind(long time) {
		timeToFind = time;
	}

}
