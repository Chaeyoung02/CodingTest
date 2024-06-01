package Dao_homework;


import java.security.PublicKey;
import java.util.List;


//사용자의 요청 처리 : View에서 전달받은 데이터 가공 -> DAO
public class MemberController {
    boolean check = false;
    public void insertMember(String memberId, String memberPwd, String memberName, String memberEmail, String memberPhone, String memberGender) {
        //전달 받은 값을 DAO에 전달하기 위해 순수데이터 가공
        Member m = new Member();
        m.setMemberId(memberId);
        m.setMemberPwd(memberPwd);
        m.setMemberName(memberName);
        m.setMemberEmail(memberEmail);
        m.setMemberPhone(memberPhone);
        m.setMemberGender(memberGender);
        //DAO에 있는 insertMember 메소드 호출
        int result = new MemberDAO().insertMember(m);
        if(result > 0) {
            new MemberMenu().displaySuccess("회원추가");
        }else {
            new MemberMenu().displayFail("회원추가");
        }
    }

    public void selectMemberAll() {
        //DAO에게 회원 전체 정보 조회A
        List<Member> resultList = new MemberDAO().selectMemberAll();
        if(resultList.isEmpty()) {
            new MemberMenu().displayNoDate();
        }else {
            new MemberMenu().displayMemberList(resultList);
        }

    }

    public void selectByMemberId(String id) {
        Member resultVo = new MemberDAO().selectByMemberId(id);
        if(resultVo == null) {
            new MemberMenu().displayNoDate();
        }else {
            new MemberMenu().displayMember(resultVo);
        }
    }

    public void selectByMemberName(String word) {
        List<Member> resultList = new MemberDAO().selectByMemberName(word);
        if(resultList.isEmpty()) {
            new MemberMenu().displayNoDate();
        }else {
            new MemberMenu().displayMemberList(resultList);
        }
    }
    public void updateMember(String memberId, String memberPwd, String memberName, String memberEmail, String memberPhone) {
        Member m = new Member();
        m.setMemberId(memberId);
        m.setMemberPwd(memberPwd);
        m.setMemberName(memberName);
        m.setMemberEmail(memberEmail);
        m.setMemberPhone(memberPhone);

        int result = new MemberDAO().updateMember(m);
        if(result > 0) {
            System.out.println("수정완료");
        }else {
            System.out.println("수정중 오류");
        }

    }
    public void deleteMember(String member_id) {
        int result = new MemberDAO().deleteMember(member_id);
        if(result > 0) {
            System.out.println("삭제 완료");
        }else {
            System.out.println("삭제 중 오류");
        }
    }
    public int login(String memberId, String memberPwd) {
        Member m = new Member();
        m.setMemberId(memberId);
        m.setMemberPwd(memberPwd);
        int result = new MemberDAO().login(m);
        return result;
    }
}
