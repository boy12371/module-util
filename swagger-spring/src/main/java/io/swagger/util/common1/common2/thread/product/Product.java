package io.swagger.util.common1.common2.thread.product;
/**
 * 产品类
 */
public class Product {
	//产品名
	private String name; 	
	
	public Product(String name){
		this.name=name;  	
	} 	
	public String toString() { 	
		return "Product-" + name; 	
	}
}
