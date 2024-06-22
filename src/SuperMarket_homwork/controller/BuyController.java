package SuperMarket_homwork.controller;

import com.gn.model.dao.BuyDao;
import com.gn.model.vo.Buy;

public class BuyController {
	public void insert(int id, int prod_no, int buy_amount) {
		Buy b = new Buy();
		b.setUser_no(id);
		b.setProd_no(prod_no);
		b.setBuy_amount(buy_amount);
		int result = new BuyDao().insert(b);
		if(result > 0) {
			System.out.println("구매가 완료");
		}else {
			System.out.println("구매가 실패");
		}
	}

}
