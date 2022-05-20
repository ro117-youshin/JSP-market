package dao;

import java.util.ArrayList;
import java.util.List;
import dto.Product;

// Product�� ���� ����� ����
public class ProductRepository {
	private List<Product> products = new ArrayList<>();
	
	// �ϳ��� ��ü�� ���� �� �ν��Ͻ��� �����ϴ� �̱��� ����
	// Ŭ���� ���忡�� �ƹ� ��� ���� �ڵ�, ��� Ŭ������ ������ ���� ��� ����. ����Ǵ� ��ġ�� �ٸ���.
	private static ProductRepository instance = new ProductRepository();
	
	public static ProductRepository getInstance() {
		return instance;
	}
	
	public ProductRepository() {
		// ������ DB���� ������ DATA
		// DB�� ����� �ʾ� ���� �ڵ�
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
	
	// ��� ��ǰ ������ ���� �´�. 
	public List<Product> getAllProducts(){
		return products;
	}
	
	// ID�� ��ǰ ã��
	public Product getProductById(String productId) {
		// ���� �ڵ�� å p.173 for�� ������ ��
		return products.stream() // ��ǰ 3���� �귯 ����.
				.filter((product) -> product.getProductId().equals(productId)) // �귯�� �� �ɷ��� �׹���, ȭ��ǥ ������ ����
				.findFirst() // filter���� ù��° ��
				.get(); // ���
	}
	
	//��ǰ �߰�
	public void addProduct(Product product) {
		products.add(product);
	}
}
