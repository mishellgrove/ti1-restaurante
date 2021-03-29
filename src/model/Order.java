package model;

import java.util.List;
import java.util.UUID;

public class Order {

	private String code;
	private OrderStatus status;
	private String idCust;
	private String nitRest;
	private String currentTime;
	private String currentDate;
	private List<Product> productsToOrder;
	
	public Order(String idCust, String nitRest) {
		this.idCust = idCust;
		this.nitRest = nitRest;
		status = OrderStatus.REQUESTED;		
		code = UUID.randomUUID().toString();
	
	}
	
	public void setStatus(OrderStatus oStatus) {
		status = oStatus;
	}

	public String getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}

	public String getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}

	public List<Product> getProductsToOrder() {
		return productsToOrder;
	}

	public void setProductsToOrder(List<Product> productsToOrder) {
		this.productsToOrder = productsToOrder;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getIdCust() {
		return idCust;
	}
	public String getCode() {
		return code;
	}

	public void setIdCust(String idCust) {
		this.idCust = idCust;
	}

	public String getNitRest() {
		return nitRest;
	}

	public void setNitRest(String nitRest) {
		this.nitRest = nitRest;
	}

	public OrderStatus getStatus() {
		return status;
	}

}
