package in.nsoft.rest.roles;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author nagesh.divatagi
 *
 * @CreateDate 16-Apr-2020 10:16:49 pm
 * @FileName Roles.java
 */

@Entity
public class Roles {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long roleid;
	private String rolename;
	private String roledescription;
	private int adduser;
	private Date addeddate;

	/*
	 * @OneToMany(mappedBy = "roles")
	 * 
	 * @JsonIgnore
	 */
	//private List<Rolespages> rolepages;

	protected Roles() {

	}

	public Roles(Long roleid, String rolename, String roledescription, int adduser, Date addeddate) {
		super();
		this.roleid = roleid;
		this.rolename = rolename;
		this.roledescription = roledescription;
		this.adduser = adduser;
		this.addeddate = addeddate;
	}

	public Long getRoleid() {
		return roleid;
	}

	public void setRoleid(Long roleid) {
		this.roleid = roleid;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public String getRoledescription() {
		return roledescription;
	}

	public void setRoledescription(String roledescription) {
		this.roledescription = roledescription;
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
		result = prime * result + ((roledescription == null) ? 0 : roledescription.hashCode());
		result = prime * result + ((roleid == null) ? 0 : roleid.hashCode());
		result = prime * result + ((rolename == null) ? 0 : rolename.hashCode());
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
		Roles other = (Roles) obj;
		if (addeddate == null) {
			if (other.addeddate != null)
				return false;
		} else if (!addeddate.equals(other.addeddate))
			return false;
		if (adduser != other.adduser)
			return false;
		if (roledescription == null) {
			if (other.roledescription != null)
				return false;
		} else if (!roledescription.equals(other.roledescription))
			return false;
		if (roleid == null) {
			if (other.roleid != null)
				return false;
		} else if (!roleid.equals(other.roleid))
			return false;
		if (rolename == null) {
			if (other.rolename != null)
				return false;
		} else if (!rolename.equals(other.rolename))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Roles [roleid=" + roleid + ", rolename=" + rolename + ", roledescription=" + roledescription
				+ ", adduser=" + adduser + ", addeddate=" + addeddate + "]";
	}

	
}
