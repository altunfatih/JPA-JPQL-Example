package com.proje.test;

import java.util.Date;
import java.util.List;

import com.proje.model.Brand;
import com.proje.model.Category;
import com.proje.model.Product;
import com.proje.model.ProductDetails;
import com.proje.repository.ProductRepository;
import com.proje.repository.impl.ProductRepositoryImpl;

public class Test {

	private static ProductRepository productRepository = new ProductRepositoryImpl();
	
	public static void main(String[] args) {
		//insertData();
		
		/* findProducts = "SELECT p FROM Product p";
		List<Product> products = productRepository.findProducts();
		
		for (Product product : products) {
			System.out.println(product);
		}
		*/
		
		/* findProductById = "SELECT p FROM Product p WHERE p.productId = :productId"
		Product product = productRepository.findProductById(4);
		System.out.println(product);
		*/
		
		/* findProductDetails = "SELECT new com.proje.model.ProductDetails(p.name, p.unitPrice, p.avaible, b.name, c.name) "
												+ "FROM Product p LEFT JOIN p.brand b LEFT JOIN p.category c";
		 List<ProductDetails> productDetails = productRepository.findProductDetails();
		 productDetails.forEach(System.out::println);
		 */
		
		/* findProductNames = "SELECT p.name FROM Product p"
		List<String> productNames = productRepository.findProductNames();
		productNames.forEach(System.out::println);
		 */
		
		/* findProductNamePrice = "SELECT p.name, p.unitPrice FROM Product p";
		List<Object[]> list = productRepository.findProductNameAndPrice();
		for (Object[] objects : list) {
			System.out.println(objects[0] + " - " + objects[1]);
		}
		 */
		
		/* findGreatPrice = "SELECT p FROM Product p WHERE p.unitPrice > :unitPrice";
		 List<Product> products= productRepository.findGreatPrice(2999);
		 products.forEach(System.out::println);
		 */
		
		/* findGreatLessPrice = "SELECT p FROM Product p WHERE p.unitPrice > :minUnitPrice AND p.unitPrice < :maxUnitPrice";
		 List<Product> products= productRepository.findGreatAndLessPrice(1000, 3000);
		 products.forEach(System.out::println);
		 */
		
		/*  findBetweenPrice = "SELECT p FROM Product p WHERE p.unitPrice BETWEEN :minUnitPrice AND :maxUnitPrice";	 		
		 List<Product> products= productRepository.findBetweenPrice(1000, 2000);
		 products.forEach(System.out::println);
		 */
		
		/* findLikeProductName = "SELECT p FROM Product p WHERE p.name LIKE :productName";
		 List<Product> products= productRepository.findLikeProductName("sus");
		 products.forEach(System.out::println);
		 */
		
		/* findInCategoryName = "SELECT p Product p LEFT JOIN p.category c WHERE c.name IN(:categoryName1, :categoryName2)";
		 List<Product> products= productRepository.findInCategoryName("Telefon", "Bilgisayar");
		 products.forEach(System.out::println);
		 */
		 
	}
	
	public static void insertData() {
		
		Brand brand1 = new Brand("Apple");
		Brand brand2 = new Brand("LG");
		Brand brand3 = new Brand("Sony");
		Brand brand4 = new Brand("Samsung");
		Brand brand5 = new Brand("Asus");
		
		Category category1 = new Category("Bilgisayar");
		Category category2 = new Category("Tablet");
		Category category3 = new Category("Telefon");
		
		Product product1 = new Product("Ýphone 7", 3500, 2, brand1, category3, new Date());
		Product product2 = new Product("LG G3", 1500, 1, brand2, category3, new Date());
		Product product3 = new Product("Sony Expeia", 2500, 1, brand3, category3, new Date());
		
		Product product4 = new Product("Samsung Z500", 1700, 2, brand4, category1, new Date());
		Product product5 = new Product("Mac i5", 5500, 2, brand1, category1, new Date());
		Product product6 = new Product("Asus i7", 2500, 2, brand1, category1, new Date());
		
		Product product7 = new Product("Galaxy Tablet", 2300, 2, brand4, category2, new Date());
		Product product8 = new Product("Asus Tablet", 3500, 2, brand5, category2, new Date());
		Product product9 = new Product("Sony Tablet", 1500, 2, brand3, category2, new Date());
		
		
		productRepository.saveBrand(brand1);
		productRepository.saveBrand(brand2);
		productRepository.saveBrand(brand3);
		productRepository.saveBrand(brand4);
		productRepository.saveBrand(brand5);
		
		productRepository.saveCategory(category1);
		productRepository.saveCategory(category2);
		productRepository.saveCategory(category3);
		
		productRepository.saveProduct(product1);
		productRepository.saveProduct(product2);
		productRepository.saveProduct(product3);
		productRepository.saveProduct(product4);
		productRepository.saveProduct(product5);
		productRepository.saveProduct(product6);
		productRepository.saveProduct(product7);
		productRepository.saveProduct(product8);
		productRepository.saveProduct(product9);
	}

}
