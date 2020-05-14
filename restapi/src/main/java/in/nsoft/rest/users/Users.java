package in.nsoft.rest.users;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author nagesh.divatagi
 *
 * @CreateDate 16-Apr-2020 10:16:49 pm
 * @FileName Users.java
 */
@Entity
public class Users /* implements UserDetails */ {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long userid;
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String emailid;
	private String displayname;
	private int genderid;
	private String mobileno;
	private int roleid;
	private boolean tempblock;
	private boolean block;
	private byte[] photo;
	private Date tempblockdate;
	private int attemptcnt;
	private Date blockeddate;
	private boolean passwordflag;
	private String thumbone;
	private String thumbtwo;
	private boolean biometricauthflag;
	private Date passwordchangedate;
	private int otp;
	private int employeeno;
	private int adduser;
	private Date addeddate;

	/*
	 * @OneToMany(mappedBy = "users")
	 * 
	 * @JsonIgnore
	 */
	// private List<Userroles> userrole;

	protected Users() {
		super();
	}

	public Users(Long userid, String username, String password, String firstname, String lastname, String emailid,
			String displayname, int genderid, String mobileno, int roleid, boolean tempblock, boolean block,
			byte[] photo, Date tempblockdate, int attemptcnt, Date blockeddate, boolean passwordflag, String thumbone,
			String thumbtwo, boolean biometricauthflag, Date passwordchangedate, int otp, int employeeno, int adduser,
			Date addeddate) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailid = emailid;
		this.displayname = displayname;
		this.genderid = genderid;
		this.mobileno = mobileno;
		this.roleid = roleid;
		this.tempblock = tempblock;
		this.block = block;
		this.photo = photo;
		this.tempblockdate = tempblockdate;
		this.attemptcnt = attemptcnt;
		this.blockeddate = blockeddate;
		this.passwordflag = passwordflag;
		this.thumbone = thumbone;
		this.thumbtwo = thumbtwo;
		this.biometricauthflag = biometricauthflag;
		this.passwordchangedate = passwordchangedate;
		this.otp = otp;
		this.employeeno = employeeno;
		this.adduser = adduser;
		this.addeddate = addeddate;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getDisplayname() {
		return displayname;
	}

	public void setDisplayname(String displayname) {
		this.displayname = displayname;
	}

	public int getGenderid() {
		return genderid;
	}

