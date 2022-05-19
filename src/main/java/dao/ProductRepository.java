package dao;

import java.util.ArrayList;
import java.util.List;
import dto.Product;

// Product에 대한 기능을 정의
public class ProductRepository {
	private List<Product> products = new ArrayList<>();
	
	public ProductRepository() {
		// 원래는 DB에서 가져올 DATA
		// DB를 배우지 않아 만든 코드
		Product phone = new Product("P1234", "iPhone 6s", 800000);
		phone.setDescription("4.7-inch, 1334X750 Retina HD display, processor");
		phone.setCategory("Smart Phone");
		phone.setManufacturer("Apple");
		phone.setUnitsInStock(1000);
		phone.setCondition("New");
		
		Product notebook = new Product("L1234", "LG PC 그램", 1500000);
		notebook.setDescription("4.7-inch, 1334X750 Retina HD display, processor");
		notebook.setCategory("Notebook");
		notebook.setManufacturer("LG");
		notebook.setUnitsInStock(1000);
		notebook.setCondition("New");
		
		Product tablet = new Product("I1234", "iPad", 900000);
		tablet.setDescription("4.7-inch, 1334X750 Retina HD display, processor");
		tablet.setCategory("tablet");
		tablet.setManufacturer("Apple");
		tablet.setUnitsInStock(1000);
		tablet.setCondition("Old");
		
		products.add(phone);
		products.add(notebook);
		products.add(tablet);
	}
	
	// 모든 상품 정보를 가져 온다. 
	public List<Product> getAllProducts(){
		return products;
	}
}
