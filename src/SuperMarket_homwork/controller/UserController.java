package SuperMarket_homwork.controller;

import SuperMarket_homwork.model.dao.UserDAO;
import SuperMarket_homwork.model.vo.User;
import SuperMarket_homwork.view.SuperMarketMenu;

public class UserController {
	public void insert(String user_id, String user_pwd, String user_nick) {
		User u = new User();
		u.setUser_id(user_id);
		u.setUser_pwd(user_pwd);
		u.setUser_nick(user_nick);

		int result = new UserDAO().insert(u);
		//중복된 아이디, insert 오류 : 0
		//정상작동 : 1

		if(result > 0) {
			System.out.println("회원추가 성공적");
		}else {
			System.out.println("회원추가 실패");
		}

	}
	public User check(String id, String pwd) {
		SuperMarketMenu sm = new SuperMarketMenu();
		User u = new User();
		u.setUser_id(id);
		u.setUser_pwd(pwd);

		if(u.getUser_id().contains("admin")) {
			u = new UserDAO().check(u);
			if(u == null) {
				System.out.println("정보가 잘못 입력되었습니다.");
				sm.mainMenu();
			}
		}
		else {
			u = new UserDAO().check(u);
			if(u == null) {
				System.out.println("정보가 잘못 입력되었습니다.");
				sm.mainMenu();
			}
		}


		return u;
	}

	//개인 정보 수정
	public void update(User u, String pwd, String nick) {
		u.setUser_nick(nick);
		u.setUser_pwd(pwd);
		int result = new UserDAO().update(u);
		if(result > 0) {
			System.out.println("수정 완료");
		}else {
			System.out.println("수정 실패");
		}
	}
	//탈퇴
	public void delete(User u, String pwd) {
		int result = new UserDAO().deleteUser(u, pwd);
		if(result > 0) {
			System.out.println("삭제 완료");
		}else {
			System.out.println("삭제 중 오류");
		}
	}

}
