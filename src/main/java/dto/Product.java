package dto;

import java.io.Serializable;

// 모델 클래스
// JSP : 자바빈즈 (getter/setter, 기본 생성자, Serializable)
public class Product {
	// Add generated serial version ID
	// 자바에서 직렬화 할 때 사용한다.
	// 아래의 코드들이 여러 곳에 흩어져 있는데 한 곳에 모아 직렬화를 해서 다른 곳으로 코드가 왔다갔다 할 때 용이하게 하기 위해 사용
	// 다형성 때문에 interface를 사용한다. 

	private String productId;
	private String name;
	private int unitPrice;
	private String description;
	private String manufacturer;
	private String category;
	private long unitsInStock;
	private String condition;
	
	// 빈 생성자를 추가해서 JSP의 기본 생성자를 맞춰준다.
	public Product() {};
	// 생성자 추가 
	public Product(String productId, String name, int unitPrice) {
		this.productId = productId;
		this.name = name;
		this.unitPrice = unitPrice;
	}
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public long getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(long unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	// 왜 하는가? 이 객체를 String 형태로 보여주기 위한
	
//	@Override
//	public String toString() {
//		return "Product [productId=" + productId + ", name=" + name + ", unitPrice=" + unitPrice + ", description="
//				+ description + ", manufacturer=" + manufacturer + ", category=" + category + ", unitsInStock="
//				+ unitsInStock + ", condition=" + condition + "]";
//	}
	
	
	
}
