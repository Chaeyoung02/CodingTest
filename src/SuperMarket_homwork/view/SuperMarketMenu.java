package SuperMarket_homwork.view;;

import java.util.Scanner;

import SuperMarket_homwork.controller.BuyController;
import SuperMarket_homwork.controller.ProductController;
import SuperMarket_homwork.controller.UserController;
import SuperMarket_homwork.model.vo.User;

public class SuperMarketMenu {
	Scanner sc = new Scanner(System.in);
	User u = null;
	public void mainMenu() {

		while(true) {
			System.out.println("**메뉴선택**");
			System.out.println("1. 회원가입 선택");
			System.out.println("2. 로그인 선택");
			System.out.print("번호입력: ");
			String num = sc.nextLine();
			if(num.equals("1")) {
				Sign();
				break;
			}else if(num.equals("2")) {
				Login();
				break;
			}else {
				System.out.println("다시 입력");
			}
		}

	}
	//회원가입 선택한 경우, 
	public void Sign() {
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();
		System.out.print("닉네임 : ");
		String nick = sc.nextLine();
		new UserController().insert(id, pwd, nick);

	}

	public void Login() {
		System.out.println("**로그인**");
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();
		u = new UserController().check(id,pwd);
		if(u.getUser_id().equals("admin")) {
			System.out.println(u.getUser_nick()+" 로 로그인되었습니다.");
			adminMenu();
		}
		else {
			System.out.println(u.getUser_nick()+" 로 로그인되었습니다.");
			userMenu(u);
		}
	}

	//관리자 메뉴
	public void adminMenu() {
		while(true) {
			System.out.println("**관리자메뉴**");
			System.out.println("1. 제품등록");
			System.out.println("2. 제품입고");
			System.out.println("3. 판매현황");
			System.out.print("번호 입력: ");
			String num = sc.nextLine();
			if(num.equals("1")) {
				insertProduct();
				break;
			}else if(num.equals("2")) {
				addAmount();
				break;
			}else if(num.equals("3")) {
				new ProductController().buyNow();
				break;
			}
			else {
				System.out.println("다시 입력");
				continue;

			}
		}

	}
	//제품등록
	public void insertProduct() {
		System.out.println("**제품등록**");
		System.out.print("제품 명 : ");
		String prod_name = sc.nextLine();
		System.out.print("제품 가격 : ");
		String prod_price = sc.nextLine();
		System.out.print("입고 개수 : ");
		int prod_amount = sc.nextInt();
		sc.nextLine();
		new ProductController().insert(prod_name, prod_price, prod_amount);
	}
	//제품입고
	public void addAmount() {
		System.out.println("**제품입고**");
		System.out.print("제품 번호 : ");
		int prod_no = sc.nextInt();
		sc.nextLine();
		System.out.print("입고 개수 : ");
		int prod_amount = sc.nextInt();
		sc.nextLine();
		new ProductController().add(prod_no, prod_amount);
	}

	//사용자 메뉴
	public void userMenu(User u) {
		while(true) {
			System.out.println("**사용자메뉴**");
			System.out.println("1. 제품구매");
			System.out.println("2. 개인 정보 수정");
			System.out.println("3. 탈퇴");
			System.out.print("번호 입력: ");
			String num = sc.nextLine();
			if(num.equals("1")) {
				new ProductController().selectAll();
				buyProduct(u);
				break;
			}else if(num.equals("2")) {
				updateInfo(u);
				break;
			}else if(num.equals("3")) {
				deleteInfo(u);
				break;
			}
			else {
				System.out.println("다시 입력");
				continue;

			}
		}

	}

	public void buyProduct(User u) {
		System.out.print("구매하고 싶은 제품 번호 : ");
		int prod_no = sc.nextInt();
		sc.nextLine();
		System.out.print("수량 입력 : ");
		int buy_amount = sc.nextInt();
		sc.nextLine();
		new BuyController().insert(u.getUser_no(),prod_no, buy_amount);//구매테이블 구매내역 추가
		new ProductController().deleteProduct(u, prod_no, buy_amount);//제품 총량 감소

	}
	public void updateInfo(User u) {
		System.out.println("**회원정보수정**");
		System.out.print("비밀번호: ");
		String pwd = sc.nextLine();
		System.out.print("닉네임 : ");
		String nick =sc.nextLine();

		new UserController().update(u, pwd,nick);

	}
	public void deleteInfo(User u) {
		System.out.println("**회원탈퇴**");
		System.out.print("비밀번호 : ");
		String memberPwd = sc.nextLine();
		new UserController().delete(u, memberPwd);
	}
}
