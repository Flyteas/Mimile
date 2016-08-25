package pw.flyshit.Mimile.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User {
	@Id
	@Column
	private int userId;
	@Column(length=32)
    private String userName;
	@Column(length=36)
	private String passWord;
	@Column
    private boolean sex;
	@Column(length=16)
	private String telePhone;
	@Column
	private int userGrade;
	@Column
	private int userCredit;
	@Column
	private int userBalace;
	@Column
	private long regDate;
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	
	
	public String getTelePhone() {
		return telePhone;
	}
	public void setTelePhone(String telePhone) {
		this.telePhone = telePhone;
	}
	
	
	public int getUserGrade() {
		return userGrade;
	}
	public void setUserGrade(int userGrade) {
		this.userGrade = userGrade;
	}
	
	
	public int getUserCredit() {
		return userCredit;
	}
	public void setUserCredit(int userCredit) {
		this.userCredit = userCredit;
	}
	
	
	public int getUserBalace() {
		return userBalace;
	}
	public void setUserBalace(int userBalace) {
		this.userBalace = userBalace;
	}
	
	
	public long getRegDate() {
		return regDate;
	}
	public void setRegDate(long regDate) {
		this.regDate = regDate;
	}
	
	
	
}


