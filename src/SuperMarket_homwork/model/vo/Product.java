package com.gn.model.vo;

public class Product {
	private int prod_no;
	private String product_name;
	private int product_amount;
	private String product_price;
	
	public Product() {}
	public Product(int prod_no, String product_name, int product_amount, String product_price) {
		this.product_price= product_price;
		this.prod_no = prod_no;
		this.product_amount = product_amount;
		this.product_name = product_name;
		
	}
	
	public int getProd_no() {
		return prod_no;
	}
	public void setProd_no(int prod_no) {
		this.prod_no = prod_no;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getProduct_amount() {
		return product_amount;
	}
	public void setProduct_amount(int product_amount) {
		this.product_amount = product_amount;
	}
	public String getProduct_price() {
		return product_price;
	}
	public void setProduct_price(String product_price) {
		this.product_price = product_price;
	}
	@Override
	public String toString() {
		return   prod_no + "||" + product_name + "||" + product_amount
				+ "||" + product_price ;
	}

	
	
}
