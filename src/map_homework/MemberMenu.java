package map_homework;
import java.util.*;


public class MemberMenu {
    Scanner sc = new Scanner(System.in);
    MemberController mc =new MemberController();

    public void mainMenu() {
        while(true) {
            System.out.println("===(주)가남에 오신 것을 환영합니다.===");
            System.out.println("원하시는 메뉴의 번호를 입력하세요.");
            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            System.out.println("3. 같은 이름 회원 찾기");
            System.out.println("9. 종료");
            System.out.print("메뉴 번호 입력 : ");
            int num = sc.nextInt();
            sc.nextLine();

            if(num == 1 || num ==2|| num == 3|| num ==9) {
                if(num == 1) {
                    joinMember();
                }else if(num == 2) {
                    login();
                }
                else if(num == 3) {
                    sameName();
                }
                else if(num == 9) {
                    break;
                }
            }
            else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                continue;
            }
        }

    }
    public void memberMenu() {
        while(true) {
            System.out.println("**** 회원 메뉴 ****");
            System.out.println("회원 메뉴는 회원만 접근할 수 있습니다.");
            System.out.println("먼저 회원가입, 로그인을 해주세요");
            System.out.println("1. 비밀번호 바꾸기");
            System.out.println("2. 이름바꾸기");
            System.out.println("3. 로그아웃");

            System.out.print("메뉴 번호 입력 : ");
            int num = sc.nextInt();
            sc.nextLine();

            if(num == 1 || num ==2|| num == 3) {
                if(num == 1) {
                    changePassword();
                }else if(num == 2) {
                    changeName();
                }
                else if(num == 3) {
                    System.out.println("로그아웃 되었습니다");
                    break;
                }
            }
            else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");

            }
        }
    }
    public void joinMember() {
        while(true) {
            //아이디 비밀번호 이름 입력
            System.out.print("아이디 : ");
            String id = sc.nextLine();
            System.out.print("비밀번호 : ");
            String password = sc.nextLine();
            System.out.print("이름 : ");
            String name = sc.nextLine();

            //비밀번호와 이름은 Member 객체에 담기
            Member m = new Member(password, name);

            //id와 Member객체를 mc.join()으로 보내기
            if(mc.joinMember(id, m)) {
                System.out.println("성공적으로 회원가입 완료하였습니다.");
                break;
            }else {
                System.out.println("중복된 아이디 입니다. 다시 입력해주세요.");
                continue;
            }
        }
    }
    public void login() {
        while(true) {
            //아이디 비밀번호입력
            System.out.print("아이디 : ");
            String id = sc.nextLine();
            System.out.print("비밀번호 : ");
            String password = sc.nextLine();

            //메소드에 값 넘겨주기
            if(mc.login(id, password) != null) {
                System.out.println(mc.login(id, password)+"님, 환영합니다.");
                memberMenu();
                break;
            }else {
                System.out.println("틀린 아이디 또는 비밀번호 입니다. 다시 입력해주세요");
            }

        }
    }
    public void changePassword() {
        while(true) {
            //아이디와 기존 비밀번호, 변경 비밀번호입력
            System.out.print("아이디 : ");
            String id = sc.nextLine();
            System.out.print("비밀번호 : ");
            String password = sc.nextLine();
            System.out.print("변경할 비밀번호 : ");
            String change = sc.nextLine();
            if(mc.changePassword(id, password, change)) {

                System.out.println("비밀번호 변경에 성공했습니다.");
                break;
            }else {
                System.out.println("비밀번호 변경에 실패했습니다");
                continue;
            }
        }
    }
    public void changeName() {
        //아이디와  비밀번호입력
        System.out.print("아이디 : ");
        String id = sc.nextLine();
        System.out.print("비밀번호 : ");
        String password = sc.nextLine();

        if(mc.login(id, password) != null) {

            System.out.println("현재이름: "+mc.login(id, password));
            System.out.print("변경할 이름 입력: ");
            String name = sc.nextLine();
            mc.changeName(id, name);

            System.out.println("이름 변경에 성공했습니다.");

        }else {
            System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요");
        }


    }
    public void sameName() {

        //이름 입력
        System.out.print("이름 : ");
        String name = sc.nextLine();

        //mc.sameName에 넘김
        TreeMap<String, String> treeMap = mc.sameName(name);

        Set<Map.Entry<String, String>> entrySet = treeMap.entrySet();
        Iterator<Map.Entry<String, String>> itr = entrySet.iterator();

        while (itr.hasNext()){
            Map.Entry<String, String> entry = itr.next();
           System.out.println(entry.getKey() + " : " + entry.getValue());


        }


    }


}

