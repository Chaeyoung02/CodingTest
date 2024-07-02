package SuperMarket_homwork.controller;

import SuperMarket_homwork.model.dao.BuyDao;
import SuperMarket_homwork.model.dao.ProductDao;
import SuperMarket_homwork.model.vo.Product;
import SuperMarket_homwork.model.vo.User;
import SuperMarket_homwork.view.SuperMarketMenu;

import java.util.List;
public class ProductController {
SuperMarketMenu sm = new SuperMarketMenu();
	public void insert(String prod_name, String prod_price, int prod_amount) {
		Product p = new Product();
		p.setProduct_name(prod_name);
		p.setProduct_price(prod_price);
		p.setProduct_amount(prod_amount);

		int result = new ProductDao().insert(p);
		// insert 오류 : 0
		//정상작동 : 1
		if(result > 0) {
			System.out.println("제품등록되었습니다.");
			sm.adminMenu();
		}else {
			System.out.println("제품등록 실패");
			sm.adminMenu();

		}

	}
	//제품 입고
	public void add(int prod_no, int prod_amount) {
		Product p = new Product();
		p.setProd_no(prod_no);
		p.setProduct_amount(prod_amount);
		int result = new ProductDao().add(p);
		if(result > 0) {
			System.out.println("제품 입고 성공");
			sm.adminMenu();
		}else {
			System.out.println("제품 입고 실패");
			sm.adminMenu();
		}
	}
	public void selectAll() {
		List<Product> resultList = new ProductDao().selectAll();
		if(resultList.isEmpty()) {
			System.out.println("구매가능한 제품이 없습니다.");
		}else {
			for(Product p : resultList) {
				System.out.println(p);
			}
		}
	}

	//제품 총량 감소
	public void deleteProduct(User u , int prod_no, int prod_amount) {
		Product p = new Product();
		p.setProd_no(prod_no);
		p.setProduct_amount(prod_amount);
		int result = new ProductDao().deleteProduct(p);
		if(result > 0) {
			System.out.println("제품 재고 삭제 성공");
			sm.userMenu(u);
		}else {
			System.out.println("제품 재고 삭제 실패");
			sm.userMenu(u);
		}
	}
	public void buyNow() {
		List<String> resultList = new BuyDao().select();
		if(resultList.isEmpty()) {
			System.out.println("판매한 제품이 없습니다.");
		}else {
			for(String buy : resultList) {
				System.out.println(buy);
			}
		}
	}
}
