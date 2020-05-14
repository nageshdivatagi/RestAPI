package in.nsoft.rest.users;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import in.nsoft.rest.roles.Roles;

/**
 * @author nagesh.divatagi
 *
 * @CreateDate 16-Apr-2020 10:16:49 pm
 * @FileName Userroles.java
 */
@Entity
public class Userroles {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long userid;
	private int roleid;
	private Date addeddate;

	/*
	 * @OneToOne(mappedBy = "userroles")
	 * 
	 * @JsonIgnore
	 */
	//private List<Roles> roles;

	protected Userroles() {
		super();
	}

	public Userroles(Long userid, int roleid, Date addeddate) {
		super();
		this.userid = userid;
		this.roleid = roleid;
		this.addeddate = addeddate;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
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
		result = prime * result + roleid;
		result = prime * result + ((userid == null) ? 0 : userid.hashCode());
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
		Userroles other = (Userroles) obj;
		if (addeddate == null) {
			if (other.addeddate != null)
				return false;
		} else if (!addeddate.equals(other.addeddate))
			return false;
		if (roleid != other.roleid)
			return false;
		if (userid == null) {
			if (other.userid != null)
				return false;
		} else if (!userid.equals(other.userid))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Userroles [userid=" + userid + ", roleid=" + roleid + ", addeddate=" + addeddate + "]";
	}

	
}
