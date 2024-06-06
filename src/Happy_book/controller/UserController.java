package Happy_book.controller;

import Happy_book.model.dao.UserDao;
import Happy_book.model.vo.User;
import Happy_book.view.BookMenu;

public class UserController {
    BookMenu bm = new BookMenu();
    public void Login(String id, String pwd){
        User u = new User();
        u.setEm_id(id);
        u.setEm_pwd(pwd);
        u = new UserDao().Login(u);
        if (u != null) {
            if(u.getEm_id().equals("admin") && u.getEm_pwd().equals("admin1234!")){
                System.out.println(u.getEm_name()+"님, 환영합니다~!");
                bm.managerMenu();
            }else {
                System.out.println(u.getEm_name()+"님, 환영합니다~!");
                bm.mainMenu();
            }

        }else {
            System.out.println("잘못 입력하셨습니다.");
            bm.mainMenu();
        }

    }
    //계정 생성
    public void insert(String id, String pwd,String name) {
        User u = new User();
        u.setEm_id(id);
        u.setEm_pwd(pwd);
        u.setEm_name(name);

        int result = new UserDao().insert(u);
        if(result > 0){
            System.out.println("생성 성공");
        }else {
            System.out.println("생성 실패. 다시 입력해주세요.");
            bm.managerMenu();
        }
    }
}
