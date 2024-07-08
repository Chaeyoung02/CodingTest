//package Happy_book.controller;
//
//import Happy_book.model.dao.UserDao;
//import Happy_book.model.vo.User;
//import Happy_book.view.BookMenu;
//
//import java.sql.SQLException;
//
//public class UserController {
//    BookMenu bm = new BookMenu();
//    public void Login(String id, String pwd){
//        User u = new User();
//        u.setEm_id(id);
//        u.setEm_pwd(pwd);
//        u = new UserDao().Login(u);
//        if (u != null) {
//            if(u.getEm_id().equals("admin") && u.getEm_pwd().equals("admin1234!")){
//                System.out.println(u.getEm_name()+"님, 환영합니다~!");
//                bm.managerMenu();
//            }else {
//                System.out.println(u.getEm_name()+"님, 환영합니다~!");
//                bm.employeeMenu();
//            }
//
//        }else {
//            System.out.println("잘못 입력하셨습니다.");
//            bm.mainMenu();
//        }
//
//    }
//    //계정 생성
//    public void insert(String id, String pwd,String name) {
//        User u = new User();
//        u.setEm_id(id);
//        u.setEm_pwd(pwd);
//        u.setEm_name(name);
//
//        int result = new UserDao().insert(u);
//        if(result > 0){
//            System.out.println("생성 성공");
//            bm.managerMenu();
//        }else {
//            System.out.println("생성 실패. 다시 입력해주세요.");
//            bm.managerMenu();
//        }
//    }
//
//    //계정 수정
//    public void update(String id, String pwd, String name, String check) {
//        User u = new User();
//        u.setEm_id(id);
//        u.setEm_pwd(pwd);
//        u.setEm_name(name);
//        u.setEm_check(check);
//        int result = new UserDao().update(u);
//        if(result > 0){
//            System.out.println("수정 완료");
//            bm.managerMenu();
//        }else {
//            System.out.println("수정 실패");
//            bm.managerMenu();
//        }
//    }
//    //퇴사처리
//    public void fireEmployee(String id, String pwd, String name){
//        User u = new User();
//        u.setEm_id(id);
//        u.setEm_pwd(pwd);
//        u.setEm_name(name);
//        int result = new UserDao().fireEmployee(u);
//        if(result > 0){
//            System.out.println("삭제 완료");
//            bm.managerMenu();
//        }else {
//            System.out.println("삭제 실패");
//            bm.managerMenu();
//        }
//    }
//}
