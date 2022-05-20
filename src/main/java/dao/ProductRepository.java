package dao;

import java.util.ArrayList;
import java.util.List;
import dto.Product;

// Product에 대한 기능을 정의
public class ProductRepository {
	private List<Product> products = new ArrayList<>();
	
	// 하나의 객체를 생성 후 인스턴스를 재사용하는 싱글턴 패턴
	// 클래스 입장에서 아무 상관 없는 코드, 어떠한 클래스에 가져다 놔도 상관 없다. 저장되는 위치가 다르다.
	private static ProductRepository instance = new ProductRepository();
	
	public static ProductRepository getInstance() {
		return instance;
	}
	
	public ProductRepository() {
		// 원래는 DB에서 가져올 DATA
		// DB를 배우지 않아 만든 코드
		Product phone = new Product("p1234", "iPhone 13 Pro", 1350000);
		phone.setDescription("15.4cm, ProMotion OLED display");
		phone.setCategory("Smart Phone");
		phone.setManufacturer("Apple");
		phone.setUnitsInStock(1000);
		phone.setCondition("New");
		
		Product notebook = new Product("m1234", "Mac Air", 1630000);
		notebook.setDescription("33.7cm, LED BackLight Display IPS technology, Apple M1");
		notebook.setCategory("notebook");
		notebook.setManufacturer("Apple");
		notebook.setUnitsInStock(1000);
		notebook.setCondition("New");
		
		Product tablet = new Product("i1234", "iPad mini", 649000);
		tablet.setDescription("8.3-inch, Liquid Retina display, Neural Engine A15 Bionic");
		tablet.setCategory("tablet");
		tablet.setManufacturer("Apple");
		tablet.setUnitsInStock(1000);
		tablet.setCondition("New");
		
		products.add(phone);
		products.add(notebook);
		products.add(tablet);
	}
	
	// 모든 상품 정보를 가져 온다. 
	public List<Product> getAllProducts(){
		return products;
	}
	
	// ID로 상품 찾기
	public Product getProductById(String productId) {
		// 원래 코드는 책 p.173 for문 참고할 것
		return products.stream() // 상품 3개가 흘러 간다.
				.filter((product) -> product.getProductId().equals(productId)) // 흘러갈 때 걸러질 그물망, 화살표 다음이 조건
				.findFirst() // filter에서 첫번째 것
				.get(); // 얻기
	}
	
	//상품 추가
	public void addProduct(Product product) {
		products.add(product);
	}
}