	public void setGenderid(int genderid) {
		this.genderid = genderid;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	public boolean isTempblock() {
		return tempblock;
	}

	public void setTempblock(boolean tempblock) {
		this.tempblock = tempblock;
	}

	public boolean isBlock() {
		return block;
	}

	public void setBlock(boolean block) {
		this.block = block;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public Date getTempblockdate() {
		return tempblockdate;
	}

	public void setTempblockdate(Date tempblockdate) {
		this.tempblockdate = tempblockdate;
	}

	public int getAttemptcnt() {
		return attemptcnt;
	}

	public void setAttemptcnt(int attemptcnt) {
		this.attemptcnt = attemptcnt;
	}

	public Date getBlockeddate() {
		return blockeddate;
	}

	public void setBlockeddate(Date blockeddate) {
		this.blockeddate = blockeddate;
	}

	public boolean isPasswordflag() {
		return passwordflag;
	}

	public void setPasswordflag(boolean passwordflag) {
		this.passwordflag = passwordflag;
	}

	public String getThumbone() {
		return thumbone;
	}

	public void setThumbone(String thumbone) {
		this.thumbone = thumbone;
	}

	public String getThumbtwo() {
		return thumbtwo;
	}

	public void setThumbtwo(String thumbtwo) {
		this.thumbtwo = thumbtwo;
	}

	public boolean isBiometricauthflag() {
		return biometricauthflag;
	}

	public void setBiometricauthflag(boolean biometricauthflag) {
		this.biometricauthflag = biometricauthflag;
	}

	public Date getPasswordchangedate() {
		return passwordchangedate;
	}

	public void setPasswordchangedate(Date passwordchangedate) {
		this.passwordchangedate = passwordchangedate;
	}

	public int getOtp() {
		return otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}

	public int getEmployeeno() {
		return employeeno;
	}

	public void setEmployeeno(int employeeno) {
		this.employeeno = employeeno;
	}

	public int getAdduser() {
		return adduser;
	}

	public void setAdduser(int adduser) {
		this.adduser = adduser;
	}

	public Date getAddeddate() {
		return addeddate;
	}

	public void setAddeddate(Date addeddate) {
		this.addeddate = addeddate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addeddate == null) ? 0 : addeddate.hashCode());
		result = prime * result + adduser;
		result = prime * result + attemptcnt;
		result = prime * result + (biometricauthflag ? 1231 : 1237);
		result = prime * result + (block ? 1231 : 1237);
		result = prime * result + ((blockeddate == null) ? 0 : blockeddate.hashCode());
		result = prime * result + ((displayname == null) ? 0 : displayname.hashCode());
		result = prime * result + ((emailid == null) ? 0 : emailid.hashCode());
		result = prime * result + employeeno;
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + genderid;
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		result = prime * result + ((mobileno == null) ? 0 : mobileno.hashCode());
		result = prime * result + otp;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((passwordchangedate == null) ? 0 : passwordchangedate.hashCode());
		result = prime * result + (passwordflag ? 1231 : 1237);
		result = prime * result + Arrays.hashCode(photo);
		result = prime * result + roleid;
		result = prime * result + (tempblock ? 1231 : 1237);
		result = prime * result + ((tempblockdate == null) ? 0 : tempblockdate.hashCode());
		result = prime * result + ((thumbone == null) ? 0 : thumbone.hashCode());
		result = prime * result + ((thumbtwo == null) ? 0 : thumbtwo.hashCode());
		result = prime * result + ((userid == null) ? 0 : userid.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		if (addeddate == null) {
			if (other.addeddate != null)
				return false;
		} else if (!addeddate.equals(other.addeddate))
			return false;
		if (adduser != other.adduser)
			return false;
		if (attemptcnt != other.attemptcnt)
			return false;
		if (biometricauthflag != other.biometricauthflag)
			return false;
		if (block != other.block)
			return false;
		if (blockeddate == null) {
			if (other.blockeddate != null)
				return false;
		} else if (!blockeddate.equals(other.blockeddate))
			return false;
		if (displayname == null) {
			if (other.displayname != null)
				return false;
		} else if (!displayname.equals(other.displayname))
			return false;
		if (emailid == null) {
			if (other.emailid != null)
				return false;
		} else if (!emailid.equals(other.emailid))
			return false;
		if (employeeno != other.employeeno)
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (genderid != other.genderid)
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (mobileno == null) {
			if (other.mobileno != null)
				return false;
		} else if (!mobileno.equals(other.mobileno))
			return false;
		if (otp != other.otp)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (passwordchangedate == null) {
			if (other.passwordchangedate != null)
				return false;
		} else if (!passwordchangedate.equals(other.passwordchangedate))
			return false;
		if (passwordflag != other.passwordflag)
			return false;
		if (!Arrays.equals(photo, other.photo))
			return false;
		if (roleid != other.roleid)
			return false;
		if (tempblock != other.tempblock)
			return false;
		if (tempblockdate == null) {
			if (other.tempblockdate != null)
				return false;
		} else if (!tempblockdate.equals(other.tempblockdate))
			return false;
		if (thumbone == null) {
			if (other.thumbone != null)
				return false;
		} else if (!thumbone.equals(other.thumbone))
			return false;
		if (thumbtwo == null) {
			if (other.thumbtwo != null)
				return false;
		} else if (!thumbtwo.equals(other.thumbtwo))
			return false;
		if (userid == null) {
			if (other.userid != null)
				return false;
		} else if (!userid.equals(other.userid))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Users [userid=" + userid + ", username=" + username + ", password=" + password + ", firstname="
				+ firstname + ", lastname=" + lastname + ", emailid=" + emailid + ", displayname=" + displayname
				+ ", genderid=" + genderid + ", mobileno=" + mobileno + ", roleid=" + roleid + ", tempblock="
				+ tempblock + ", block=" + block + ", photo=" + Arrays.toString(photo) + ", tempblockdate="
				+ tempblockdate + ", attemptcnt=" + attemptcnt + ", blockeddate=" + blockeddate + ", passwordflag="
				+ passwordflag + ", thumbone=" + thumbone + ", thumbtwo=" + thumbtwo + ", biometricauthflag="
				+ biometricauthflag + ", passwordchangedate=" + passwordchangedate + ", otp=" + otp + ", employeeno="
				+ employeeno + ", adduser=" + adduser + ", addeddate=" + addeddate + "]";
	}


}
