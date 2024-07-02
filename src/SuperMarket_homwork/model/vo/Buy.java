package SuperMarket_homwork.model.vo;

public class Buy {
	private int buy_no;
	private int prod_no;
	private int user_no;
	private int buy_amount;
	
	public Buy() {
		
	}
	public Buy(int buy_amount, int prod_no, int user_no, int buy_no) {
		this.buy_amount = buy_amount;
		this.buy_no = buy_no;
		this.prod_no = prod_no;
		this.user_no = user_no;
	}
	public int getBuy_amount() {
		return buy_amount;
	}
	public void setBuy_amount(int buy_amount) {
		this.buy_amount = buy_amount;
	}
	
	public int getBuy_no() {
		return buy_no;
	}
	public void setBuy_no(int buy_no) {
		this.buy_no = buy_no;
	}
	public int getProd_no() {
		return prod_no;
	}
	public void setProd_no(int prod_no) {
		this.prod_no = prod_no;
	}
	public int getUser_no() {
		return user_no;
	}
	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}
	@Override
	public String toString() {
		return "Buy [buy_no=" + buy_no + ", prod_no=" + prod_no + ", user_no=" + user_no + ", buy_amount=" + buy_amount
				+ "]";
	}

}
