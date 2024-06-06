package Happy_book.model.vo;

public class User {
    private int em_no;
    private String em_id;
    private String em_pwd;
    private String em_name;
    private String em_check;

    public User() {
    }

    public User(int em_no, String em_id, String em_pwd, String em_name, String em_check) {
        this.em_no = em_no;
        this.em_id = em_id;
        this.em_pwd = em_pwd;
        this.em_name = em_name;
        this.em_check = em_check;
    }

    public int getEm_no() {
        return em_no;
    }

    public void setEm_no(int em_no) {
        this.em_no = em_no;
    }

    public String getEm_id() {
        return em_id;
    }

    public void setEm_id(String em_id) {
        this.em_id = em_id;
    }

    public String getEm_pwd() {
        return em_pwd;
    }

    public void setEm_pwd(String em_pwd) {
        this.em_pwd = em_pwd;
    }

    public String getEm_name() {
        return em_name;
    }

    public void setEm_name(String em_name) {
        this.em_name = em_name;
    }

    public String getEm_check() {
        return em_check;
    }

    public void setEm_check(String em_check) {
        this.em_check = em_check;
    }

    @Override
    public String toString() {
        return "User{" +
                "em_no=" + em_no +
                ", em_id='" + em_id + '\'' +
                ", em_pwd='" + em_pwd + '\'' +
                ", em_name='" + em_name + '\'' +
                ", em_check=" + em_check +
                '}';
    }
}
