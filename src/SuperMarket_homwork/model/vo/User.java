package SuperMarket_homwork.model.vo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class User {
	private String user_id;
	private int user_no;
	private String user_pwd;
	private String user_nick;
	private LocalDateTime sign_date;
	private LocalDateTime update_date;

	public User() {

	}


	public User(int user_no, String user_id, String user_pwd, String user_nick, LocalDateTime sign_date,
				LocalDateTime update_date) {
		this.user_id = user_id;
		this.user_no = user_no;
		this.user_pwd = user_pwd;
		this.user_nick = user_nick;
		this.sign_date = sign_date;
		this.update_date = update_date;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public int getUser_no() {
		return user_no;
	}

	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}

	public String getUser_pwd() {
		return user_pwd;
	}

	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}

	public String getUser_nick() {
		return user_nick;
	}

	public void setUser_nick(String user_nick) {
		this.user_nick = user_nick;
	}



	public LocalDateTime getSign_date() {
		return sign_date;
	}

	public void setSign_date(LocalDateTime sign_date) {
		this.sign_date = sign_date;
	}

	public LocalDateTime getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(LocalDateTime update_date) {
		this.update_date = update_date;
	}

	@Override
	public String toString() {
		return   user_no + "||"+ user_id +  "||" + user_pwd + "||"
				+ user_nick + "||" + sign_date + "||" + update_date;
	}



}
