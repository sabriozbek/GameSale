import java.sql.Date;

public class Gamer {
	
	private int id;
private String nationalId;
private String firstName;
private String lastName;
private String nickName;
private Date birthday;


public Gamer(int id, String nationalId, String firstName, String lastName, Date birthday) {
	super();
	this.id = id;
	this.nationalId = nationalId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.birthday = birthday;
}


public Gamer() {
	
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getNationalId() {
	return nationalId;
}


public void setNationalId(String nationalId) {
	this.nationalId = nationalId;
}


public String getFirstName() {
	return firstName;
}


public void setFirstName(String firstName) {
	this.firstName = firstName;
}


public String getLastName() {
	return lastName;
}


public void setLastName(String lastName) {
	this.lastName = lastName;
}


public Date getBirthday() {
	return birthday;
}


public void setBirthday(Date birthday) {
	this.birthday = birthday;
}


public String getNickName() {
	return nickName;
}


public void setNickName(String nickName) {
	this.nickName = nickName;
}



}
