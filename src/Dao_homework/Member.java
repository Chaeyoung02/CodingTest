package Dao_homework;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Member {
    private int memberNo;
    private String memberId;
    private String memberPwd;
    private String memberName;
    private String memberEmail;
    private String memberPhone;
    private String memberGender;
    private LocalDateTime regDate;
    private LocalDateTime modDate;
    public Member() {}
    public Member(int memberNo, String memberId, String memberPwd,String memberName, String memberEmail, String memberPhone,
                  String memberGender, LocalDateTime regDate, LocalDateTime modDate) {
        this.memberNo = memberNo;
        this.memberId = memberId;
        this.memberPwd = memberPwd;
        this.memberName = memberName;
        this.memberEmail = memberEmail;
        this.memberPhone = memberPhone;
        this.memberGender = memberGender;
        this.regDate = regDate;
        this.modDate = modDate;
    }


    public int getMemberNo() {
        return memberNo;
    }
    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }
    public String getMemberId() {
        return memberId;
    }

    public String getMemberName() {
        return memberName;
    }
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
    public String getMemberPwd() {
        return memberPwd;
    }
    public void setMemberPwd(String memberPwd) {
        this.memberPwd = memberPwd;
    }
    public String getMemberEmail() {
        return memberEmail;
    }
    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }
    public String getMemberPhone() {
        return memberPhone;
    }
    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
    }
    public String getMemberGender() {
        return memberGender;
    }
    public void setMemberGender(String memberGender) {
        this.memberGender = memberGender;
    }
    public LocalDateTime getRegDate() {
        return regDate;
    }
    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }
    public LocalDateTime getModDate() {
        return modDate;
    }
    public void setModDate(LocalDateTime modDate) {
        this.modDate = modDate;
    }


    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm:ss");
        String regDateStr = dtf.format(regDate);
        String modDateStr = dtf.format(modDate);
        return memberNo + "||" + memberId + "||" + memberPwd + "||"+memberName+"||"+
                memberEmail + "||" + memberPhone + "||" + memberGender + "||"
                + regDateStr + "||" + modDateStr ;
    }




}
